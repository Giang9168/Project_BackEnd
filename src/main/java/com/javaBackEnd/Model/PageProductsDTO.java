package com.javaBackEnd.Model;

import java.util.List;

public class PageProductsDTO {
	private List<ProductsDTO> product;
	private Integer skip;
	private Integer limit;
	private Integer total;
	
	public List<ProductsDTO> getProduct() {
		return product;
	}
	public void setProduct(List<ProductsDTO> product) {
		this.product = product;
	}
	public Integer getSkip() {
		return skip;
	}
	public void setSkip(Integer skip) {
		this.skip = skip;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
}
