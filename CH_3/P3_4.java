package CH3;

import java.util.Scanner;

/*
(P3.4) Write a program that reads three numbers and prints “all the same” if they are all the
same, “all different” if they are all different, and “neither” otherwise.

*/
public class P3_4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();

		if (x == y && y == z)
			System.out.println("all the same");
		else if (x != y && y != z)
			System.out.println("all diffrent");
		else
			System.out.println("either");
	}
}