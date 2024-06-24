package utilities;

import employees.Employee;
import java.util.List;

public class EmployeeUtilities {

    // Method to calculate total salary of all employees
    public static double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    // Method to print details of all employees
    public static void printEmployeeDetails(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}
