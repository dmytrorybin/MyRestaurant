package DAO;

import java.util.List;

import Entities.CustomerOrderItem;

public interface CustomerOrderItemDao {
	public CustomerOrderItem findById(int id);
//	public CustomerOrderItem findByName(String name);
	public void save(CustomerOrderItem customerOI);
	public void remove(int id);
	public void updateQuantity(int id, int quantity);
	public List<CustomerOrderItem> findByOrderId(int id);
	public List<String> getDishNames(int id);
	public List<String> getOrderSum(int id);

	
}

