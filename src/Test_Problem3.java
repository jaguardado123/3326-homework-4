import static org.junit.Assert.*;
import org.junit.Test;
import problem3.*;

public class Test_Problem3 {
	
	@Test
	public void testing_employee() {
		// Testing for inheritance from
		Member parent = new Member("John Doe", "123 Main St", 123456);
		Employee child = new Employee("Jane Smith", "456 Oak Ave", 789012, 222333, 30000.0f);
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_manager() {
		// Testing for inheritance from
		Employee parent = new Employee("Jane Smith", "456 Oak Ave", 789012, 222333, 30000.0f);
        Manager child = new Manager("Alice Johnson", "789 Pine Rd", 345678, 444555, 50000.0f, "Sales");
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_regional_manager() {
		// Testing for inheritance from
        Manager parent = new Manager("Alice Johnson", "789 Pine Rd", 345678, 444555, 50000.0f, "Sales");
        RegionalManager child = new RegionalManager("Bob Williams", "321 Cedar St", 901234, 666777, 70000.0f, "Operations", "Northwest", 10);
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}
}