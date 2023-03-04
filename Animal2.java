class Animal2
{
	void eat()
	{
		System.out.println("eating....");
	}//eat
}
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("barking...");
		}//bark
	}
	class BabyDog extends Dog
	{
		void weep()
		{
			System.out.println("weeping..");
	}
	}//weeping

		class Test2{
	public static void main(String[] args) 
	{
		BabyDog d=new BabyDog();
		d.weep();
		d.bark();
		d.eat();
		
	}
		}
		
