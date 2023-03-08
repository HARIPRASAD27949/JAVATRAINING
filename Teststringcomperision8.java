import java.util.*;
class Teststringcomperision8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the s1 character");
		String s1=sc.next();
		System.out.println("enter the s2 character");
		String s2=sc.next();
		System.out.println("enter the s3 character");
		String s3=sc.next();
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));




	}
}
