package com.assignmenttracker;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {
    @Test
    public void testStatusBeforeDueDate() {
        Assignment a = new Assignment(
                "Test",
                1,
                null,
                LocalDate.now().plusDays(3),
                false);

        assertEquals("Pending", a.getStatus());
    }

    @Test
    public void testStatusAfterDueDate() {
        Assignment b = new Assignment(
                "Test2",
                2,
                null,
                LocalDate.now().minusDays(3),
                false);

        assertEquals("Overdue", b.getStatus());
    }

    @Test
    public void testIsCompleted() {
        Assignment c = new Assignment(
                "Test3",
                3,
                null,
                LocalDate.now(),
                true);

        assertEquals("Completed", c.getStatus());
    }
}
