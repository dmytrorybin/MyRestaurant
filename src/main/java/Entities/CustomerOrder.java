package Entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int totalPrice;
    private String status;
    private java.sql.Timestamp orderDate; 
    private int customerId;
    
    @OneToMany(mappedBy="customerOrder", cascade=CascadeType.PERSIST)
    private Collection<CustomerOrderItem> CustomerOItems;
    
    public CustomerOrder(){   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.sql.Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(java.sql.Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Collection<CustomerOrderItem> getCustomerOItems() {
		return CustomerOItems;
	}

	public void setCustomerOItems(Collection<CustomerOrderItem> customerOItems) {
		CustomerOItems = customerOItems;
	}
	
//	@OneToMany(mappedBy="customerOrder", cascade=CascadeType.PERSIST)
//    private Collection<CustomerOrderItem> orderItems;
}
