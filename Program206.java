import java.util.*;
public class Program206
{
	public static void main(String[]args)
	{
		char ch;
		System.out.println("Enter a character:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int ascii=(int)ch;
			System.out.println("THe ASCII value of"+ch+"is"+ascii);
	}
}