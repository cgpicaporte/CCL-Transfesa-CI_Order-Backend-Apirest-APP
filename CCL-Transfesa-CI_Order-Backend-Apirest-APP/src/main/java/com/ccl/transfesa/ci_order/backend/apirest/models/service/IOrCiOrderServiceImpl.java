package com.ccl.transfesa.ci_order.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccl.transfesa.ci_order.backend.apirest.models.dao.IOrCiOrderDao;
import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

@Service
public class IOrCiOrderServiceImpl implements IOrCiOrderService {

	@Autowired
	private IOrCiOrderDao orCiOrderDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<OrCiOrder> findAll() {
		// TODO Auto-generated method stub
		return (List<OrCiOrder>) orCiOrderDao.findAll();
	}
	

	@Override
	public Page<OrCiOrder> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return orCiOrderDao.findAll(pageable);
	}

	@Override
	public OrCiOrder findById(Long id) {
		// TODO Auto-generated method stub
		return orCiOrderDao.findById(id).orElse(null);
	}

	@Override
	public OrCiOrder save(OrCiOrder orCiOrder) {
		// TODO Auto-generated method stub
		return orCiOrderDao.save(orCiOrder);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		orCiOrderDao.deleteById(id);

	}

}
