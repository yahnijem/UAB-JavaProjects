package Lab05;

public class CalcTester {
    public static void main(String[] args) {
		ScientificCalculator s = new ScientificCalculator(5 , 3);
		System.out.println(s.add());
		System.out.println(s.subtract());
		System.out.println(s.multiply());
		System.out.println(s.divide());
		System.out.println(s.SquareRoot());
		System.out.println(s.Exponent());

	}
}
