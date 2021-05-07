package Entities;

import java.util.Calendar;

import Abstract.ICostumerService;


public class Customer implements ICostumerService{
	public int id;
	public String FirstName;
	public String LastName;
	public Calendar DateOfBirth;
	public String NationalId;
	
	public Customer(int id, String FirstName, String LastName, Calendar DateOfBirth, String NationalId) {
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.DateOfBirth = DateOfBirth;
		this.NationalId = NationalId;
	}

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
