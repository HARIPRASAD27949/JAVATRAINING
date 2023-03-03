import java.util.Scanner;
class Voter
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int age;
System.out.print("Enter your age:");
age=s.nextInt();
if (age>=18)
{
System.out.println("You are eligible for vote");
}
else
{
System.out.println("You are not eligible for vote");
if ((18-age)==1)
{
System.out.println("You are eligible for vote after one year");
}
else
{
System.out.println("You are eligible for vote after "+(18-age)+" Years");
}
}
}
}
