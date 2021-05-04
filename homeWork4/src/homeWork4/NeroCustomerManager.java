package homeWork4;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("saved to db  :" +customer.getFirstName());
		
	}

	

}
