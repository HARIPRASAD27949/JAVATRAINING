import java.util.*;
public class Program204
{
	public static boolean isEven(int n)
	{
		if(n%2==0)
		{return true;}
		else
		{return false;}
	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		if(isEven(0))
		{
			System.out.println("Even\n");
			System.out.println(n+"is an Even number");
				
		}
		else
		{
			System.out.println("odd\n");
			System.out.println(n+"is an odd number");
		}
	}
}
