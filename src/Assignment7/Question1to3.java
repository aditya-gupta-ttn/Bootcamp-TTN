package Assignment7;

//1
//Create a Record for the Student with the following Fields:
//id
//name
//standard

public class Question1to3 {
    public static void main(String[] args) {
        record Student(int id, String name, String standard) {}
        Student student = new Student(121, "Aditya", "B.tech 8th sem");
        Student student1 = new Student(122, "Ayush", "B.tech 8th sem");

//2
//Make sure that no null values should be used for initialization.
        if(student.name == null || student.standard== null)
        {
            throw new IllegalArgumentException();
        }
        System.out.println(student.id() + " ");
        System.out.println(student.name() + " ");
        System.out.println(student.standard() + " ");
//3
//Use equal and hashCode methods with Student records

        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}


