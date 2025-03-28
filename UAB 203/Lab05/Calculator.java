package Lab05;

/**
 * This is a parent class that represents a basic calculator.
 * It stores the calculator functions like addition, subtraction, multiplication, and division.
 */
public class Calculator {
	
	private double num1;
    private double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public double getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	public double add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
