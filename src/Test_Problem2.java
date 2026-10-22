import static org.junit.Assert.*;
import org.junit.Test;
import problem2.*;

public class Test_Problem2 {
	
	@Test
	public void testing_Math() {
		Math math = new Math();
		double [] numbersA = {2.0, 3.0, 4.0};
		double [] numbersB = {22.0, 35.0, 4.0, 12.5};


		expect( math.list(numbersA) == 0.0, true);
		expect( math.list(numbersB) == 0.0, true);
	}

	@Test
	public void testing_Largest() {
		Math math = new Largest();
		double [] numbersA = {2.0, 3.0, 4.0};
		double [] numbersB = {22.0, 35.0, 4.0, 12.5};


		expect( math.list(numbersA) == 4.0, true);
		expect( math.list(numbersB) == 35.0, true);
	}

	@Test
	public void testing_Smallest() {
		Math math = new Smallest();
		double [] numbersA = {2.0, 3.0, 4.0};
		double [] numbersB = {22.0, 35.0, 4.0, 12.5};


		expect( math.list(numbersA) == 2.0, true);
		expect( math.list(numbersB) == 4.0, true);
	}

	@Test
	public void testing_Average() {
		Math math = new Average();
		double [] numbersA = {2.0, 3.0, 4.0};
		double [] numbersB = {22.0, 35.0, 4.0, 12.0};


		expect( math.list(numbersA) == 3.0, true);
		expect( math.list(numbersB) == 18.25, true);
	}
}