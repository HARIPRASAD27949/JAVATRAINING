class Staticmethod
{
	static void myStaticmethod()
	{
		System.out.println("static method can be called without creation of an object");
	}//staticmethod
	public void myPublicMethod()
	{
		System.out.println("public methods must be call by creating object");
	}
	public static void main(String[] args) 
	{
		myStaticmethod();
	    Staticmethod myobj=new Staticmethod();
		myobj.myPublicMethod();
	}
}