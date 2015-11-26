package DAO;

import Entities.Customer;

public interface CustomerDao {
	public Customer findById(int id);
	public Customer findByName(String name);
	public void save(Customer customer);
	public void updateName(int id, String name);
	public void updatePassword(int id, String password);
	public void updateAddress(int id, String address);
	public void updateEmail(int id, String email);


}

