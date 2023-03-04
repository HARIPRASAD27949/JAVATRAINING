class Animal
{
	void eat()
	{
		System.out.println("eating....");
	}
}//eat
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("barking...");
		}
	}//bark
		class Test{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.bark();
		d.eat();
	}
		}
		
