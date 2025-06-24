package Constructors.AccessModifiers;

public class EmployeeRecords {

   
    static class Employee {
        public int employeeID;         
        protected String department;   
        private double salary;         

       
        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

      
        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                System.out.println("Salary cannot be negative.");
            }
        }

       
        public void displayEmployeeDetails() {
            System.out.println("Employee ID : " + employeeID);
            System.out.println("Department  : " + department);
            System.out.println("Salary      : ₹" + salary);
            System.out.println("-------------------------------");
        }
    }

    
    static class Manager extends Employee {
        private String teamName;

        public Manager(int employeeID, String department, double salary, String teamName) {
            super(employeeID, department, salary);
            this.teamName = teamName;
        }

        
        public void displayManagerDetails() {
            
            System.out.println("Manager ID     : " + employeeID);  
            System.out.println("Department     : " + department);  
            System.out.println("Team           : " + teamName);
            System.out.println("-------------------------------");
        }
    }

   
    public static void main(String[] args) {
      
        Employee emp1 = new Employee(101, "Finance", 40000);
        emp1.displayEmployeeDetails();

        
        emp1.setSalary(45000);
        System.out.println("Updated Salary: ₹" + emp1.getSalary());
        emp1.displayEmployeeDetails();

        Manager mgr1 = new Manager(201, "IT", 75000, "Development Team");
        mgr1.displayManagerDetails();
        mgr1.displayEmployeeDetails(); 
    }
}
