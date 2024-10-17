package ie.atu.studentapp;

public class Student {
    // Private fields
    private String name;
    private String email;
    private String course;

    // Default constructor
    public Student() {}

    // Constructor that accepts only the name parameter
    public Student(String name) {
        this.name = name;
    }

    // Constructor that accepts name, email, and course
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}