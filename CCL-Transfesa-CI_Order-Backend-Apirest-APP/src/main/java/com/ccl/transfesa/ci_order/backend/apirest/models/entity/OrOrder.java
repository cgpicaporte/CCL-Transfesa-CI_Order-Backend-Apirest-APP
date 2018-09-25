/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccl.transfesa.ci_order.backend.apirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author decgp1
 */
@Entity
@Table(name = "OR_ORDER", catalog = "", schema = "INTFS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrOrder.findAll", query = "SELECT o FROM OrOrder o")})
public class OrOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ORDER")
    private BigDecimal idOrder;
    @Column(name = "SENDERCODE")
    private String sendercode;
    @Column(name = "RECEIVERCODE")
    private String receivercode;
    @Column(name = "MESSAGEREFERENCENUMBER")
    private String messagereferencenumber;
    @Column(name = "MESSAGETYPE")
    private String messagetype;
    @Column(name = "MESSAGESUBTYPE")
    private String messagesubtype;
    @Column(name = "ORDERTYPE")
    private String ordertype;
    @Column(name = "PREPARATIONDATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preparationdatetime;
    @Column(name = "VERSIONNUMBER")
    private String versionnumber;
    @Column(name = "CONSIGMENTCODE")
    private String consigmentcode;
    @Column(name = "CONSIGMENTDATE")
    private String consigmentdate;
    @Column(name = "SHIPMENTTYPE")
    private String shipmenttype;
    @Column(name = "ACKOFRECEIPTDATE")
    private String ackofreceiptdate;
    @Column(name = "ACKOFRECEIPTSIGN")
    private String ackofreceiptsign;
    @Column(name = "INTERNALORDERNUMBER")
    private String internalordernumber;
    @Column(name = "SERVICECODE")
    private String servicecode;
    @Column(name = "SERVICECONTRACT")
    private String servicecontract;
    @Column(name = "ENTITYCODE")
    private String entitycode;
    @Column(name = "USERCODE")
    private String usercode;
    @Column(name = "RELEASEINDICATOR")
    private String releaseindicator;
    @Column(name = "CONSIGMENTNOTENUMBER")
    private String consigmentnotenumber;
    @Column(name = "CONSIGMENTNOTETYPE")
    private String consigmentnotetype;
    @Column(name = "CONSIGMENTNOTEPRINTED")
    private String consigmentnoteprinted;
    @Column(name = "CONSIGMENTNOTECOMMENTS")
    private String consigmentnotecomments;
    @Column(name = "ORDERSTATUS")
    private String orderstatus;
    @Column(name = "ACTIVITYCODE")
    private String activitycode;
    @Column(name = "BUSINESSLINECODE")
    private String businesslinecode;
    @Column(name = "BUSINESSLINEDESC")
    private String businesslinedesc;
    @Column(name = "OBJECTID")
    private String objectid;
    @OneToMany(mappedBy = "idOrder")
    private List<OrUti> orUtiList;
    @OneToMany(mappedBy = "idOrder")
    private List<OrWagon> orWagonList;
    @OneToMany(mappedBy = "idOrder")
    private List<OrTrain> orTrainList;
    @JoinColumn(name = "ID_CI_ORDER", referencedColumnName = "ID_CI_ORDER")
    @ManyToOne
    private OrCiOrder idCiOrder;

    public OrOrder() {
    }

    public OrOrder(BigDecimal idOrder) {
        this.idOrder = idOrder;
    }

    public BigDecimal getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(BigDecimal idOrder) {
        this.idOrder = idOrder;
    }

    public String getSendercode() {
        return sendercode;
    }

    public void setSendercode(String sendercode) {
        this.sendercode = sendercode;
    }

    public String getReceivercode() {
        return receivercode;
    }

    public void setReceivercode(String receivercode) {
        this.receivercode = receivercode;
    }

    public String getMessagereferencenumber() {
        return messagereferencenumber;
    }

    public void setMessagereferencenumber(String messagereferencenumber) {
        this.messagereferencenumber = messagereferencenumber;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    public String getMessagesubtype() {
        return messagesubtype;
    }

    public void setMessagesubtype(String messagesubtype) {
        this.messagesubtype = messagesubtype;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public Date getPreparationdatetime() {
        return preparationdatetime;
    }

    public void setPreparationdatetime(Date preparationdatetime) {
        this.preparationdatetime = preparationdatetime;
    }

    public String getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(String versionnumber) {
        this.versionnumber = versionnumber;
    }

    public String getConsigmentcode() {
        return consigmentcode;
    }

    public void setConsigmentcode(String consigmentcode) {
        this.consigmentcode = consigmentcode;
    }

    public String getConsigmentdate() {
        return consigmentdate;
    }

    public void setConsigmentdate(String consigmentdate) {
        this.consigmentdate = consigmentdate;
    }

    public String getShipmenttype() {
        return shipmenttype;
    }

    public void setShipmenttype(String shipmenttype) {
        this.shipmenttype = shipmenttype;
    }

    public String getAckofreceiptdate() {
        return ackofreceiptdate;
    }

    public void setAckofreceiptdate(String ackofreceiptdate) {
        this.ackofreceiptdate = ackofreceiptdate;
    }

    public String getAckofreceiptsign() {
        return ackofreceiptsign;
    }

    public void setAckofreceiptsign(String ackofreceiptsign) {
        this.ackofreceiptsign = ackofreceiptsign;
    }

    public String getInternalordernumber() {
        return internalordernumber;
    }

    public void setInternalordernumber(String internalordernumber) {
        this.internalordernumber = internalordernumber;
    }

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public String getServicecontract() {
        return servicecontract;
    }

    public void setServicecontract(String servicecontract) {
        this.servicecontract = servicecontract;
    }

    public String getEntitycode() {
        return entitycode;
    }

    public void setEntitycode(String entitycode) {
        this.entitycode = entitycode;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getReleaseindicator() {
        return releaseindicator;
    }

    public void setReleaseindicator(String releaseindicator) {
        this.releaseindicator = releaseindicator;
    }

    public String getConsigmentnotenumber() {
        return consigmentnotenumber;
    }

    public void setConsigmentnotenumber(String consigmentnotenumber) {
        this.consigmentnotenumber = consigmentnotenumber;
    }

    public String getConsigmentnotetype() {
        return consigmentnotetype;
    }

    public void setConsigmentnotetype(String consigmentnotetype) {
        this.consigmentnotetype = consigmentnotetype;
    }

    public String getConsigmentnoteprinted() {
        return consigmentnoteprinted;
    }

    public void setConsigmentnoteprinted(String consigmentnoteprinted) {
        this.consigmentnoteprinted = consigmentnoteprinted;
    }

    public String getConsigmentnotecomments() {
        return consigmentnotecomments;
    }

    public void setConsigmentnotecomments(String consigmentnotecomments) {
        this.consigmentnotecomments = consigmentnotecomments;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getActivitycode() {
        return activitycode;
    }

    public void setActivitycode(String activitycode) {
        this.activitycode = activitycode;
    }

    public String getBusinesslinecode() {
        return businesslinecode;
    }

    public void setBusinesslinecode(String businesslinecode) {
        this.businesslinecode = businesslinecode;
    }

    public String getBusinesslinedesc() {
        return businesslinedesc;
    }

    public void setBusinesslinedesc(String businesslinedesc) {
        this.businesslinedesc = businesslinedesc;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    @XmlTransient
    public List<OrUti> getOrUtiList() {
        return orUtiList;
    }

    public void setOrUtiList(List<OrUti> orUtiList) {
        this.orUtiList = orUtiList;
    }

    @XmlTransient
    public List<OrWagon> getOrWagonList() {
        return orWagonList;
    }

    public void setOrWagonList(List<OrWagon> orWagonList) {
        this.orWagonList = orWagonList;
    }

    @XmlTransient
    public List<OrTrain> getOrTrainList() {
        return orTrainList;
    }

    public void setOrTrainList(List<OrTrain> orTrainList) {
        this.orTrainList = orTrainList;
    }

    public OrCiOrder getIdCiOrder() {
        return idCiOrder;
    }

    public void setIdCiOrder(OrCiOrder idCiOrder) {
        this.idCiOrder = idCiOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrOrder)) {
            return false;
        }
        OrOrder other = (OrOrder) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccl.transfesa.ci_orden.OrOrder[ idOrder=" + idOrder + " ]";
    }
    
}
