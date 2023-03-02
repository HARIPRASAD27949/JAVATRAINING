import java.util.*;
public class Program202
{ 
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
			int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println("Even\n");
			System.out.println(n+"is Even number");

		}
		else
		{
			System.out.println("odd\n");
			System.out.println(n+"is Odd number");

		}
	}
}