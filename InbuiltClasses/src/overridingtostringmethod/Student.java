package overridingtostringmethod;

public class Student {
public int id;
public String name;
public double marks;
public Student(int id, String name, double marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
public String toString()
{
	return this.id+""+"\n"+this.name+"\n"+this.marks+"";
}


public boolean equals(Object o1)
{
	Student rv=(Student)o1;
	return this.marks==rv.marks;
}
}
