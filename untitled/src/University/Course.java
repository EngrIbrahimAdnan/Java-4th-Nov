package University;

public class Course {

    private String courseName;
    private int studentNumber;
    private String courseInstructor;

    //class constructor
    public Course(String courseName, int studentNumber, String courseInstructor) {
        this.courseName = courseName;
        this.studentNumber = studentNumber;
        this.courseInstructor = courseInstructor;
    }

    //set and get course name
    public void setCourseName(String newCourseName) {
        this.courseName = newCourseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    //set and get number of students
    public void setStudentNumber(int newStudentNumber) {
        this.studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    //set and get course instructor
    public void setCourseInstructor(String newCourseInstructor) {
        this.courseInstructor = newCourseInstructor;
    }

    public String getCourseInstructor() {
        return this.courseInstructor;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName +
                ", Number of Students: " + studentNumber +
                ", course instructor name: " + courseInstructor;
    }
}
