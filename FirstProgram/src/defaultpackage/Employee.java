package defaultpackage;

public class Employee {
int id;
String name;
 void acceptDetails() {
	 id = 100;
	 name = "ram";
 }
 void displayDetails() {
	 System.out.println(id + "," + name);
 }
 public static void main(String[] args) {
	Employee obj = new Employee();
	obj.acceptDetails();
	obj.displayDetails();
}
}

