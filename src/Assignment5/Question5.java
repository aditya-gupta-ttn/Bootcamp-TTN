// 5
//Given a list of objects of following class:
//
//      class Employee{
//      String fullName;
//      Long salary;
//      String city;
//      }
//
//Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.

package Assignment5;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class Question5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rohit Upadhyay", 4000L, "Delhi"),
                new Employee("Amit Verma", 6000L, "Mumbai"),
                new Employee("Aditya Gupta", 4500L, "Delhi"),
                new Employee("Rahul Mehta", 3000L, "Noida"),
                new Employee("Vikas Kumar", 2000L, "Noida"),
                new Employee("Amit Sharma", 3500L, "Delhi")
        );

        Set<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && "Delhi".equalsIgnoreCase(e.city))
                .map(Employee::getFirstName)
                .collect(Collectors.toSet());

        System.out.println(uniqueFirstNames);
    }
}

