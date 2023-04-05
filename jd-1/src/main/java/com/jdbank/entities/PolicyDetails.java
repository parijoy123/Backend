package com.jdbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="policy_details")
public class PolicyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policy_id;
	private String policy_name;
	private String tenure;
	private String premium;
	private int ins_id;
	
	public PolicyDetails() {
	
	}
	
	public PolicyDetails(int policy_id, String policy_name, String tenure, String premium, int ins_id) {
		this.policy_id = policy_id;
		this.policy_name = policy_name;
		this.tenure = tenure;
		this.premium = premium;
		this.ins_id = ins_id;
	}

	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public int getIns_id() {
		return ins_id;
	}
	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}
	@Override
	public String toString() {
		return "PolicyDetails [policy_id=" + policy_id + ", policy_name=" + policy_name + ", tenure=" + tenure
				+ ", premium=" + premium + ", ins_id=" + ins_id + "]";
	}
}
