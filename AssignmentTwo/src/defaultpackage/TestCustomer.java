package defaultpackage;

import java.util.Scanner;

import defaultpackage.Customer.InvalidInpudException;

public class TestCustomer {
	public static void main(String[] args) {
		//Customer rv= new Customer("a1","shiva","gold");
		//System.out.println(rv.custName);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String no=sc.nextLine();
		String name=sc.nextLine();
		String cate=sc.nextLine();
		
	//if(no[0]!='c'||no[0]!='C'|| name.length()<3|| )
		
	
		try {
			Customer rv= new Customer(no,name,cate);
		} catch (InvalidInpudException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(rv.name());
	

}
}
