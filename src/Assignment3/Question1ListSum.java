package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1ListSum {
    public static void main(String args[])
    {
        List<Double> num=new ArrayList<>();
        num.add(10.02);
        num.add(23.40);
        num.add(56.23);
        num.add(34.56);
        num.add(23.51);

        Iterator<Double> iterator= num.iterator();
        double sum=0.0;

        while(iterator.hasNext())
        {
            sum+= iterator.next();
        }
        System.out.println(sum);
    }
}

