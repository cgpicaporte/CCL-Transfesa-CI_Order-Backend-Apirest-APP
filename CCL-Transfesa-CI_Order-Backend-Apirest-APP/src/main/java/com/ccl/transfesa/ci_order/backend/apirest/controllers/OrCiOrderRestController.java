package com.ccl.transfesa.ci_order.backend.apirest.controllers;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;
import com.ccl.transfesa.ci_order.backend.apirest.models.service.IOrCiOrderService;
import com.ccl.transfesa.ci_order.backend.apirest.view.xml.OrCiOrderList;

@RestController
@RequestMapping("/api")
public class OrCiOrderRestController {
	
	@Autowired
	private IOrCiOrderService orCiOrderService;
	
	@GetMapping("/orciordersall")
	public List<OrCiOrder> index(){
		return orCiOrderService.findAll();
	}
	
	@GetMapping(value = "/orciordersxml")
	public @ResponseBody OrCiOrderList listarXMLRest(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "10") int size) {
		Pageable pageRequest = PageRequest.of(page, size);
		Page<OrCiOrder> orCiOrders = orCiOrderService.findAll(pageRequest);
		return new OrCiOrderList(orCiOrders.getContent());
	}
	
	@GetMapping(value = "/orciorders")
	public @ResponseBody List<OrCiOrder> listarXMLRestJson(@RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "10") int size) {
		Pageable pageRequest = PageRequest.of(page, size);
		Page<OrCiOrder> orCiOrders = orCiOrderService.findAll(pageRequest);
		return orCiOrders.getContent();
	}
	
	@GetMapping("/orciorders/{id}")
	public OrCiOrder show(@PathVariable BigDecimal id) {
		return orCiOrderService.findById(id);
	}
	
	@PostMapping("/orciorders")
	@ResponseStatus(HttpStatus.CREATED) //con esto retornamos un 201
	public OrCiOrder create(@RequestBody OrCiOrder orCiOrder) {
		//cliente.setCreateAt(new Date()); en el Entity ponemos un PrePersist
		return orCiOrderService.save(orCiOrder);		
	}
	
	@PutMapping("/orciorders/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public OrCiOrder update(@RequestBody OrCiOrder orCiOrder, @PathVariable BigDecimal id) {
		
		OrCiOrder orCiOrderActual= orCiOrderService.findById(id);
		orCiOrderActual.setInterchangeid(orCiOrder.getInterchangeid());
		orCiOrderActual.setSenderidentification(orCiOrder.getSenderidentification());
		orCiOrderActual.setReceiveridentification(orCiOrder.getReceiveridentification());
		orCiOrderActual.setMsgpreparationdate(orCiOrder.getMsgpreparationdate());
		orCiOrderActual.setXsdversion(orCiOrder.getXsdversion());
		orCiOrderActual.setAckofreceipt(orCiOrder.getAckofreceipt());
		orCiOrderActual.setTestindicator(orCiOrder.getTestindicator());
		orCiOrderActual.setCorrelationid(orCiOrder.getCorrelationid());
		
		return orCiOrderService.save(orCiOrderActual);
	}
	
	@DeleteMapping("/orciorders/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable BigDecimal id) {
		orCiOrderService.delete(id);
	}

}
