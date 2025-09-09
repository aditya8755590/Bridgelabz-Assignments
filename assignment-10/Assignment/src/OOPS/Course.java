package OOPS;
public class Course {
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName = "GLA University mathura wale ";

    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName);
        System.out.println(duration + "weeks");
        System.out.println(fee);
        System.out.println(instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
    
}
