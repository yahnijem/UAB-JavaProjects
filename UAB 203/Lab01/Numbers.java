package Lab01;

/**
 * This program calculates the sum of numbers from 0 to 100.
 */

public class Numbers{
	
	public static void main(String[] args){
		int x = 100;
		int sum = 0;
		for (int i=0; i<=x; i++) 
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
