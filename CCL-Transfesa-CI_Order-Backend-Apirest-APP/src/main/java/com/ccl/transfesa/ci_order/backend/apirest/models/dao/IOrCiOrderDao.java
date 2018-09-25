package com.ccl.transfesa.ci_order.backend.apirest.models.dao;

import java.math.BigDecimal;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

public interface IOrCiOrderDao extends PagingAndSortingRepository<OrCiOrder, BigDecimal> {

}