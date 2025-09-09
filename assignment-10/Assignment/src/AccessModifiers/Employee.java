package AccessModifiers;
// Problem 4: Employee Records
// Develop an Employee class with:
// employeeID (public).
// department (protected).
// salary (private).
// Write methods to:
// Modify salary using a public method.
// Create a subclass Manager to access employeeID and department.

public class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary);
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }


// Subclass Manager
class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
}