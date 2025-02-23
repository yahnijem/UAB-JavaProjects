package Lab05;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
// setters and getters go here

    public int add(){
        return this.num1 + this.num2;
    }
    public int subtract(){
        return this.num1 - this.num2;
    }
    public int multiply(){
        return (this.num1 * this.num2);
    }
    public double divide(){
        return (this.num1 / this.num2);
    }
    




}
