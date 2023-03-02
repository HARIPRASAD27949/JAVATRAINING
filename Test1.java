class MyDate 
{
	private int day;
	public int month;
	public int year;
	public int get_day()
	{
	return day;
}
public void set_day(int d)
{
	day=d;
}
}

class Test1
{
	public static void main(String[] args) 
	{
		MyDate obj=new MyDate();
		obj.set_day(1);
		obj.month=2;
		obj.year=2023;
System.out.println(obj.get_day()+"-"+obj.month+"-"+obj.year);
	}
}//test
