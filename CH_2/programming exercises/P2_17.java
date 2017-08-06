import java.util.Scanner;

/*
(P2.17) Write a program that reads two times in military format (0900, 1730) and prints the
number of hours and minutes between the two times. Here is a sample run. User
input is in color.
Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes
Extra credit if you can deal with the case where the first time is later than the second:
Please enter the first time: 1730
Please enter the second time: 0900
15 hours 30 minutes
*/
public class P2_17 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the first time: ");
		String t1 = in.next();
		
		System.out.println("Please enter the second time: ");
		String t2 = in.next();
		
		int h1 =Integer.parseInt(t1.substring(0, 2));
		int m1 = Integer.parseInt(t1.substring(2));
		int totalMinutes1 = h1 * 60 + m1;
		
		int h2 =Integer.parseInt(t2.substring(0, 2));
		int m2 = Integer.parseInt(t2.substring(2));
		int totalMinutes2 = h2 * 60 + m2;
		
		int hours = 0, minutes = 0;
		if(totalMinutes2 > totalMinutes1)
		{
			int diff = totalMinutes2 - totalMinutes1;
			 hours = diff / 60;
			 minutes = diff % 60;
		}
		else if(totalMinutes2 < totalMinutes1)
		{
			int minutesPerDay = 24 * 60;
			int diff = totalMinutes2 - totalMinutes1 + minutesPerDay;
			 hours = diff / 60;
			 minutes = diff % 60;
		}
		
		System.out.println(hours + " hours " + minutes + " minutes ");
	}
}
