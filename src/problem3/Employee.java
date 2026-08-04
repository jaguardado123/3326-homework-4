package problem3;

public class Employee {
    public String name;
    public String address;
    public int accountNumber;
    public int employeeId;
    public float salary;

    public Employee(String name, String address, int accountNumber, int employeeId, float salary) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Salary: " + this.salary);
    }
}