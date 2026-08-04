package problem3;

public class Manager {
    public String name;
    public String address;
    public int accountNumber;
    public int employeeId;
    public float salary;
    public String department;

    public Manager(String name, String address, int accountNumber, int employeeId, float salary, String department) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }
}