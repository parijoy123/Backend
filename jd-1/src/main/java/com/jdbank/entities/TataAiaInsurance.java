package com.jdbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tata_Insurance")
public class TataAiaInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ins_id;
	private String ins_name;
	private int vendor_id;
	public int getIns_id() {
		return ins_id;
	}
	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}
	public String getIns_name() {
		return ins_name;
	}
	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	@Override
	public String toString() {
		return "TataAiaInsurance [ins_id=" + ins_id + ", ins_name=" + ins_name + ", vendor_id=" + vendor_id + "]";
	}
}
