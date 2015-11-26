package DAO;

import java.util.List;

import Entities.CustomerOrder;

public interface CustomerOrderDao {
	public List<CustomerOrder> findNameDate(String status);
	public List<CustomerOrder> findDone(String status);
	public void updateStatus(int id, String status);
	public void save(CustomerOrder customerOrder);

}
