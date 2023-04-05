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

import com.jdbank.entities.LicInsurance;
//import com.jdbank.entities.Vendors;
import com.jdbank.repository.LicRepo;
//import com.jdbank.repository.VendorsRepo;

import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/lic_insurance")
public class LicController {
	@Autowired
	private LicRepo lic_repo ;
	 @GetMapping("/get")
	  public List<LicInsurance> getAllLicInsurances(){
//		 List<Vendors> vendorsList = new ArrayList<Vendors>();
//		 personList.add(new Person(1,"Mickey Mouse", 30));
	//	 vendorsList.add(new Vendors(500,"Lic"));
		 return lic_repo.findAll();
	 }
	 @GetMapping("/get/{ins_id}")
	  public Optional<LicInsurance> getVendorsWithId(@PathVariable Integer ins_id){
		//returning data from jdb datadbase as vendors table
	    return  lic_repo.findById(ins_id);
	  } 
	@PostMapping("/add")
	public LicInsurance licInsRegister(@RequestBody LicInsurance licIns, HttpSession session) {
		System.out.println(licIns);
		System.out.println("Not found vendors");
		return lic_repo.save(licIns);
	}

}
