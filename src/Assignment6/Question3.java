package Assignment6;

//3
//Use Of method to create List, Set and Map


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        List<String> name= List.of("Aditya", "Divi", "Raju", "Nobita");
        Set<String> lang=Set.of("Java", "Python", "JavaScript", "C++");
        Map<Integer,String> empdetails=Map.of(1,"Adi",2,"Nobi",3,"Raj",4,"Abhi");

        System.out.println(name);
        System.out.println(lang);
        System.out.println(empdetails);



    }
}
