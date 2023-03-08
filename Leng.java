import java.util.Scanner;
class Leng
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
		
	//reversedigit
	public int length()
	{
		if (n<0) n=-n;
		if(n==0)
			return 1;
		int len=0;
		while(n>0)
		{
			n=n/10;
			len++;
		}

		return len;
	}

}//class
class Length
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n1;
		System.out.println("Enter the digit");
		n1=sc.nextInt();
		Leng l=new Leng();
		l.set(n1);
		int a=l.length();
		int x=l.get();
		System.out.println("length of digits of "+a);
		
	}//main()
}//length