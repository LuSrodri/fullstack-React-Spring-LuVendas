package com.LuSrodri.LuVendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LuSrodri.LuVendas.dto.SaleDto;
import com.LuSrodri.LuVendas.dto.SaleSuccessDto;
import com.LuSrodri.LuVendas.dto.SaleSumDto;
import com.LuSrodri.LuVendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable page){
		Page<SaleDto> pageAux = service.findAll(page);
		return ResponseEntity.ok(pageAux);
	}
	
	@GetMapping(value = "/sum-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller(){
		List<SaleSumDto> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller(){
		List<SaleSuccessDto> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
}
