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

# Dependencies
For this project, I used Maven to manage the dependencies and build the Java application.
* JUnit 5: Used to create and run the 10 unit tests for my fitness tracker.
* Maven: Used to manage the project dependencies and run the tests.
* Java 21: The Java version used to develop the application.

The JUnit 5 dependencies are configured in the pom.xml file and downloaded through Maven Central. This makes it easier to manage the project and run the tests without manually downloading the libraries.

# Project Structure
The project contains three main Java classes:
* Workout.java - Represents a workout
* Goal.java - Represents a fitness goal
* FitnessTracker.java - Manages workouts and goals and checks whether goals have been reached

# Clean Code Practices
I tried to keep my code simple, organized, and easy to understand throughout this project. Here are three examples of clean coding practices I used.

1. Meaningful Names
I used clear names for my variables and methods, such as getWorkouts(), addWorkout(), and goals. This makes it easier to understand what each method does     without needing a lot of extra explanation.

<img width="4032" height="3024" alt="image" src="https://github.com/user-attachments/assets/a9d46de5-d385-4980-a984-4a2dfbd5ed04" />


2. Input Validation
In my addWorkout() and addGoal() methods, I used if statements to check that the objects are not null before adding them to the array lists. This helps prevent invalid data from being added to the fitness tracker.

<img width="4032" height="3024" alt="image" src="https://github.com/user-attachments/assets/f84ce860-57b6-45cd-bd22-00ae3c5b90e7" />

3. Simple and Readable Methods
My isGoalReached() method checks if a goal is valid before comparing the number of workouts completed with the target. I kept the logic straightforward so it is easier to read, test, and maintain.

<img width="4032" height="3024" alt="image" src="https://github.com/user-attachments/assets/611174e1-6eb6-4fb1-9856-83fdcc8d544b" />


# Unit Testing
JUnit 5 was used to test the fitness tracker.

10 unit tests were created to check different scenarios, including adding workouts, adding goals, checking empty lists, handling invalid inputs, and checking whether goals have been reached.

I tested both positive and negative scenarios to make sure my fitness tracker works correctly. This included checking that workouts and goals could be added successfully, that null values were not added, and that goals were only marked as reached when the required number of workouts was completed.

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

# Problems Encountered
I didn't run into any major problems while completing this project. I did spend some extra time making sure Maven and GitHub Actions were configured correctly and that all my unit tests passed.

I also wanted to make sure I was following the correct branching and pull request workflow, especially because I had issues with merging changes in a previous project.
