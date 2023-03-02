import java.util.*;
public class Program307b
{
	static double area_of_a_rectangle(double length, double breadth)
	{
		return length*breadth;
	}
	public static void main (String[]args)
	{
		Scanner sc=new Scanner (System.in);
		double length;
		System.out.println("\n Enter the length of the rectangle:");
		double breadth;
		System.out.println("Enter the breadth of the rectangle:");
		breadth=sc.nextDouble();
		length=sc.nextDouble();
		System.out.println("area of the Rectangle is" +area_of_a_rectangle(length,breadth));

	}
}