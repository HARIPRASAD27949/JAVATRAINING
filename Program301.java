import java.util.*;
class Program301
{
	static void positiveNegative(int a)
	{
		if (a>=0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		positiveNegative(n);
	}
}