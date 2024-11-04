import University.Course;

public class Main {
    public static void main(String[] args) {
        Course newCourse = new Course("Calculus",6293,"Forget about sleep if you plan on taking this course");

        //print before modification
        newCourse.printAll();

        //Let's change the new course to physics instead of calculus
        newCourse.setCourseName("Physics");
        newCourse.setCourseNumber(6394);
        newCourse.setCourseDescription("Wanna hear a joke? your life, after you take this course");

        //print after modification
        newCourse.printAll();
    }
}