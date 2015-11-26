package DAO;

	import java.util.List;

import org.springframework.stereotype.Repository;

import Entities.CustomerOrder;
import Entities.CustomerOrderItem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

	@Repository
	public class CustomerOrderDaoImpl implements CustomerOrderDao {
	    @PersistenceContext
	    private EntityManager em;
	    
        public List<CustomerOrder> findNameDate(String status){
            TypedQuery<CustomerOrder> query = em.createQuery("SELECT p.name p.orderDate FROM CustomerOrder p WHERE p.status = " + status, CustomerOrder.class);
            return query.getResultList();
        }
        
        public List<CustomerOrder> findDone(String status){
            TypedQuery<CustomerOrder> query = em.createQuery("SELECT p FROM CustomerOrder p WHERE p.status = " + status, CustomerOrder.class);
            return query.getResultList();
        }
        
	    public void updateStatus(int id, String status){
	    	CustomerOrder customerOrder = em.find(CustomerOrder.class, id);
	        if (customerOrder != null){
	        	customerOrder.setStatus(status);
	        }
	    }
	    
	    public void save(CustomerOrder customerOrder){
		    em.persist(customerOrder);
	    }

	    
	}