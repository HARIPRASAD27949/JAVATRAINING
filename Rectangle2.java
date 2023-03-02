class Rec
{
	double length;
	double breadth;
public Rec()
	{
		length=breadth=0;
	}
	public Rec(double l,double b)
	{
		length=l;
		breadth=b;
	}
	public void area()
	{
		double area=length*breadth;
			System.out.println("area is "+area);
		}
		public void perimeter()
	{
			double perimeter=length*breadth;
			System.out.println("perimeter is"+perimeter);
}
}

class Rectangle2
{
	public static void main(String[]args)
	{
		Rec r1=new Rec();
		Rec r2=new Rec(10,20);
		r1.area();
		r1.perimeter();
		r2.area();
		r2.perimeter();


}
}