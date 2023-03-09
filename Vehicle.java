class Vehicle 
{
	void run()
	{
	System.out.println("vehicle is running");
}
}
class Bike2 extends Vehicle
{
	void run()
	{
		System.out.println("bike is running safely");
	}
public static void main(String[] args) 
	{
		Bike2 obj=new Bike2();
		obj.run();
	}
}