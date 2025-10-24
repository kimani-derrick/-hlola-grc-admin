#!/usr/bin/env python3
"""
HTML to PDF Converter
Converts HTML invoice to PDF using weasyprint
"""

import os
import sys
from pathlib import Path

def install_weasyprint():
    """Install weasyprint if not already installed"""
    try:
        import weasyprint
        print("✓ weasyprint is already installed")
        return True
    except ImportError:
        print("Installing weasyprint...")
        import subprocess
        try:
            subprocess.check_call([sys.executable, "-m", "pip", "install", "weasyprint"])
            print("✓ weasyprint installed successfully")
            return True
        except subprocess.CalledProcessError as e:
            print(f"✗ Failed to install weasyprint: {e}")
            return False

def convert_html_to_pdf(html_file, output_file=None):
    """Convert HTML file to PDF"""
    try:
        import weasyprint
        
        # Set default output filename if not provided
        if output_file is None:
            html_path = Path(html_file)
            output_file = html_path.with_suffix('.pdf')
        
        print(f"Converting {html_file} to {output_file}...")
        
        # Convert HTML to PDF
        weasyprint.HTML(filename=html_file).write_pdf(output_file)
        
        print(f"✓ PDF generated successfully: {output_file}")
        return True
        
    except Exception as e:
        print(f"✗ Error converting HTML to PDF: {e}")
        return False

def main():
    """Main function"""
    html_file = "invoice.html"
    
    # Check if HTML file exists
    if not os.path.exists(html_file):
        print(f"✗ HTML file '{html_file}' not found")
        return False
    
    # Install weasyprint if needed
    if not install_weasyprint():
        return False
    
    # Convert HTML to PDF
    success = convert_html_to_pdf(html_file)
    
    if success:
        print("\n🎉 Invoice PDF generated successfully!")
        print("You can find the PDF file in the current directory.")
    else:
        print("\n❌ Failed to generate PDF")
    
    return success

if __name__ == "__main__":
    main()
