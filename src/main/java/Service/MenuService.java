package Service;

import java.util.List;

import Entities.Menu;

public interface MenuService {
	public List<Menu> findByCategory(String category);
	public void addDish(Menu menu);
	public void removeDish(int id);
	public void updateName(int id, String name);
	public void updatePrice(int id, int price);
	public void updateKitchenMade(int id, int KM);
	public void updateCategory(int id, String category);
	public void updateActive(int id, int active);
}
