import static org.junit.Assert.*;
import org.junit.Test;
import problem2.*;

public class Test_Problem2 {
	
	@Test
	public void testing_condo() {
		// Testing for inheritance
		House parent = new House("456 Elm St", 1200.0f, 4);
		Condo child = new Condo("123 Main St", 1000.0f, 3, "Building A", 101);
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_duplex() {
		// Testing for inheritance
		House parent = new House("456 Elm St", 1200.0f, 4);
		Duplex child = new Duplex("789 Oak Ave", 800.0f, 2, true);
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

	@Test
	public void testing_townhouse() {
		// Testing for inheritance
		House parent = new House("456 Elm St", 1200.0f, 4);
		Townhouse child = new Townhouse("101 Pine Rd", 1500.0f, 5, false, 3);
		assertEquals(true, parent.getClass().isAssignableFrom(child.getClass()) );
	}

}