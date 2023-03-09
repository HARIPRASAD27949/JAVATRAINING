import java.util.*;
class  Factor2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("\n Enter the number: ");
		num=sc.nextInt();
		int size=(int)num/2;
		int[] FA=new int[size];
		int i,count=0;
		for (i=1;i<num;i++)
		{
			if (num%i==0)
			{
				FA[count]=i;
				count=count+1;
				System.out.print(i+",");
			}
		}
		System.out.print("\nTotal factors of "+num+" are "+count);
		for(int j=0;j<count;j++)
		{
			System.out.print(FA[j]+",");
		}
	}
}
