package com.ccl.transfesa.ci_order.backend.apirest.models.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

public interface IOrCiOrderService {

	public List<OrCiOrder> findAll();
	
	public Page<OrCiOrder> findAll(Pageable pageable);
	
	public OrCiOrder findById(BigDecimal id);
	
	public OrCiOrder save(OrCiOrder orCiOrder);
	
	public void delete(BigDecimal id);
		
}
