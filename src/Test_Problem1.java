import static org.junit.Assert.*;
import org.junit.Test;
import problem1.*;

public class Test_Problem1 {

	@Test
	public void testing_linkedlist() {
        LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		
		assertEquals(3, list.size());
	}

	@Test
	public void testing_linkedlist_values() {
        LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(4);
		list.insert(8);
		list.insert(16);

		assertEquals(4, list.size());

		assertEquals(2, list.get(0));
		assertEquals(4, list.get(1));
		assertEquals(8, list.get(2));
		assertEquals(16, list.get(3));
	}
}