#!/usr/bin/env python3
"""
Simple HTML to PDF converter using wkhtmltopdf
"""

import os
import subprocess
import sys
from pathlib import Path

def convert_html_to_pdf(html_file, output_file=None):
    """Convert HTML file to PDF using wkhtmltopdf"""
    
    # Set default output filename if not provided
    if output_file is None:
        html_path = Path(html_file)
        output_file = html_path.with_suffix('.pdf')
    
    print(f"Converting {html_file} to {output_file}...")
    
    try:
        # Use wkhtmltopdf with options for better PDF output
        cmd = [
            'wkhtmltopdf',
            '--page-size', 'A4',
            '--margin-top', '0.5in',
            '--margin-right', '0.5in',
            '--margin-bottom', '0.5in',
            '--margin-left', '0.5in',
            '--encoding', 'UTF-8',
            '--disable-smart-shrinking',
            '--print-media-type',
            '--dpi', '300',
            '--zoom', '0.8',
            html_file,
            output_file
        ]
        
        # Run the conversion
        result = subprocess.run(cmd, capture_output=True, text=True)
        
        if result.returncode == 0:
            print(f"✓ PDF generated successfully: {output_file}")
            return True
        else:
            print(f"✗ Error converting HTML to PDF:")
            print(f"  stdout: {result.stdout}")
            print(f"  stderr: {result.stderr}")
            return False
            
    except FileNotFoundError:
        print("✗ wkhtmltopdf not found. Please install it first.")
        return False
    except Exception as e:
        print(f"✗ Error: {e}")
        return False

def main():
    """Main function"""
    html_file = "invoice.html"
    
    # Check if HTML file exists
    if not os.path.exists(html_file):
        print(f"✗ HTML file '{html_file}' not found")
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
