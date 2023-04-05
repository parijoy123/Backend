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


import com.jdbank.entities.TataAiaInsurance;


import com.jdbank.repository.TataAiaRepo;

import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/tataaia_inurance")
public class TataAiaController {
	@Autowired
	private TataAiaRepo tataaia_repo ;
	 @GetMapping("/get")
	  public List<TataAiaInsurance> getAlltataaiaInsurances(){
//		 List<Vendors> vendorsList = new ArrayList<Vendors>();
//		 personList.add(new Person(1,"Mickey Mouse", 30));
	//	 vendorsList.add(new Vendors(500,"Lic"));
		 return tataaia_repo.findAll();
	 }
	 @GetMapping("/get/{ins_id}")
	  public Optional<TataAiaInsurance> getTataAiaInsWithId(@PathVariable Integer ins_id){
		//returning data from jdb datadbase as vendors table
	    return  tataaia_repo.findById(ins_id);
	  } 
	@PostMapping("/add")
	public TataAiaInsurance tataAiaInsRegister(@RequestBody TataAiaInsurance tataaia_ins, HttpSession session) {
		System.out.println(tataaia_ins);
		
		return tataaia_repo.save(tataaia_ins);
	}
}
