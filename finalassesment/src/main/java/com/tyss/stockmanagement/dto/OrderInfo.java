package com.tyss.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="OrderInfo")

public class OrderInfo {
	@Column
	@Id
	@GeneratedValue
	Integer id;
	@Column
	Double total_price;
	@Column
	Double total_price_with_gst;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}
	public Double getTotal_price_with_gst() {
		return total_price_with_gst;
	}
	public void setTotal_price_with_gst(Double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "orders")
	private List<ProductInfo> products;
	
	
	
	

}
