package com.assignmenttracker;
import java.time.LocalDate;
import java.util.Objects;

public class Assignment {
    private String name;
    private int id;
    private Course course;
    private LocalDate dueDate;
    private boolean completed;

    public Assignment(String name, int ID, Course course, LocalDate dueDate, boolean completed) {
        this.name = name;
        this.id = ID;
        this.course = null;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Assignment)) return false;
        Assignment that = (Assignment) o;
        return id == that.id &&
                completed == that.completed &&
                Objects.equals(name, that.name) &&
                Objects.equals(dueDate, that.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dueDate, completed);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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

    public boolean getcompleted() {
        return completed;
    }

    public String getStatus() {
        if (LocalDate.now().isAfter(dueDate) && !completed) {
            return "Overdue";
        } else if (completed) {
            return "Completed";
        } else {
            return "Pending";
        }
    }
}
