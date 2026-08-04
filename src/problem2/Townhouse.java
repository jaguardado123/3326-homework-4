package problem2;

public class Townhouse {
    public String address;
    public float squareFootage;
    public int rooms;
    public boolean hasGym;
    public int floors;

    public Townhouse(String address, float squareFootage, int rooms, boolean hasGym, int floors) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.rooms = rooms;
        this.hasGym = hasGym;
        this.floors = floors;
    }

    public void displayInfo() {
        System.out.println("Townhouse Information:");
        System.out.println("Address: " + this.address);
        System.out.println("Square Footage: " + this.squareFootage);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Has Gym: " + (this.hasGym ? "Yes" : "No"));
        System.out.println("Floors: " + this.floors);
    }
}