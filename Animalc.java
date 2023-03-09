class Animalc
{
	Animalc()
	{
		System.out.println("animal is created");
	}
}
	class Dog extends Animalc{
		Dog()
		{
			super();
			System.out.println("dog is created");
		}
	}
	
	class Testsuper3
	{
		public static void main(String[]args)
		{
			Dog d=new Dog();
	}
	}