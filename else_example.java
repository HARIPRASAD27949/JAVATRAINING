import java.util.Scanner;
public class else_example
{
	public static void main(String []args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
			System.out.println("enter two integers:");
		i=sc.nextInt();
		j=sc.nextInt();
		if(j==0)
			System.out.println("Division by error");
		else
			System.out.println(i+"divided by"+j+"is"+(i/j));
	}
}