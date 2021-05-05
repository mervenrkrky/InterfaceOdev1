package interfacesödev1;




public class StarbucksCustomerManager extends BaseCustomerManager {
	
    CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");

		}
	}
	
}

