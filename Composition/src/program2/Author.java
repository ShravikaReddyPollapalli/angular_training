package program2;

public class Author {
Book b;
Pen p;
public String Aname;
public Author(Book b, Pen p, String Aname) {
	super();
	this.b = b;
	this.p = p;
	this.Aname = Aname;
}
public void createStory()
{
	b.openBook();
	b.turnPage();
	b.closePage();
	p.write();
	b.titleBook();
	System.out.println("AuthorName "+this.Aname);
}
}
