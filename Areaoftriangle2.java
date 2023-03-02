import java.util.*;
class  Areatri2
{
		static double areaofatriangle(double base,double height)
		{
			double temp;
			temp=1.0/2.0*base*height;
			return temp;
		}

		public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			double base,height,area;
			System.out.println("Enter the base of traingle");
			base=sc.nextDouble();
			System.out.println("enter the hight of a traingle");
			height=sc.nextDouble();
			area=areaofatriangle(base,height);
		    System.out.println("area of the triangleis  "+base+"  height  "+height+" is "+area+"  sq unites");
	}

}
