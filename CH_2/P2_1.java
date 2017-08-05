/*
(P2.1) Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet
of paper in millimeters. There are 25.4 millimeters per inch. Use constants and commentsin 
your program.
*/
public class P2_1 {
	
	public static void main(String[] args){
		
	       final double millimeter_per_inch=25.4;
	       final double WIDTH=8.5;
	       final double HEIGHT=11; 
	       
	       System.out.printf("the size of the letter is %f x %f millimeters", WIDTH * millimeter_per_inch, HEIGHT * millimeter_per_inch); 
	}
}
