import java.util.Scanner;
/*
(P2.8) Write a program that asks the user for the lengths of the sides of a rectangle. Then
print
• The area and perimeter of the rectangle
• The length of the diagonal (use the Pythagorean theorem)
*/
public class P2_8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("enter the height of the rectangle: ");
		double height = in.nextDouble();

		System.out.println("enter the width of the rectangle: ");
		double width = in.nextDouble();

		double area = height * width;
		double permieter = (height + width) * 2;
		double diagonal = Math.sqrt(height * height + width * width);
		
		System.out.println("area= " + area);
		System.out.println("permieter = " + permieter);
		System.out.println("diagonal = " + diagonal);
	}
}