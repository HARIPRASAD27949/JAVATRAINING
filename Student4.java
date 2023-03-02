import java.util.*;
class Student
{
	int rollno;
	String name;
	static String college="miti";
	Student(int rollno,String name,float fee)
	{
		this.name=name;
		this.rollno=rollno;
		this.fee=fee;
		void diplay()
		{
		System.out.println("Rollno:"+rollno+"\nNAme: "+name+"\ncollege "+college="\nfee"+fee);
	}
}
public class Student5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name of the student:");
	  String s=sc.nextInt();
	  System.out.println("Enter the fee of the student:");
	  float f=sc.nextInt();
	  System.out.println("Enter the roll number of the student