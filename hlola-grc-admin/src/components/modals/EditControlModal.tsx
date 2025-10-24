import { useState, useEffect } from 'react';
import { X, Shield, AlertCircle } from 'lucide-react';
import { Control } from '@/types';

interface EditControlModalProps {
  isOpen: boolean;
  onClose: () => void;
  onSubmit: (id: string, data: any) => void;
  control: Control | null;
  isSubmitting?: boolean;
}

export interface EditControlFormData {
  controlId: string;
  title: string;
  description: string;
  category: string;
  subcategory: string;
  priority: string;
  implementationLevel: string;
  businessImpact: string;
  technicalRequirements: string;
  legalRequirements: string;
  implementationGuidance: string;
  testingProcedures: string;
}

const categoryIcons = {
  'Technical': Shield,
  'Administrative': AlertCircle,
  'Physical': Shield,
  'Legal': AlertCircle,
};

const categoryColors = {
  'Technical': '#10B981',
  'Administrative': '#8B5CF6',
  'Physical': '#F59E0B',
  'Legal': '#EF4444',
};

export const EditControlModal = ({ isOpen, onClose, onSubmit, control, isSubmitting: externalIsSubmitting }: EditControlModalProps) => {
  const [formData, setFormData] = useState<EditControlFormData>({
    controlId: '',
    title: '',
    description: '',
    category: 'Technical',
    subcategory: '',
    priority: 'medium',
    implementationLevel: 'basic',
    businessImpact: '',
    technicalRequirements: '',
    legalRequirements: '',
    implementationGuidance: '',
    testingProcedures: '',
  });

  const isSubmitting = externalIsSubmitting || false;

  // Update form data when control changes
  useEffect(() => {
    if (control) {
      setFormData({
        controlId: control.control_id || '',
        title: control.title || '',
        description: control.description || '',
        category: control.category || 'Technical',
        subcategory: control.subcategory || '',
        priority: control.priority || 'medium',
        implementationLevel: control.implementation_level || 'basic',
        businessImpact: control.businessImpact || '',
        technicalRequirements: control.technicalRequirements || '',
        legalRequirements: control.legalRequirements || '',
        implementationGuidance: control.implementationGuidance || '',
        testingProcedures: control.testingProcedures || '',
      });
    }
  }, [control]);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    if (control) {
      onSubmit(control.id, formData);
    }
  };

  const handleChange = (field: keyof EditControlFormData, value: string) => {
    setFormData(prev => ({ ...prev, [field]: value }));
  };

  if (!isOpen || !control) return null;

  const Icon = categoryIcons[formData.category as keyof typeof categoryIcons] || Shield;
  const iconColor = categoryColors[formData.category as keyof typeof categoryColors] || '#10B981';

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
        className="bg-white rounded-2xl w-full max-w-4xl max-h-[90vh] overflow-hidden shadow-2xl"
        style={{ maxWidth: '56rem' }}
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
              <h2 className="text-xl font-semibold text-slate-900">Edit Control</h2>
              <p className="text-sm text-slate-600">
                Update control details for {control.title}
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
                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">
                    Control ID <span className="text-red-500">*</span>
                  </label>
                  <input
                    type="text"
                    value={formData.controlId}
                    onChange={(e) => handleChange('controlId', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., AC-1, SC-7, AU-2"
                    required
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">
                    Title <span className="text-red-500">*</span>
                  </label>
                  <input
                    type="text"
                    value={formData.title}
                    onChange={(e) => handleChange('title', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., Access Control Policy"
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
                    placeholder="Describe the control's purpose and requirements..."
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
                    <option value="Technical">Technical</option>
                    <option value="Administrative">Administrative</option>
                    <option value="Physical">Physical</option>
                    <option value="Legal">Legal</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Subcategory</label>
                  <input
                    type="text"
                    value={formData.subcategory}
                    onChange={(e) => handleChange('subcategory', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., Access Control, Network Security"
                    disabled={isSubmitting}
                  />
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
                  <label className="block text-sm font-medium text-slate-700 mb-1">
                    Implementation Level <span className="text-red-500">*</span>
                  </label>
                  <select
                    value={formData.implementationLevel}
                    onChange={(e) => handleChange('implementationLevel', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    required
                    disabled={isSubmitting}
                  >
                    <option value="basic">Basic</option>
                    <option value="intermediate">Intermediate</option>
                    <option value="advanced">Advanced</option>
                  </select>
                </div>
              </div>
            </div>

            {/* Additional Details */}
            <div>
              <h3 className="text-sm font-semibold text-slate-700 mb-4">Additional Details</h3>
              <div className="space-y-4">
                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Business Impact</label>
                  <textarea
                    value={formData.businessImpact}
                    onChange={(e) => handleChange('businessImpact', e.target.value)}
                    rows={3}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent resize-none"
                    placeholder="Describe the business impact of this control..."
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Technical Requirements</label>
                  <textarea
                    value={formData.technicalRequirements}
                    onChange={(e) => handleChange('technicalRequirements', e.target.value)}
                    rows={3}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent resize-none"
                    placeholder="Specify technical requirements and implementation details..."
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Legal Requirements</label>
                  <textarea
                    value={formData.legalRequirements}
                    onChange={(e) => handleChange('legalRequirements', e.target.value)}
                    rows={3}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent resize-none"
                    placeholder="List relevant legal and regulatory requirements..."
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Implementation Guidance</label>
                  <textarea
                    value={formData.implementationGuidance}
                    onChange={(e) => handleChange('implementationGuidance', e.target.value)}
                    rows={3}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent resize-none"
                    placeholder="Provide step-by-step implementation guidance..."
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Testing Procedures</label>
                  <textarea
                    value={formData.testingProcedures}
                    onChange={(e) => handleChange('testingProcedures', e.target.value)}
                    rows={3}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent resize-none"
                    placeholder="Describe how to test and validate this control..."
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
                'Update Control'
              )}
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};
