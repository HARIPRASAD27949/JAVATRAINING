import java.util.*;
public class Program306
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
        int day_no=sc.nextInt();
		String s=new String();
		if(month_no==0)s="sunday";
		 if(month_no==1)s="monday";
		 if(month_no==2)s="tuesday";
		 if(day_no==3)s="wednesday";
		 if(day_no==4)s="thursday";
		 if(day_no==5)s="friday";
		 if(day_no==6)s="saturday";
		 if (day_no<0||day_no>6)s="Incorrect day number";
		System.out.println("Day is:"+s);
	}
}
	