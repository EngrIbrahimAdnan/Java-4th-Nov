import University.Course;

public class Main {
    public static void main(String[] args) {
        Course newCourse = new Course("Calculus",394,"Andreas Olsson");

        //print before modification
        System.out.println(newCourse);

        //Let's change the new course to physics instead of calculus
        newCourse.setCourseName("Physics");
        newCourse.setStudentNumber(243);
        newCourse.setCourseInstructor("Abdulaziz alsaffar");

        //print after modification
        System.out.println(newCourse);
    }
}