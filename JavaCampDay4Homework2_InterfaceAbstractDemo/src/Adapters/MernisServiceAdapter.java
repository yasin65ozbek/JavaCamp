package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy Client =  KPSPublicSoapProxy();
		return Client.TCKimlikNoDogrula(Long.parseLong(customer.NationalId), customer.FirstName,
				customer.LastName.toUpperCase(), customer.DateOfBirth.YEAR);

	}

	private KPSPublicSoapProxy KPSPublicSoapProxy() {
		// TODO Auto-generated method stub
		return null;
	}
}
