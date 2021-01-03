package overridingtostringmethod;

public class College {
public static void main(String[] args) {
	Student s1=new Student(413,"shravikas",67);
	Student s2=new Student(413,"shra",67);
	System.out.println(s1);
	System.out.println(s2);
	boolean status=s1.equals(s2);
	System.out.println(status);
}
}
