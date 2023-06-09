package com.example.shopmoduletwo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Shop {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shop_id;
	private String shop_category;
	private String shop_name;
	private String shop_customers;
	private String shop_status;
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_category() {
		return shop_category;
	}
	public void setShop_category(String shop_category) {
		this.shop_category = shop_category;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_customers() {
		return shop_customers;
	}
	public void setShop_customers(String shop_customers) {
		this.shop_customers = shop_customers;
	}
	public String getShop_status() {
		return shop_status;
	}
	public void setShop_status(String shop_status) {
		this.shop_status = shop_status;
	}
	public Shop(Integer shop_id, String shop_category, String shop_name, String shop_customers, String shop_status) {
		super();
		this.shop_id = shop_id;
		this.shop_category = shop_category;
		this.shop_name = shop_name;
		this.shop_customers = shop_customers;
		this.shop_status = shop_status;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shop [shop_id=" + shop_id + ", shop_category=" + shop_category + ", shop_name=" + shop_name
				+ ", shop_customers=" + shop_customers + ", shop_status=" + shop_status + "]";
	}
	
	
	
	
}
