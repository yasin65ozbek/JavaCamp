import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.util.Calendar;
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());

		Calendar releaseDate = Calendar.getInstance();
		releaseDate.set(1986, 1, 6);

		Customer customer = new Customer(1, "Yasin","ÖZBEK",releaseDate,"165165165165");
		customerManager.Save(customer);
		
		
		System.out.println(customer);
	}

}
