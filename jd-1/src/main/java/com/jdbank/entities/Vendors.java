package com.jdbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendors")
public class Vendors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendor_id;
	private String vendor_Name;
	public Vendors() {
		
	}
	public Vendors(int vendor_id, String vendor_name) {
		// TODO Auto-generated constructor stub
		this.vendor_id=vendor_id;
		this.vendor_Name=vendor_name;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_Name() {
		return vendor_Name;
	}
	public void setVendor_Name(String vendor_Name) {
		this.vendor_Name = vendor_Name;
	}
	@Override
	public String toString() {
		return "Vendors [vendor_id=" + vendor_id + ", vendor_Name=" + vendor_Name + "]";
	}
	
}
