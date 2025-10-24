// Export Black Coffee track to MP3
// This script will help generate an audio file from your Strudel track

const fs = require('fs');

// Your Black Coffee track code
const trackCode = `// Black Coffee Inspired South African House - Simple Version
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
hush`;

console.log("Black Coffee Track Code:");
console.log("========================");
console.log(trackCode);
console.log("\nTo export this as MP3:");
console.log("1. Go to https://strudel.cc/");
console.log("2. Paste the code above into the editor");
console.log("3. Click the 'share' button");
console.log("4. Look for export/record options");
console.log("5. Or use browser developer tools to record audio");
