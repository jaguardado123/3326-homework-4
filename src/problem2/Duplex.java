package problem2;

public class Duplex {
    public String address;
    public float squareFootage;
    public int rooms;
    public boolean hasGarage;

    public Duplex(String address, float squareFootage, int rooms, boolean hasGarage) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
    }

    public void displayInfo() {
        System.out.println("Duplex Information:");
        System.out.println("Address: " + this.address);
        System.out.println("Square Footage: " + this.squareFootage);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Has Garage: " + (this.hasGarage ? "Yes" : "No"));
    }
}