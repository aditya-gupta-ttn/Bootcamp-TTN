package Assignment2;

// Enum for House Types with their prices
public enum House {
    APARTMENT("Apartment", 136208),
    VILLA("Villa", 250000),
    COTTAGE("Cottage", 150078),
    MANSION("Mansion", 507000);

    // Enum fields for house name and price
    private final String houseType;
    private final int price;

    // Constructor to initialize enum values
    House(String houseType, int price) {
        this.houseType = houseType;
        this.price = price;
    }

    // Method to get the price of the house
    public int getPrice() {
        return this.price;
    }

    // Method to display the house name and price
    public void displayHouseInfo() {
        System.out.println(houseType + " - Price: ₹" + getPrice());
    }
}
