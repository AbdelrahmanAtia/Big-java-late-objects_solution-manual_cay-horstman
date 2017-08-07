package CH3;

import java.util.Scanner;

/*
(P3.2) Write a program that reads a floating-point number and prints “zero” if the number is zero. 
       Otherwise, print “positive” or “negative”. Add “small” if the absolute value
       of the number is less than 1, or “large” if it exceeds 1,000,000.
*/
public class P3_2 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("enter a floating point number: ");
		double input = in.nextDouble();
		double val = Math.abs(input);

		if (input == 0)
			System.out.print("zero");

		else
		{
			if (val > 1E6)
				System.out.print("large ");

			else if (val < 1)
				System.out.print("small ");
			if (input > 0)
				System.out.print("positive ");

			else if (input < 0)
				System.out.print("negative ");
			
		}
	}
}
