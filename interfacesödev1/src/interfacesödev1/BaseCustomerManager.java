package interfacesödev1;

public class BaseCustomerManager implements CustomerService {

	public void Save(Customer customer) {
		System.out.println("Veritabanına kaydedildi :  "+ customer.getFirstName());
	}
}
