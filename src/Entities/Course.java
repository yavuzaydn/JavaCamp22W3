package Entities;

public class Course {

    private int courseId;
    private String courseName;
    private String instructorId;
    private double price;

    public Course(){

    }

    public Course(int courseId, String courseName, String instructorId, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorId = instructorId;
        this.price = price;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
