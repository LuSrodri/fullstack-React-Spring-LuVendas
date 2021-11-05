package com.LuSrodri.LuVendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.LuSrodri.LuVendas.dto.SaleSuccessDto;
import com.LuSrodri.LuVendas.dto.SaleSumDto;
import com.LuSrodri.LuVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.LuSrodri.LuVendas.dto.SaleSumDto("
			+ "obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj group by obj.seller")
	List<SaleSumDto> amountGroupedBySeller();
	
	@Query("SELECT new com.LuSrodri.LuVendas.dto.SaleSuccessDto("
			+ "obj.seller, SUM(obj.visited), SUM(obj.deals) ) "
			+ "FROM Sale AS obj group by obj.seller")
	List<SaleSuccessDto> successGroupedBySeller();
}
