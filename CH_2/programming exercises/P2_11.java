import java.util.Scanner;

/*
(P2.11) Write a program that asks the user to input
• The number of gallons of gas in the tank
• The fuel efficiency in miles per gallon
• The price of gas per gallon	
Then print the cost per 100 miles and how far the car can go with the gas in the tank.
*/
public class P2_11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("enter the number of gallons of gas in the tank: ");
		double gallons = in.nextDouble();

		System.out.print("enter the fuel efficiency in miles per gallon: ");
		double fuel_efficiency = in.nextDouble();

		System.out.print("enter the price of gas per gallon: ");
		double price_per_gallon = in.nextDouble();

		System.out.println("the cost per 100 miles = " + (price_per_gallon * (100.0 / fuel_efficiency)));

		double distance = gallons * fuel_efficiency;
		System.out.printf("distance that the car can go with gas in the tank = %f miles", distance);
	}
}