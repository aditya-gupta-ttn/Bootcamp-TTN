package Assignment7;

// 4
//Use a Sealed class concept to create a class hierarchy

//5
//Mark Child classes as final, sealed, and non sealed and observe their behavior

sealed class A permits B,C{

    void show(){
        System.out.println("Show A");
    }

}
final class B extends A{
    void show(){
        System.out.println("Show B");
    }
}
non-sealed class C extends A{
    void show(){
        System.out.println("Show C");
    }
}

public class Question4to5 extends C{

    public static void main(String[] args) {
        Question4to5 q=new Question4to5();
        q.show();
    }
}
