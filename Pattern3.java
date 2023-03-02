import java.util.*;
class Pattern1
{
	static void printPattern1(char ch,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(ch);
			}
		System.out.println("\n");
	}
	public static void printPattern(int n1,char ch)
	{
		for(int j=n1;j>0;j--)
		{
			printPattern1(ch,j);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
	char ch;
	System.out.println("enter the no.of colomuns");
	n=sc.nextInt();
	System.out.println("enter the character");
	ch=sc.next().charAt(0);
     printPattern(n,ch);
	}
}