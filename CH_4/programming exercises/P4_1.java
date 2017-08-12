• P 4.1 Write programs with loops that compute
a. The sum of all even numbers between 2 and 100 (inclusive).

b. The sum of all squares between 1 and 100 (inclusive).

c. All powers of 2 from 2^0 up to 2^20.

d. The sum of all odd numbers between a and b (inclusive), where a and b are inputs.

e. The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
------------------------------------------------------------------------------------------------------------------------
solution of (a)
----------------
public static void main(String[] args) 
{
		int n = 2;
		int sum = 0;
		while (n <= 100) {
			if (n % 2 == 0)
				sum = sum + n;
			n++;
		}
		System.out.print("sum = " + sum);
}
------------------------------------------------------------------------------------------------------------------------
solution of (b)
----------------
public static void main(String[] args) 
{
	int n = 1;
	int z;
	int sum = 0;
	while (n <= 100) {
		z = n * n;
		sum = sum + z;
		n++;
	}
	System.out.print("sum = " + sum);
}
-------------------------------------------------------------------------------------------------------------------------
solution of (c)
----------------
public static void main(String[] args)
{
	int power = 0;
	double z;
	while (power <= 20) {
		z = Math.pow(2, power);
		System.out.println(z);
		power++;
	}
}
-------------------------------------------------------------------------------------------------------------------------
solution of (d)
----------------
public static void main(String[] args) 
{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the values of a and b separated by a space: ");
		int a = in.nextInt();
		int b = in.nextInt();
		double sum = 0;
		while (a <= b) {
			if (a % 2 != 0) 
				sum = sum + a;
			a++;
		}
		System.out.println("sum= " + sum);
}
-------------------------------------------------------------------------------------------------------------------------
solution of (e)
----------------
public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("enter a value: ");
		int input = in.nextInt();
		int sum = 0;
		int num;
		while (input > 0) {
			num = input % 10;
			input = input / 10;
			if (num % 2 != 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
-------------------------------------------------------------------------------------------------------------------------	
