package com.webshop.Entities;

public class Product_Item_Entity {
	
	private Integer id;

	private String type;

	private String brand;

	private String model;

	private double price;

	private String description;

	private Integer quantity;

	public Product_Item_Entity() {

		type = "default type";

		brand = "default brand";

		model = "default model";

		price = -1.0;

		description = "default description";

		quantity = -1;

	}

	public Product_Item_Entity(String type, String brand, String model,
			double price, String description, Integer quantity) {

		this.type = type;

		this.brand = brand;

		this.model = model;

		this.price = price;

		this.description = description;

		this.quantity = quantity;

	}
	
	public Product_Item_Entity(Product_Item_Entity entity) {
		
		
		
	}

	public Integer getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getdescription() {
		return description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


}
