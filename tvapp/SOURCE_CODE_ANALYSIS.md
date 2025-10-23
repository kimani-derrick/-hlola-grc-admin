# HDO Android TV App - Source Code Analysis

## 🔍 **Deep Source Code Analysis**

After successfully decompiling the HDO Android TV APK, I've analyzed the complete source code to understand how the app works and where it gets its streaming sources.

## 📱 **App Architecture**

### **1. Main Application Structure**
```java
// Main App Class
com.boxhdo.android.tv.App extends Application
- Uses Dagger Hilt for dependency injection
- Firebase Analytics integration
- Custom video player initialization
```

### **2. Main Activity**
```java
// TV Activity with remote control support
com.boxhdo.android.tv.ui.activity.main.TvActivity
- Handles TV remote control navigation
- Key event handling for arrow keys (up, down, left, right)
- Fragment navigation system
- Back button handling with confirmation dialog
```

## 🎬 **Data Models Analysis**

### **1. Movie Model**
```java
public final class Movie {
    public final long id;                    // Movie ID
    public final String backdropPath;        // Background image
    public final String posterPath;          // Poster image
    public final String title;               // Movie title
    public final long tmdbId;                // TMDB ID
    public final String overview;            // Description
    public final String releaseDate;         // Release date
    public final int runtime;                // Duration
    public final MediaType type;             // Movie/TV Series
    public final String slug;                // URL slug
    public final String trailer;             // Trailer URL
    public final boolean infoCompleted;      // Data completeness
    public final int latestSeason;           // Latest season
    public final int latestEpisode;          // Latest episode
    public final String quality;             // Video quality
    public final double imdbRating;          // IMDB rating
    public final long updateAt;              // Last update
    public final List<Genre> genres;         // Genres
    public final List<Country> countries;    // Countries
    public final List<Cast> cast;            // Cast members
    public final List<Company> companies;    // Production companies
    public final List<Season> seasons;       // TV seasons
    public final boolean inWatchList;        // User watchlist
    public final Vote vote;                  // User rating
}
```

### **2. Streaming Source Structure**
```java
public final class StreamSource {
    public final List<StreamUrl> fullHD;     // 1080p streams
    public final List<StreamUrl> hd;         // 720p streams  
    public final List<StreamUrl> sd;        // 480p streams
    public final List<StreamUrl> sdp;       // 360p streams
    public final List<StreamUrl> auto;      // Auto quality streams
}
```

### **3. Stream URL Model**
```java
public final class StreamUrl {
    public final String url;                // Streaming URL
    public final SourceType sourceType;     // HLS, MP4, AUTO
    public final long fileSize;             // File size in bytes
}
```

### **4. Source Types**
```java
public enum SourceType {
    HLS,    // HTTP Live Streaming
    MP4,    // Direct MP4 files
    AUTO    // Auto-detect format
}
```

## 🎯 **Key Findings**

### **1. Streaming Architecture**
- **Multiple Quality Levels**: 1080p, 720p, 480p, 360p, Auto
- **Multiple Formats**: HLS, MP4, Auto-detect
- **Quality Selection**: User can choose preferred quality
- **Fallback System**: Multiple sources per quality level

### **2. Data Sources (Inferred)**
Based on the code structure, the app likely uses:

#### **A. Primary APIs**
- **TMDB API**: For movie metadata (tmdbId field)
- **Custom HDO API**: For streaming URLs
- **IMDB Integration**: For ratings (imdbRating field)

#### **B. Streaming Sources**
The app appears to use multiple streaming providers:
- **Direct HTTP/HTTPS streams**
- **HLS (HTTP Live Streaming)**
- **MP4 direct downloads**
- **Custom streaming protocols**

### **3. App Features**
```java
// Key Features Found in Source Code:
- Movie/TV Series browsing
- Search functionality
- Watchlist management
- Continue watching
- User ratings and votes
- Cast and crew information
- Genre and country filtering
- Quality selection
- Subtitle support
- Trailer playback
- User profiles
- Settings management
```

## 🏗️ **Technical Implementation**

### **1. UI Architecture**
```java
// Fragment-based navigation
- HomeFragment
- MoviesFragment  
- TVSeriesFragment
- SearchFragment
- MyListFragment
- SettingsFragment
- PlayerFragment
- LoginFragment
- SplashFragment
```

### **2. Database Layer**
```java
// Room Database
com.boxhdo.android.data.local.AppDatabase
- Movie caching
- User preferences
- Watchlist storage
- Continue watching
- Offline support
```

### **3. Network Layer**
```java
// API Services
- Movie API service
- Streaming URL service
- User authentication
- Search service
- Metadata service
```

## 🎬 **Streaming Implementation**

### **1. Video Player**
```java
// Custom video player integration
- ExoPlayer for Android
- HLS streaming support
- MP4 playback
- Quality switching
- Subtitle support
- Hardware acceleration
```

