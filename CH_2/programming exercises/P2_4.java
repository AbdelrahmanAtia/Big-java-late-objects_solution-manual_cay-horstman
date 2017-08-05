import java.util.Scanner;

/*
(P2.4) Write a program that prompts the user for two integers and then prints
• The sum
• The difference
• The product
• The average
• The distance (absolute value of the difference)
• The maximum (the larger of the two)
• The minimum (the smaller of the two)
Hint: The max and min functions are declared in the Math class.
*/
public class P2_4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter two integers: ");
		
		int x = in.nextInt();
		int y = in.nextInt();

		System.out.println("sum= " + (x + y));
		System.out.println("diffrence= " + (x - y));
		System.out.println("product= " + x * y);
		System.out.println("average = " + (x + y) / (2.0));
		System.out.println("distace= " + Math.abs(x - y));
		System.out.println("maximum= " + Math.max(x, y));
		System.out.println("minimum= " + Math.min(x, y));
	}
}