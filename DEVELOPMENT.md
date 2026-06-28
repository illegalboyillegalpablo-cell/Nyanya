# NGANYA - Contributing Guidelines

This document outlines how to contribute to the NGANYA project.

## Getting Started

### Prerequisites
- Android Studio Giraffe or later
- Android SDK 34
- Kotlin 1.9+
- Gradle 8.0+

### Setup
1. Clone the repository
2. Open in Android Studio
3. Let Gradle sync dependencies
4. Build and run

## Project Structure

```
app/
├── src/main/
│   ├── kotlin/com/nganya/app/
│   │   ├── data/
│   │   │   ├── model/
│   │   │   │   ├── User.kt
│   │   │   │   └── Post.kt
│   │   │   └── repository/
│   │   │       ├── UserRepository.kt
│   │   │       └── PostRepository.kt
│   │   ├── ui/
│   │   │   ├── screens/
│   │   │   │   ├── FeedScreen.kt
│   │   │   │   ├── ExploreScreen.kt
│   │   │   │   └── ProfileScreen.kt
│   │   │   └── theme/
│   │   │       └── Theme.kt
│   │   ├── MainActivity.kt
│   │   └── NGANYAApp.kt
│   └── AndroidManifest.xml
```

## Development Workflow

1. Create a branch for your feature
2. Make your changes
3. Test thoroughly
4. Submit a pull request
5. Wait for review and address feedback

## Code Quality Standards

- Follow Kotlin conventions
- Use meaningful names
- Add documentation
- Write unit tests
- Keep functions small and focused

## Testing

Run tests with:
```bash
./gradlew test
```

## Build APK

Debug build:
```bash
./gradlew assembleDebug
```

Release build:
```bash
./gradlew assembleRelease
```

---

**Thank you for contributing to NGANYA! 🙏**
