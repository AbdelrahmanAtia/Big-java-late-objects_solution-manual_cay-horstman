package CH3;

import java.util.Scanner;

/*
(P3.9) Write a program that reads a temperature value and the letter C for Celsius or F for
Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
at sea level.
*/
public class P3_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("press F for fahrenhiet and C for celsuis: ");
		String unit = in.next();
		System.out.print("enter the value of the tmperature: ");
		double value = in.nextDouble();

		if (unit.equals("C")) {
			if (value >= 100)
				System.out.println("gaseous");
			else if (value <= 0)
				System.out.println("solid");
			else
				System.out.println("liquid");
		}

		else if (unit.equals("F")) {
			if (value >= 212)
				System.out.println("gaseous");
			else if (value <= 32)
				System.out.println("solid");
			else
				System.out.println("liquid");

		} else
			System.out.print("wrong input");
	}
}