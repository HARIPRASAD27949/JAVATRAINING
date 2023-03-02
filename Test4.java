import java.util.*;
class MyDate 
{
	private int day;
	private int month;
	private int year;
	public int get_day()
	{
	return day;
}//getday
public void set_day(int d)
{
	day=d;
}//setday
public int get_month()
	{
	return month;
}//getmonth
public void set_month(int m)
	{
	month=m;
	}
	public int get_year()
	{
	return year;
}//getmonth
public void set_year(int y)
	{
	year=y;
		
}//setmonth
}//class


class Test4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int d,m,y;
		System.out.println("Enter the day");
        d=sc.nextInt();
        System.out.println("Enter the month");
        m=sc.nextInt();
        System.out.println("Enter the year");
        y=sc.nextInt();

		MyDate obj=new MyDate();
		obj.set_day(d);
		obj.set_month(m);
		obj.set_year(y);
        System.out.println(obj.get_day()+"-"+obj.get_month()+"-"+obj.get_year());
	}//main
}//test3
