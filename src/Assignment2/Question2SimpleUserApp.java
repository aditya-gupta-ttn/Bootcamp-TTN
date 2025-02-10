// 2. Create a User class with fields:  firstname, lastname, age, phonenumber. Write a program which accepts values of user fields from commandline, create object and append that to a text file. After every user creation the program should prompt: "Do you want to continue creating users? (Type QUIT to exit)" and keep on accepting values
// and writing to file unitl user quits.

package Assignment2;

import java.io.*;
import java.util.Scanner;

class User {
    String firstName, lastName, phoneNumber;
    int age;

    // Constructor
    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Method to return user info as a string
    public String getInfo() {
        return firstName + " " + lastName + ", Age: " + age + ", Phone: " + phoneNumber;
    }
}

public class Question2SimpleUserApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCreating = true;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            while (continueCreating) {
                // Get user input
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter phone number: ");
                String phoneNumber = scanner.nextLine();

                // Create a User object and write to file
                User user = new User(firstName, lastName, age, phoneNumber);
                writer.write(user.getInfo());
                writer.newLine();  // Add new line after each user

                System.out.println("User saved!");
                System.out.print("Do you want to continue? (Type QUIT to exit): ");
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("QUIT")) {
                    continueCreating = false;
                }
            }
            System.out.println("Program ended. User data has been saved.");
        } catch (IOException e) {
            System.out.println("Error saving data.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
