package interfaces�dev1;

public class BaseCustomerManager implements CustomerService {

	public void Save(Customer customer) {
		System.out.println("Veritaban�na kaydedildi :  "+ customer.getFirstName());
	}
}
