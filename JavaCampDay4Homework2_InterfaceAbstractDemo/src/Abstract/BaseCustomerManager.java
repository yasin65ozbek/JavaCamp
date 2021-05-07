package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICostumerService {

	public void Save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi : " + customer.FirstName);
	}

}
