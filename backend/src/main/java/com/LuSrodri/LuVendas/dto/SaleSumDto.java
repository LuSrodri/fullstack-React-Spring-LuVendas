package com.LuSrodri.LuVendas.dto;

import java.io.Serializable;

import com.LuSrodri.LuVendas.entities.Seller;

public class SaleSumDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sallerName;
	private Double saleSum;
	
	public SaleSumDto() {
	}

	public SaleSumDto(Seller seller, Double saleSum) {
		super();
		this.sallerName = seller.getName();
		this.saleSum = saleSum;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public Double getSaleSum() {
		return saleSum;
	}

	public void setSaleSum(Double saleSum) {
		this.saleSum = saleSum;
	}
	
}
