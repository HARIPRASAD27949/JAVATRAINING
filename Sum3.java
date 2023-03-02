import java.util.Scanner;
class Number
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
	public int factNum()
	{
		int res=1;
		int n=this.n1;
		while (n>=0)
		{
			if(n==0)
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
	public int productDigit(int n)
	{
		int product=1;
		n=this.n1;
		while (n>=0)
		{
			if(n==0)
		{
				return product;
		}
		else
			{
			product=product*(n%10);
			}
			n--;
		}
		return 1;
		}
}
		class sum6
		{
	public static void main(String[]args)
	{
		Number ob1=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int temp=sc.nextInt();
		ob1.setn1(temp);
		int res=ob1.factNum();
		int product=ob1.productDigit();
		System.out.println("sum of digits of "+ob1.getn1()+"is"+res);
		System.out.println("Product of digits of "+ob1.getn1()+"is"+product);
	}//main()
}//sum1