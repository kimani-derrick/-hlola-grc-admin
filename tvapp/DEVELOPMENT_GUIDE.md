# Flutter Sony Bravia Netflix-like Movie Streaming App

## Overview
This guide documents the development of a Flutter-based Sony Bravia TV app that provides a Netflix-like interface for streaming movies from free sources like Dopebox, YTS, and other major streaming platforms.

## Table of Contents
1. [Project Architecture](#project-architecture)
2. [Free Movie Streaming APIs](#free-movie-streaming-apis)
3. [Flutter TV Development Setup](#flutter-tv-development-setup)
4. [Sony Bravia TV Integration](#sony-bravia-tv-integration)
5. [UI/UX Design](#uiux-design)
6. [Implementation Strategy](#implementation-strategy)
7. [Development Phases](#development-phases)
8. [Best Practices](#best-practices)

## Project Architecture

### Core Components
- **Flutter Framework**: Cross-platform development
- **TV Focus**: Optimized for remote control navigation
- **Streaming Engine**: Custom video player with multiple source support
- **Content Management**: Dynamic movie catalog with search and filtering
- **User Interface**: Netflix-inspired design with focus on TV viewing

### Technology Stack
- **Frontend**: Flutter with TV-specific widgets
- **State Management**: Provider/Riverpod for state management
- **Video Player**: Video Player Plus or ExoPlayer
- **HTTP Client**: Dio for API calls
- **Caching**: Hive for local storage
- **Navigation**: Custom TV navigation system

## Free Movie Streaming APIs

### 1. YTS (YIFY) API
```dart
// Base URL: https://yts.mx/api/v2/
// Free, no API key required
// Provides movie metadata and torrent links
```

**Endpoints:**
- `list_movies.json` - Get movie list
- `movie_details.json` - Get specific movie details
- `movie_suggestions.json` - Get similar movies

**Example Usage:**
```dart
class YTSApi {
  static const String baseUrl = 'https://yts.mx/api/v2';
  
  static Future<List<Movie>> getMovies({
    int limit = 20,
    int page = 1,
    String quality = '720p',
    String sortBy = 'date_added',
  }) async {
    final response = await dio.get('$baseUrl/list_movies.json', queryParameters: {
      'limit': limit,
      'page': page,
      'quality': quality,
      'sort_by': sortBy,
    });
    // Parse response and return Movie objects
  }
}
```

### 2. TMDB (The Movie Database) API
```dart
// Base URL: https://api.themoviedb.org/3/
// Free with API key (easy to get)
// Provides comprehensive movie metadata
```

**Key Features:**
- Movie details, cast, crew
- High-quality posters and backdrops
- Popular, trending, and top-rated movies
- Search functionality
- Multiple language support

### 3. OMDb API (Open Movie Database)
```dart
// Base URL: http://www.omdbapi.com/
// Free tier: 1000 requests/day
// Provides detailed movie information
```

### 4. Free Streaming Sources Integration
```dart
// Custom implementation for free streaming sources
class StreamingSourceManager {
  static const Map<String, String> sources = {
    'dopebox': 'https://dopebox.to',
    'soap2day': 'https://soap2day.to',
    'fmovies': 'https://fmovies.to',
    '123movies': 'https://123movies.to',
  };
  
  static Future<List<StreamingLink>> getStreamingLinks(String movieTitle) async {
    // Implement web scraping or API calls to get streaming links
  }
}
```

## Flutter TV Development Setup

### 1. Project Initialization
```bash
# Create new Flutter project
flutter create --platforms android tvapp

# Add TV-specific dependencies
flutter pub add video_player_plus
flutter pub add dio
flutter pub add provider
flutter pub add hive
flutter pub add cached_network_image
flutter pub add flutter_tv
```

### 2. Android TV Configuration
```xml
<!-- android/app/src/main/AndroidManifest.xml -->
<application
    android:name="io.flutter.app.FlutterApplication"
    android:label="TV Movie App"
    android:icon="@mipmap/ic_launcher">
    
    <activity
        android:name=".MainActivity"
        android:exported="true"
        android:launchMode="singleTop"
        android:theme="@style/Theme.AppCompat.NoActionBar"
        android:screenOrientation="landscape">
        
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
            <category android:name="android.intent.category.LEANBACK_LAUNCHER" />
        </intent-filter>
    </activity>
</application>
```

### 3. TV Navigation Setup
```dart
// lib/navigation/tv_navigation.dart
class TVNavigation {
  static final FocusNode _focusNode = FocusNode();
  
  static void handleKeyEvent(KeyEvent event) {
    switch (event.logicalKey) {
      case LogicalKeyboardKey.arrowUp:
        _navigateUp();
        break;
      case LogicalKeyboardKey.arrowDown:
        _navigateDown();
        break;
      case LogicalKeyboardKey.arrowLeft:
        _navigateLeft();
        break;
      case LogicalKeyboardKey.arrowRight:
        _navigateRight();
        break;
      case LogicalKeyboardKey.select:
        _selectItem();
        break;
    }
  }
}
```

## Sony Bravia TV Integration

### 1. Android TV Leanback Support
```dart
// lib/widgets/leanback_browse_fragment.dart
class LeanbackBrowseFragment extends StatefulWidget {
  @override
  _LeanbackBrowseFragmentState createState() => _LeanbackBrowseFragmentState();
}

class _LeanbackBrowseFragmentState extends State<LeanbackBrowseFragment> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Row(
        children: [
          // Left sidebar for categories
          Expanded(
            flex: 1,
            child: CategorySidebar(),
          ),
          // Main content area
          Expanded(
            flex: 4,
            child: MovieGrid(),
          ),
        ],
      ),
    );
  }
}
```

### 2. TV Remote Control Support
```dart
// lib/controllers/remote_controller.dart
class RemoteController {
  static void initialize() {
    // Set up key event handling for TV remote
    RawKeyboard.instance.addListener(_handleKeyEvent);
  }
  
  static void _handleKeyEvent(RawKeyEvent event) {
    if (event is RawKeyDownEvent) {
      // Handle remote control button presses
      _processRemoteInput(event.logicalKey);
    }
  }
}
```

## UI/UX Design

### 1. Netflix-inspired Interface
```dart
// lib/screens/home_screen.dart
class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      body: Column(
        children: [
          // Hero banner with featured movie
          HeroBanner(),
          // Horizontal scrolling categories
          CategoryRow(title: 'Trending Now', movies: trendingMovies),
          CategoryRow(title: 'New Releases', movies: newReleases),
          CategoryRow(title: 'Top Rated', movies: topRated),
          CategoryRow(title: 'Action Movies', movies: actionMovies),
        ],
      ),
    );
  }
}
```

### 2. Movie Card Design
```dart
// lib/widgets/movie_card.dart
class MovieCard extends StatelessWidget {
  final Movie movie;
  final bool isFocused;
  
  @override
  Widget build(BuildContext context) {
    return Container(
      width: 200,
      height: 300,
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(8),
        boxShadow: isFocused ? [
          BoxShadow(
            color: Colors.white.withOpacity(0.3),
            blurRadius: 10,
            spreadRadius: 2,
          )
        ] : null,
      ),
      child: Column(
        children: [
          // Movie poster
          Expanded(
            flex: 3,
            child: ClipRRect(
              borderRadius: BorderRadius.circular(8),
              child: CachedNetworkImage(
                imageUrl: movie.posterUrl,
                fit: BoxFit.cover,
                placeholder: (context, url) => Container(
                  color: Colors.grey[800],
                  child: Icon(Icons.movie, color: Colors.white),
                ),
              ),
            ),
          ),
          // Movie title
          Expanded(
            flex: 1,
            child: Container(
              padding: EdgeInsets.all(8),
              child: Text(
                movie.title,
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 14,
                  fontWeight: FontWeight.bold,
                ),
                maxLines: 2,
                overflow: TextOverflow.ellipsis,
              ),
            ),
          ),
        ],
      ),
    );
  }
}
```

### 3. Video Player Interface
```dart
// lib/screens/player_screen.dart
class PlayerScreen extends StatefulWidget {
  final Movie movie;
  final String streamUrl;
  
  @override
  _PlayerScreenState createState() => _PlayerScreenState();
}

class _PlayerScreenState extends State<PlayerScreen> {
  late VideoPlayerController _controller;
  
  @override
  void initState() {
    super.initState();
    _controller = VideoPlayerController.networkUrl(
      Uri.parse(widget.streamUrl),
    );
    _controller.initialize().then((_) {
      setState(() {});
    });
  }
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      body: Center(
        child: _controller.value.isInitialized
            ? AspectRatio(
                aspectRatio: _controller.value.aspectRatio,
                child: VideoPlayer(_controller),
              )
            : CircularProgressIndicator(),
      ),
    );
  }
}
```

## Implementation Strategy

### Phase 1: Core Setup (Week 1-2)
1. **Project Initialization**
   - Set up Flutter project with TV support
   - Configure Android TV manifest
   - Add essential dependencies

2. **Basic Navigation**
   - Implement TV navigation system
   - Create focus management
   - Set up remote control handling

### Phase 2: API Integration (Week 3-4)
1. **Movie Data APIs**
   - Integrate YTS API for movie metadata
   - Add TMDB API for enhanced movie details
   - Implement caching system

2. **Streaming Sources**
   - Research and implement free streaming sources
   - Create streaming link resolver
   - Add fallback mechanisms

### Phase 3: UI Development (Week 5-6)
1. **Home Screen**
   - Create Netflix-inspired layout
   - Implement horizontal scrolling categories
   - Add hero banner with featured content

2. **Movie Details**
   - Design movie detail screen
   - Add cast and crew information
   - Implement related movies section

### Phase 4: Video Player (Week 7-8)
1. **Player Implementation**
   - Integrate video player
   - Add playback controls
   - Implement subtitle support

2. **Streaming Optimization**
   - Add multiple quality options
   - Implement adaptive streaming
   - Add buffering indicators

### Phase 5: Advanced Features (Week 9-10)
1. **Search and Filtering**
   - Implement search functionality
   - Add genre filtering
   - Create watchlist feature

2. **User Experience**
   - Add loading states
   - Implement error handling
   - Add offline support

## Development Phases

### Phase 1: Foundation
- [ ] Flutter project setup
- [ ] TV navigation system
- [ ] Basic UI structure
- [ ] API integration setup

### Phase 2: Core Features
- [ ] Movie listing and details
- [ ] Video player implementation
- [ ] Streaming source integration
- [ ] Search functionality

### Phase 3: Enhancement
- [ ] Advanced UI features
- [ ] Performance optimization
- [ ] Error handling
- [ ] Testing and debugging

### Phase 4: Polish
- [ ] UI/UX refinements
- [ ] Performance tuning
- [ ] Final testing
- [ ] Deployment preparation

## Best Practices

### 1. Performance Optimization
```dart
// Use lazy loading for movie lists
class LazyMovieList extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (context, index) {
        // Load movies on demand
        return FutureBuilder<Movie>(
          future: _loadMovie(index),
          builder: (context, snapshot) {
            if (snapshot.hasData) {
              return MovieCard(movie: snapshot.data!);
            }
            return LoadingCard();
          },
        );
      },
    );
  }
}
```

### 2. Memory Management
```dart
// Dispose controllers properly
class MovieCard extends StatefulWidget {
  @override
  void dispose() {
    _imageController.dispose();
    super.dispose();
  }
}
```

### 3. Error Handling
```dart
// Implement robust error handling
class ApiService {
  static Future<List<Movie>> getMovies() async {
    try {
      final response = await dio.get('/movies');
      return parseMovies(response.data);
    } on DioException catch (e) {
      if (e.type == DioExceptionType.connectionTimeout) {
        throw NetworkException('Connection timeout');
      }
      throw ApiException('Failed to load movies');
    }
  }
}
```

### 4. Caching Strategy
```dart
// Implement efficient caching
class CacheManager {
  static final HiveInterface _hive = Hive;
  
  static Future<void> cacheMovies(List<Movie> movies) async {
    final box = await _hive.openBox('movies');
    for (final movie in movies) {
      await box.put(movie.id, movie.toJson());
    }
  }
  
  static Future<List<Movie>> getCachedMovies() async {
    final box = await _hive.openBox('movies');
    final movies = <Movie>[];
    for (final key in box.keys) {
      movies.add(Movie.fromJson(box.get(key)));
    }
    return movies;
  }
}
```

## Free API Resources

### 1. YTS API (No API Key Required)
- **Base URL**: `https://yts.mx/api/v2/`
- **Documentation**: https://yts.mx/api
- **Rate Limit**: None
- **Features**: Movie metadata, torrent links, search

### 2. TMDB API (Free API Key)
- **Base URL**: `https://api.themoviedb.org/3/`
- **Documentation**: https://developers.themoviedb.org/3
- **Rate Limit**: 1000 requests/day
- **Features**: Comprehensive movie data, images, cast/crew

### 3. OMDb API (Free Tier)
- **Base URL**: `http://www.omdbapi.com/`
- **Documentation**: http://www.omdbapi.com/
- **Rate Limit**: 1000 requests/day
- **Features**: Detailed movie information, ratings

### 4. Free Streaming Sources
- **Dopebox**: Web scraping required
- **Soap2Day**: Web scraping required
- **Fmovies**: Web scraping required
- **123Movies**: Web scraping required

## Security Considerations

### 1. API Key Protection
```dart
// Store API keys securely
class ApiKeys {
  static const String tmdbApiKey = String.fromEnvironment('TMDB_API_KEY');
  static const String omdbApiKey = String.fromEnvironment('OMDB_API_KEY');
}
```

### 2. Content Filtering
```dart
// Implement content filtering
class ContentFilter {
  static bool isAllowedContent(Movie movie) {
    // Filter out inappropriate content
    return !movie.genres.contains('Adult') && 
           movie.rating != 'XXX';
  }
}
```

## Deployment

### 1. Android TV Build
```bash
# Build for Android TV
flutter build apk --release --target-platform android-arm64

# Sign the APK
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore release-key.keystore app-release.apk alias_name
```

### 2. Sony Bravia Installation
1. Enable "Unknown Sources" in Android TV settings
2. Install APK via ADB or USB
3. Configure app permissions
4. Test remote control functionality

## Conclusion

This guide provides a comprehensive approach to developing a Netflix-like movie streaming app for Sony Bravia TVs using Flutter. The app leverages free APIs and streaming sources to provide a premium viewing experience without subscription costs.

The development process is structured in phases, ensuring a systematic approach to building a robust, user-friendly application that takes full advantage of the TV platform's capabilities.

Remember to always respect copyright laws and terms of service when implementing streaming functionality, and consider adding proper disclaimers about content sources.
