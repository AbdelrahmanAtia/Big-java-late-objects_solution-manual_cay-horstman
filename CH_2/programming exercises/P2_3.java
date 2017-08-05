import java.util.Scanner;

/*
(P2.3) Write a program that reads a number and displays the square, cube, and fourth
power. Use the Math.pow method only for the fourth power.
*/
public class P2_3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		double x = in.nextDouble();
		
		System.out.println("square = " + x * x);
		System.out.println("cube = " + x * x * x);
		System.out.println("fourth power = " + Math.pow(x, 4));
	}
}