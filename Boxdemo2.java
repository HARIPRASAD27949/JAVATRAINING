class Box
{
	public double width;
	public double height;
	public double depth;
    public Box()
	{
		width=height=depth=0.0;
	}
	public Box (double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public void volume()
	{
		System.out.println("volume="+(width*height*depth));
	}
}
class BoxDemo2
{
	public static void main(String[]args)
	{
		Box b1=new Box();
		Box b2=new Box(10,15,20);
		b1.volume();
		b2.volume();
	}
}