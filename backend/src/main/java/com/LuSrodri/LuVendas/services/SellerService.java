package com.LuSrodri.LuVendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LuSrodri.LuVendas.dto.SellerDto;
import com.LuSrodri.LuVendas.entities.Seller;
import com.LuSrodri.LuVendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repo;
	
	public List<SellerDto> findAll(){
		List<Seller> result = repo.findAll();
		return result.stream().map(x -> new SellerDto(x)).toList();
	}
}
