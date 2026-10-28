# Overview:
This project implements a calculator app based on Philipp Lackner's tutorial, which can be found in the references section.
The base calculator can enter, add, subtract, multiply, and divide numbers. The app also features a backspace (del), a clear (AC),
and a decimal feature. 

# Enhancements
My addition to the project is two enhancements:
A square root function that will take the square root of the last number entered. It will return an error if the square of a negative is taken.
A theme toggle that allows the user to switch between dark and light modes, fully changing the color scheme of the app.

# Setup and Run steps
To run the project Android Studio Ladybug or newer is optimal.
JDK 17 or newer is required. JDK 17 is installed with Android Studio and should work out of the box.
Android SDK platform 35 is required
An Android device or emulator is required

Once the requirements are met:
Download the project from GitHub and open the project root folder in Android Studio and ensure the JDK and SDK are correct and sync the project with Gradle.
To run the app, simply create the virtual Android (or connect to a physical device) and press the run button in Android Studio

# Video Demo
A video demo of the app can be found here: https://drive.google.com/file/d/1zqydT-aEPNOUpvqDEYSc5q70XVEWc8gs/view?usp=sharing

# Screenshots
Screenshots of the project can be seen here:
https://drive.google.com/drive/folders/1a655FABlDOEgYF_8Cchla9Goxcnr99-4?usp=sharing

# Notes on architecture/trade-offs
The architecture of the project is a result of Jetpack Compose. The Compose UI architecture follows a unidirectional data flow.
Basically, the UI is immutable but the state of the UI can be changed and this is done by states flowing down and events flowing up.
For specific implementations, the square root function faced an interesting trade-off. Because the base calculator was designed in such a way that
operations need two numbers, the square root function, a unary operation, is in an awkward spot and had to exist as its own CalculatorAction instead of CalculatorOperation.
Because of the architecture, this ends up creating another case to handle in the ViewModel file. 

# Reflection
In reflection, I am satisfied with how my two enhancements were implemented, and this was a good opportunity to learn hands-on with Kotlin/Android Studio. 
However, the first thing I would refactor is how numbers and operations are handled. As I mentioned earlier, the operation function in the base calculator
requires two numbers, meaning unary operations have to be separated from all of the other operations. I would also like to refactor the code in such a way that
the creation of calculator buttons is more streamlined and less code has to be written. But as Lanker mentioned in his tutorial, it was somewhat impractical for this project
and would have ended up making the project more complex than necessary. 

# References:
https://developer.android.com/codelabs/basic-android-kotlin-compose-material-theming#0
https://developer.android.com/develop/ui/compose/state
https://github.com/philipplackner/CalculatorPrep
https://www.youtube.com/watch?v=-aTcFJWxEQA
https://developer.android.com/develop/ui/compose/architecture
