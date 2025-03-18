package com.javaBackEnd.Respository.Entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="Product")
public class ProductsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name ="name", columnDefinition = "NVARCHAR(255)")
	private String name;
	
	@Column(name ="age")
	private Integer age;
	
	@Column(name ="price")
	private Integer price;
	
	@Column(name ="quantity")
	private Integer quantity;
	
	@Column(name="img")
	private String img;
	
	@Column(name ="description",columnDefinition = "NVARCHAR(255)")
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
			
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
