package com.assignmenttracker;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AssignmentManager manager = new AssignmentManager();

        // Create courses
        Course course1 = new Course("Mathematics", 101);
        Course course2 = new Course("Science", 102);

        // Add courses to the manager
        manager.addCourse(course1);
        manager.addCourse(course2);

        // Create assignments
        Assignment assignment1 = new Assignment(
                "Algebra Homework",
                1,
                course1,
                LocalDate.of(2026, 10, 15),
                false);

        Assignment assignment2 = new Assignment(
                "Physics Lab Report",
                2,
                course2,
                LocalDate.of(2024, 2, 20),
                true);

        Assignment assignment3 = new Assignment(
                "Chemistry Project",
                3,
                course2,
                LocalDate.of(2023, 10, 25),
                false);

        // Add assignments to courses
        course1.getAssignments().add(assignment1);
        course2.getAssignments().add(assignment2);
        course2.getAssignments().add(assignment3);

        // Retrieve all assignments
        System.out.println("All Assignments:");
        for (Assignment assignment : manager.getAllAssignments()) {
            System.out.println(assignment.getName() + " - " + assignment.getStatus());
        }

        // Retrieve assignments by course ID
        System.out.println("\nAssignments for Course ID " + course2.getId() + ":");
        for (Assignment assignment : manager.getAssignmentsByCourse(102)) {
            System.out.println(assignment.getName() + " - " + assignment.getStatus());
        }

        // Retrieve pending assignments
        System.out.println("\nPending Assignments:");
        for (Assignment assignment : manager.getPendingAssignments()) {
            System.out.println(assignment.getName() + " - " + assignment.getStatus());
        }

        // Retrieve completed assignments
        System.out.println("\nCompleted Assignments:");
        for (Assignment assignment : manager.getCompletedAssignments()) {
            System.out.println(assignment.getName() + " - " + assignment.getStatus());
        }

        // Add an assignment
        course1.addAssignment(new Assignment(
                "Quadratic equation practice",
                4,
                course1,
                LocalDate.of(2025, 12, 1),
                true));

        // Delete an assignment
        course2.removeAssignment(assignment3);

        System.out.println("\nAssignments after deletion:");
        for (Assignment assignment : manager.getAllAssignments()) {
            System.out.println(assignment.getName() + " - " + assignment.getStatus());
        }
    }
}
