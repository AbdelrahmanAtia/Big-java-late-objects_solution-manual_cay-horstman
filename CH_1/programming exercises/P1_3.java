/*
 *(P1.3) Write a program that prints the product of the first ten positive integers, 1 × 2 × … × 10. 
 *(Use * to indicate multiplication in Java.)
 */
public class P1_3 {
	public static void main(String[] args) 
	{
		int result = 1;
		for(int i = 1; i <= 10; i++)
		{
			result = result * i;
		}
		System.out.println(result);
	}
}
