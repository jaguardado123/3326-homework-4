import static org.junit.Assert.*;
import org.junit.Test;
import problem3.*;

public class Test_Problem3 {
	
	@Test
	public void testing_Inventory() {
		Inventory inventory = new Inventory();

		inventory.connectionType("firebase");
		expect( inventory.connectionStatus(), "Connecting to Firebase.");
		inventory.connectionType("supabase");
		expect( inventory.connectionStatus(), "Connecting to Supabase.");
		inventory.connectionType("sqlite");
		expect( inventory.connectionStatus(), "Connecting to SQLite.");
		inventory.connectionType("microsoftSQL");
		expect( inventory.connectionStatus(), "Connecting to Microsoft SQL.");
	}
}