import java.util.Scanner;
class sumn
{
	private int n;
	public void set(int n)
	{
		this.n=n;
	}//setn1
	public int get()
	{
		return this.n;
	}//getn1
	public int reverse()
	{
		int sum=0;
		int n=this.n;
		while (n>0)
		{
			sum=sum*10+n%10;
			n=n/10;

		}//while
		return sum;
	}//reversedigit
	public int digit()
	{
		int sum=0;
		n=this.n;
		while(n>0)
		{
			sum=sum+(n%10);
			n=n/10;
		}

		return sum;
	}

}//class
class SumofDigits
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the digit");
		n=sc.nextInt();
		sumn s=new sumn();
		s.set(n);
		int z=s.get();
		int c=s.reverse();
		int a=s.digit();
		System.out.println("sum of digits of "+z+"is"+a+"and reverse of the digit is "+c);
	}//main()
}//sum1