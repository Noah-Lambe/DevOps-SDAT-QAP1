package com.assignmenttracker;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AssignmentManagerTest {
    @Test
    public void testCombingListsWithGetAllAssignments() {
        LocalDate dueDate = LocalDate.now().plusDays(3);

        Course testCourse1 = new Course("Course1", 1);
        Course testCourse2 = new Course("Course2", 1);

        Assignment testAssignment1 =
                new Assignment("Test1", 1, null, dueDate, false);

        Assignment testAssignment2 =
                new Assignment("Test2", 2, null, dueDate, true);

        testCourse1.addAssignment(testAssignment1);
        testCourse2.addAssignment(testAssignment2);

        AssignmentManager testManager = new AssignmentManager();
        testManager.addCourse(testCourse1);
        testManager.addCourse(testCourse2);

        ArrayList<Assignment> expectedList = new ArrayList<>(List.of(
                new Assignment("Test1", 1, null, dueDate, false),
                new Assignment("Test2", 2, null, dueDate, true)
        ));

        assertIterableEquals(expectedList, testManager.getAllAssignments());
    }
}
