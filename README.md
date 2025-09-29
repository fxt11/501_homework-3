# Android Compose Layout

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


- Jetpack Compose dependencies
