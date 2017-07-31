/*
 * (P1.2) Write a program that prints the sum of the first ten positive integers, 1 + 2 + … + 10.
 */
public class P1_2 {

	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		//or u can do this
		//System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
	}
}
