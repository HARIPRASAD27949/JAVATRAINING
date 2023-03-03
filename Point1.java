import java.util.*;
public class Point
{
	double x;
	double y;
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
public class Test7
{
public static void main(string[]args)
	{
	double x1,y1,x2,y2,res;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the x coordinates and y coordinates");
	x1=sc.nextDouble();
	y1=sc.nextDouble();
	Point p=new Point(x1,y1);
	res=p.distance_from_origin();
	System.out.println("Distance of point from origin is"+res);
	}
}//main
