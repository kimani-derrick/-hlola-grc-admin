'use client';

import { useState, useEffect } from 'react';
import { 
  ShieldCheck, 
  Layers, 
  ShieldCheck as ShieldCheckIcon, 
  CheckSquare, 
  Upload, 
  Clock, 
  Plus,
  Search,
  Settings,
  LogOut
} from 'lucide-react';

// Import our new abstractions
import { mockFrameworks } from '@/services/mockData';
import { useNavigation } from '@/hooks/useNavigation';
import { useDataFiltering } from '@/hooks/useDataFiltering';
import { useAuth } from '@/contexts/AuthContext';
import apiService, { Framework, Control, Task } from '@/services/api';
import { Breadcrumb } from '@/components/Breadcrumb';
import { StatsCards } from '@/components/StatsCards';
import { FrameworksSection } from '@/components/sections/FrameworksSection';
import { ControlsSection } from '@/components/sections/ControlsSection';
import { TasksSection } from '@/components/sections/TasksSection';
import { CreateFrameworkModal } from '@/components/modals/CreateFrameworkModal';
import { CreateControlModal } from '@/components/modals/CreateControlModal';
import { CreateTaskModal } from '@/components/modals/CreateTaskModal';
import { DeleteFrameworkModal } from '@/components/modals/DeleteFrameworkModal';
import { EditFrameworkModal, EditFrameworkFormData } from '@/components/modals/EditFrameworkModal';
import { SuccessNotification } from '@/components/notifications/SuccessNotification';

