package Assignment3;


//Given the following class Employee class{ Double Age; Double Salary; String Name} Design the class in such a way that the default sorting should work on firstname and lastname. Also, Write a program to sort Employee objects based on salary using Comparator.
public class Employee implements Comparable<Employee> {
    Double age;
    Double salary;
    String firstName;
    String lastName;

    public Employee(Double age,Double salary,String firstName, String lastName)
    {
        this.age=age;
        this.salary=salary;
        this.firstName=firstName;
        this.lastName=lastName;

    }

    @Override
    public int compareTo(Employee other)
    {
        int firstNameComparision=this.firstName.compareTo(other.firstName);
        return (firstNameComparision!=0)?firstNameComparision:this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString(){
        return "Employee{" + "Name='" + firstName + ' ' + lastName + "', Age=" + age + ", Salary=" + salary + '}';
    }
}

