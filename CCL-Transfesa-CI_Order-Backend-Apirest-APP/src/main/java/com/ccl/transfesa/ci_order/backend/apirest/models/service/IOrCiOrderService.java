package com.ccl.transfesa.ci_order.backend.apirest.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

public interface IOrCiOrderService {

	public List<OrCiOrder> findAll();
	
	public Page<OrCiOrder> findAll(Pageable pageable);
	
	public OrCiOrder findById(Long id);
	
	public OrCiOrder save(OrCiOrder orCiOrder);
	
	public void delete(Long id);
	
	public List <OrCiOrder> findAllWithOrCiOrderOrderBy(Sort sort);
	
	public Sort sortByIdDesc();
	
	public Sort sortByIdAsc();
		
}
