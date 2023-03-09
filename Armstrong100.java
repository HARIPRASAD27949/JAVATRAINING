import java.util.Scanner;
class Armstrong100
{
public static void main(String[] args)
	{

int sum,sum1;
  for(int i=100;i<1000;i++)
{
 int sum2=1000;
 int numberOfdigits=String.valueOf(i).length();
 while(sum1>0)
{
 int digit=sum%10;
 sum+=Math.pow(digit,numberOfdigits);
 sum=sum1/10;
   }
if(sum==sum1)
{
  System.out.print(" "+sum1+",");
}
}
System.out.print("\n Total amstrong numbers in array is "+sum1+"\n");
}
}
