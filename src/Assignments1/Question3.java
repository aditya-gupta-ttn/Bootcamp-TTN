//     Q3. Write a java program to show following menu to the user: *******Menu******* 1. Calculate Area of Circle 2. Calculate Circumference of a Circle 3. Exit. Choose an option (1-3): Take radius as user input. Hint: Use Switch statement to act on the menu.
//     Also area and circumference methods should be static.
package Assignments1;

import java.util.Scanner;

public class Question3 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
  public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double radius;
        do {
            System.out.println("*******Menu*******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit.");
            System.out.print("Choose an option (1-3): ");
            
            choice = scanner.nextInt();  
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    radius = scanner.nextDouble();
                    double area = calculateArea(radius);
                    System.out.println("The area of the circle is: " + area);
                    break;
                
                case 2:
                    System.out.print("Enter the radius of the circle: ");
                    radius = scanner.nextDouble();
                    double circumference = calculateCircumference(radius);
                    System.out.println("The circumference of the circle is: " + circumference);
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1, 2, or 3.");
            }
        } while (choice != 3);  
        
        scanner.close();
    }
}


