import java.util.*;    
public class ArmstsrongNumber  
{   
static boolean ArmStrong(int n)   
{   
int res,digits=0,last=0,sum=0;    
res=n;     
while(res>0)    
{   
res = res/10;   
digits++;   
}   
res = n;   
while(res>0)   
{        
last=res%10;   
sum +=(Math.pow(last,digits));   
res=res/10;   
}  
if(n==sum) 
	{
      return true;
	}
else
	{
	return false; 
	}//else
}   
public static void  main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");  
num=sc.nextInt();  
if(ArmStrong(num))  
{  
System.out.print("Armstrong number ");  
}//if  
else   
{  
System.out.print("Not Armstrong number ");  
}//else  
}//main   
}//class  