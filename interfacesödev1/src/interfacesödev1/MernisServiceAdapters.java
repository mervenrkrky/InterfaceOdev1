package interfacesödev1;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService {

	/*@SuppressWarnings("deprecation")
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy() ;
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		
	}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch ( RemoteException e) {
			e.printStackTrace();

		}
		return result;
	
	}*/
	
	@SuppressWarnings("deprecation")
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
	

	}}
