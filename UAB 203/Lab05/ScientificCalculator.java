package Lab05;

public class ScientificCalculator extends Calculator{
	
	public ScientificCalculator(int num1, int num2) {
		super(num1, num2);
	}
	
	public double SquareRoot(){
		return Math.sqrt(getNum1());
	}
	public double Exponent(){
		return Math.pow(getNum1(), getNum2());
	}

	
	
	
}
