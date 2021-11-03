package com.LuSrodri.LuVendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LuSrodri.LuVendas.dto.SeleDto;
import com.LuSrodri.LuVendas.services.SeleService;

@RestController
@RequestMapping(value = "/seles")
public class SeleController {
	
	@Autowired
	private SeleService service;
	
	@GetMapping
	public ResponseEntity<Page<SeleDto>> findAll(Pageable page){
		Page<SeleDto> pageAux = service.findAll(page);
		return ResponseEntity.ok(pageAux);
	}
	
}
