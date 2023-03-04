import java.util.*;
class Doubt2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float P,R,T;
		P=sc.nextFloat();
		R=sc.nextFloat();
		T=sc.nextFloat();
		float SI=(P*T*R)/100;
	    System.out.println("Simple intrest="+SI);
		double CI=P*(Math.pow((1+R/100),T));
		System.out.println("compound intrest is ="+SI);

	}
}