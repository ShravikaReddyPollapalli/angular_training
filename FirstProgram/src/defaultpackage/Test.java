package defaultpackage;

public class Test {
	 String queryString = "select * from ipl.csv where season > 2014 and city = 'Bangalore' ";
//	public void getFields( ) {
//		String[] split_from = queryString.split("from");
//		String sub_str1 =split_from[0].trim();
//		String[] split_select = sub_str1.split("select");
//		String sub_str2 = split_select[1].trim();
//		if(sub_str2=="*")
//			System.out.println(split_select); ;
//		String[] res = sub_str2.split(",");
//		System.out.println( res); 
//	}
	public static void main(String[] args) {
		Test t = new Test();
//	t.getFields();
		System.out.println(t.queryString);
	}
}
//seql acidic - cap theorem
//mysql - sequel database