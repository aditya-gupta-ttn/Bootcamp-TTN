package Assignment3.Question4;
import java.util.*;
import java.util.Objects;

class EmployeeDetail {
    String name;
    int age;
    String designation;

    public EmployeeDetail(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetail employee = (EmployeeDetail) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}

public class EmployeeMapExample {
    public static void main(String[] args) {
        Map<EmployeeDetail, Double> employeeSalaryMap = new HashMap<>();

        EmployeeDetail e1 = new EmployeeDetail("Aditya Gupta", 22, "Software Engineer");
        EmployeeDetail e2 = new EmployeeDetail("Sudhakar Sharma", 23, "Data Scientist");
        EmployeeDetail e3 = new EmployeeDetail("Karan Singh", 23, "Manager");

        employeeSalaryMap.put(e1, 75000.0);
        employeeSalaryMap.put(e2, 85000.0);
        employeeSalaryMap.put(e3, 95000.0);

        // Displaying the map entries
        for (Map.Entry<EmployeeDetail, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
        }
    }
}


