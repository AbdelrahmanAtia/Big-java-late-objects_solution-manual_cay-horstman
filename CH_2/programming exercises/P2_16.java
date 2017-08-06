
import java.util.Scanner;

/*
(P2.16) Write a program that reads in an integer and breaks it into a sequence of individual
digits. For example, the input 16384 is displayed as
1 6 3 8 4
You may assume that the input has no more than five digits and is not negative.
*/
public class P2_16 {
	public static void main(String[] args) {
		
		/*note that there is another simple solution, using charAt() method but i choosed to
		do it in the hard way*/

		int i = 0;
		int n = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("enter an integer: ");

		int input = in.nextInt();
		int z = input;

		while (input > 0) {
			input = input / 10;
			i++;
		}
		int j = (int) Math.pow(10, i - 1);

		while (n < i - 1) {
			System.out.print((z / j) + " ");
			z = z % j;
			j = j / 10;
			i--;
		}
		System.out.print(z);
	}
}
