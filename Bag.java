package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="material")

public class Bag {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int id;
	private String material_name;
	private String material_type;
	private int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public String getMaterial_type() {
		return material_type;
	}
	public void setMaterial_type(String material_type) {
		this.material_type = material_type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
