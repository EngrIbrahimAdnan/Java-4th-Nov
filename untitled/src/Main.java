import University.Course;

public class Main {
    public static void main(String[] args) {
        Course newCourse = new Course("Calculus",293,"This is a description");

        System.out.println(newCourse.getCourseDescription());

    }
}