// Q7. WAP showing try, multi-catch and finally blocks.
package Assignments1;

public class Question7 {

    public static void main(String[] args) {
        try {
            int[] numbers = {10, 5, 0};
            int result = numbers[0] / numbers[2]; 
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block executed.");
        }
        try {
            String str = null;
            System.out.println(str.length()); 
        }
        catch (NullPointerException | NumberFormatException e) {
            System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block executed again.");
        }
    }
}

