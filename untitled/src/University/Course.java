package University;

public class Course {

    private String courseName;
    private int courseNumber;
    private String courseDescription;


    //class constructor
    public Course(String courseName,int courseNumber, String courseDescription){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseDescription = courseDescription;
    }

    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseNumber(int newCourseNumber){
        this.courseNumber = newCourseNumber;
    }

    public int getCourseNumber(){
        return this.courseNumber;
    }

    public void setCourseDescription(String newCourseDescription){
        this.courseDescription = newCourseDescription;
    }

    public String getCourseDescription(){
        return this.courseDescription;
    }

    public void printAll(){
        System.out.println("Course Name: "+ this.courseName + ", Course number: " + this.courseNumber + ", Course description: " + this.courseDescription);
    }

}
