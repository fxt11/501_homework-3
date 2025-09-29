# Flutter Layout Demo

A Flutter application demonstrating responsive layout design using Row and Column widgets with weighted children.

## Features

- **Row Layout**: Main screen divided into two sections with 25% and 75% width distribution
- **Column Layout**: The larger section contains a Column with 3 weighted children
- **Weighted Children**: Children with proportions of 2:3:5 (20%, 30%, 50% respectively)
- **Visual Design**: Color-coded sections with text labels for easy visualization
- **Responsive Design**: Uses Expanded widgets for flexible layout

## Layout Structure

```
Row (100% width)
├── Left Section (25% width)
│   └── Blue container with sidebar icon
└── Right Section (75% width)
    └── Column (100% height)
        ├── Header (Green)
        ├── Child 1 (Red) - Weight: 2 (20%)
        ├── Child 2 (Orange) - Weight: 3 (30%)
        └── Child 3 (Purple) - Weight: 5 (50%)
```

## Screenshots

The app displays:
- A blue left section taking 25% of the screen width
- A gray right section taking 75% of the screen width
- Three colored containers within the right section with different weights
- Clear labels indicating the proportions and weights

## Getting Started

### Prerequisites

- Flutter SDK (>=3.0.0)
- Dart SDK
- Android Studio or VS Code with Flutter extensions

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd flutter_layout_demo
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
└── main.dart          # Main application file with layout implementation
pubspec.yaml           # Flutter project configuration
README.md             # This file
```

## Key Widgets Used

- **Row**: Horizontal layout container
- **Column**: Vertical layout container
- **Expanded**: Flexible widget that takes available space
- **Container**: Decorative container with styling
- **Scaffold**: Basic app structure with AppBar

## Layout Concepts Demonstrated

1. **Flexible Layouts**: Using `Expanded` widgets for responsive design
2. **Weight Distribution**: Using `flex` property for proportional sizing
3. **Nested Layouts**: Combining Row and Column widgets
4. **Visual Hierarchy**: Color coding and text labels for clarity

## Customization

You can easily modify:
- Colors by changing the `Color.shade` values
- Proportions by adjusting the `flex` values
- Text content and icons
- Border radius and padding

## License

This project is open source and available under the MIT License.
