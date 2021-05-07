package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) {
		//System.out.println("Kkimlik doðrulama başarılı!");
		return true;
	}
	
}
