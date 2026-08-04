package problem3;

public class Member {
    public String name;
    public String address;
    public int accountNumber;

    public Member(String name, String address, int accountNumber) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
    }

    public void displayInfo() {
        System.out.println("Member Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Account Number: " + this.accountNumber);
    }
}