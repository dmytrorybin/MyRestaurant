package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class CustomerOrderItem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int menuDish;
    private String orderId;
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name="orderId")
     private CustomerOrder customerOrder;

    
    
    public CustomerOrderItem(){   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMenuDish() {
		return menuDish;
	}

	public void setMenuDish(int menuDish) {
		this.menuDish = menuDish;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
}