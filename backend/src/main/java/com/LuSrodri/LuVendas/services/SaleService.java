package com.LuSrodri.LuVendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LuSrodri.LuVendas.dto.SaleDto;
import com.LuSrodri.LuVendas.dto.SaleSuccessDto;
import com.LuSrodri.LuVendas.dto.SaleSumDto;
import com.LuSrodri.LuVendas.entities.Sale;
import com.LuSrodri.LuVendas.repositories.SaleRepository;
import com.LuSrodri.LuVendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repo;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable page){
		sellerRepo.findAll();
		Page<Sale> result = repo.findAll(page);
		return result.map(x -> new SaleDto(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupedBySeller(){
		return repo.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDto> successGroupedBySeller(){
		return repo.successGroupedBySeller();
	}
	
}
