package defaultpackage;

public class Customer {
	 private String custNo;
	    private String custName;
	    private String category;



	    public Customer(String custNo, String custName, String category) throws InvalidInpudException {

	        if(custNo.charAt(0)=='C'||custNo.charAt(0)=='c') {
	            this.custNo = custNo;
	            System.out.println(this.custNo);
	        }
	        else
	            throw new InvalidInpudException("CustNo must Starts with C or c");


	        if(custName.length()>=4) {
	            this.custName = custName;
	            System.out.println(this.custName);
	        }
	        else
	            throw  new InvalidInpudException("Should contain atleast 4 characters!");


	        if(category.equals("Gold")||category.equals("Platinum")||category.equals("Silver")) {
	            this.category = category;
	            System.out.println(this.category);
	        }

	        else
	            throw  new InvalidInpudException("Should contain either Platinum or Silver or Gold");


	    }

	    public String getCustNo() {
	        return custNo;
	    }

	    public String getCustName() {
	        return custName;
	    }

	    public String getCategory() {
	        return category;
	    }

	    class InvalidInpudException extends Exception{
	        public InvalidInpudException() {
	            super();
	        }

	        public InvalidInpudException(String message) {
	            super(message);
	        }
	    }

	    public static void main(String[] args) {
	        try{
	            Customer obj=new Customer("a","vishnu","Gold");

	        }
	        catch (InvalidInpudException i) {
	            System.out.println(i);
	        }


	    }
}
