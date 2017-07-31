/*
 *(P1.4) Write a program that prints the balance of an account after the first, second, and third year. 
 *The account has an initial balance of $1,000 and earns 5 percent interest per year.
 */

public class P1_4 {

	public static void main(String[] args) {
		
		double initialBalance = 1000;
		double  result1 = initialBalance + 0.05 * initialBalance;
		double  result2 = result1 + 0.05 * result1;
		double  result3 = result2 + 0.05 * result2;
		
		System.out.println("Balance after 1st year = " + result1);
		System.out.println("Balance after 2nd year = " + result2);
		System.out.println("Balance after 3rd year = " + result3);

	}
}