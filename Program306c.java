import java.util.*;
public class Program306c
{
	public static void displayMonth(int month_no)
	{
		String s=new String();
		if(month_no==1)s="january";
		if(month_no==2)s="february";
		if(month_no==3)s="march";
		if(month_no==4)s="april";
		if(month_no==5)s="may";
		if(month_no==6)s="june";
		if(month_no==7)s="july";
		if(month_no==8)s="august";
		if(month_no==9)s="september";
		if(month_no==10)s="octobar";
		if(month_no==11)s="november";
		if(month_no==12)s="december";
		if(month_no<0 || month_no>12)s="Incorrect Month number";
		System.out.println("Month is:"+s);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the month numbers(0_12):");
		int month_no=sc.nextInt();
		displayMonth(month_no);
	}
}

	