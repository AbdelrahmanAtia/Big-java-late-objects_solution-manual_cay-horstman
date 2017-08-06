import java.util.Scanner;

/*
(P2.14) Write a program that reads a number between 1,000 and 999,999 from the user and
prints it with a comma separating the thousands. Here is a sample dialog; the user
input is in color:
Please enter an integer between 1000 and 999999: 23456
23,456 

*/
public class P2_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("enter an integer between 1,000 and 999,999 :");
		int num = in.nextInt();
		int x = num / 1000;
		int y = num % 1000;
		System.out.println(x + "," + y);
	}
}