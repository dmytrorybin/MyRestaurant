package com.bionic.edu;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entities.Customer;
import Entities.CustomerOrder;
import Entities.CustomerOrderItem;
import Entities.Menu;
import Service.CustomerOrderItemService;
import Service.CustomerOrderService;
import Service.CustomerService;
import Service.MenuService;

public class Main {
	/////
	//    @SuppressWarnings("resource")
	//    public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	//        	CustomerService merchantService = context.getBean(CustomerService.class);
	//        	Customer m1 = merchantService.findById(1);
	//             System.out.println("name = " + m1.getName()); 
	//     }
	//    //// As a customer I’d like to add dishes to a shopping cart
	//    @SuppressWarnings("resource")
	//    public static void main(String[] args) {
	//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	//        CustomerOrderItemService customerIOService = context.getBean(CustomerOrderItemService.class);
	//        CustomerOrderItem customerOI = new CustomerOrderItem();
	//        customerOI.setMenuDish(1);
//			  customerIOService.save(customerOI);
	//    }

	//    //// As a customer I’d like to remove dishes from a cart
	//    @SuppressWarnings("resource")
	//    public static void main(String[] args) {
	//        ApplicationContext context = new 	ClassPathXmlApplicationContext("beans.xml");
	//        CustomerOrderItemService customerOIService = context.getBean(CustomerOrderItemService.class);
	//        customerOIService.remove(5);
	//    }
	
//	//// As a customer I’d like to change quantity of specific dish
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//		ApplicationContext context = new 	ClassPathXmlApplicationContext("beans.xml");
//		CustomerOrderItemService customerOIService = context.getBean(CustomerOrderItemService.class);
//		customerOIService.updateQuantity(3, 5);
//		System.out.println("Update finished");
//	}
	
//	//// As a customer I’d like to see a list of chosen dishes and total price of my order
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderItemService customerOIService = context.getBean(CustomerOrderItemService.class);
//	     List<CustomerOrderItem> list = customerOIService.findByOrderId(3);
//	     for(CustomerOrderItem p: list)
//		System.out.println(p.toString()); 
//	}
	
//	////As a customer I’d like to see a list of chosen dishes and total price of my order
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new 	ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderItemService customerOIService = context.getBean(CustomerOrderItemService.class);
//	     List<String> list = customerOIService.getDishNames(1);
//	     for(String s: list)
//		System.out.println(s); 
//	}
	
//	////As a customer I’d like to see a list of chosen dishes and total price of my order
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new 	ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderItemService customerOIService = context.getBean(CustomerOrderItemService.class);
//	     List<String> list = customerOIService.getOrderSum(1);
//	     int sum = 0;
//	     for(int i = 0; i < list.size(); i++ ){
//	    	 sum += Integer.parseInt(list.get(i));
//	     }	     
//		System.out.println(sum); 
//	}
	
	
//	    ////  As a customer I’d like to register a customer account (to be able to submit an order)
//	    @SuppressWarnings("resource")
//	    public static void main(String[] args) {
//	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	        CustomerService customerService = context.getBean(CustomerService.class);
//	        Customer customer = new Customer();
//	        customer.setName("Jim");
//	        customer.setLogin("jimmy");
//	        customer.setPassword("111");
//	        customer.setEmail("asdasd@b.com");
//	        customer.setAddress("Kyiv");
//	   	 	Timestamp TS = new Timestamp(new Date().getTime());
//	        customer.setRegDate(TS);
//			customerService.save(customer);
//	    }
	
//    ////  As a customer I’d like to register a customer account (to be able to submit an order)
//    @SuppressWarnings("resource")
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        CustomerService customerService = context.getBean(CustomerService.class);
//        Customer customer = customerService.findById(1);
//        customer.setName("Jim");
//        customer.setLogin("jimmy");
//        customer.setPassword("111");
//        customer.setEmail("asdasd@b.com");
//        customer.setAddress("Kyiv");
//   	 	Timestamp TS = new Timestamp(new Date().getTime());
//        customer.setRegDate(TS);
//    }
	
//    ////   As a customer I’d like to be able to edit my account
//    @SuppressWarnings("resource")
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        CustomerService customerService = context.getBean(CustomerService.class);
//        customerService.updateName(1, "Jim");
//        customerService.updatePassword(1, "111");
//    }

//  ////    As a customer I'd like to choose dishes from categories (main course, soups, salads, etc.)
//  @SuppressWarnings("resource")
//  public static void main(String[] args) {
//      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//      MenuService menuService = context.getBean(MenuService.class);
//      List<Menu> list = menuService.findByCategory("Main course");
//      for(Menu p: list)
//    	  System.out.println(p.toString()); 
//  }
	
//	    //// As a customer I’d like to add dishes to a shopping cart
//	    @SuppressWarnings("resource")
//	    public static void main(String[] args) {
//	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	        MenuService menuService = context.getBean(MenuService.class);
//	        Menu menu = new Menu();
//	        menu.setName("Pizza Margarita");
//	        menu.setPrice(8);
//	        menu.setCategory("Main couese");
//	        menu.setKitchenMade(1);
//	        menu.setActive(1);
//	        menuService.addDish(menu);
//	    }
	
//    ////  As a restaurant administrator I’d like to remove dishes from the menu
//    @SuppressWarnings("resource")
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        MenuService menuService = context.getBean(MenuService.class);
//        menuService.removeDish(3);
//    }
    
//   ////   As a restaurant administrator I’d like to edit specific dish in the menu
//	////   As a restaurant administrator I’d like to activate/deactivate specific dish in the menu
//    @SuppressWarnings("resource")
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        MenuService menuService = context.getBean(MenuService.class);
//        menuService.updateCategory(3, "Dessert");
//        menuService.updateActive(3, 0);
//    }
	
//	////  As a kitchen staff member I’d like to see the list of orders with dish names and time when it has been ordered
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderService customerOrderService = context.getBean(CustomerOrderService.class);
//	     List<CustomerOrder> list = customerOrderService.findById(3);
//	     for(CustomerOrder p: list)
//		System.out.println(p.toString()); 
//	}
	
//	////  As a kitchen staff member I’d like to see the list of orders with dish names and time when it has been ordered
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderService customerOrderService = context.getBean(CustomerOrderService.class);
//	     List<CustomerOrder> list = customerOrderService.findNameDate("ready for cooking");
//	     customerOrderService.updateStatus(3, "ready for delivery");
//	}
	
//	////   As a delivery guy I’d like to change status of the specific order to "delivering" or "delivered"
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderService customerOrderService = context.getBean(CustomerOrderService.class);
//	     List<CustomerOrder> list = customerOrderService.findNameDate("ready for delivery");
//	     customerOrderService.updateStatus(3, "delivering");
//	}
	
//	////   As a delivery guy I’d like to see the list of orders ready for delivery (when it is marked as "done" by kitchen stuff member)
//	////   As a delivery guy I’d like to change status of the specific order to "delivering" or "delivered"
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	     CustomerOrderService customerOrderService = context.getBean(CustomerOrderService.class);
//	     List<CustomerOrder> list = customerOrderService.findDone("ready for delivery");
//	     customerOrderService.updateStatus(3, "delivering");
//	}
	
	////	As a customer I’d like to submit an order
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerOrderService customerOrderService = (CustomerOrderService)context.getBean("customerOrderServiceImpl");
        
        CustomerOrder co = new CustomerOrder();
        co.setTotalPrice(20);          //////////!!!!
        co.setStatus("ready for cooking");
		GregorianCalendar cld1 = new GregorianCalendar(2015, 02, 03);  ////!!!!
		java.util.Date dt1 = cld1.getTime();
        co.setOrderDate(new java.sql.Timestamp(dt1.getTime()));
        co.setCustomerId(1);                                           /////!!!
		
        CustomerOrderItem coi = new CustomerOrderItem();
		coi.setMenuDish(1);
		coi.setQuantity(3);
		
		ArrayList<CustomerOrderItem> list = new ArrayList<CustomerOrderItem>();
		list.add(coi);
		co.setCustomerOItems(list);
		coi.setCustomerOrder(co);

		customerOrderService.save(co);
	}

}
