# Android Login Form App

A modern Android application built with Jetpack Compose featuring a beautiful login form with Material 3 design principles.

## Features

- **Material 3 Design**: Modern UI following Google's Material 3 design guidelines
- **Form Validation**: Real-time validation with error messages for empty fields
- **Password Visibility Toggle**: Users can show/hide password for better UX
- **Responsive Layout**: Centered layout that works on different screen sizes
- **Theme Integration**: Uses Material 3 color scheme and typography

## Screenshots

The app displays a clean login form with:

- Welcome message and subtitle
- Username input field with validation
- Password input field with show/hide toggle
- Sign In button with Material 3 styling
- Forgot Password link
- Error messages displayed below fields when validation fails

## Technical Details

### Architecture

- **UI Framework**: Jetpack Compose
- **Design System**: Material 3
- **Language**: Kotlin
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36 (Android 14)

### Key Components

- `MainActivity`: Main activity containing the login form
- `LoginForm`: Composable function implementing the login UI
- Material 3 components: `OutlinedTextField`, `Button`, `TextButton`
- State management using `remember` and `mutableStateOf`

### Dependencies

- AndroidX Core KTX
- Jetpack Compose BOM
- Material 3
- Material Icons Extended
- Activity Compose
- Lifecycle Runtime KTX

## Setup Instructions

### Prerequisites

- Android Studio Arctic Fox or later
- Android SDK 24 or higher
- Kotlin 1.8.0 or later

### Installation

1. Clone this repository:

   ```bash
   git clone <repository-url>
   cd 501homework35
   ```

2. Open the project in Android Studio

3. Sync the project with Gradle files

4. Run the app on an emulator or physical device

### Building the Project

```bash
./gradlew assembleDebug
```

### Running Tests

```bash
./gradlew test
```

## Code Structure

```
app/src/main/java/com/example/a501homework3_5/
├── MainActivity.kt          # Main activity with login form
└── ui/theme/
    ├── Color.kt             # Material 3 color definitions
    ├── Theme.kt             # App theme configuration
    └── Type.kt              # Typography definitions
```

## Form Validation

The login form includes comprehensive validation:

- **Username Field**:

  - Required field validation
  - Error message: "Username is required"
  - Error state styling with red border and text

- **Password Field**:

  - Required field validation
  - Error message: "Password is required"
  - Password visibility toggle
  - Error state styling with red border and text

- **Real-time Validation**:
  - Errors clear automatically when user starts typing
  - Validation triggers on form submission
  - Visual feedback with Material 3 error colors

## Material 3 Implementation

The app follows Material 3 design principles:

- **Color Scheme**: Uses `MaterialTheme.colorScheme` for consistent theming
- **Typography**: Implements Material 3 typography scale
- **Components**: Uses Material 3 components (`OutlinedTextField`, `Button`)
- **Shapes**: Applies Material 3 shape system
- **Elevation**: Follows Material 3 elevation guidelines

## Future Enhancements

- [ ] Add biometric authentication
- [ ] Implement actual login logic with backend integration
- [ ] Add loading states and progress indicators
- [ ] Include "Remember Me" functionality
- [ ] Add social login options (Google, Facebook)
- [ ] Implement password strength indicator
- [ ] Add dark theme support

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

Created as part of CS 501 Android Development coursework.

---

**Note**: This is a demonstration project showcasing Material 3 design implementation and form validation in Jetpack Compose. The login functionality is currently for UI demonstration purposes only.
