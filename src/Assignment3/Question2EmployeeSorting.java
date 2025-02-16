package Assignment3;

// Q2) Given the following class Employee class{ Double Age; Double Salary; String Name} Design the class in such a way that the default sorting should work on firstname and lastname. Also,
// Write a program to sort Employee objects based on salary using Comparator.
import java.util.*;

public class Question2EmployeeSorting {
    public static void main(String args[]) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23.0, 50000.0, "Aditya", "Gupta"));
        employees.add(new Employee(22.0, 70000.0, "Akash", "Singh"));
        employees.add(new Employee(21.0, 60000.0, "Divi", "Krishna"));
        employees.add(new Employee(23.0, 45000.0, "Boby", "John"));

        // Sorting using Comparable (default sorting by Name)
        Collections.sort(employees);
        System.out.println("Employees sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sorting using Comparator (by Salary)
        employees.sort(new SalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

