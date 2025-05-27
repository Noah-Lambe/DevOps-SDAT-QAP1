package com.assignmenttracker;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    @Test
    public void testAddAssignment() {
        Course testCourse = new Course("Course", 1);
        LocalDate dueDate = LocalDate.now().plusDays(3);

        Assignment testAssignment = new Assignment(
                "Test",
                1,
                null,
                dueDate,
                false);

        testCourse.addAssignment(testAssignment);

        ArrayList<Assignment> expectedList = new ArrayList<>(List.of(new Assignment(
                "Test",
                1,
                null,
                dueDate,
                false)));

        assertIterableEquals(expectedList, testCourse.getAssignments());
    }
}