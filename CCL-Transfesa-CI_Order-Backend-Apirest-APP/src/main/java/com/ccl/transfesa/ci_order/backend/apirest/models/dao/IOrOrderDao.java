package com.ccl.transfesa.ci_order.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrOrder;

public interface IOrOrderDao extends CrudRepository<OrOrder, Long>{

}
