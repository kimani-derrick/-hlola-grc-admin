import { useState, useEffect } from 'react';
import { X, CheckSquare, AlertCircle } from 'lucide-react';
import { Task } from '@/types';

interface EditTaskModalProps {
  isOpen: boolean;
  onClose: () => void;
  onSubmit: (id: string, data: any) => void;
  task: Task | null;
  isSubmitting?: boolean;
}

export interface EditTaskFormData {
  title: string;
  description: string;
  category: string;
  priority: string;
  frequency: string;
  estimatedHours: number;
  dueDate: string;
  assigneeId: string;
}

const categoryIcons = {
  'Implementation': CheckSquare,
  'Review': AlertCircle,
  'Testing': CheckSquare,
  'Documentation': AlertCircle,
};

const categoryColors = {
  'Implementation': '#8B5CF6',
  'Review': '#F59E0B',
  'Testing': '#10B981',
  'Documentation': '#06B6D4',
};

export const EditTaskModal = ({ isOpen, onClose, onSubmit, task, isSubmitting: externalIsSubmitting }: EditTaskModalProps) => {
  const [formData, setFormData] = useState<EditTaskFormData>({
    title: '',
    description: '',
    category: 'Implementation',
    priority: 'medium',
    frequency: 'One-time',
    estimatedHours: 1,
    dueDate: '',
    assigneeId: '',
  });

  const isSubmitting = externalIsSubmitting || false;

  // Update form data when task changes
  useEffect(() => {
    if (task) {
      setFormData({
        title: task.title || '',
        description: task.description || '',
        category: task.category || 'Implementation',
        priority: task.priority || 'medium',
        frequency: task.frequency || 'One-time',
        estimatedHours: task.estimated_hours || 1,
        dueDate: task.dueDate || '',
        assigneeId: '', // This would need to be added to Task type if available
      });
    }
  }, [task]);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    if (task) {
      onSubmit(task.id, formData);
    }
  };

  const handleChange = (field: keyof EditTaskFormData, value: string | number) => {
    setFormData(prev => ({ ...prev, [field]: value }));
  };

  if (!isOpen || !task) return null;

  const Icon = categoryIcons[formData.category as keyof typeof categoryIcons] || CheckSquare;
  const iconColor = categoryColors[formData.category as keyof typeof categoryColors] || '#8B5CF6';

  return (
    <div 
      className="fixed inset-0 bg-black/70 backdrop-blur-sm z-[99999] flex items-center justify-center"
      style={{ position: 'fixed', top: 0, left: 0, right: 0, bottom: 0 }}
      onClick={(e) => {
        if (e.target === e.currentTarget && !isSubmitting) {
          onClose();
        }
      }}
    >
      <div 
        className="bg-white rounded-2xl w-full max-w-2xl max-h-[90vh] overflow-hidden shadow-2xl"
        style={{ maxWidth: '42rem' }}
      >
        {/* Header */}
        <div className="flex items-center justify-between p-6 border-b border-slate-200 bg-slate-50">
          <div className="flex items-center gap-3">
            <div 
              className="w-10 h-10 rounded-lg flex items-center justify-center"
              style={{ backgroundColor: `${iconColor}20` }}
            >
              <Icon className="w-5 h-5" style={{ color: iconColor }} />
            </div>
            <div>
              <h2 className="text-xl font-semibold text-slate-900">Edit Task</h2>
              <p className="text-sm text-slate-600">
                Update task details for {task.title}
              </p>
            </div>
          </div>
          <button
            onClick={onClose}
            className="p-2 hover:bg-slate-100 rounded-lg transition-colors"
            disabled={isSubmitting}
          >
            <X className="w-5 h-5 text-slate-500" />
          </button>
        </div>

        {/* Form */}
        <form onSubmit={handleSubmit} className="p-6 overflow-y-auto max-h-[calc(90vh-180px)]">
          <div className="space-y-6">
            {/* Basic Information */}
            <div>
              <h3 className="text-sm font-semibold text-slate-700 mb-4">Basic Information</h3>
              <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                <div className="md:col-span-2">
                  <label className="block text-sm font-medium text-slate-700 mb-1">
                    Task Title <span className="text-red-500">*</span>
                  </label>
                  <input
                    type="text"
                    value={formData.title}
                    onChange={(e) => handleChange('title', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., Implement access control policy"
                    required
                    disabled={isSubmitting}
                  />
                </div>

                <div className="md:col-span-2">
                  <label className="block text-sm font-medium text-slate-700 mb-1">Description</label>
                  <textarea
                    value={formData.description}
                    onChange={(e) => handleChange('description', e.target.value)}
                    rows={3}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent resize-none"
                    placeholder="Describe the task requirements and objectives..."
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">
                    Category <span className="text-red-500">*</span>
                  </label>
                  <select
                    value={formData.category}
                    onChange={(e) => handleChange('category', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    required
                    disabled={isSubmitting}
                  >
                    <option value="Implementation">Implementation</option>
                    <option value="Review">Review</option>
                    <option value="Testing">Testing</option>
                    <option value="Documentation">Documentation</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">
                    Priority <span className="text-red-500">*</span>
                  </label>
                  <select
                    value={formData.priority}
                    onChange={(e) => handleChange('priority', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    required
                    disabled={isSubmitting}
                  >
                    <option value="low">Low</option>
                    <option value="medium">Medium</option>
                    <option value="high">High</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Frequency</label>
                  <select
                    value={formData.frequency}
                    onChange={(e) => handleChange('frequency', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  >
                    <option value="One-time">One-time</option>
                    <option value="Daily">Daily</option>
                    <option value="Weekly">Weekly</option>
                    <option value="Monthly">Monthly</option>
                    <option value="Quarterly">Quarterly</option>
                    <option value="Annually">Annually</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Estimated Hours</label>
                  <input
                    type="number"
                    min="0"
                    step="1"
                    value={formData.estimatedHours}
                    onChange={(e) => handleChange('estimatedHours', parseInt(e.target.value, 10) || 0)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Due Date</label>
                  <input
                    type="date"
                    value={formData.dueDate}
                    onChange={(e) => handleChange('dueDate', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Assignee ID</label>
                  <input
                    type="text"
                    value={formData.assigneeId}
                    onChange={(e) => handleChange('assigneeId', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="Enter assignee ID (optional)"
                    disabled={isSubmitting}
                  />
                </div>
              </div>
            </div>
          </div>

          {/* Actions */}
          <div className="flex items-center justify-end gap-3 pt-6 border-t border-slate-200">
            <button
              type="button"
              onClick={onClose}
              className="px-4 py-2 text-slate-600 hover:text-slate-800 transition-colors"
              disabled={isSubmitting}
            >
              Cancel
            </button>
            <button
              type="submit"
              disabled={isSubmitting}
              className="px-6 py-2 bg-hlola-blue text-white rounded-lg hover:bg-blue-700 transition-colors font-medium disabled:opacity-50 disabled:cursor-not-allowed flex items-center gap-2"
            >
              {isSubmitting ? (
                <>
                  <div className="w-4 h-4 border-2 border-white border-t-transparent rounded-full animate-spin" />
                  Updating...
                </>
              ) : (
                'Update Task'
              )}
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};
