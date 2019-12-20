package com.tyss.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="ProductInfo")
public class ProductInfo {
	
	@Column
	@Id
	@GeneratedValue
	private Integer pid;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private Integer quantity;
	@Column
	private Double price;
	
	public Integer getId() {
		return pid;
	}
	public void setId(Integer id) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="order_history_info",
	joinColumns = @JoinColumn(name="pid"),
	inverseJoinColumns=@JoinColumn(name="id"))
	private List<OrderInfo> orders;

	

}
