package com.ccl.transfesa.ci_order.backend.apirest.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrOrder;

public interface IOrOrderDao extends PagingAndSortingRepository<OrOrder, Long>{

}
