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

import com.jdbank.entities.BajajInsurance;
import com.jdbank.repository.BajajRepo;
import jakarta.servlet.http.HttpSession;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jd/vendors/bajaj_insurance")
public class BajajController {
	@Autowired
	private BajajRepo bajaj_repo ;
	 @GetMapping("/get")
	  public List<BajajInsurance> getAllBajajInsurances(){
//		 List<Vendors> vendorsList = new ArrayList<Vendors>();
//		 personList.add(new Person(1,"Mickey Mouse", 30));
	//	 vendorsList.add(new Vendors(500,"Lic"));
		 return bajaj_repo.findAll();
	 }
	 @GetMapping("/get/{ins_id}")
	  public Optional<BajajInsurance> getVendorsWithId(@PathVariable Integer ins_id){
		//returning data from jdb datadbase as vendors table
	    return  bajaj_repo.findById(ins_id);
	  } 
	@PostMapping("/add")
	public BajajInsurance bajajInuranceRegister(@RequestBody BajajInsurance bajaj_ins, HttpSession session) {
		System.out.println(bajaj_ins);
		
		return bajaj_repo.save(bajaj_ins);
	}

}

