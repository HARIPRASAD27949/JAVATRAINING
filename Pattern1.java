class Pattern1
{
 public static void printPattern(char ch,int n)
	{
	 for(int i=0;i<=n;i++)
		{
		 System.out.println(ch);
		}
		System.out.print("\n");
	}
	public static void main(String[]args)
	{
		printPattern('#',1);
		printPattern('#',2);
		printPattern('#',3);
		printPattern('#',4);
		printPattern('#',5);
	}
}



