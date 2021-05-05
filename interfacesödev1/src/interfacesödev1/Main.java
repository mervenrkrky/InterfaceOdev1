package interfacesödev1;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
	
		
		Customer customer1 = new Customer(1, "Mervenur", "Karakaya", new Date(2000), "tc");		
	
		BaseCustomerManager manager= new StarbucksCustomerManager(new MernisServiceAdapters());
		
		
		manager.Save(customer1);
		
		
		
	}

	

}
