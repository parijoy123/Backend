package com.jdbank.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbank.entities.OrdersDetails;
import com.jdbank.repository.OrdersRepo;

import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/insurances/policies/pol_orders")
public class OrdersDetailsController {
	@Autowired
	private OrdersRepo orders_repo ;
	
	 @GetMapping("/get")
	  public List<OrdersDetails> getAllOrdersDetails(){
//			 List<Vendors> vendorsList = new ArrayList<Vendors>();
//			 personList.add(new Person(1,"Mickey Mouse", 30));
		//	 vendorsList.add(new Vendors(500,"Lic"));
			 return orders_repo.findAll();
		 }
	 @GetMapping("/get/{policy_id}")
	  public Optional<OrdersDetails> getOrdersDetailsWithId(@PathVariable Integer order_id){
		//returning data from jdb datadbase as vendors table
	    return  orders_repo.findById(order_id);
	  } 
	 @PostMapping("/add")
		public OrdersDetails ordersRegister(@RequestBody OrdersDetails orders_details, HttpSession session) {
			System.out.println(orders_details);
			
			return orders_repo.save(orders_details);
		}
}
