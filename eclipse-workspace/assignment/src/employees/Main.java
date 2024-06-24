package employees;

public class Main {
	 public static void main(String[] args) {
	        // Create a Manager instance
	        Manager manager = new Manager("Alice", "M001", 90000, "Sales");
	        // Create a Developer instance
	        Developer developer = new Developer("Bob", "D001", 80000, "Java");

	        // Print Manager details
	        System.out.println("Manager Details:");
	        System.out.println("Name: " + manager.getName());
	        System.out.println("Employee ID: " + manager.getEmployeeId());
	        System.out.println("Salary: " + manager.getSalary());
	        System.out.println("Department: " + manager.getDepartment());
	        System.out.println();

	        // Print Developer details
	        System.out.println("Developer Details:");
	        System.out.println("Name: " + developer.getName());
	        System.out.println("Employee ID: " + developer.getEmployeeId());
	        System.out.println("Salary: " + developer.getSalary());
	        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
	        
	        
	        
	    }
	}



