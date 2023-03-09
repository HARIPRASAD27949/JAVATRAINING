class Animala
{
	String color="white";
}
class Dog extends Animala
{
	String color ="black";
	void printcolor(){
		System.out.println(color);
		System.out.println(super.color);
	}
}

	class Testsuper1
	{
		
		public static void main(String[]args)
		{
			Dog d=new Dog();
		d.printcolor();
	}
	}
