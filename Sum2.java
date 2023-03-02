import java.util.Scanner;
class sumn
{
	public static int sumDigit(int n)
	{
		int sum=0;
		while (n>0)
		{
			sum=sum+n%10;
			n=n/10;

		}//while
		return sum;
	}//sumdigit
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int temp=sc.nextInt();
		int res=sumDigit(temp);
		System.out.println("sum of digits of "+temp+"is"+res);
	}//main()
}//sum1