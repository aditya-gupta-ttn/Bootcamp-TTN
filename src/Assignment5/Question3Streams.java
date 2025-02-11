//3
//Sum all the numbers greater than 5 in the integer list using streams
package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3Streams {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum=list.stream().filter(num->num>5).mapToInt(num->num).sum();
        System.out.println("Sum of element greater than 5 ="+sum);
    }
}
