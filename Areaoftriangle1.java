import java.util.*;
class  Areatri1
{
		static double areaofatriangle(double base,double height)
		{
			float c=1/2f;
			return(c)*base*height;
		}
		public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			double base,height,area;
			System.out.println("Enter the base of traingle");
			base=sc.nextDouble();
			System.out.println("enter the hight of a traingle");
			height=sc.nextDouble();
		    System.out.println("area of the triangleis  "+areaofatriangle(base,height));
	}

}
