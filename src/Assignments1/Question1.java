package Assignments1;

class Question1 {
    static String FirstName="Aditya";
    static String LastName="Gupta";
    static int age=21;
    
    static {
        System.out.println("Static Block"); 
        System.out.println("First Name "+FirstName);
        System.out.println("Last Name "+LastName);
        System.out.println("Age "+age);
    }
    
     public static void personDetails()
     {  System.out.println("Static Method"); 
        System.out.println("First Name "+FirstName);
        System.out.println("Last Name "+LastName);
        System.out.println("Age "+age); 
     }
    static String personDetails="FirstName: Aditya, LastName: Gupta, Age: 21";
    public static void main(String args[])
    {   System.out.println("Static Variable");
        System.out.println(personDetails);
        
        personDetails();
        
    }
}
