package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import Entities.Customer;
import Entities.CustomerOrderItem;
import Entities.Menu;

@Repository
public class MenuDaoImpl implements MenuDao {

	@PersistenceContext
    private EntityManager em;
	
    public List<Menu> findByCategory(String category){
        TypedQuery<Menu> query = em.createQuery("SELECT m FROM Menu m WHERE m.category = " + category, Menu.class);
        return query.getResultList();
    }
    
    public void addDish(Menu menu){
	    em.persist(menu);
    }
    
    public void removeDish(int id){
    	Menu menu = em.find(Menu.class, id);
        if (menu != null){
        	em.remove(menu);
        }
   }
    
    public void updateName(int id, String name){
    	Menu menu = em.find(Menu.class, id);
        if (menu != null){
        	menu.setName(name);
        }
    }
    
    public void updatePrice(int id, int price){
    	Menu menu = em.find(Menu.class, id);
        if (menu != null){
        	menu.setPrice(price);
        }
    }
    
    public void updateKitchenMade(int id, int KM){
    	Menu menu = em.find(Menu.class, id);
        if (menu != null){
        	menu.setKitchenMade(KM);
        }
    }
    
    public void updateCategory(int id, String category){
    	Menu menu = em.find(Menu.class, id);
        if (menu != null){
        	menu.setCategory(category);
        }
    }
    
    public void updateActive(int id, int active){
    	Menu menu = em.find(Menu.class, id);
        if (menu != null){
        	menu.setActive(active);
        }
    }
}
