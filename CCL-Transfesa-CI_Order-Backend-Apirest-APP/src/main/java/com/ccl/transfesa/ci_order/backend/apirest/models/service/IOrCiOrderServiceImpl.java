package com.ccl.transfesa.ci_order.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccl.transfesa.ci_order.backend.apirest.models.dao.IOrCiOrderDao;
import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

@Service
public class IOrCiOrderServiceImpl implements IOrCiOrderService {

	@Autowired
	private IOrCiOrderDao orCiOrderDao;

	@Override
	@Transactional(readOnly = true)
	public List<OrCiOrder> findAll() {
		//return (List<OrCiOrder>) orCiOrderDao.findAll();
		return (List<OrCiOrder>) orCiOrderDao.findAll(sortByIdDesc());
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

	@Override
	public List<OrCiOrder> findAllWithOrCiOrderOrderBy(Sort sort) {

		String[] arrayOrdenacion = new String[] { "idCiOrder"/*, "campo2", "campo3", "campo4"*/ };
		return orCiOrderDao.findAllWithOrCiOrderOrderBy(Sort.by(arrayOrdenacion));
	}

	public Sort sortByIdDesc() {
		return new Sort(Sort.Direction.DESC, "idCiOrder");
	}

	public Sort sortByIdAsc() {
		return new Sort(Sort.Direction.ASC, "idCiOrder");
	}
	
	

}
