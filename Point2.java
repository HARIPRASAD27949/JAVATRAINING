import java.util.*;
public class Point
{
	private double x;
	private double y;
	public double getX()
	{
		return this.x;
	}//getx
	public double getY()
	{
		return this.y;
	}//gety
	Point()
	{
		x=0;
		y=0;
	}//point
	Point(double x1,double y1)
	{
		x=x1;
		y=y1;
	}//pointargs
	public double distance_from_origin()
	{
		double dist;
		dist=Math.sqrt(x*x+y*y);
		return dist;
	}//origin
	public double distance_from_point(Point Q)
	{
		double diff_x=x-Q.x;
		double diff_y=y-Q.y;
		return Math.sqrt(diff_x*diff_x+diff_y*diff_y);
	}//diff
	public void translate(double x_trans,double y_trans)
	{
		x=x+x_trans;
		y=y+y_trans;
	}//trans
}
class Test9
{
public static void main(String[] args)
	{
	double x1,y1,x2,y2,res;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the x coordinates and y coordinates of point class");
	x1=sc.nextDouble();
	y1=sc.nextDouble();
	Point p=new Point(x1,y1);
	System.out.println("Enter the x coordinates and y coordinates");
	System.out.print("for translation  of the point");
	x2=sc.nextDouble();
	y2=sc.nextDouble();
	System.out.println("co-ordinates point is"=p.getX()+","+p.getY());
	System.out.println("After translation:");
	p.translate(x2,y2);
	System.out.println("co-ordinates point is"=p.getX()+","+p.getY());
	}
}//main
