package aditya.com;

public class Main1 {
	
	public static void main(String args[]) {
		Department management =new Department();
		Department service =new Department();
		Employee aditya=new Employee(9042,"aditya","managment",320000);
		Employee arun=new Employee(2,"arun","managment",3200);
		Employee jagan=new Employee(3000,"jagan","service",3000);
		management.employeeArray[0]=aditya;
		management.employeeArray[1]=arun;
		
		service.employeeArray[0]=jagan;
		
		// search employee by nick name and get their id 
		System.out.println(search("adi",management).ID);
		System.out.println(search("jag",service).ID);
		// increase salary in a specific department by 10 percent 
		//increseSalary(management);
		
		
		
	}
	
	


public static Employee search(String nikName,Department dept) {
	int n=dept.employeeArray.length;
	
	for(int i=0;i<n;i++) {
		if(dept.employeeArray[i]==null) {
			continue;
		}
		Employee temp=dept.employeeArray[i];
		String name=temp.Name;
		if(name.contains(nikName)){
			return temp;
		}
	}
	return null;
	
}

	}
