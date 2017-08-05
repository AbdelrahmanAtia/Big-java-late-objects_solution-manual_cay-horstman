package CH_2;

import java.util.Scanner;
/*
(P2.7) Write a program that prompts the user for a radius and then prints
• The area and circumference of a circle with that radius
• The volume and surface area of a sphere with that radius 
*/
public class P2_7 {
	public static void main(String[] args) {

		double circle_area, circle_circumference;
		double sphere_area, sphere_volume;
		double radius;

		Scanner in = new Scanner(System.in);

		System.out.print("enter the radius:");
		radius = in.nextDouble();

		circle_area = (Math.PI) * Math.pow(radius, 2);
		circle_circumference = 2 * Math.PI * radius;
		sphere_area = 4 * (Math.PI) * (Math.pow(radius, 2));
		sphere_volume = (4 / 3.0) * (Math.PI) * (Math.pow(radius, 3));

		System.out.println();

		System.out.printf("circle area = %f", circle_area);
		System.out.println();

		System.out.printf("circle circumference = %f", circle_circumference);
		System.out.println();

		System.out.printf("sphere area = %f", sphere_area);
		System.out.println();

		System.out.printf("sphere volume = %f", sphere_volume);
		System.out.println();
	}
}