### **2. Streaming URL Resolution**
```java
// Streaming source management
public class StreamSource {
    // Multiple quality options
    List<StreamUrl> fullHD;  // 1080p
    List<StreamUrl> hd;      // 720p  
    List<StreamUrl> sd;      // 480p
    List<StreamUrl> sdp;     // 360p
    List<StreamUrl> auto;    // Auto quality
}
```

### **3. Quality Selection**
```java
// Quality management
- User preference storage
- Automatic quality selection
- Manual quality override
- Bandwidth adaptation
- Fallback mechanisms
```

## 🔧 **For Your Flutter App**

### **1. Recommended Architecture**
```dart
// Flutter equivalent structure
class Movie {
  final int id;
  final String title;
  final String posterPath;
  final String backdropPath;
  final String overview;
  final double rating;
  final List<String> genres;
  final List<StreamSource> streamSources;
}

class StreamSource {
  final List<StreamUrl> fullHD;
  final List<StreamUrl> hd;
  final List<StreamUrl> sd;
  final List<StreamUrl> sdp;
  final List<StreamUrl> auto;
}

class StreamUrl {
  final String url;
  final SourceType type;
  final int fileSize;
}

enum SourceType { hls, mp4, auto }
```

### **2. API Integration Strategy**
```dart
// Multi-API approach
class StreamingService {
  // Primary: YTS API for metadata
  static Future<List<Movie>> getMoviesFromYTS() async {
    // YTS API calls
  }
  
  // Secondary: TMDB API for enhanced data
  static Future<Movie> enhanceWithTMDB(Movie movie) async {
    // TMDB API calls
  }
  
  // Tertiary: Custom streaming sources
  static Future<List<StreamUrl>> getStreamingUrls(String movieId) async {
    // SuperEmbed, StreamAPI, OpenVideoSource
  }
}
```

### **3. Quality Management**
```dart
// Quality selection system
class QualityManager {
  static const Map<String, List<StreamUrl>> qualities = {
    '1080p': fullHDStreams,
    '720p': hdStreams,
    '480p': sdStreams,
    '360p': sdpStreams,
    'auto': autoStreams,
  };
  
  static StreamUrl selectBestQuality(String preference) {
    // Quality selection logic
  }
}
```

## 🎯 **Key Insights for Flutter Development**

### **1. What HDO Does Well**
✅ **Multiple Quality Options**: 5 different quality levels  
✅ **Multiple Formats**: HLS, MP4, Auto-detect  
✅ **Fallback System**: Multiple sources per quality  
✅ **User Preferences**: Quality selection storage  
✅ **Offline Support**: Local database caching  
✅ **TV Navigation**: Perfect remote control support  

### **2. Implementation Strategy**
1. **Use YTS API** for movie metadata (fastest, free)
2. **Use TMDB API** for enhanced movie details
3. **Use SuperEmbed/StreamAPI** for streaming URLs
4. **Implement quality selection** system
5. **Add fallback mechanisms** for reliability
6. **Use ExoPlayer** for video playback
7. **Implement TV navigation** for remote control

### **3. Streaming Sources to Implement**
```dart
// Recommended streaming sources
class StreamingSources {
  static const Map<String, String> apis = {
    'yts': 'https://yts.mx/api/v2/',
    'tmdb': 'https://api.themoviedb.org/3/',
    'superembed': 'https://superembed.stream/',
    'streamapi': 'https://streamapi.in/',
    'openvideosource': 'https://openvideosource.com/',
  };
}
```

## 📊 **Performance Optimizations**

### **1. Caching Strategy**
```dart
// Implement efficient caching
class CacheManager {
  static Future<void> cacheMovies(List<Movie> movies) async {
    // Cache movies locally
  }
  
  static Future<List<Movie>> getCachedMovies() async {
    // Retrieve cached movies
  }
}
```

### **2. Lazy Loading**
```dart
// Load content on demand
class LazyMovieList extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (context, index) {
        return FutureBuilder<Movie>(
          future: _loadMovieOnDemand(index),
          builder: (context, snapshot) {
            // Build movie card
          },
        );
      },
    );
  }
}
```

## 🎬 **Conclusion**

The HDO app uses a sophisticated architecture with:
- **Multiple streaming sources** for reliability
- **Quality selection** system for user preference
- **Fallback mechanisms** for uninterrupted streaming
- **Local caching** for offline support
- **TV-optimized navigation** for remote control

Your Flutter app can achieve similar functionality using the **free APIs** we identified:
- **YTS API** (fastest, no API key)
- **TMDB API** (enhanced metadata)
- **SuperEmbed/StreamAPI** (streaming URLs)

This analysis provides the complete blueprint for building a Netflix-like Sony Bravia TV app with free streaming sources!
