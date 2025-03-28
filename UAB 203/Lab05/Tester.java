package Lab05;

/**
 * The main class that runs and creates new calculators taking in two numbers.
 */

public class Tester {
	public static void main(String[] args) {
		ScientificCalculator s = new ScientificCalculator(5 , 3);
		ScientificCalculator a = new ScientificCalculator(3 , 3);		

		System.out.println(s.add());
		System.out.println(s.subtract());
		System.out.println(s.multiply());
		System.out.println(s.divide());
		System.out.println(s.SquareRoot());
		System.out.println(s.Exponent());
		
		System.out.println("~~~~~~~~~~~~~~");
		
		System.out.println(a.add());
		System.out.println(a.subtract());
		System.out.println(a.multiply());
		System.out.println(a.divide());
		System.out.println(a.SquareRoot());
		System.out.println(a.Exponent());

	}

}
