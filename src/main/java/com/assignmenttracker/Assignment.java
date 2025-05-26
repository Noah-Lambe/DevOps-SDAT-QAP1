package com.assignmenttracker;
import java.time.LocalDate;

public class Assignment {
    private String name;
    private int id;
    private Course course;
    private LocalDate dueDate;
    private String status;

    public Assignment(String name, int ID, LocalDate dueDate, String status) {
        this.name = name;
        this.id = ID;
        this.course = null;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
