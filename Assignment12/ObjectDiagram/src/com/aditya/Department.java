package com.aditya;
// Description: A Company has several Department objects, and each department contains Employee objects. Model this using composition, where deleting a company should also delete all departments and employees.
// Tasks:
// Define a Company class that contains multiple Department objects.
// Define an Employee class within each Department.
// Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.

public class Department {
    // write department class here
    private String name;
    private Employee[] employees;
    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }
    public String getName() {
        return name;
    }
    public Employee[] getEmployees() {
        return employees;
    }


    
    public static class Employee {
        private String name;
        private String position;
        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }
        public String getName() {
            return name;
        }
        public String getPosition() {
            return position;
        }
    }


    
}
