package com.ccl.transfesa.ci_order.backend.apirest.models.service;

import java.util.List;
import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrOrder;

public interface IOrOrderService {

		public List<OrOrder> findAll();
		public OrOrder findById(Long id);
		public OrOrder save(OrOrder orOrder);
		public void delete(Long id);
		
	}