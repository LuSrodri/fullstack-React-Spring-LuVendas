package com.LuSrodri.LuVendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LuSrodri.LuVendas.dto.SeleDto;
import com.LuSrodri.LuVendas.entities.Sale;
import com.LuSrodri.LuVendas.repositories.SeleRepository;
import com.LuSrodri.LuVendas.repositories.SellerRepository;

@Service
public class SeleService {

	@Autowired
	private SeleRepository repo;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true)
	public Page<SeleDto> findAll(Pageable page){
		sellerRepo.findAll();
		Page<Sale> result = repo.findAll(page);
		return result.map(x -> new SeleDto(x));
	}
}
