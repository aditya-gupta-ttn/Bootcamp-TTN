// 2
//Create and access default and static method of an interface.

package Assignment5;

interface Test{
    default void show() {
        System.out.println("default method");
    }
    static void display(){
        System.out.println("static method ");
    }

}
public class Question2 implements Test{
    public static void main(String[] args) {
      Question2 obj =new Question2();
      obj.show();
      Test.display();
    }
}
