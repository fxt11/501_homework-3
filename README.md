# Contact List App

A modern Android contact list application built with Jetpack Compose, featuring alphabetical grouping, sticky headers, and smooth scroll animations.

## Features

### Core Functionality
- **Alphabetical Grouping**: Contacts are automatically grouped by the first letter of their name
- **Sticky Headers**: Letter headers remain visible while scrolling through contacts in that group
- **70 Sample Contacts**: Pre-populated with diverse sample data for testing
- **Modern UI**: Clean Material Design 3 interface with cards and proper spacing

### Advanced Features
- **Scroll to Top FAB**: Floating Action Button appears only after scrolling past the 10th item
- **Smooth Animations**: Uses `animateScrollToItem()` with Kotlin coroutines for fluid scrolling
- **Responsive Design**: Optimized for different screen sizes and orientations


#### Data Layer
- `Contact.kt`: Data class representing contact information
- `ContactRepository.kt`: Repository pattern for data management with 70 sample contacts

