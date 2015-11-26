package DAO;

	import org.springframework.stereotype.Repository;

import Entities.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

	@Repository
	public class CustomerDaoImpl implements CustomerDao {
	    @PersistenceContext
	    private EntityManager em;
	    public Customer findById(int id){
	    	Customer m = null;
		m = em.find(Customer.class, id);
		return m;
	    }
	    
	    public Customer findByName(String name){
	    	Customer m = null;
		m = em.find(Customer.class, name);
		return m;
	    }
	    
	    public void save(Customer customer){
		    em.persist(customer);
	    }
	    
	    public void updateName(int id, String name){
	    	Customer customer = em.find(Customer.class, id);
	        if (customer != null){
	        	customer.setName(name);
	        }
	    }
	    
	    public void updatePassword(int id, String password){
	    	Customer customer = em.find(Customer.class, id);
	        if (customer != null){
	        	customer.setName(password);
	        }
	    }
	    
	    public void updateAddress(int id, String address){
	    	Customer customer = em.find(Customer.class, id);
	        if (customer != null){
	        	customer.setName(address);
	        }
	    }
	    
	    public void updateEmail(int id, String email){
	    	Customer customer = em.find(Customer.class, id);
	        if (customer != null){
	        	customer.setName(email);
	        }
	    }
}