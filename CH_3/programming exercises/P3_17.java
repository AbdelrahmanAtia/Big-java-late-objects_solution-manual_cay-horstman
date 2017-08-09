package CH3;
import java.util.Scanner;
/*
•• P 3.17 When two points in time are compared, each given as hours (in military time, ranging
from 0 and 23) and minutes, the following pseudocode determines which comes
first.
	If hour1 < hour2
		time1 comes first.
	Else if hour1 and hour2 are the same
		If minute1 < minute2
			time1 comes first.
		Else if minute1 and minute2 are the same
			time1 and time2 are the same.
		Else
			time2 comes first.
	Else
		time2 comes first.
Write a program that prompts the user for two points in time and prints the time that
comes first, then the other time.
*/
public class P3_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour1, hour2;
		int min1, min2;

		System.out.println("enter hours and minutes of first time separated by space: ");
		hour1 = in.nextInt();
		min1 = in.nextInt();

		System.out.println("enter hours and minutes of second time separated by space: ");
		hour2 = in.nextInt();
		min2 = in.nextInt();

		if (hour1 < hour2) 
		{
			System.out.println("time 1 comes first");
		}
		else if (hour1 == hour2) 
		{
			if (min1 < min2)
				System.out.println("time 1 comes first");
			else if (min1 == min2)
				System.out.println("time 1 and time 2 are equal");
			else
				System.out.println("time 2 comes first");
		}
		else
		{
			System.out.println("time 2 comes first");
		}
	}
}