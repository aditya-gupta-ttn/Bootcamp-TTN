//Q4 Create a two dimensional array of integers and display:
//1. sum of all elements of each column
//2. sum of all elements of each row
package Assignments1;

public class Question4 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("Sum of elements in each column:");
        int numRows = array.length;
        int numCols = array[0].length;

        for (int col = 0; col < numCols; col++) {
            int colSum = 0;
            for (int row = 0; row < numRows; row++) {
                colSum += array[row][col];
            }
            System.out.println("Column " + (col + 1) + " sum: " + colSum);
        }

        System.out.println("\nSum of elements in each row:");
        for (int row = 0; row < numRows; row++) {
            int rowSum = 0;
            for (int col = 0; col < numCols; col++) {
                rowSum += array[row][col];
            }
            System.out.println("Row " + (row + 1) + " sum: " + rowSum);
        }
    }
}

