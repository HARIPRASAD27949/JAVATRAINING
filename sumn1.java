import java.util.Scanner;
class sumn1
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
		int n1;
		System.out.println("Enter the digit");
		n1=sc.nextInt();
		int[] arr=new int[n1];
        int[] sum=new int[n1];
		System.out.println("Enter the numbers:");
		for (int i=0;i<n1 ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		sumn s=new sumn();
		for (int i=0;i<n1 ;i++ )
		{
		
		s.set(arr[i]);
		int a=s.digit();
		System.out.println("yht sum of digits is "+a);
		}
	}//main()
}//sum1