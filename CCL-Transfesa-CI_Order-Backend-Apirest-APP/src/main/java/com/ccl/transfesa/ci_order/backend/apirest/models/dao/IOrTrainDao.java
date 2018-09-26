package com.ccl.transfesa.ci_order.backend.apirest.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrTrain;

public interface IOrTrainDao extends PagingAndSortingRepository<OrTrain, Long> {

}