export default function AdminDashboard() {
  const [activeTab, setActiveTab] = useState('frameworks');
  const [searchQuery, setSearchQuery] = useState('');
  const [showCreateModal, setShowCreateModal] = useState(false);
  const [showSuccessNotification, setShowSuccessNotification] = useState(false);
  const [successMessage, setSuccessMessage] = useState('');
  const [isSubmitting, setIsSubmitting] = useState(false);
  const { logout, admin } = useAuth();

  // Real data state
  const [frameworks, setFrameworks] = useState<Framework[]>([]);
  const [controls, setControls] = useState<Control[]>([]);
  const [tasks, setTasks] = useState<Task[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  // Use our custom hooks
  const {
    selectedFramework,
    selectedControl,
    breadcrumb,
    setSelectedFramework,
    setSelectedControl,
    handleFrameworkClick,
    handleControlClick,
    handleBackToFrameworks,
    handleBackToControls,
  } = useNavigation();

  // Handle tab switching with state reset
  const handleTabSwitch = (tabId: string) => {
    setActiveTab(tabId);
    
    // Reset navigation state when switching to frameworks tab
    if (tabId === 'frameworks') {
      setSelectedFramework(null);
      setSelectedControl(null);
    }
    // Reset control selection when switching to controls tab (but keep framework if coming from tasks)
    else if (tabId === 'controls') {
      setSelectedControl(null);
    }
    // Reset both when switching to tasks tab
    else if (tabId === 'tasks') {
      // Only reset if we're not coming from a control click
      if (!selectedControl) {
        setSelectedFramework(null);
        setSelectedControl(null);
      }
    }
  };

  const { getCurrentControls, getCurrentTasks } = useDataFiltering(selectedFramework, selectedControl, controls, tasks);

  // Data transformation function
  const transformFormDataToAPI = (formData: any) => {
    // Framework data with camelCase field names (backend expects camelCase)
    const frameworkData = {
      name: formData.name,
      description: formData.description,
      region: formData.region,
      country: formData.country || null,
      category: formData.category,
      type: formData.type,
      icon: formData.category.toLowerCase(), // Default icon based on category
      color: formData.category === 'Privacy' ? '#10B981' : 
             formData.category === 'Security' ? '#EF4444' :
             formData.category === 'Compliance' ? '#8B5CF6' :
             formData.category === 'Risk' ? '#F59E0B' :
             formData.category === 'Financial' ? '#06B6D4' : '#EC4899',
      complianceDeadline: formData.complianceDeadline || null,
      priority: formData.priority,
      riskLevel: formData.riskLevel,
      status: formData.status || 'active',
      requirementsCount: formData.controls?.length || 0,
      applicableCountries: formData.country ? [formData.country] : [],
      industryScope: formData.industryScope,
      maxFineAmount: formData.maxFineAmount || '0',
      maxFineCurrency: formData.maxFineCurrency || 'EUR'
    };

    return {
      framework: frameworkData,
      controls: formData.controls || []
    };
  };

  // Sequential API calls handler
  const handleCreateFramework = async (formData: any) => {
    setIsSubmitting(true);
    
    try {
      const { framework, controls } = transformFormDataToAPI(formData);
      
      // Step 1: Create Framework
      console.log('Creating framework:', framework);
      const frameworkResponse = await apiService.createFramework(framework);
      
      if (!frameworkResponse.success) {
        throw new Error(frameworkResponse.message || 'Failed to create framework');
      }
      
      // Backend returns framework directly, not wrapped in data field
      const createdFramework = (frameworkResponse as any).framework || frameworkResponse.data;
      
      let createdControls = [];
      let createdTasks = [];
      let errors = [];

      // Step 2: Create Controls
      if (controls.length > 0) {
        console.log(`Creating ${controls.length} controls...`);
        
        for (const controlData of controls) {
          try {
            const controlPayload = {
              frameworkId: createdFramework.id,
              controlId: controlData.controlId,
              title: controlData.title,
              description: controlData.description,
              category: controlData.category,
              priority: controlData.priority
            };
            
            const controlResponse = await apiService.createControl(controlPayload);
            
            if (!controlResponse.success) {
              throw new Error(controlResponse.message || 'Failed to create control');
            }
            
            // Backend returns control directly, not wrapped in data field
            const createdControl = (controlResponse as any).control || controlResponse.data;
            createdControls.push(createdControl);
            
            // Step 3: Create Tasks for this Control
            if (controlData.tasks && controlData.tasks.length > 0) {
              console.log(`Creating ${controlData.tasks.length} tasks for control ${controlData.title}...`);
              
              for (const taskData of controlData.tasks) {
                try {
                  const taskPayload = {
                    controlId: createdControl.id,
                    title: taskData.title,
                    description: taskData.description,
                    category: taskData.category,
                    priority: taskData.priority,
                    estimatedHours: taskData.estimatedHours,
                    dueDate: taskData.dueDate || null,
                    assigneeId: taskData.assigneeId || null,
                    status: 'pending',
                    autoGenerated: false
                  };
                  
                  const taskResponse = await apiService.createTask(taskPayload);
                  
                  if (!taskResponse.success) {
                    throw new Error(taskResponse.message || 'Failed to create task');
                  }
                  
                  // Backend returns task directly, not wrapped in data field
                  const createdTask = (taskResponse as any).task || taskResponse.data;
                  createdTasks.push(createdTask);
                } catch (taskError) {
                  console.error('Error creating task:', taskError);
                  const errorMessage = taskError instanceof Error ? taskError.message : 'Unknown error';
                  errors.push(`Failed to create task "${taskData.title}": ${errorMessage}`);
                }
              }
            }
          } catch (controlError) {
            console.error('Error creating control:', controlError);
            const errorMessage = controlError instanceof Error ? controlError.message : 'Unknown error';
            errors.push(`Failed to create control "${controlData.title}": ${errorMessage}`);
          }
        }
      }

      // Prepare success message
      let message = `Framework "${createdFramework.name}" created successfully!`;
      
      if (createdControls.length > 0) {
        message += ` Added ${createdControls.length} control${createdControls.length > 1 ? 's' : ''}`;
        if (createdTasks.length > 0) {
          message += ` and ${createdTasks.length} task${createdTasks.length > 1 ? 's' : ''}`;
        }
        message += '.';
      }
      
      if (errors.length > 0) {
        message += ` Note: ${errors.length} item${errors.length > 1 ? 's' : ''} failed to create.`;
        console.warn('Partial creation errors:', errors);
      }
      
      setSuccessMessage(message);
      setShowSuccessNotification(true);
      
      // Close the modal
      setShowCreateModal(false);
      
      // Refresh data to show new framework (with small delay to ensure backend processing)
      setTimeout(async () => {
        await refreshData();
      }, 1000);
      
    } catch (error) {
      console.error('Error creating framework:', error);
      const errorMessage = error instanceof Error ? error.message : 'Unknown error';
      setSuccessMessage(`Failed to create framework: ${errorMessage}`);
      setShowSuccessNotification(true);
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleCreateControl = async (data: any) => {
    try {
      console.log('Creating control:', data);
      
      // Ensure we have a selected framework
      if (!selectedFramework) {
        throw new Error('No framework selected');
      }
      
      const controlPayload = {
        frameworkId: selectedFramework.id,
        controlId: data.controlId,
        title: data.title,
        description: data.description,
        category: data.category,
        subcategory: data.subcategory,
        priority: data.priority,
        implementationLevel: data.implementationLevel?.toLowerCase(),
        businessImpact: data.businessImpact,
        technicalRequirements: data.technicalRequirements,
        legalRequirements: data.legalRequirements,
        implementationGuidance: data.implementationGuidance,
        testingProcedures: data.testingProcedures,
        evidenceRequirements: data.evidenceRequirements || []
      };
      
      const response = await apiService.createControl(controlPayload);
      
      if (response.success) {
        setSuccessMessage(`Control "${data.title}" created successfully!`);
        setShowSuccessNotification(true);
        
        // Refresh controls data
        const controlsResponse = await apiService.getControls();
        if (controlsResponse.success) {
          setControls(controlsResponse.controls || []);
        }
        
        // Close the modal
        setShowCreateModal(false);
      } else {
        throw new Error(response.message || 'Failed to create control');
      }
    } catch (error: any) {
      console.error('Error creating control:', error);
      setError(`Failed to create control: ${error.message}`);
    }
  };

  const handleCreateTask = async (data: any) => {
    try {
      console.log('Creating task:', data);
      
      // Ensure we have a selected framework and control
      if (!selectedFramework || !selectedControl) {
        throw new Error('No framework or control selected');
      }
      
      const taskPayload = {
        controlId: selectedControl.id,
        title: data.title,
        description: data.description,
        category: data.category,
        priority: data.priority,
        assigneeId: data.assignedTo,
        dueDate: data.dueDate,
        estimatedHours: data.estimatedHours,
        status: data.status || 'pending'
      };
      
      const response = await apiService.createTask(taskPayload);
      
      if (response.success) {
        setSuccessMessage(`Task "${data.title}" created successfully!`);
        setShowSuccessNotification(true);
        
        // Refresh tasks data
        const tasksResponse = await apiService.getTasks();
        if (tasksResponse.success) {
          setTasks(tasksResponse.tasks || []);
        }
        
        // Close the modal
        setShowCreateModal(false);
      } else {
        throw new Error(response.message || 'Failed to create task');
      }
    } catch (error: any) {
      console.error('Error creating task:', error);
      setError(`Failed to create task: ${error.message}`);
    }
  };

  // Calculate stats from real data
  const calculateStats = () => {
    const activeFrameworks = frameworks.filter(f => f.is_active).length;
    const pendingTasks = tasks.filter(t => t.status === 'pending' || t.status === 'in_progress').length;
    
    return {
      totalFrameworks: frameworks.length,
      totalControls: controls.length,
      totalTasks: tasks.length,
      activeFrameworks,
      pendingTasks
    };
  };

  const stats = calculateStats();

  // Delete framework modal state
  const [showDeleteModal, setShowDeleteModal] = useState(false);
  const [frameworkToDelete, setFrameworkToDelete] = useState<Framework | null>(null);
  const [isDeleting, setIsDeleting] = useState(false);

  // Edit framework modal state
  const [showEditModal, setShowEditModal] = useState(false);
  const [frameworkToEdit, setFrameworkToEdit] = useState<Framework | null>(null);
  const [isEditing, setIsEditing] = useState(false);

  // Delete framework handler - opens modal
  const handleDeleteFramework = (framework: Framework) => {
    setFrameworkToDelete(framework);
    setShowDeleteModal(true);
  };

  // Confirm delete framework
  const confirmDeleteFramework = async () => {
    if (!frameworkToDelete) return;
    
    try {
      setIsDeleting(true);
      console.log('Deleting framework:', frameworkToDelete.name);
      
      const response = await apiService.deleteFramework(frameworkToDelete.id);
      
      if (response.success) {
        setSuccessMessage(`Framework "${frameworkToDelete.name}" deleted successfully!`);
        setShowSuccessNotification(true);
        
        // Refresh frameworks data
        const frameworksResponse = await apiService.getFrameworks();
        if (frameworksResponse.success) {
          setFrameworks(frameworksResponse.frameworks || []);
        }
        
        // Close modal
        setShowDeleteModal(false);
        setFrameworkToDelete(null);
      } else {
        throw new Error(response.message || 'Failed to delete framework');
      }
    } catch (error: any) {
      console.error('Error deleting framework:', error);
      setError(`Failed to delete framework: ${error.message}`);
    } finally {
      setIsDeleting(false);
    }
  };

  // Edit framework handler - opens modal
  // Edit framework - always use the latest data from state
  const handleEditFramework = (framework: Framework) => {
    // Find the latest version of this framework from state
    const latestFramework = frameworks.find(f => f.id === framework.id) || framework;
    setFrameworkToEdit(latestFramework);
    setShowEditModal(true);
  };

  // Submit edit framework
  const handleEditFrameworkSubmit = async (id: string, data: EditFrameworkFormData) => {
    try {
      setIsEditing(true);
      console.log('Updating framework:', id, data);
      
      const response = await apiService.updateFramework(id, data);
      
      if (response.success) {
        setSuccessMessage(`Framework "${data.name}" updated successfully!`);
        setShowSuccessNotification(true);
        
        // Refresh frameworks data
        const frameworksResponse = await apiService.getFrameworks();
        if (frameworksResponse.success) {
          const updatedFrameworks = frameworksResponse.frameworks || [];
          setFrameworks(updatedFrameworks);
          
          // Update the frameworkToEdit with fresh data from the API
          const updatedFramework = updatedFrameworks.find(f => f.id === id);
          if (updatedFramework) {
            setFrameworkToEdit(updatedFramework);
          }
        }
        
        // Close modal
        setShowEditModal(false);
        setFrameworkToEdit(null);
      } else {
        throw new Error(response.message || 'Failed to update framework');
      }
    } catch (error: any) {
      console.error('Error updating framework:', error);
      setError(`Failed to update framework: ${error.message}`);
    } finally {
      setIsEditing(false);
    }
  };

  // Fetch data on mount
  useEffect(() => {
    const fetchData = async () => {
      try {
        setLoading(true);
        setError(null);

        // Fetch all data in parallel
        const [frameworksResponse, controlsResponse, tasksResponse] = await Promise.all([
          apiService.getFrameworks(),
          apiService.getControls(),
          apiService.getTasks()
        ]);

        if (frameworksResponse.success && frameworksResponse.frameworks) {
          setFrameworks(frameworksResponse.frameworks);
        } else {
          console.error('Failed to fetch frameworks:', frameworksResponse.message);
        }

        if (controlsResponse.success && controlsResponse.controls) {
          setControls(controlsResponse.controls);
        } else {
          console.error('Failed to fetch controls:', controlsResponse.message);
        }

        if (tasksResponse.success && tasksResponse.tasks) {
          setTasks(tasksResponse.tasks);
        } else {
          console.error('Failed to fetch tasks:', tasksResponse.message);
        }
      } catch (err) {
        console.error('Error fetching data:', err);
        setError('Failed to load data. Please try again.');
      } finally {
        setLoading(false);
      }
    };

    fetchData();
  }, []);

  // Refresh data function (for after successful creation)
  const refreshData = async () => {
    try {
      const [frameworksResponse, controlsResponse, tasksResponse] = await Promise.all([
        apiService.getFrameworks(),
        apiService.getControls(),
        apiService.getTasks()
      ]);

      if (frameworksResponse.success && frameworksResponse.frameworks) {
        setFrameworks(frameworksResponse.frameworks);
      }

      if (controlsResponse.success && controlsResponse.controls) {
        setControls(controlsResponse.controls);
      }

      if (tasksResponse.success && tasksResponse.tasks) {
        setTasks(tasksResponse.tasks);
      }
    } catch (err) {
      console.error('Error refreshing data:', err);
      // Don't set error state for refresh failures, just log them
    }
  };

  // Navigation handlers with tab switching
  const handleFrameworkClickWithTab = (framework: any) => {
    handleFrameworkClick(framework, setActiveTab);
  };

  const handleControlClickWithTab = (control: any) => {
    handleControlClick(control, setActiveTab);
  };

  const handleBreadcrumbClick = (index: number) => {
    if (index === 0) handleBackToFrameworks(setActiveTab);
    else if (index === 1 && selectedFramework) handleBackToControls(setActiveTab);
  };

  const handleLogout = () => {
    logout();
  };

  return (
    <div className="min-h-screen bg-hlola-gradient">
      {/* Background Elements */}
      <div className="absolute inset-0 overflow-hidden">
        <div className="absolute -top-40 -right-40 w-80 h-80 bg-hlola-blue rounded-full mix-blend-multiply filter blur-xl opacity-5 animate-pulse"></div>
        <div className="absolute -bottom-40 -left-40 w-80 h-80 bg-hlola-cyan rounded-full mix-blend-multiply filter blur-xl opacity-5 animate-pulse"></div>
      </div>

      <div className="relative z-10">
        {/* Header */}
        <header className="glass-nav border-b border-hlola-cyan/20">
          <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
            <div className="flex items-center justify-between h-16">
              <div className="flex items-center gap-4">
                <div className="flex items-center gap-3">
                  <div className="w-8 h-8 bg-hlola-gradient-strong rounded-lg flex items-center justify-center">
                    <ShieldCheck className="w-5 h-5 text-white" />
                  </div>
                  <h1 className="text-xl font-bold text-hlola-blue">Admin Portal</h1>
                </div>
              </div>
              
              <div className="flex items-center gap-4">
                <div className="relative">
                  <Search className="absolute left-3 top-1/2 transform -translate-y-1/2 w-4 h-4 text-slate-400" />
                  <input
                    type="text"
                    placeholder="Search..."
                    value={searchQuery}
                    onChange={(e) => setSearchQuery(e.target.value)}
                    className="pl-10 pr-4 py-2 bg-white/80 border border-hlola-cyan/30 rounded-lg text-slate-800 placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-hlola-cyan backdrop-blur-sm"
                  />
                </div>
                
                {/* Admin Info */}
                {admin && (
                  <div className="flex items-center gap-2 px-3 py-1 bg-white/80 rounded-lg backdrop-blur-sm">
                    <div className="w-6 h-6 bg-hlola-gradient-strong rounded-full flex items-center justify-center">
                      <span className="text-white text-xs font-semibold">
                        {admin.firstName?.charAt(0)}{admin.lastName?.charAt(0)}
                      </span>
                    </div>
                    <span className="text-slate-700 text-sm font-medium">
                      {admin.firstName} {admin.lastName}
                    </span>
                  </div>
                )}
                
                <button className="p-2 text-slate-400 hover:text-hlola-blue transition-colors">
                  <Settings className="w-5 h-5" />
                </button>
                <button 
                  onClick={handleLogout}
                  className="p-2 text-slate-400 hover:text-red-500 transition-colors"
                  title="Logout"
                >
                  <LogOut className="w-5 h-5" />
                </button>
              </div>
            </div>
          </div>
        </header>

        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
          {/* Stats Cards */}
          <StatsCards stats={stats} />

          {/* Breadcrumb Navigation */}
          <Breadcrumb items={breadcrumb} onNavigate={handleBreadcrumbClick} />

          {/* Navigation Tabs */}
          <div className="glass rounded-2xl p-2 mb-8">
            <nav className="flex space-x-2">
              {[
                { id: 'frameworks', name: 'Frameworks', icon: Layers },
                { id: 'controls', name: 'Controls', icon: ShieldCheck },
                { id: 'tasks', name: 'Tasks', icon: CheckSquare },
                { id: 'bulk-import', name: 'Bulk Import', icon: Upload },
                { id: 'audit-logs', name: 'Audit Logs', icon: Clock }
              ].map((tab) => (
                <button
                  key={tab.id}
                  onClick={() => handleTabSwitch(tab.id)}
                  className={`flex items-center gap-2 px-4 py-2 rounded-xl font-medium transition-all ${
                    activeTab === tab.id
                      ? 'bg-hlola-blue text-white shadow-lg'
                      : 'text-slate-600 hover:text-hlola-blue hover:bg-hlola-cyan/10'
                  }`}
                >
                  <tab.icon className="w-4 h-4" />
                  {tab.name}
                </button>
              ))}
            </nav>
          </div>

          {/* Content Area */}
          <div className="glass rounded-2xl overflow-hidden">
            {/* Content Header */}
            <div className="px-6 py-4 border-b border-hlola-cyan/20 flex items-center justify-between">
              <div>
                <h2 className="text-xl font-semibold text-hlola-blue capitalize">
                  {selectedFramework && selectedControl ? `${selectedControl.title} Tasks` :
                   selectedFramework ? `${selectedFramework.name} Controls` :
                   activeTab.replace('-', ' ')}
                </h2>
                <p className="text-slate-600 text-sm">
                  {selectedFramework && selectedControl ? `Tasks for control ${selectedControl.control_id} in ${selectedFramework.name}` :
                   selectedFramework ? `Controls within the ${selectedFramework.name} framework` :
                   activeTab === 'frameworks' && 'Manage compliance frameworks and their controls'}
                  {activeTab === 'controls' && !selectedFramework && 'Select a framework to view its controls'}
                  {activeTab === 'tasks' && !selectedControl && 'Select a control to view its tasks'}
                  {activeTab === 'bulk-import' && 'Import frameworks, controls, and tasks in bulk'}
                  {activeTab === 'audit-logs' && 'View administrative actions and changes'}
                </p>
              </div>
              <button
                onClick={() => setShowCreateModal(true)}
                className="flex items-center gap-2 px-4 py-2 bg-hlola-gradient-strong text-white rounded-lg hover:opacity-90 transition-all"
              >
                <Plus className="w-4 h-4" />
                Add {selectedFramework && selectedControl ? 'Task' :
                     selectedFramework ? 'Control' :
                     activeTab === 'frameworks' ? 'Framework' : 
                     activeTab === 'controls' ? 'Control' : 
                     activeTab === 'tasks' ? 'Task' : 'Item'}
              </button>
            </div>

            {/* Content Body */}
            <div className="p-6">
              {loading ? (
                <div className="flex items-center justify-center py-12">
                  <div className="w-8 h-8 border-4 border-hlola-blue border-t-transparent rounded-full animate-spin"></div>
                  <span className="ml-3 text-slate-600">Loading data...</span>
                </div>
              ) : error ? (
                <div className="text-center py-12">
                  <div className="text-red-500 mb-4">{error}</div>
                  <button 
                    onClick={() => window.location.reload()} 
                    className="px-4 py-2 bg-hlola-blue text-white rounded-lg hover:opacity-90"
                  >
                    Retry
                  </button>
                </div>
              ) : (
                <>
                  {activeTab === 'frameworks' && (
                    <FrameworksSection 
                      frameworks={frameworks} 
                      onFrameworkClick={handleFrameworkClickWithTab}
                      onFrameworkDelete={handleDeleteFramework}
                      onFrameworkEdit={handleEditFramework}
                      loading={loading}
                    />
                  )}

                  {activeTab === 'controls' && (
                    <ControlsSection 
                      controls={getCurrentControls}
                      onControlClick={handleControlClickWithTab}
                      loading={loading}
                    />
                  )}

                  {activeTab === 'tasks' && (
                    <TasksSection 
                      tasks={getCurrentTasks}
                      onTaskClick={(task) => {
                        // TODO: Implement task click handler
                        console.log('Task clicked:', task);
                      }}
                      loading={loading}
                    />
                  )}

                  {activeTab === 'bulk-import' && (
                <div className="text-center py-12">
                  <Upload className="w-16 h-16 text-slate-400 mx-auto mb-4" />
                  <h3 className="text-lg font-semibold text-hlola-blue mb-2">Bulk Import</h3>
                  <p className="text-slate-600 mb-6">Upload CSV or Excel files to import frameworks, controls, and tasks</p>
                  <button className="px-6 py-3 bg-hlola-gradient-strong text-white rounded-lg hover:opacity-90 transition-all">
                    Choose Files
                  </button>
                </div>
              )}

                  {activeTab === 'audit-logs' && (
                <div className="space-y-4">
                  {[
                    { action: 'Framework Created', item: 'GDPR', user: 'Admin User', time: '2 hours ago' },
                    { action: 'Control Updated', item: 'A.5.1.1', user: 'Admin User', time: '4 hours ago' },
                    { action: 'Task Created', item: 'Review Policy', user: 'Admin User', time: '6 hours ago' },
                    { action: 'Bulk Import', item: '3 Frameworks', user: 'Admin User', time: '1 day ago' }
                  ].map((log, index) => (
                    <div key={index} className="glass rounded-xl p-4">
                      <div className="flex items-center justify-between">
                        <div className="flex items-center gap-3">
                          <div className="w-8 h-8 bg-hlola-gradient-strong rounded-lg flex items-center justify-center">
                            <Clock className="w-4 h-4 text-white" />
                          </div>
                          <div>
                            <p className="text-hlola-blue font-medium">{log.action}</p>
                            <p className="text-slate-600 text-sm">{log.item} • {log.user}</p>
                          </div>
                        </div>
                        <span className="text-slate-500 text-sm">{log.time}</span>
                      </div>
                    </div>
                  ))}
                </div>
                  )}
                </>
              )}
            </div>
          </div>
        </div>
      </div>

      {/* Modals */}
        <CreateFrameworkModal
          isOpen={showCreateModal && activeTab === 'frameworks' && selectedFramework === null}
          onClose={() => setShowCreateModal(false)}
          onSubmit={handleCreateFramework}
          isSubmitting={isSubmitting}
        />

      <CreateControlModal
        isOpen={showCreateModal && (activeTab === 'controls' || (activeTab === 'frameworks' && selectedFramework !== null))}
        onClose={() => setShowCreateModal(false)}
        onSubmit={handleCreateControl}
        framework={selectedFramework}
      />

      <CreateTaskModal
        isOpen={showCreateModal && (activeTab === 'tasks' || (activeTab === 'frameworks' && selectedFramework !== null && selectedControl !== null))}
        onClose={() => setShowCreateModal(false)}
        onSubmit={handleCreateTask}
        control={selectedControl}
      />

      <DeleteFrameworkModal
        isOpen={showDeleteModal}
        onClose={() => {
          setShowDeleteModal(false);
          setFrameworkToDelete(null);
        }}
        onConfirm={confirmDeleteFramework}
        frameworkName={frameworkToDelete?.name || ''}
        isDeleting={isDeleting}
      />

      <EditFrameworkModal
        isOpen={showEditModal}
        onClose={() => {
          setShowEditModal(false);
          setFrameworkToEdit(null);
        }}
        onSubmit={handleEditFrameworkSubmit}
        framework={frameworkToEdit}
        isSubmitting={isEditing}
      />

      {/* Success Notification */}
      <SuccessNotification
        message={successMessage}
        isVisible={showSuccessNotification}
        onClose={() => setShowSuccessNotification(false)}
      />
    </div>
  );
}
