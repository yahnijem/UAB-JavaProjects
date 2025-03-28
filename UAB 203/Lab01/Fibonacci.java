package Lab01;

/**
 * First ever Java project!
 * This class generates and prints the Fibonacci sequence up to a given number of terms.
 */

public class Fibonacci {
	public static void Fibonacci(int n){
		int a= 0; 
		int b = 1;
		for (int i=0; i<n; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a=b;
			b=c;
		}
    }
	public static void main(String[] args) {
		Fibonacci(10);
	}
}
