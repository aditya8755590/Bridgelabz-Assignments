package AccessModifiers;


public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        setCGPA(CGPA);
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }
    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
    }
}
