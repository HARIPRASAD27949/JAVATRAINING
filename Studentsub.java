import java.util.*;
public class Studentsub 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of student:");
		int n=sc.nextInt();
		int rollNo[]=new int[n];
		int s1[]=new int[n];
		int s2[]=new int[n];
		int s3[]=new int[n];
		double total[]=new double [n];
		double avg[]=new double[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter student"+(i+1)+"details:");
			System.out.println("Roll No:");
			rollNo[i]=sc.nextInt();
			System.out.println("subject 1 Marks:");
			s1[i]=sc.nextInt();
			System.out.println("subject 2 Marks:");
			s2[i]=sc.nextInt();
			System.out.println("subject 3 Marks:");
			s3[i]=sc.nextInt();
			total[i]=(s1[i]+s2[i]+s3[i]);
			avg[i]=total[i]/3.0;
		}
		System.out.println("Roll no\t Total\t Average");
		for(int i=0;i<n;i++)
		{
			System.out.println(rollNo[i]+"\t"+total[i]+"\t"+avg[i]);
		}
	}
}