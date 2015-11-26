package Service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import Entities.CustomerOrderItem;
import DAO.CustomerOrderItemDao;
@Named
public class CustomerOrderItemServiceImpl implements CustomerOrderItemService{
    @Inject
    private CustomerOrderItemDao custOIDao;
    
    public CustomerOrderItem findById(int id) { 
    	return custOIDao.findById(id); 
    }
    
    @Transactional
    public void save(CustomerOrderItem customerOI){
    	custOIDao.save(customerOI);
    }

    @Transactional
    public void remove(int id){
    	custOIDao.remove(id);
    }
    
    @Transactional
    public void updateQuantity(int id, int quantity){
    	custOIDao.updateQuantity(id, quantity);
    }
    
    public List<CustomerOrderItem> findByOrderId(int id){
    	return custOIDao.findByOrderId(id);
    }
    
    public List<String> getDishNames(int id){
        return custOIDao.getDishNames(id);
    }
    
    public List<String> getOrderSum(int id){
        return custOIDao.getOrderSum(id);
    }




}
    
