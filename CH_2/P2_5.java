import java.util.Scanner;
/*
(P2.5) Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
Sum: 45
Difference: -5
Product: 500
Average: 22.50
Distance: 5
Maximum: 25
Minimum: 20
*/
public class P2_5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter two integers: ");

		int x = in.nextInt();
		int y = in.nextInt();

		System.out.printf("sum:      %10d ", (x + y));
		System.out.println("");
		System.out.printf("diffrence:%10d ", (x - y));
		System.out.println("");
		System.out.printf("product:  %10d ", x * y);
		System.out.println("");
		System.out.printf("average:  %10.2f ", (x + y) / (2.0));
		System.out.println("");
		System.out.printf("distace:  %10d ", Math.abs(x - y));
		System.out.println("");
		System.out.printf("maximum:  %10d", Math.max(x, y));
		System.out.println("");
		System.out.printf("minimum:  %10d ", Math.min(x, y));
		System.out.println("");
	}
}