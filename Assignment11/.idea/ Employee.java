public class  Employee {
//     Design an Employee class with the following features:
// Static:
// ○       A static variable companyName shared by all employees.
// ○       A static method displayTotalEmployees() to show the total number of employees.
// This:
// ○       Use this to initialize name, id, and designation in the constructor.
// Final:
// ○       Use a final variable id for the employee ID, which cannot be modified after assignment.
// Instanceof
// ○       Check if a given object is an instance of the Employee class before printing the employee details
    static String companyName="gla University";
    private final int id;
    String name="";
    String designation="";
    private static int totalEmployee=0;

    Employee(int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
        totalEmployee++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployee);
    }

    public void displayDetails(){
        if(this instanceof Employee){
            System.out.println("Employee ID: "+id);
            System.out.println("Employee Name: "+name);
            System.out.println("Employee Designation: "+designation);
        }
        
       else{
            System.out.println("Not a valid Employee");
        }
    }

}
