//Q5. Create a class named Employee with fields firstname,lastname,age and designation. The class should:
//1. have all types of constructors to initialize the object
//2. class should also have setter methods to update a particular field
//3. Override its toString method to display a meaningful message using all these fields.

package Assignments1;

public class Question5 {
    // Fields
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    // Default constructor
    public Question5() {
        this.firstname = "Unknown";
        this.lastname = "Unknown";
        this.age = 0;
        this.designation = "Unknown";
    }

    // Parameterized constructor
    public Question5(String firstname, String lastname, int age, String designation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }

    // Constructor with only some parameters (useful for cases where not all fields are provided)
    public Question5(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = 0;
        this.designation = "Unknown";
    }

    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Employee [First Name: " + firstname + ", Last Name: " + lastname + ", Age: " + age + ", Designation: " + designation + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating employee objects using different constructors
        Question5 emp1 = new Question5("John", "Doe", 30, "Software Engineer");
        Question5 emp2 = new Question5();
        Question5 emp3 = new Question5("Jane", "Smith");

        // Printing employee information using toString()
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        // Updating fields using setter methods
        emp2.setFirstname("Alice");
        emp2.setLastname("Johnson");
        emp2.setAge(25);
        emp2.setDesignation("Project Manager");

        System.out.println(emp2.toString());
    }
}

