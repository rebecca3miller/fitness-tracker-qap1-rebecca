# Fitness Tracker
A simple Java fitness tracker application created using classes, constructors, and methods. The project allows users to add workouts, set fitness goals, and check if their goals have been reached.

# Features
- Add workouts to the fitness tracker.
- Store workouts and fitness goals using ArrayLists.
- Add fitness goals with a target number of workouts.
- Check if a fitness goal has been reached.
- Handle invalid inputs, such as null workouts or goals.

# Technologies Used
- Java 21
- Maven
- JUnit 5
- Git and GitHub
- GitHub Actions

# Project Structure
The project contains three main Java classes:
* Workout.java - Represents a workout
* Goal.java - Represents a fitness goal
* FitnessTracker.java - Manages workouts and goals and checks whether goals have been reached

# Unit Testing
JUnit 5 was used to test the fitness tracker.

10 unit tests were created to check different scenarios, including adding workouts, adding goals, checking empty lists, handling invalid inputs, and checking whether goals have been reached.

All 10 tests passed successfully.

# GitHub Actions
GitHub Actions was configured with Maven to automatically build and test the project.

The workflow runs when changes are pushed to the develop branch or when pull requests are opened against main or develop.

The Maven builds and automated tests completed successfully.

# Running the Tests
To run the tests locally using Maven: mvn test

# Conclusion 
This project helped me practice working with Java classes, Array Lists, unit testing, Maven, and GitHub Actions. It also helped me understand how automated testing can be used to check that code is working correctly before merging changes into the main branch. 

In a previous project last semester, I accidentally merged changes that I wasn't supposed to, which caused some issues with my work. Because of that experience, I really liked learning how to use branch protection, pull requests, and Maven with GitHub Actions. It gave me a better understanding of how to manage changes safely and avoid making the same mistake again.
