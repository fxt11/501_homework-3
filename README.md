# Android Compose Layout Demo

This Android project demonstrates a custom layout using Jetpack Compose with specific width and weight proportions.

## Layout Structure

The main screen features a `Row` layout with two sections:

### Left Section (25% width)
- Takes up 25% of the screen width
- Displays a green background with white text
- Shows: "25%"

### Right Section (75% width)
Contains a `Column` with three weighted children in 2:3:5 proportions:

1. **Blue Section (Weight: 2)**
   - Takes up 2/10 of the available height in the column
   - Blue background with white text
   - Shows: "20%" (2/10 = 20%)

2. **Orange Section (Weight: 3)**
   - Takes up 3/10 of the available height in the column
   - Orange background with white text
   - Shows: "30%" (3/10 = 30%)

3. **Pink Section (Weight: 5)**
   - Takes up 5/10 of the available height in the column
   - Pink background with white text
   - Shows: "50%" (5/10 = 50%)

## Technical Implementation

- **Framework**: Android Jetpack Compose
- **Layout Components**: Row, Column, Box
- **Weight Distribution**: Uses `weight()` modifier for proportional sizing
- **Colors**: Custom colors for visual distinction
- **Typography**: Bold white text for better visibility

## Project Structure

```
app/src/main/java/com/example/a501homework3_1/
├── MainActivity.kt          # Main activity with layout implementation
└── ui/theme/
    └── Theme.kt            # Material Design theme configuration
```

## How to Run

1. Open the project in Android Studio
2. Sync the project with Gradle files
3. Run the app on an emulator or physical device
4. The layout will display the proportional sections as described

## Features Demonstrated

- Row and Column layouts
- Weight-based proportional sizing
- Color-coded sections for visual clarity
- Text labels for space usage visualization
- Material Design 3 theming
- Responsive layout design

## Requirements

- Android Studio Arctic Fox or later
- Android SDK API 21 or higher
- Kotlin support
- Jetpack Compose dependencies
