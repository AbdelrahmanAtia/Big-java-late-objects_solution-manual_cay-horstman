package CH3;

import java.util.Scanner;

/*
(P3.3) Write a program that reads an integer and prints how many digits the number has, by
checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are
less than ten billion.) If the number is negative, first multiply it with –1.
*/
public class P3_3 {
	
	public static void main(String[] args) {

		int n = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter an integer: ");
		double input = in.nextInt();

		if (input < 0)
			input *= -1;

		for (int i = 10; i < 1E9; i *= 10) 
		{
			if (input >= i)  n++;
		}
		System.out.print("the number of digits is " + n);
	}
}