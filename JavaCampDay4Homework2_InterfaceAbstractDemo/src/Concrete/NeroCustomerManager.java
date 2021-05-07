package Concrete;

import Abstract.ICostumerService;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import Abstract.BaseCustomerManager;

public class NeroCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService _customerCheckService;
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Geçerli bir kiþi deðil");
		}
	}
	
}
