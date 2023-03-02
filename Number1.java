import java.util.Scanner;
class Number333
{
private int n1;
public void setn1(int n1)
{
this.n1=n1;
}
public int getn1()
{
return this.n1;
}
public int factorialDigit()
{
int res=1;
int n=this.n1;
while(n>=0)
{
if(n==0)
{
return res;
}
else
{
res=res*n;
}
n--;
}
return 1;
}
public int productDigit()
{
int product=1;
int n=this.n1;
while(n>0)
{
if(n==0)
{
return product;
}
else
{
product=product*(n%10);
n=n/10;
}
}
return product;
}
}
class Test
{
public static void main(String[] args)
{
Number333 ob=new Number333();
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int temp=sc.nextInt();
ob.setn1(temp);
int res=ob.factorialDigit();
System.out.println("factorial of digits of  "+ob.getn1()+" is "+res);
int product=ob.productDigit();
System.out.println("product of digits of  "+ob.getn1()+" is "+product);
}
}
