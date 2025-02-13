package Assignment6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 4
//Create Unmodifiable List from a Steam
public class Question4 {
    public static void main(String[] args) {

        List<Integer> nums=Stream.of(1,2,3,4,5).filter(e->e%2==0).collect(Collectors.toUnmodifiableList());
        System.out.println(nums);
        //we cannot add as nums.add(4);
    }
}
