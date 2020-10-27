package com.webshop.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.webshop.Entities.Product_Item_Entity;

@Entity
@Table(name = "product", schema = "eshop")
public class Product_Item_Class {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer m_productItemId;

	private String m_productItemType;

	private String m_productItemBrand;

	private String m_productItemModel;

	private double m_productItemPrice;

	private String m_productItemDiscription;

	private Integer m_productItemQuantity;

	public Product_Item_Class() {

		m_productItemType = "default type";

		m_productItemBrand = "default brand";

		m_productItemModel = "default model";

		m_productItemPrice = -1.0;

		m_productItemDiscription = "default discription";

		m_productItemQuantity = -1;

	}

	public Product_Item_Class(String m_productItemType, String m_productItemBrand, String m_productItemModel,
			double m_productItemPrice, String m_productItemDiscription, Integer m_productItemQuantity) {

		this.m_productItemType = m_productItemType;

		this.m_productItemBrand = m_productItemBrand;

		this.m_productItemModel = m_productItemModel;

		this.m_productItemPrice = m_productItemPrice;

		this.m_productItemDiscription = m_productItemDiscription;

		this.m_productItemQuantity = m_productItemQuantity;

	}
	
	public Product_Item_Class(Product_Item_Entity entity) {
		
		
		
	}

	public Integer getId() {
		return m_productItemId;
	}

	public String getType() {
		return m_productItemType;
	}

	public String getBrand() {
		return m_productItemBrand;
	}

	public String getModel() {
		return m_productItemModel;
	}

	public double getPrice() {
		return m_productItemPrice;
	}

	public String getDiscription() {
		return m_productItemDiscription;
	}

	public Integer getQuantity() {
		return m_productItemQuantity;
	}

	public void setId(Integer m_productItemId) {
		this.m_productItemId = m_productItemId;
	}

	public void setType(String m_productItemType) {
		this.m_productItemType = m_productItemType;
	}

	public void setBrand(String m_productItemBrand) {
		this.m_productItemBrand = m_productItemBrand;
	}

	public void setModel(String m_productItemModel) {
		this.m_productItemModel = m_productItemModel;
	}

	public void setPrice(double m_productItemPrice) {
		this.m_productItemPrice = m_productItemPrice;
	}

	public void setDiscription(String m_productItemDiscription) {
		this.m_productItemDiscription = m_productItemDiscription;
	}

	public void setQuantity(Integer m_productItemQuantity) {
		this.m_productItemQuantity = m_productItemQuantity;
	}


}
