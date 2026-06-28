# NGANYA - Entertainment Platform

A modern Android entertainment application built with Kotlin and Jetpack Compose, featuring a social media feed, content discovery, and user profiles.

## 🎯 Project Overview

NGANYA is an entertainment platform that brings users together through content sharing, discovery, and social interaction. Built with modern Android technologies for optimal performance and user experience.

## ✨ Features

### Core Features
- 📱 **Bottom Navigation** - Easy access to Feed, Explore, and Profile sections
- 🎬 **Content Feed** - Stream of posts from followed creators
- 🔍 **Explore Section** - Discover trending and recommended content
- 👤 **User Profiles** - View and manage user information
- ❤️ **Like & Engagement** - Like and interact with posts
- 💬 **Comments** - Comment on posts and engage with creators

### UI/UX
- Material Design 3 components
- Dark/Light theme support
- Smooth navigation transitions
- Responsive layouts
- Dynamic color system (Android 12+)

## 🛠 Tech Stack

### Architecture & Design Patterns
- **Clean Architecture** with Repository Pattern
- **Jetpack Compose** - Modern declarative UI framework
- **Material Design 3** - Latest Material Design standards
- **Kotlin** - Modern programming language for Android

### Dependencies
- Compose 1.5.4+
- Material3 1.1.2+
- Kotlin 1.9.0+
- Android API 24+ (min) / API 34 (target)

## 📦 Project Structure

```
app/src/main/
├── kotlin/com/nganya/app/
│   ├── data/
│   │   ├── model/
│   │   │   ├── User.kt
│   │   │   └── Post.kt
│   │   └── repository/
│   │       ├── UserRepository.kt
│   │       └── PostRepository.kt
│   ├── ui/
│   │   ├── screens/
│   │   │   ├── FeedScreen.kt
│   │   │   ├── ExploreScreen.kt
│   │   │   └── ProfileScreen.kt
│   │   └── theme/
│   │       └── Theme.kt
│   ├── MainActivity.kt
│   └── NGANYAApp.kt
└── AndroidManifest.xml
```

## 🚀 Getting Started

### Prerequisites
- Android Studio Giraffe or later
- Java Development Kit (JDK) 11+
- Android SDK with API 34

### Installation

1. Clone the repository
```bash
git clone https://github.com/illegalboyillegalpablo-cell/Nyanya.git
cd Nyanya
```

2. Open in Android Studio
```bash
# File > Open > Select project folder
```

3. Sync Gradle dependencies
```bash
# Gradle will automatically sync when you open the project
```

4. Run the application
```bash
# Click Run > Run 'app' or press Shift + F10
```

## 📚 Documentation

- [CONTRIBUTING.md](CONTRIBUTING.md) - How to contribute to the project
- [DEVELOPMENT.md](DEVELOPMENT.md) - Development setup and guidelines
- [CHANGELOG.md](CHANGELOG.md) - Version history and roadmap
- [LICENSE](LICENSE) - MIT License

## 🎨 Theming

NGANYA supports Material Design 3 with dynamic color support:

### Light Theme
- Primary: #6200EE (Purple)
- Secondary: #03DAC6 (Teal)
- Tertiary: #1F6DEF (Blue)

### Dark Theme
- Primary: #BB86FC (Light Purple)
- Secondary: #03DAC6 (Teal)
- Tertiary: #03DAC6 (Teal)

## 📱 Screen Overview

### Feed Screen
- Displays a list of posts from followed users
- Lazy loading for optimal performance
- Like and comment on posts

### Explore Screen
- Discover trending content
- Browse recommended creators
- Search functionality

### Profile Screen
- User profile information
- Follower/Following statistics
- Edit profile options

## 🔐 Security & Privacy

- Secure data handling
- User privacy protection
- Encrypted communication
- GDPR compliant

## 📊 Future Roadmap

### Version 1.1.0 (Planned)
- User authentication
- Real-time notifications
- Direct messaging
- Story feature

### Version 2.0.0 (Planned)
- Video streaming
- Live broadcasting
- Payment integration
- Advanced search
- Hashtag support

## 🤝 Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

## 📝 License

This project is licensed under the MIT License - see [LICENSE](LICENSE) file for details.

## 👥 Authors

- **illegalboyillegalpablo-cell** - Project Owner and Lead Developer

## 📞 Support

For support, email illegalboyillegalpablo@gmail.com or open an issue on GitHub.

## 🙏 Acknowledgments

- Android Development Community
- Jetpack Compose Team
- Material Design Team
- All contributors and testers

---

**Made with ❤️ by the NGANYA Team**