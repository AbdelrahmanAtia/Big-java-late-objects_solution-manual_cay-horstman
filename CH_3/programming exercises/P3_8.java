package CH3;

import java.util.Scanner;

/*
P 3.8 Write a program that reads four integers and prints “two pairs” if the input consists
of two matching pairs (in some order) and “not two pairs” otherwise. For example,
1 2 2 1 two pairs
1 2 2 3 not two pairs
2 2 2 2 two pairs
*/
public class P3_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter 4 integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		if (a == b && c == d)
			System.out.println("two pairs");
		else if (a == c && b == d)
			System.out.println("two pairs");
		else if (a == d && b == c)
			System.out.println("two pairs");
		else
			System.out.println("not two pairs");
	}
}