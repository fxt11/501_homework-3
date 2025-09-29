# Contact List App

A modern Android contact list application built with Jetpack Compose, featuring alphabetical grouping, sticky headers, and smooth scroll animations.

## Features

### 📱 Core Functionality
- **Alphabetical Grouping**: Contacts are automatically grouped by the first letter of their name
- **Sticky Headers**: Letter headers remain visible while scrolling through contacts in that group
- **70 Sample Contacts**: Pre-populated with diverse sample data for testing
- **Modern UI**: Clean Material Design 3 interface with cards and proper spacing

### 🎯 Advanced Features
- **Scroll to Top FAB**: Floating Action Button appears only after scrolling past the 10th item
- **Smooth Animations**: Uses `animateScrollToItem()` with Kotlin coroutines for fluid scrolling
- **Responsive Design**: Optimized for different screen sizes and orientations

## Technical Implementation

### Architecture
- **MVVM Pattern**: Clean separation of data, UI, and business logic
- **Jetpack Compose**: Modern declarative UI framework
- **Kotlin Coroutines**: Asynchronous operations for smooth animations

### Key Components

#### Data Layer
- `Contact.kt`: Data class representing contact information
- `ContactRepository.kt`: Repository pattern for data management with 70 sample contacts

#### UI Layer
- `ContactList.kt`: Main composable with LazyColumn implementation
- `LetterHeader.kt`: Sticky header component for alphabetical grouping
- `ContactItem.kt`: Individual contact card component
- `MainActivity.kt`: Main activity with Compose integration

### Dependencies
- **Jetpack Compose BOM**: Latest Compose libraries
- **Material Design 3**: Modern design system
- **Kotlin Coroutines**: For smooth scroll animations
- **AndroidX Core**: Core Android libraries

## Setup Instructions

### Prerequisites
- Android Studio Hedgehog or later
- Android SDK 24+ (Android 7.0)
- Kotlin 2.0.21+

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd 501homework33
   ```

2. Open the project in Android Studio

3. Sync the project with Gradle files

4. Run the app on an emulator or physical device

### Building the Project
```bash
./gradlew assembleDebug
```

## Usage

### Basic Navigation
1. **Scroll Through Contacts**: Swipe up/down to browse through the alphabetically grouped contacts
2. **Sticky Headers**: Notice how letter headers (A, B, C, etc.) stick to the top while scrolling
3. **Scroll to Top**: After scrolling past the 10th contact, a floating action button appears
4. **Smooth Animation**: Tap the FAB to smoothly animate back to the top

### Sample Data
The app includes 70 sample contacts with:
- Names starting with letters A through G
- Realistic phone numbers
- Email addresses
- Proper alphabetical sorting

## Code Structure

```
app/src/main/java/com/example/a501homework3_3/
├── data/
│   ├── Contact.kt              # Contact data class
│   └── ContactRepository.kt    # Sample data repository
├── ui/
│   ├── components/
│   │   └── ContactList.kt      # Main contact list UI
│   └── theme/                  # Material Design theme
└── MainActivity.kt             # Main activity
```

## Key Features Explained

### Alphabetical Grouping
```kotlin
val groupedContacts = contacts.groupBy { it.name.first().uppercaseChar() }
```
Contacts are grouped by their first letter using Kotlin's `groupBy` function.

### Sticky Headers
```kotlin
stickyHeader {
    LetterHeader(letter = letter)
}
```
LazyColumn's `stickyHeader` composable keeps letter headers visible during scrolling.

### Scroll to Top Animation
```kotlin
coroutineScope.launch {
    listState.animateScrollToItem(0)
}
```
Uses coroutines with `animateScrollToItem()` for smooth scrolling animations.

### Conditional FAB Visibility
```kotlin
val showFab by remember {
    derivedStateOf {
        listState.firstVisibleItemIndex > 10
    }
}
```
FAB only appears after scrolling past the 10th item using `derivedStateOf`.

## Customization

### Adding More Contacts
Edit `ContactRepository.kt` to add more sample data:
```kotlin
Contact(id, "Name", "Phone", "Email")
```

### Changing FAB Trigger
Modify the threshold in `ContactList.kt`:
```kotlin
listState.firstVisibleItemIndex > YOUR_THRESHOLD
```

### Styling
Customize colors and typography in the theme files under `ui/theme/`.

## Performance Considerations

- **LazyColumn**: Efficiently handles large lists with lazy loading
- **Sticky Headers**: Minimal performance impact with Compose's optimization
- **Coroutines**: Non-blocking animations prevent UI freezing
- **Memory Efficient**: Only renders visible items

## Testing

### Manual Testing
1. Test scrolling performance with all 70 contacts
2. Verify sticky headers work correctly
3. Test FAB appearance and scroll-to-top functionality
4. Check animations are smooth on different devices

### Automated Testing
Run unit tests:
```bash
./gradlew test
```

## Future Enhancements

- [ ] Search functionality
- [ ] Contact editing capabilities
- [ ] Contact photos
- [ ] Favorites system
- [ ] Dark mode support
- [ ] Contact import/export

## License

This project is created for educational purposes as part of CS501 coursework.

## Author

Created for CS501 Android Development Course - Homework 3.3

---

**Note**: This app demonstrates modern Android development practices using Jetpack Compose, Material Design 3, and Kotlin coroutines for a smooth user experience.
