package CH3;

/*
Write a program that reads in three integers and prints “in order” if they are sorted in
ascending or descending order, or “not in order” otherwise. For example,
1 2 5 in order
1 5 2 not in order
5 2 1 in order
1 2 2 in order
*/
import java.util.Scanner;

public class P3_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();

		if (z >= y && y >= x)
			System.out.print("in order");
		else if (x >= y && y >= z)
			System.out.print("in order");
		else
			System.out.print("not in order");
	}
}