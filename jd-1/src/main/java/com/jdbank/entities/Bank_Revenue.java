package com.jdbank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank_Revenue")
public class Bank_Revenue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int revenue_id;
	private int vendor_id; 
	private long total_profit;
	private long total_loss;
	private long profit_in_20;
	private long loss_in_20;
	private long profit_in_21;
	private long loss_in_21;
	private long profit_in_22;
	private long loss_in_22;
	
	public Bank_Revenue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank_Revenue(int revenue_id, int vendor_id, long total_profit, long total_loss, long profit_in_20,
			long loss_in_20, long profit_in_21, long loss_in_21, long profit_in_22, long loss_in_22) {
		super();
		this.revenue_id = revenue_id;
		this.vendor_id = vendor_id;
		this.total_profit = total_profit;
		this.total_loss = total_loss;
		this.profit_in_20 = profit_in_20;
		this.loss_in_20 = loss_in_20;
		this.profit_in_21 = profit_in_21;
		this.loss_in_21 = loss_in_21;
		this.profit_in_22 = profit_in_22;
		this.loss_in_22 = loss_in_22;
	}
	public int getRevenue_id() {
		return revenue_id;
	}
	public void setRevenue_id(int revenue_id) {
		this.revenue_id = revenue_id;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public long getTotal_profit() {
		return total_profit;
	}
	public void setTotal_profit(long total_profit) {
		this.total_profit = total_profit;
	}
	public long getTotal_loss() {
		return total_loss;
	}
	public void setTotal_loss(long total_loss) {
		this.total_loss = total_loss;
	}
	public long getProfit_in_20() {
		return profit_in_20;
	}
	public void setProfit_in_20(long profit_in_20) {
		this.profit_in_20 = profit_in_20;
	}
	public long getLoss_in_20() {
		return loss_in_20;
	}
	public void setLoss_in_20(long loss_in_20) {
		this.loss_in_20 = loss_in_20;
	}
	public long getProfit_in_21() {
		return profit_in_21;
	}
	public void setProfit_in_21(long profit_in_21) {
		this.profit_in_21 = profit_in_21;
	}
	public long getLoss_in_21() {
		return loss_in_21;
	}
	public void setLoss_in_21(long loss_in_21) {
		this.loss_in_21 = loss_in_21;
	}
	public long getProfit_in_22() {
		return profit_in_22;
	}
	public void setProfit_in_22(long profit_in_22) {
		this.profit_in_22 = profit_in_22;
	}
	public long getLoss_in_22() {
		return loss_in_22;
	}
	public void setLoss_in_22(long loss_in_22) {
		this.loss_in_22 = loss_in_22;
	}
	
	
	
	
}
