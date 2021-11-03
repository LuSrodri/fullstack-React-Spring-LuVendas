package com.LuSrodri.LuVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LuSrodri.LuVendas.entities.Sale;

public interface SeleRepository extends JpaRepository<Sale, Long> {

}
