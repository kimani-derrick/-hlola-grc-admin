#!/usr/bin/env python3
"""
Black Coffee Track Audio Generator
This script helps you create an MP3 from your Strudel track
"""

import os
import webbrowser
import time

def main():
    print("🎵 Black Coffee Track Audio Generator")
    print("=" * 40)
    
    print("\n📋 Your Black Coffee Track Code:")
    print("-" * 30)
    
    track_code = '''// Black Coffee Inspired South African House - Simple Version
// This should definitely work!

// Set tempo to house music speed
setcpm(128)

// Main kick drum pattern - Black Coffee style
d1 $ s "bd*2 ~ bd ~" # gain 0.8

// Hi-hats for groove
d2 $ s "hh*8" # gain 0.4

// Deep bassline - signature Black Coffee sound
d3 $ n "c2 ~ ~ c2 ~ ~ ~ ~" # s "bass" # gain 0.7

// Add some African percussion
d4 $ s "~ conga:2 ~ conga:1 ~ conga:3 ~" # gain 0.5

// Jazzy chord progression
d5 $ n "c4 e4 g4 ~" # s "piano" # gain 0.4

// Melodic lead with African scales
d6 $ n "c5 d5 f5 g5 a5 ~ ~ ~" # s "saw" # gain 0.3

// Clear any existing sounds
hush'''
    
    print(track_code)
    
    print("\n🚀 How to Generate MP3:")
    print("-" * 25)
    print("1. Open the HTML recorder: black_coffee_recorder.html")
    print("2. Or go to https://strudel.cc/ and paste the code")
    print("3. Use browser recording tools to capture audio")
    print("4. Save as MP3/WAV file")
    
    print("\n🎛️ Alternative Methods:")
    print("-" * 22)
    print("• Use OBS Studio to record screen + audio")
    print("• Use Audacity to record system audio")
    print("• Use browser developer tools to record")
    
    print("\n📁 Files created:")
    print("- black_coffee_inspired.strudel (your track)")
    print("- black_coffee_recorder.html (recording tool)")
    print("- generate_audio.py (this script)")
    
    # Open the HTML recorder
    html_file = os.path.abspath("black_coffee_recorder.html")
    print(f"\n🌐 Opening recorder: {html_file}")
    webbrowser.open(f"file://{html_file}")

if __name__ == "__main__":
    main()
