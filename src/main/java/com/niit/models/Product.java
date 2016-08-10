package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product {
	
	@Id
	private String id;
    private String name;
    private String description;
	private String price;
	private String supplier;
	@Transient
	private MultipartFile image;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return price;
	}
	public String getsupplier() {
		return supplier;
	}
	public String getSupplier() {
		return supplier;
	}
	public MultipartFile getImage() {
		return image;
	}
    public void setId(String id) {
		this.id = id;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}
