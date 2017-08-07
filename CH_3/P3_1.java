package CH3;

import java.util.Scanner;

/*
(P3.1) Write a program that reads an integer and prints whether it is negative, zero, or positive.
*/
public class P3_1 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("enter an integer: ");
		int input=in.nextInt();
		if(input>0)
			System.out.println("positive");
		else if(input<0)
			System.out.println("negative");
		else
			System.out.println("zero");
	}
}
