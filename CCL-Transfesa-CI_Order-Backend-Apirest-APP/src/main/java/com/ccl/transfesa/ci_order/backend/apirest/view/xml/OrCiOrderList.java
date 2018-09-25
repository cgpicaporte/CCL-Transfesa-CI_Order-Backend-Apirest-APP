package com.ccl.transfesa.ci_order.backend.apirest.view.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.ccl.transfesa.ci_order.backend.apirest.models.entity.OrCiOrder;

@XmlRootElement(name = "OrCiOrderList")
public class OrCiOrderList {

	@XmlElement(name = "OrCiOrder")
	public List<OrCiOrder> orCiOrders;

	public OrCiOrderList() {

	}

	public OrCiOrderList(List<OrCiOrder> orCiOrders) {
		this.orCiOrders = orCiOrders;
	}

	public List<OrCiOrder> getOrCiOrders() {
		return orCiOrders;
	}

}
