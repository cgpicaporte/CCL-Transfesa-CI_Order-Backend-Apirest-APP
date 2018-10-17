package com.ccl.transfesa.ci_order.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

@Repository
public interface IOrCiOrderDao extends PagingAndSortingRepository<OrCiOrder, Long> {

	public List <OrCiOrder> findAllWithOrCiOrderOrderBy(Sort sort);
	
}
