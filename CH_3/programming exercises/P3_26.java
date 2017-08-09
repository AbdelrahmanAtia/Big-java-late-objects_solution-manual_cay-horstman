package CH3;
/*
(P3.26) Roman numbers. Write a program that converts a positive integer into the Roman
number system. The Roman number system has digits
	I 1
	V 5
	X 10
	L 50
	C 100
	D 500
	M 1,000
Numbers are formed according to the following rules:
a. Only numbers up to 3,999 are represented.

b. As in the decimal system, the thousands, hundreds, tens, and ones are
expressed separately.

c. The numbers 1 to 9 are expressed as
	I 1
	II 2
	III 3
	IV 4
	V 5
	VI 6
	VII 7
	VIII 8
	IX 9
As you can see, an I preceding a V or X is subtracted from the value, and you
can never have more than three I’s in a row.

d. Tens and hundreds are done the same way, except that the letters X, L, C and C,
D, M are used instead of I, V, X, respectively.

Your program should take an input, such as 1978, and convert it to Roman numerals,
MCMLXXVIII.
*/
import java.util.Scanner;

public class P3_26 
{
	public static void main(String[] args) 
	{
		String digit1 = "";
		Scanner in = new Scanner(System.in);
		System.out.print("enter a positive integer: ");
		int input = in.nextInt();
		if (input >= 1 && input <= 3999)
		{
			int x = input % 10;
			int ones = x;
			switch (ones) {
			case 1:
				digit1 = "I";
				break;
			case 2:
				digit1 = "II";
				break;
			case 3:
				digit1 = "III";
				break;
			case 4:
				digit1 = "IV";
				break;
			case 5:
				digit1 = "V";
				break;
			case 6:
				digit1 = "VI";
				break;
			case 7:
				digit1 = "VII";
				break;
			case 8:
				digit1 = "VIII";
				break;
			case 9:
				digit1 = "IX";
				break;
			case 10:
				digit1 = "X";
				break;
			default:
				break;
			}
			x = input / 10;
			int tens = x % 10;
			String digit2 = "";
			switch (tens) {
			case 1:
				digit2 = "X";
				break;
			case 2:
				digit2 = "XX";
				break;
			case 3:
				digit2 = "XXX";
				break;
			case 4:
				digit2 = "XL";
				break;
			case 5:
				digit2 = "L";
				break;
			case 6:
				digit2 = "LX";
				break;
			case 7:
				digit2 = "LXX";
				break;
			case 8:
				digit2 = "LXXX";
				break;
			case 9:
				digit2 = "XC";
				break;
			default:
				break;
			}
			x = input / 100;
			int hundreds = x % 10;
			String digit3 = "";
			switch (hundreds) {
			case 1:
				digit3 = "C";
				break;
			case 2:
				digit3 = "CC";
				break;
			case 3:
				digit3 = "CCC";
				break;
			case 4:
				digit3 = "CD";
				break;
			case 5:
				digit3 = "D";
				break;
			case 6:
				digit3 = "DC";
				break;
			case 7:
				digit3 = "DCC";
				break;
			case 8:
				digit3 = "DCCC";
				break;
			case 9:
				digit3 = "CM";
				break;
			default:
				break;
			}
			x = input / 1000;
			int thousands = x % 10;
			String digit4 = "";
			switch (thousands) {
			case 1:
				digit4 = "M";
				break;
			case 2:
				digit4 = "MM";
				break;
			case 3:
				digit4 = "MMM";
				break;
			default:
				break;
			}
			System.out.println(digit4 + digit3 + digit2 + digit1);

		} 
		else
			System.out.println("input must be in the range of 1 to 3999");
	}
}
