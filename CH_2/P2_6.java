import java.util.Scanner;
/*
(P2.6) Write a program that prompts the user for a measurement in meters and then converts
it to miles, feet, and inches.
*/
public class P2_6 {

	public static void main(String[] args) {
		
		final double METERS_PER_MILE = 1609.344;
		final double FEETS_PER_METER = 3.2808399;
		final double INCHES_PER_METER = 39.3700787;
		
		double meters, miles, feet, inches;

		Scanner in = new Scanner(System.in);

		System.out.print("enter the value in meters: ");
		meters = in.nextDouble();
		
		miles = meters / METERS_PER_MILE;
		feet = meters * FEETS_PER_METER;
		inches = meters * INCHES_PER_METER;
		System.out.println();

		System.out.printf("%f meters = %f miles", meters, miles);
		System.out.println();

		System.out.printf("%f meters = %f miles", meters, feet);
		System.out.println();

		System.out.printf("%f meters = %f miles", meters, inches);
		System.out.println();
	}
}