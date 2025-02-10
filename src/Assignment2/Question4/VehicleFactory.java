package Assignment2.Question4;

// VehicleFactory.java
public class VehicleFactory {
    // Factory method to create the vehicle
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            return new Truck();
        }
        return null;
    }
}
