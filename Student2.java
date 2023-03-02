import java.util.*;
class Student
{
	int rollno;
	String name;
	static String college="miti";
	static void change()
	{
		college="sgdc";
	}
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	//method to display values                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
class Student2
{
	public static void main(String[] args) 
	{
		Student s1=new Student(111,"hari");
		Student s2=new Student(222,"siva");
		Student s3=new Student(333,"shivani");
		//calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}//class