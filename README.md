# NGANYA - Instagram & TikTok Inspired Entertainment App

NGANYA is a modern Android application built with Kotlin and Jetpack Compose, inspired by Instagram and TikTok with a cool theme and engaging UI for entertainment.

## 📱 Features

- **Feed Screen** - Scroll through user posts and content
- **Explore Screen** - Discover new and trending content
- **Profile Screen** - View and manage user profile
- **Bottom Navigation** - Easy navigation between tabs
- **Material Design 3** - Modern UI components and theming
- **Jetpack Compose** - Declarative UI framework

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Design**: Material Design 3
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34
- **Build System**: Gradle with Kotlin DSL

## 📋 Project Structure

```
Nyanya/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/nganya/app/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── NGANYAApp.kt
│   │   │   │   └── ui/
│   │   │   │       ├── theme/
│   │   │   │       │   └── Theme.kt
│   │   │   │       └── screens/
│   │   │   │           ├── FeedScreen.kt
│   │   │   │           ├── ExploreScreen.kt
│   │   │   │           └── ProfileScreen.kt
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   │   ├── test/
│   │   └── androidTest/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest version)
- Android SDK Platform 34
- Android SDK Build-Tools 34.x
- Kotlin 1.9+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/illegalboyillegalpablo-cell/Nyanya.git
   cd Nyanya
   ```

2. **Build the project**
   ```bash
   ./gradlew build
   ```

3. **Run on emulator or device**
   ```bash
   ./gradlew installDebug
   ```

4. **Launch the app**
   ```bash
   adb shell am start -n com.nganya.app/.MainActivity
   ```

## 📦 Dependencies

### Core Android
- `androidx.core:core-ktx:1.12.0`
- `androidx.appcompat:appcompat:1.6.1`
- `com.google.android.material:material:1.11.0`

### Jetpack Compose
- `androidx.compose.ui:ui:1.5.4`
- `androidx.compose.material3:material3:1.1.2`
- `androidx.activity:activity-compose:1.8.1`
- `androidx.lifecycle:lifecycle-runtime-ktx:2.6.2`

### Testing
- `junit:junit:4.13.2`
- `androidx.test.ext:junit:1.1.5`
- `androidx.test.espresso:espresso-core:3.5.1`

## 🎨 UI Components

### Screens Included
1. **FeedScreen** - LazyColumn with feed cards for content display
2. **ExploreScreen** - Discovery and trending content
3. **ProfileScreen** - User profile management

### Navigation
- Bottom Navigation Bar with 3 tabs (Feed, Explore, Profile)
- Material Design 3 components
- Compose Scaffold for layout structure

## 🔧 Configuration

### Gradle Build Config
- **minSdk**: 24
- **targetSdk**: 34
- **compileSdk**: 34
- **Kotlin Compiler Extension**: 1.5.0

### Permissions
- `INTERNET` - Network requests
- `CAMERA` - Photo/video capture
- `RECORD_AUDIO` - Audio recording
- `READ_EXTERNAL_STORAGE` - Access media
- `WRITE_EXTERNAL_STORAGE` - Save media

## 📄 License

MIT License - See LICENSE file for details

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📞 Support

For issues and bug reports, please create an issue on GitHub:
https://github.com/illegalboyillegalpablo-cell/Nyanya/issues

## 👤 Author

**illegalboyillegalpablo-cell**
- GitHub: [@illegalboyillegalpablo-cell](https://github.com/illegalboyillegalpablo-cell)

---

**Built with ❤️ for entertainment and creativity**
