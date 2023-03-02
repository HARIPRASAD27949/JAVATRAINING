import java.util.Scanner;
public class else_example4
{
	public static void main(String []args)
	{
		int i;
		i=15;
		{
			System.out.println("we are in black shirt");
			int j;
			i=10;
			j=i*i;
			System.out.println("i and j in new block are "+i+" "+j);
		}
		int k;
		k=i+2;
		int j;
		j=k+100;
		System.out.println("i and j out of the new block are "+i+"  "+j);
	}
}