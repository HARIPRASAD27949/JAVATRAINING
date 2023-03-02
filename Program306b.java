import java.util.*;
public class Program306b
{
	public static void displayDay(int day_no)
	{
		String s=new String();
		if(day_no==0)s="sunday";
		else if(day_no==1)s="monday";
		else if(day_no==2)s="tuesday";
		else if(day_no==3)s="wednesday";
		else if(day_no==4)s="thursday";
		else if(day_no==5)s="friday";
		else if(day_no==6)s="saturday";
		else  s="Incorrect day number";
		System.out.println("Day is:"+s);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the day numbers(0_6):");
		int day_no=sc.nextInt();
		displayDay(day_no);
	}
}

	