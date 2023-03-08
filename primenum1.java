import java.util.*;
class primenum1 
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return this.num;
		
	}
	public boolean checkPrime()
	{
		if (this.num==1||this.num==2)
			return true;
		for(int i=2;i<this.num;i++)
		{
			if(this.num%i==0)
			{
				return false;
		}
		}
		return true;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number: ");
	int temp=sc.nextInt();
	primenum1 ob1=new primenum1();
	ob1.setNum(temp);
	if (ob1.checkPrime())
		{
	      System.out.println("prime");
		}
	    else
		{
		System.out.println("not prime");
		}
}
}
		
		