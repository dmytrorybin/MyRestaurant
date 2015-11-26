package Service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import DAO.CustomerOrderDao;
import Entities.CustomerOrder;


@Named
public class CustomerOrderServiceImpl implements CustomerOrderService{
    @Inject
    private CustomerOrderDao customerOrderDao;
    
    public List<CustomerOrder> findNameDate(String status){
    	return customerOrderDao.findNameDate(status);
    }
    
    @Transactional
    public void updateStatus(int id, String status){
    	customerOrderDao.updateStatus(id, status);
    }

    public List<CustomerOrder> findDone(String status){
    	return customerOrderDao.findDone(status);
    }
    
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public void save(CustomerOrder customerOrder){
	customerOrderDao.save(customerOrder);
    }

    
}