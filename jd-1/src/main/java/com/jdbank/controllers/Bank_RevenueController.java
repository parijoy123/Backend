package com.jdbank.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbank.entities.Bank_Revenue;

import com.jdbank.repository.Bank_RevenueRepo;


import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/jd/bank_revenue")
public class Bank_RevenueController {

	@Autowired
	private Bank_RevenueRepo bank_revenue_repo ;
	
	 @GetMapping("/get")
	  public List<Bank_Revenue> getAllRevenueDetails(){
//			 List<Vendors> vendorsList = new ArrayList<Vendors>();
//			 personList.add(new Person(1,"Mickey Mouse", 30));
		//	 vendorsList.add(new Vendors(500,"Lic"));
			 return bank_revenue_repo.findAll();
		 }
	 @GetMapping("/get/{revenue_id}")
	  public Optional<Bank_Revenue> getRevenueDetailsWithId(@PathVariable Integer revenue_id){
		//returning data from jdb datadbase as vendors table
	    return  bank_revenue_repo.findById(revenue_id);
	  } 
	 @PostMapping("/add")
		public Bank_Revenue revenueRegister(@RequestBody Bank_Revenue bank_reveneu_details, HttpSession session) {
			System.out.println(bank_reveneu_details);
			
			return bank_revenue_repo.save(bank_reveneu_details);
		}
}

	

