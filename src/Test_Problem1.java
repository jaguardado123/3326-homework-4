import static org.junit.Assert.*;
import org.junit.Test;
import problem1.*;

public class Test_Problem1 {

	@Test
	public void testing_Product() {
        Product product = new Product();
		
		assertEquals(product.cost(75.5) == 75.5, true);
		assertEquals(product.cost(32.0, 0.30) == 22.4, true);
		assertEquals(product.cost(55.0, 0.40) == 33.0, true);
		assertEquals(product.cost(20.0, "QWE-456") == 10.0, true);
		assertEquals(product.cost(30.0, "bob") == 30.0, true);
	}

	@Test
	public void testing_MovieTicket() {
        Product ticket = new MovieTicket();

		assertEquals( ((MovieTicket) ticket).cost("Tuesday", 12.0, 1) == 6.0, true);
		assertEquals( ((MovieTicket) ticket).cost("Tuesday", 10.0, 3) == 15.0, true);
		assertEquals( ((MovieTicket) ticket).cost("Saturday", 11.0, 2) == 22.0, true);
	}

	@Test
	public void testing_Popcorn() {
        Product popcorn = new Popcorn();

		assertEquals( ((Popcorn) popcorn).cost(8.00, "small", true) == 7.5, true);
		assertEquals( ((Popcorn) popcorn).cost(9.00, "small", false) == 8.0, true);
		assertEquals( ((Popcorn) popcorn).cost(8.00, "medium", true) == 8.5, true);
		assertEquals( ((Popcorn) popcorn).cost(9.00, "medium", false) == 9.0, true);
		assertEquals( ((Popcorn) popcorn).cost(8.00, "large", true) == 10.5, true);
		assertEquals( ((Popcorn) popcorn).cost(9.00, "large", false) == 11.0, true);
	}
}