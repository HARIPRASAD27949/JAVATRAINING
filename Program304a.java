import java.util.*;
public class Program304a
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		int a,b;
		System.out.println("Enter 1st number a:");
		a=sc.nextInt();
			System.out.println("ENter the 2nd number b:");
	     b=sc.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("Numbers after Swapping:"+a+" "+b);
	}
}
