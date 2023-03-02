import java.util.*;
class Student
{
	String name;
	int rollno;
	float fee;
	static String college="miti";
	Student(String name,int rollno,float fee)
	{
		this.name=name;
		this.rollno=rollno;
		this.fee=fee;
	}
		void display()
		{
		System.out.println("\nNAme: "+name+"\nRollno:"+rollno+"\ncollege "+college+"\nfee"+fee);
	}
}
public class Student5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name of the student:");
	  String s=sc.next();
	  System.out.println("Enter the roll number of the student:");
	  int i=sc.nextInt();
	  System.out.println("Enter the fee of the student:");
	  float f=sc.nextFloat();
	  Student a1=new Student(s,i,f);
	  Student.college="mtca";
	  a1.display();
	}
}