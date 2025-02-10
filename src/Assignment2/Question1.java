//Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)

package Assignment2;

public class Question1 {
    public static void main(String[] args) {
        for (House house : House.values()) {
            house.displayHouseInfo();
        }
    }
}

