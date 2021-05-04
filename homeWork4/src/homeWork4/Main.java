package homeWork4;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager =new NeroCustomerManager();
		customerManager.save(new Customer(1, "Simge", "Saglam", "06.02.1999", "100000000000"));
		System.out.println();
		
	}
	


}
