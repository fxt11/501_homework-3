# Android Scaffold Demo App

An Android application built with Jetpack Compose demonstrating the use of Scaffold with top app bar, bottom navigation bar, and floating action button (FAB) with proper padding to avoid overlap.

## Features

- **Top App Bar**: Displays the app title "Scaffold Demo App" with Material Design 3 styling
- **Bottom Navigation Bar**: Contains 3 navigation items (Home, Settings, Profile) with icons and labels
- **Floating Action Button (FAB)**: Triggers a Snackbar message when pressed
- **Proper Padding**: Inner padding applied to prevent overlap between UI elements
- **Material Design 3**: Uses the latest Material Design guidelines and theming
- **Jetpack Compose**: Modern Android UI toolkit for declarative UI

## Screenshots

The app includes three main screens:
- **Home**: Welcome screen with home icon and primary color theming
- **Settings**: Settings configuration screen with secondary color theming
- **Profile**: User profile screen with tertiary color theming

## Getting Started

### Prerequisites

- Android Studio (latest version)
- Android SDK (API level 24 or higher)
- Kotlin support
- Jetpack Compose enabled

### Installation

1. Clone this repository:
   ```bash
   git clone <repository-url>
   cd 501homework
   ```

2. Open the project in Android Studio

3. Sync the project with Gradle files

4. Run the app on an Android device or emulator

## Project Structure

```
app/src/main/java/com/example/a501homework/
├── MainActivity.kt          # Main activity with Scaffold implementation
└── ui/theme/               # Material Design 3 theming
    ├── Color.kt
    ├── Theme.kt
    └── Type.kt
```

## Key Implementation Details

### Scaffold Components

1. **TopAppBar**: 
   - Centered title with bold font weight
   - Uses Material Design 3 color scheme
   - Primary container background color

2. **NavigationBar**:
   - Three items: Home, Settings, Profile
   - Material Design icons for each item
   - Selected state highlighting

3. **FloatingActionButton**:
   - Add icon with Material Design styling
   - Shows Snackbar when pressed
   - Proper positioning to avoid overlap

4. **Body Padding**:
   - Uses Scaffold's innerPadding parameter
   - Additional 16dp padding for content
   - Prevents overlap with other UI elements

### Navigation

The app uses Jetpack Compose state management with `remember` and `mutableIntStateOf()` to handle bottom navigation bar selection and page switching.

## Dependencies

- `androidx.activity:activity-compose`: Compose integration
- `androidx.compose.bom`: Compose BOM for version management
- `androidx.compose.ui`: Compose UI toolkit
- `androidx.compose.material3`: Material Design 3 components
- `androidx.core:core-ktx`: Kotlin extensions

## Development

This project demonstrates:
- Jetpack Compose Scaffold widget usage
- Bottom navigation implementation with NavigationBar
- Floating action button integration
- Proper UI spacing and padding with innerPadding
- Material Design 3 theming and color schemes
- Snackbar messaging with SnackbarHost
- State management in Compose

## Technical Notes

- Uses `@OptIn(ExperimentalMaterial3Api::class)` for Material 3 features
- Implements proper accessibility with content descriptions
- Follows Material Design 3 guidelines
- Uses Compose's declarative UI approach
- Implements proper theming with MaterialTheme.colorScheme

## Author

Created as part of an Android development course assignment using Jetpack Compose.

## License

This project is for educational purposes.
