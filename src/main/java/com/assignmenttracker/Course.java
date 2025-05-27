package com.assignmenttracker;

import java.util.ArrayList;

public class Course {
    private String name;
    private int id;
    private ArrayList<Assignment> assignmentsarrayList;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignmentsarrayList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignmentsarrayList;
    }

    public void addAssignment(Assignment assignment) {
        assignmentsarrayList.add(assignment);
        assignment.setCourse(this);
    }

    public void removeAssignment(Assignment assignment) {
        assignmentsarrayList.remove(assignment);
        assignment.setCourse(null);
    }
}
