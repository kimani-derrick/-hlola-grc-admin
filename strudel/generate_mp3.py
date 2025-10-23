#!/usr/bin/env python3
"""
Generate Black Coffee Track as MP3
This script creates an actual MP3 file you can play in VLC
"""

import numpy as np
import wave
import struct
import math
import os

def generate_tone(frequency, duration, sample_rate=44100, amplitude=0.3):
    """Generate a sine wave tone"""
    frames = int(duration * sample_rate)
    arr = np.zeros(frames)
    
    for i in range(frames):
        arr[i] = amplitude * math.sin(2 * math.pi * frequency * i / sample_rate)
    
    return arr

def generate_kick_drum(duration, sample_rate=44100):
    """Generate a kick drum sound"""
    frames = int(duration * sample_rate)
    arr = np.zeros(frames)
    
    # Kick drum: low frequency with decay
    for i in range(frames):
        t = i / sample_rate
        decay = math.exp(-t * 8)  # Fast decay
        freq = 60 * math.exp(-t * 3)  # Frequency sweep from 60Hz down
        if freq < 20:
            freq = 20
        arr[i] = 0.8 * decay * math.sin(2 * math.pi * freq * t)
    
    return arr

def generate_hihat(duration, sample_rate=44100):
    """Generate a hi-hat sound"""
    frames = int(duration * sample_rate)
    arr = np.zeros(frames)
    
    # Hi-hat: high frequency noise with quick decay
    for i in range(frames):
        t = i / sample_rate
        decay = math.exp(-t * 20)  # Very fast decay
        noise = (np.random.random() - 0.5) * 2  # White noise
        arr[i] = 0.3 * decay * noise
    
    return arr

def generate_bass_note(frequency, duration, sample_rate=44100):
    """Generate a bass note"""
    frames = int(duration * sample_rate)
    arr = np.zeros(frames)
    
    for i in range(frames):
        t = i / sample_rate
        decay = math.exp(-t * 2)  # Slow decay for bass
        # Add some harmonics for richer sound
        fundamental = math.sin(2 * math.pi * frequency * t)
        harmonic2 = 0.3 * math.sin(2 * math.pi * frequency * 2 * t)
        harmonic3 = 0.1 * math.sin(2 * math.pi * frequency * 3 * t)
        arr[i] = 0.7 * decay * (fundamental + harmonic2 + harmonic3)
    
    return arr

def create_black_coffee_track():
    """Create the Black Coffee inspired track"""
    sample_rate = 44100
    duration = 8  # 8 seconds
    total_frames = int(duration * sample_rate)
    
    # Initialize the track
    track = np.zeros(total_frames)
    
    # Beat pattern: "bd*2 ~ bd ~" = kick on beats 1, 2, 4
    # 4/4 time, 128 BPM = 0.46875 seconds per beat
    beat_duration = 60.0 / 128  # 0.46875 seconds
    
    # Generate kick drums
    kick_positions = [0, beat_duration, 3 * beat_duration]  # Beats 1, 2, 4
    for pos in kick_positions:
        start_frame = int(pos * sample_rate)
        kick = generate_kick_drum(0.3, sample_rate)
        end_frame = min(start_frame + len(kick), total_frames)
        track[start_frame:end_frame] += kick[:end_frame-start_frame]
    
    # Generate hi-hats: "hh*8" = 8 hi-hats per measure
    for beat in range(8):  # 8 beats total
        for subdivision in range(2):  # 2 hi-hats per beat
            pos = beat * beat_duration + subdivision * beat_duration / 2
            start_frame = int(pos * sample_rate)
            hihat = generate_hihat(0.1, sample_rate)
            end_frame = min(start_frame + len(hihat), total_frames)
            track[start_frame:end_frame] += hihat[:end_frame-start_frame] * 0.3
    
    # Generate bassline: "c2 ~ ~ c2 ~ ~ ~ ~"
    # C2 = 65.41 Hz
    c2_freq = 65.41
    bass_positions = [0, 3 * beat_duration]  # C2 on beats 1 and 4
    for pos in bass_positions:
        start_frame = int(pos * sample_rate)
        bass_duration = 2 * beat_duration  # Hold for 2 beats
        bass = generate_bass_note(c2_freq, bass_duration, sample_rate)
        end_frame = min(start_frame + len(bass), total_frames)
        track[start_frame:end_frame] += bass[:end_frame-start_frame] * 0.6
    
    # Normalize and convert to 16-bit
    track = track / np.max(np.abs(track)) * 0.8
    track_16bit = (track * 32767).astype(np.int16)
    
    return track_16bit, sample_rate

def save_as_wav(audio_data, sample_rate, filename):
    """Save audio data as WAV file"""
    with wave.open(filename, 'w') as wav_file:
        wav_file.setnchannels(1)  # Mono
        wav_file.setsampwidth(2)  # 16-bit
        wav_file.setframerate(sample_rate)
        wav_file.writeframes(audio_data.tobytes())

def convert_to_mp3(wav_file, mp3_file):
    """Convert WAV to MP3 using ffmpeg"""
    import subprocess
    try:
        subprocess.run(['ffmpeg', '-i', wav_file, '-acodec', 'mp3', '-ab', '192k', mp3_file], 
                      check=True, capture_output=True)
        return True
    except (subprocess.CalledProcessError, FileNotFoundError):
        return False

def main():
    print("🎵 Generating Black Coffee Track...")
    print("=" * 40)
    
    # Generate the track
    audio_data, sample_rate = create_black_coffee_track()
    
    # Save as WAV first
    wav_filename = "black_coffee_track.wav"
    save_as_wav(audio_data, sample_rate, wav_filename)
    print(f"✅ Created: {wav_filename}")
    
    # Try to convert to MP3
    mp3_filename = "black_coffee_track.mp3"
    if convert_to_mp3(wav_filename, mp3_filename):
        print(f"✅ Created: {mp3_filename}")
        print(f"\n🎵 You can now play {mp3_filename} in VLC!")
    else:
        print(f"⚠️  Could not create MP3 (ffmpeg not found)")
        print(f"🎵 You can play {wav_filename} in VLC instead!")
    
    print(f"\n📁 Files created in: {os.getcwd()}")
    print("\n🎶 Track features:")
    print("- 128 BPM house beat")
    print("- Deep kick drums (Black Coffee style)")
    print("- Steady hi-hat groove")
    print("- Deep bassline on C2")
    print("- 8 seconds duration")

if __name__ == "__main__":
    main()
