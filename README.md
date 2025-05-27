# Student Assignment Tracker (Java CLI Application)

This is a command-line Java application designed to help students manage and track their assignments by course. The application is built using object-oriented principles and demonstrates core Java development practices such as encapsulation, modular design, and unit testing. Continuous integration is implemented via GitHub Actions.

## Project Overview

The application allows users to:
- Add assignments to specific courses
- Mark assignments as completed
- Automatically track assignment status as Pending, Completed, or Overdue
- View and manage assignments by course
- Aggregate assignments across multiple courses

## Features Implemented

- Object-oriented class structure (`Assignment`, `Course`, `AssignmentManager`)
- Dynamic status calculation based on due date and completion
- Assignment filtering and aggregation through a manager class
- Clean, readable CLI-friendly architecture
- Unit testing with JUnit 5
- CI pipeline using GitHub Actions triggered on pull requests to `dev` and `main`

## Unit Testing

The project includes five unit tests located in `src/test/java/com/assignmenttracker/`. These tests validate core logic for the application:

1. `getStatus()` returns "Pending" when the assignment is not completed and before the due date
2. `getStatus()` returns "Overdue" when the assignment is not completed and the due date has passed
3. `getStatus()` returns "Completed" after the assignment is marked as complete
4. Assignments are correctly added to a course
5. `AssignmentManager` aggregates assignments from multiple courses correctly

## Dependencies

The project uses Maven for dependency management. The primary dependencies are:

- **JUnit 5** (for testing): `org.junit.jupiter:junit-jupiter:5.9.3`
- **Maven Surefire Plugin** (to run tests): version `3.0.0-M7`

Example `pom.xml` dependency section:

```xml
<dependencies>
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
  </dependency>
</dependencies>
