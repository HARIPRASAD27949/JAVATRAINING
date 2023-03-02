import java.util.*;
public class Program304c
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		int a,b;
		System.out.println("Enter two number a:");
		 a=sc.nextInt();
	     b=sc.nextInt();
		a=(a+b)-(b=a);
		 System.out.println("Numbers after Swapping:"+a+" "+b);
	}
}
