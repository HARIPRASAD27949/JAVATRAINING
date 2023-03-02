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


class Test1
{
	public static void main(String[] args) 
	{
		MyDate obj=new MyDate();
		obj.set_day(1);
		obj.set_month(2);
		obj.set_year(2023);
System.out.println(obj.get_day()+"-"+obj.get_month()+"-"+obj.get_year());
	}//main
}//test3
