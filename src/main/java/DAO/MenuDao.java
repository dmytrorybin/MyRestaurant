package DAO;

import java.util.List;

import Entities.CustomerOrderItem;



public interface MenuDao {
	public List<Entities.Menu> findByCategory(String category);
	public void addDish(Entities.Menu menu);
	public void removeDish(int id);
	public void updateName(int id, String name);
	public void updatePrice(int id, int price);
	public void updateKitchenMade(int id, int KM);
	public void updateCategory(int id, String category);
	public void updateActive(int id, int active);

}
