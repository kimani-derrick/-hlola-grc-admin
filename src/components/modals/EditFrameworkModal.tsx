import { useState, useEffect } from 'react';
import { X, Shield, Globe, Building, Heart, Lock, CreditCard } from 'lucide-react';
import { Framework } from '@/types';

interface EditFrameworkModalProps {
  isOpen: boolean;
  onClose: () => void;
  onSubmit: (id: string, data: EditFrameworkFormData) => void;
  framework: Framework | null;
  isSubmitting?: boolean;
}

export interface EditFrameworkFormData {
  name: string;
  description: string;
  region: string;
  country: string;
  category: string;
  type: string;
  priority: string;
  riskLevel: string;
  status: string;
  industryScope: string;
  maxFineAmount: string;
  maxFineCurrency: string;
}

const categoryIcons = {
  'Privacy': Shield,
  'Security': Lock,
  'Compliance': Building,
  'Risk': Shield,
  'Financial': CreditCard,
  'Healthcare': Heart,
};

const categoryColors = {
  'Privacy': '#10B981',
  'Security': '#EF4444',
  'Compliance': '#8B5CF6',
  'Risk': '#F59E0B',
  'Financial': '#06B6D4',
  'Healthcare': '#EC4899',
};

export const EditFrameworkModal = ({ isOpen, onClose, onSubmit, framework, isSubmitting: externalIsSubmitting }: EditFrameworkModalProps) => {
  const [formData, setFormData] = useState<EditFrameworkFormData>({
    name: '',
    description: '',
    region: 'Global',
    country: '',
    category: 'Privacy',
    type: 'Legal',
    priority: 'high',
    riskLevel: 'high',
    status: 'active',
    industryScope: 'All',
    maxFineAmount: '0',
    maxFineCurrency: 'EUR',
  });

  const isSubmitting = externalIsSubmitting || false;

  // Update form data when framework changes
  useEffect(() => {
    if (framework) {
      setFormData({
        name: framework.name || '',
        description: framework.description || '',
        region: framework.region || 'Global',
        country: framework.country || '',
        category: framework.category || 'Privacy',
        type: framework.type || 'Legal',
        priority: framework.priority || 'high',
        riskLevel: framework.risk_level || 'high',
        status: framework.status || 'active',
        industryScope: framework.industry_scope || 'All',
        maxFineAmount: framework.max_fine_amount?.toString() || '0',
        maxFineCurrency: framework.max_fine_currency || 'EUR',
      });
    }
  }, [framework]);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    if (framework) {
      onSubmit(framework.id, formData);
    }
  };

  const handleChange = (field: keyof EditFrameworkFormData, value: string) => {
    setFormData(prev => ({ ...prev, [field]: value }));
  };

  if (!isOpen || !framework) return null;

  const Icon = categoryIcons[formData.category as keyof typeof categoryIcons] || Shield;

  return (
    <div className="fixed inset-0 bg-black/70 backdrop-blur-sm z-[99999] flex items-center justify-center p-4">
      <div className="bg-white rounded-xl shadow-2xl w-full max-w-2xl max-h-[90vh] overflow-hidden">
        {/* Header */}
        <div className="flex items-center justify-between p-6 border-b border-slate-200 bg-slate-50">
          <div className="flex items-center gap-3">
            <div 
              className="w-10 h-10 rounded-lg flex items-center justify-center"
              style={{ backgroundColor: categoryColors[formData.category as keyof typeof categoryColors] + '20' }}
            >
              <Icon 
                className="w-5 h-5"
                style={{ color: categoryColors[formData.category as keyof typeof categoryColors] }}
              />
            </div>
            <div>
              <h2 className="text-xl font-semibold text-slate-800">Edit Framework</h2>
              <p className="text-sm text-slate-500">Update framework information</p>
            </div>
          </div>
          <button
            onClick={onClose}
            className="p-2 text-slate-400 hover:text-slate-600 hover:bg-slate-200 rounded-lg transition-colors"
            disabled={isSubmitting}
          >
            <X className="w-5 h-5" />
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
                    Framework Name <span className="text-red-500">*</span>
                  </label>
                  <input
                    type="text"
                    value={formData.name}
                    onChange={(e) => handleChange('name', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., GDPR, HIPAA, ISO 27001"
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
                    placeholder="Describe the framework's purpose and scope..."
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Category <span className="text-red-500">*</span></label>
                  <select
                    value={formData.category}
                    onChange={(e) => handleChange('category', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    required
                    disabled={isSubmitting}
                  >
                    <option value="Privacy">Privacy</option>
                    <option value="Security">Security</option>
                    <option value="Compliance">Compliance</option>
                    <option value="Risk">Risk</option>
                    <option value="Financial">Financial</option>
                    <option value="Healthcare">Healthcare</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Type <span className="text-red-500">*</span></label>
                  <select
                    value={formData.type}
                    onChange={(e) => handleChange('type', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    required
                    disabled={isSubmitting}
                  >
                    <option value="Legal">Legal</option>
                    <option value="Standards">Standards</option>
                    <option value="Industry">Industry</option>
                    <option value="International">International</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Priority</label>
                  <select
                    value={formData.priority}
                    onChange={(e) => handleChange('priority', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  >
                    <option value="low">Low</option>
                    <option value="medium">Medium</option>
                    <option value="high">High</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Risk Level</label>
                  <select
                    value={formData.riskLevel}
                    onChange={(e) => handleChange('riskLevel', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  >
                    <option value="low">Low</option>
                    <option value="medium">Medium</option>
                    <option value="high">High</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Status</label>
                  <select
                    value={formData.status}
                    onChange={(e) => handleChange('status', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  >
                    <option value="active">Active</option>
                    <option value="draft">Draft</option>
                    <option value="deprecated">Deprecated</option>
                  </select>
                </div>
              </div>
            </div>

            {/* Geographic Scope */}
            <div>
              <h3 className="text-sm font-semibold text-slate-700 mb-4">Geographic Scope</h3>
              <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Region</label>
                  <select
                    value={formData.region}
                    onChange={(e) => handleChange('region', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  >
                    <option value="Global">Global</option>
                    <option value="Europe">Europe</option>
                    <option value="North America">North America</option>
                    <option value="Asia Pacific">Asia Pacific</option>
                    <option value="Africa">Africa</option>
                    <option value="Middle East">Middle East</option>
                    <option value="Latin America">Latin America</option>
                  </select>
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Country</label>
                  <input
                    type="text"
                    value={formData.country}
                    onChange={(e) => handleChange('country', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., United States, Germany"
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Industry Scope</label>
                  <input
                    type="text"
                    value={formData.industryScope}
                    onChange={(e) => handleChange('industryScope', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="e.g., All, Healthcare, Finance"
                    disabled={isSubmitting}
                  />
                </div>
              </div>
            </div>

            {/* Financial Impact */}
            <div>
              <h3 className="text-sm font-semibold text-slate-700 mb-4">Financial Impact</h3>
              <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Maximum Fine Amount</label>
                  <input
                    type="number"
                    value={formData.maxFineAmount}
                    onChange={(e) => handleChange('maxFineAmount', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    placeholder="0"
                    min="0"
                    step="0.01"
                    disabled={isSubmitting}
                  />
                </div>

                <div>
                  <label className="block text-sm font-medium text-slate-700 mb-1">Currency</label>
                  <select
                    value={formData.maxFineCurrency}
                    onChange={(e) => handleChange('maxFineCurrency', e.target.value)}
                    className="w-full px-3 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-hlola-blue focus:border-transparent"
                    disabled={isSubmitting}
                  >
                    <option value="EUR">EUR</option>
                    <option value="USD">USD</option>
                    <option value="GBP">GBP</option>
                    <option value="JPY">JPY</option>
                    <option value="CNY">CNY</option>
                  </select>
                </div>
              </div>
            </div>
          </div>
        </form>

        {/* Footer */}
        <div className="flex items-center justify-end gap-3 p-6 border-t border-slate-200 bg-slate-50">
          <button
            type="button"
            onClick={onClose}
            className="px-4 py-2 text-slate-600 bg-white border border-slate-300 rounded-lg hover:bg-slate-50 transition-colors font-medium"
            disabled={isSubmitting}
          >
            Cancel
          </button>
          <button
            onClick={handleSubmit}
            className="px-4 py-2 bg-hlola-blue text-white rounded-lg hover:bg-hlola-blue/90 transition-colors font-medium disabled:opacity-50 disabled:cursor-not-allowed flex items-center gap-2"
            disabled={isSubmitting || !formData.name}
          >
            {isSubmitting ? (
              <>
                <div className="w-4 h-4 border-2 border-white border-t-transparent rounded-full animate-spin" />
                Updating...
              </>
            ) : (
              'Update Framework'
            )}
          </button>
        </div>
      </div>
    </div>
  );
};

