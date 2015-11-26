package Service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import DAO.MenuDao;
import Entities.Menu;

@Named
public class MenuServiceImpl implements MenuService {
	
	 @Inject
	 private MenuDao menuDao;
	 
	    public List<Menu> findByCategory(String category){
	    	return menuDao.findByCategory(category);
	    }

	    @Transactional
	    public void addDish(Menu menu){
	    	menuDao.addDish(menu);
	    }
	    
	    @Transactional
	    public void removeDish(int id){
	    	menuDao.removeDish(id);
	    }
	    
	    @Transactional
	    public void updateName(int id, String name){
	    	menuDao.updateName(id, name);
	    }
	    
	    @Transactional
	    public void updatePrice(int id, int price){
	    	menuDao.updatePrice(id, price);
	    }
	    
	    @Transactional
	    public void updateKitchenMade(int id, int KM){
	    	menuDao.updateKitchenMade(id, KM);
	    }
	    
	    @Transactional
	    public void updateCategory(int id, String category){
	    	menuDao.updateCategory(id, category);
	    }
	    
	    @Transactional
	    public void updateActive(int id, int active){
	    	menuDao.updateKitchenMade(id, active);
	    }
}
