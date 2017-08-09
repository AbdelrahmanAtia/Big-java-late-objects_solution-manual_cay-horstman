package CH3;

import java.util.Scanner;

/*
(P3.12) Write a program that translates a letter grade into a number grade. Letter grades are
A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
However, an A+ has value 4.0.

Enter a letter grade: B-
The numeric value is 2.7.
*/
public class P3_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a letter grade: ");
		String str = in.next();
		char ch1 = str.charAt(0);
		char ch2 = ' ';
		if(str.length() == 2){
			ch2 = str.charAt(1);
		}
		
		double n = 0;
		switch (ch1) {
		case 'A':
			n = 4;
			break;
		case 'B':
			n = 3;
			break;
		case 'C':
			n = 2;
			break;
		case 'D':
			n = 1;
			break;
		case 'F':
			n = 0;
			break;
		}
		
		if (str.equals("A+"))
			n = n + 0;
		else if (ch2 == '+' && ch1 != 'F')
			n = n + 0.3;
		else if (ch2 == '-' && ch1 != 'F')
			n = n - 0.3;

		System.out.println("the numeric value is " + n);
	}
}
