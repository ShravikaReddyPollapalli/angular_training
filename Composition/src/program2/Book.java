package program2;

public class Book {
public String title;

public Book(String title) {
	super();
	this.title = title;
}
public void titleBook()
{
	System.out.println(this.title);
}
public void openBook()
{
	System.out.println("open the book");
}
public void turnPage()
{
	System.out.println("turn the page");
}
public void closePage()
{
	System.out.println("close the book");
}

}
