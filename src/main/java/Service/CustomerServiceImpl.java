package Service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import Entities.Customer;
import DAO.CustomerDao;
@Named
public class CustomerServiceImpl implements CustomerService{
    @Inject
    private CustomerDao customerDao;
    
    public Customer findById(int id) { 
    	return customerDao.findById(id); 
    }
    
    public Customer findByName(String name) { 
    	return customerDao.findByName(name); 
    }
    
    @Transactional
    public void save(Customer customer){
    	customerDao.save(customer);
    }
    
    @Transactional
    public void updateName(int id, String name){
    	customerDao.updateName(id, name);
    }
    
    @Transactional
    public void updatePassword(int id, String password){
    	customerDao.updatePassword(id, password);
    }
    
    @Transactional
    public void updateAddress(int id, String address){
    	customerDao.updateAddress(id, address);
    }
    
    @Transactional
    public void updateEmail(int id, String email){
    	customerDao.updateEmail(id, email);
    }
}
