class Book
{
	String name;
	int price;
	Author auther;
	Book(String n,int p,Author author)
	{
		this.name=n;
		this.price=p;
		this.auther=auther;
	}
	public static void main(String[]args)
	{
		Author auther=new Author("john",42,"USA");
		Book b=new Book("Java for Begginer",800,auther);
		System.out.println("Book Name:"+b.name);
		System.out.println("Book price:"+b.price);
		System.out.println("-----Auther Details------");
		System.out.println("Auther name:"+b.auther.authorName);
		System.out.println("Auther Age:"+b.auther.age);
		System.out.println("Auther place:"+b.auther.place);

}
}
