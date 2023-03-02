import java.util.*;
public class Program309
{
	static int smaller(int a,int b, int c)
	{
		if(a<b&&a<c)
			return a;
		else if (b<a&&b<c)
			return b;
		else if (c<a && c<b)
			return c;
		else
			return 0;
	}
	public static void main(String []args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		System.out.println("the smaller number is "+smaller(a,b,c));
	}
}