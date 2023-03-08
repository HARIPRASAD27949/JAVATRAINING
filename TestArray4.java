class TestArray4
{
	public static void main(String[] args) 
	{
		int[]numbers={2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		for(int number:numbers)
		{
			sum+=number;
		}
		int arraylength=numbers.length;
		average=((double)sum/(double)arraylength);
		System.out.println("sum ="+sum);
		System.out.println("average ="+average);
	}
}