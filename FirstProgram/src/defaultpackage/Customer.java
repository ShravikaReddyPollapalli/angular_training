package defaultpackage;

public class Customer {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void accept() {
	setId(100);
	setName("shhra");
}
void display() {
	System.out.println(getId() + "," + getName());
}
public static void main(String[] args) {
	Customer obj = new Customer();
	obj.accept();
	obj.display();
}
}
