// 4. Write a program to show application of Factory Design Pattern.

package Assignment2.Question4;

// Main.java
public class FactoryDesignPatternMain {
    public static void main(String[] args) {
        // Get a car object using the factory
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.drive();

        // Get a bike object using the factory
        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
        vehicle2.drive();

        // Get a truck object using the factory
        Vehicle vehicle3 = VehicleFactory.getVehicle("Truck");
        vehicle3.drive();
    }
}
