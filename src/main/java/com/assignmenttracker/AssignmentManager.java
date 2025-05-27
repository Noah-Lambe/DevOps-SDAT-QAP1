package com.assignmenttracker;

import java.util.ArrayList;
import java.util.List;

public class AssignmentManager {
    private List<Course> courses;

    public AssignmentManager() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public List<Assignment> getAllAssignments() {
        List<Assignment> allAssignments = new ArrayList<>();
        for (Course course : courses) {
            allAssignments.addAll(course.getAssignments());
        }
        return allAssignments;
    }

    public List<Assignment> getAssignmentsByCourse(int courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                return course.getAssignments();
            }
        }
        return new ArrayList<>();
    }

    public List<Assignment> getPendingAssignments() {
        List<Assignment> pendingAssignments = new ArrayList<>();
        for (Course course : courses) {
            for (Assignment assignment : course.getAssignments()) {
                if ("Pending".equalsIgnoreCase(assignment.getStatus())) {
                    pendingAssignments.add(assignment);
                }
            }
        }
        return pendingAssignments;
    }

    public List<Assignment> getCompletedAssignments() {
        List<Assignment> completedAssignments = new ArrayList<>();
        for (Course course : courses) {
            for (Assignment assignment : course.getAssignments()) {
                if ("Completed".equalsIgnoreCase(assignment.getStatus())) {
                    completedAssignments.add(assignment);
                }
            }
        }
        return completedAssignments;
    }
}