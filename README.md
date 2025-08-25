# Digital Clock

This is a simple Java Swing-based digital clock application that displays the current **time**, **day**, and **date** in a GUI window. 
The clock updates every second using a continuous background loop.

## Features

* Live updating of current time in `hh:mm:ss a` format
* Displays the current day (e.g., Monday)
* Displays the current date (e.g., 12 January 2022)
* Custom fonts and color styling using `JLabel`
* Unit tests using JUnit 5

## Project Structure

```
digital_clock/
├── src/
│   └── time/
│       ├── MyFrame.java       // Main GUI frame
│       ├── Time.java          // Main entry point
│       ├── MyFrameTest.java   // Unit tests for MyFrame
│       └── TimeTest.java      // Additional test coverage
```

## How to Run

### Requirements

* Java Development Kit (JDK) 8 or higher
* Any Java IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse)
* JUnit 5 (for testing)

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/Khayaguzu/digital_clock.git
   cd digital_clock
   ```

2. Open the project in your preferred IDE.

3. Run the `Time.java` file. This will launch a window displaying the digital clock.

## Running Tests

JUnit 5 is used for testing the formatting logic and frame properties.

### In NetBeans or IntelliJ:

* Right-click the `time` package and select **Run Tests**.

### Or using Maven (if configured):

```bash
mvn test
```

---
