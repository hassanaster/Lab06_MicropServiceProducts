package com.udea.microservicio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
    @GeneratedValue
    private Long id;
    private String productName;

    @Override
    public String toString() {
        return "A product{"
                + "id:" + id
                + ", productName='" + productName + '\''
                + '}';
    }

    public Product(String productName) {
        this.productName = productName;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
