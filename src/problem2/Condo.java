package problem2;

public class Condo {
    public String address;
    public float squareFootage;
    public int rooms;
    public String buildingName;
    public int unitNumber;

    public Condo(String address, float squareFootage, int rooms, String buildingName, int unitNumber) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.rooms = rooms;
        this.buildingName = buildingName;
        this.unitNumber = unitNumber;
    }

    public void displayInfo() {
        System.out.println("Condo Information:");
        System.out.println("Address: " + this.address);
        System.out.println("Square Footage: " + this.squareFootage);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Building Name: " + this.buildingName);
        System.out.println("Unit Number: " + this.unitNumber);
    }
}