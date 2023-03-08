import java.util.*;
class TestArray5
{
	public static void main(String[] args) 
	{
		int n,x,flag=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of element you want in array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the all Elemrnts");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if (a[i]==x)
			{
				flag=1;
				break;
			}
			else 
			{
				flag=0;
			}
		}
		if (flag==1)
		{
			System.out.println("element found at position:"+(i+1));
		}
		else
		{
			System.out.println("element not found");
		}
	}
}
		