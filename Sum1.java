import java.util.Scanner;
class sumn
{
	private int n1;
	public void setn1(int n1)
	{
		this.n1=n1;
	}//setn1
	public int getn1()
	{
		return this.n1;
	}//getn1
	public int sumDigit()
	{
		int sum=0;
		prod=1;
		int n=this.n1;
		while (n>0)
		{
			sum=sum+n%10;
			prod=prod*(n%10);
			n=n/10;

		}//while
		return prod-sum;
	}//sumdigit

}//class
class Sum1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		sumn o=new sumn();
		int n;
		n=sc.nextInt();
		o.setn1(n);
		int z=o.getn1();
		int a=o.sumDigit();
		System.out.println("sum of digits of "+z+"is"+a);
	}//main()
}//sum1