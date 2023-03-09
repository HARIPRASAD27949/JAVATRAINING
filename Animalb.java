class Animalb
{
	void eat()
	{
		System.out.println("eating....");
	}
}//eat
	class Dog extends Animal
	{
		void eat()
		{
			System.out.println("eating bread...");
		}
		void bark(){
			System.out.println("barking.....");
	}
	void work()
	{
		super.eat();
		bark();
	}
	}//bark
		class Testsuper2{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.bark();
		d.work();
	}
		}
		
