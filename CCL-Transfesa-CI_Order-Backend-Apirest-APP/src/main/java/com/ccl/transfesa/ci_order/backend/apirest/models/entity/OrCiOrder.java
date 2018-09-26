/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccl.transfesa.ci_order.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author decgp1
 */
@Entity
@Table(name = "OR_CI_ORDER", catalog = "", schema = "INTFS")
@Data
public class OrCiOrder implements Serializable {

    private static final long serialVersionUID = 1L;
        
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORSCI_ORDER")
	@SequenceGenerator(sequenceName = "ORSCI_ORDER", initialValue = 1, allocationSize = 1, name = "ORSCI_ORDER")
    @Column(name = "ID_CI_ORDER")
    @NonNull
    private Long idCiOrder;
    @Column(name = "INTERCHANGEID")
    private String interchangeid;
    @Column(name = "SENDERIDENTIFICATION")
    private String senderidentification;
    @Column(name = "RECEIVERIDENTIFICATION")
    private String receiveridentification;
    
    @Column(name = "MSGPREPARATIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgpreparationdate;

    @PrePersist
	public void prePersist() {
    	if (msgpreparationdate ==  null){
    		msgpreparationdate = new Date();
    	}
	}
    
    @Column(name = "XSDVERSION")
    private String xsdversion;
    @Column(name = "ACKOFRECEIPT")
    private String ackofreceipt;
    @Column(name = "TESTINDICATOR")
    private String testindicator;
    @Column(name = "CORRELATIONID")
    private String correlationid;
    
    /*
    @OneToMany(mappedBy = "idCiOrder")
    private List<OrOrder> orOrderList;
	*/    
    public OrCiOrder() {
    }
    /*
    public OrCiOrder(BigDecimal idCiOrder) {
        this.idCiOrder = idCiOrder;
    }

    public BigDecimal getIdCiOrder() {
        return idCiOrder;
    }

    public void setIdCiOrder(BigDecimal idCiOrder) {
        this.idCiOrder = idCiOrder;
    }

    public String getInterchangeid() {
        return interchangeid;
    }

    public void setInterchangeid(String interchangeid) {
        this.interchangeid = interchangeid;
    }

    public String getSenderidentification() {
        return senderidentification;
    }

    public void setSenderidentification(String senderidentification) {
        this.senderidentification = senderidentification;
    }

    public String getReceiveridentification() {
        return receiveridentification;
    }

    public void setReceiveridentification(String receiveridentification) {
        this.receiveridentification = receiveridentification;
    }

    public Date getMsgpreparationdate() {
        return msgpreparationdate;
    }

    public void setMsgpreparationdate(Date msgpreparationdate) {
        this.msgpreparationdate = msgpreparationdate;
    }

    public String getXsdversion() {
        return xsdversion;
    }

    public void setXsdversion(String xsdversion) {
        this.xsdversion = xsdversion;
    }

    public String getAckofreceipt() {
        return ackofreceipt;
    }

    public void setAckofreceipt(String ackofreceipt) {
        this.ackofreceipt = ackofreceipt;
    }

    public String getTestindicator() {
        return testindicator;
    }

    public void setTestindicator(String testindicator) {
        this.testindicator = testindicator;
    }

    public String getCorrelationid() {
        return correlationid;
    }

    public void setCorrelationid(String correlationid) {
        this.correlationid = correlationid;
    }
    
    /*
    @XmlTransient
    public List<OrOrder> getOrOrderList() {
        return orOrderList;
    }

    public void setOrOrderList(List<OrOrder> orOrderList) {
        this.orOrderList = orOrderList;
    }
	*/
    /*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCiOrder != null ? idCiOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrCiOrder)) {
            return false;
        }
        OrCiOrder other = (OrCiOrder) object;
        if ((this.idCiOrder == null && other.idCiOrder != null) || (this.idCiOrder != null && !this.idCiOrder.equals(other.idCiOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccl.transfesa.ci_orden.OrCiOrder[ idCiOrder=" + idCiOrder + " ]";
    }
    */
}
