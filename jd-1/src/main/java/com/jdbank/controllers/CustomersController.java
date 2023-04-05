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

import com.jdbank.entities.Customers;
import com.jdbank.repository.CustomersRepo;

import jakarta.servlet.http.HttpSession;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/insurances/policies/pol_orders/customers")
public class CustomersController {
	@Autowired
	private CustomersRepo customers_repo ;
	
	 @GetMapping("/get")
	  public List<Customers> getAllCustomerDetails(){
//			 List<Vendors> vendorsList = new ArrayList<Vendors>();
//			 personList.add(new Person(1,"Mickey Mouse", 30));
		//	 vendorsList.add(new Vendors(500,"Lic"));
			 return customers_repo.findAll();
		 }
	 @GetMapping("/get/{customer_id}")
	  public Optional<Customers> getCustomersDetailsWithId(@PathVariable Integer customer_id){
		//returning data from jdb datadbase as vendors table
	    return  customers_repo.findById(customer_id);
	  } 
	 @PostMapping("/add")
		public Customers customerRegister(@RequestBody Customers customers_details, HttpSession session) {
			System.out.println(customers_details);
			
			return customers_repo.save(customers_details);
		}
}
