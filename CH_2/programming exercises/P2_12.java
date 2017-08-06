import java.util.Scanner;

/*
(P2.12) File names and extensions. Write a program that prompts the user for the drive letter
(C), the path (\Windows\System), the file name (Readme), and the extension (txt). Then
print the complete file name C:\Windows\System\Readme.txt. (If you use UNIX or a
Macintosh, skip the drive name and use / instead of \ to separate directories.)
*/
public class P2_12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("enter the drive letter,example c : ");
		String str1 = in.next();

		System.out.print("enter the path,for example: \\Windows\\System : ");
		String str2 = in.next();

		System.out.print("enter the file name: ");
		String str3 = in.next();

		System.out.print("enter the file extension: ");
		String str4 = in.next();

		System.out.println("complete file name is " + str1 + ":" + str2 + "\\" + str3 + "." + str4);

	}
}