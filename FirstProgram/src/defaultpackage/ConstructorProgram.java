package defaultpackage;

public class ConstructorProgram {

	private String name;
	private String address;
	
	
	public ConstructorProgram() {
		System.out.println("constructor");
	}
    public ConstructorProgram(String name) {
    	this.name = name;
    }
	public ConstructorProgram(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "ConstructorProgram [name=" + name + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		ConstructorProgram obj = new ConstructorProgram();
		ConstructorProgram obj1 = new ConstructorProgram("ram");
		System.out.println(obj1.toString());
		ConstructorProgram obj2 = new ConstructorProgram("ram","bengaluru");
		
		System.out.println(obj2.toString());
	}
}
