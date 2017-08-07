package CH3;

import java.util.Scanner;

/*
(P3.5) Write a program that reads three numbers and prints “increasing” if they are in
increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise.
Here, “increasing” means “strictly increasing”, with each value larger than its predecessor.
The sequence 3 4 4 would not be considered increasing.
*/
public class P3_5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter three numbers separated by space: ");
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();

		if (z > y && y > x)
			System.out.print("increasing");
		else if (x > y && y > z)
			System.out.print("decreasing");
		else
			System.out.print("neither");
	}
}