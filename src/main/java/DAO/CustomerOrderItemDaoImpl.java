package DAO;

	import java.util.List;

import org.springframework.stereotype.Repository;

import Entities.CustomerOrderItem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

	@Repository
	public class CustomerOrderItemDaoImpl implements CustomerOrderItemDao {
	    @PersistenceContext
	    private EntityManager em;
	    public CustomerOrderItem findById(int id){
	    	CustomerOrderItem m = null;
		m = em.find(CustomerOrderItem.class, id);
		return m;
	    }
	    
	    public void save(CustomerOrderItem customerOI){
		    em.persist(customerOI);
	    }
	    
	    
	    public void remove(int id){
	    	CustomerOrderItem customerOI = em.find(CustomerOrderItem.class, id);
	        if (customerOI != null){
	        	em.remove(customerOI);
	        }
	   }
	    
	    public void updateQuantity(int id, int quantity){
	    	CustomerOrderItem customerOI = em.find(CustomerOrderItem.class, id);
	        if (customerOI != null){
	        	customerOI.setQuantity(quantity);
	        }
	    }
	    
	        public List<CustomerOrderItem> findByOrderId(int id){
	            TypedQuery<CustomerOrderItem> query = em.createQuery("SELECT p FROM CustomerOrderItem p 	WHERE p.orderId = " + id, CustomerOrderItem.class);
	            return query.getResultList();
	        }
	        
	        public List<String> getDishNames(int id){
	            String txt = "SELECT m.name FROM CustomerOrderItem c, Menu m WHERE m.id = c.menuDish AND c.orderId = " + id;
	            TypedQuery<String> query = em.createQuery(txt, String.class);
	            return query.getResultList();
	      }
	        
	        public List<String> getOrderSum(int id){
	            String txt = "SELECT m.price FROM CustomerOrderItem c, Menu m WHERE m.id = c.menuDish AND c.orderId = " + id;
	            TypedQuery<String> query = em.createQuery(txt, String.class);
	            return query.getResultList();
	      }

	    }
