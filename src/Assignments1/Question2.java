package Assignments1;
//Q2. Write a program to read user input until user writes XDONE and then show the entered text by the user on command line
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Enter text (type XDONE to stop):");
        while (true) {
            input = sc.nextLine();

            if (input.equals("XDONE")) {
                break;
            }

            System.out.println("You entered: " + input);
        }

        System.out.println("Program end");
        sc.close();
    }
}


