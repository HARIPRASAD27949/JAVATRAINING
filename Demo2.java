import java.util.*;
class Demo2
{
	private 
	public static int digit(int n)
	{
		int res=1;
		while(n>=0)
		{
			if (n==0)
			{
			return res;
		}
		else
		{
			res=res*n;
		}
		n--;
	}
	return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res=digit(n);
		System.out.println("the factorial of"+n+"is"+res);
	}
	}

