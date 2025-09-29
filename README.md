# Flutter Scaffold Demo App

A Flutter application demonstrating the use of Scaffold with top app bar, bottom navigation bar, and floating action button (FAB) with proper padding to avoid overlap.

## Features

- **Top App Bar**: Displays the app title "Scaffold Demo App"
- **Bottom Navigation Bar**: Contains 3 navigation items (Home, Settings, Profile)
- **Floating Action Button (FAB)**: Triggers a Snackbar message when pressed
- **Proper Padding**: Inner padding applied to prevent overlap between UI elements
- **Material Design 3**: Uses the latest Material Design guidelines

## Screenshots

The app includes three main screens:
- **Home**: Welcome screen with home icon
- **Settings**: Settings configuration screen
- **Profile**: User profile screen

## Getting Started

### Prerequisites

- Flutter SDK (>=3.0.0)
- Dart SDK
- Android Studio / VS Code with Flutter extensions
- Android device or emulator / iOS simulator

### Installation

1. Clone this repository:
   ```bash
   git clone <repository-url>
   cd scaffold_app
   ```

2. Install dependencies:
   ```bash
   flutter pub get
   ```

3. Run the app:
   ```bash
   flutter run
   ```

## Project Structure

```
lib/
├── main.dart          # Main application file with Scaffold implementation
pubspec.yaml           # Flutter project configuration
README.md             # This file
```

## Key Implementation Details

### Scaffold Components

1. **AppBar**: 
   - Centered title
   - Uses theme's inverse primary color
   - Material Design 3 styling

2. **Bottom Navigation Bar**:
   - Three items: Home, Settings, Profile
   - Icons and labels for each item
   - Selected item highlighting

3. **Floating Action Button**:
   - Positioned to avoid overlap with bottom navigation
   - Shows Snackbar when pressed
   - Material Design 3 styling

4. **Body Padding**:
   - 16px padding around main content
   - Prevents overlap with other UI elements

### Navigation

The app uses a simple state management approach with `setState()` to handle bottom navigation bar selection and page switching.

## Dependencies

- `flutter`: Flutter SDK
- `cupertino_icons`: iOS-style icons

## Development

This project demonstrates:
- Flutter Scaffold widget usage
- Bottom navigation implementation
- Floating action button integration
- Proper UI spacing and padding
- Material Design 3 theming
- Snackbar messaging

## Author

Created as part of a Flutter development course assignment.

## License

This project is for educational purposes.
