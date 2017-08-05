/*
(P2.2) Write a program that computes and displays the perimeter of a letter-size 
(8.5 × 11 inches) sheet of paper and the length of its diagonal.
*/
public class P2_2 {
	public static void main(String[] args) {

		final double width = 8.5;
		final double height = 11;
		double perimeter = 2 * (height + width);
		double diagonal = Math.sqrt(width * width + height * height);

		System.out.println("perimeter = " + perimeter + " inches");
		System.out.println("diagonal = " + diagonal + " inches");
	}
}