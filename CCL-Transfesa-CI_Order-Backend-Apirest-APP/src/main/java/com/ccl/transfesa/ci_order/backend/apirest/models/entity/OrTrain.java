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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "OR_TRAIN", catalog = "", schema = "INTFS")
@Data
/*
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrTrain.findAll", query = "SELECT o FROM OrTrain o")})
*/    
public class OrTrain implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    //@Basic(optional = false)
    @NonNull
    @Column(name = "ID_TRAIN")
    private Long idTrain;
    @Column(name = "TRAINNUMBER")
    private String trainnumber;
    @Column(name = "INTERNALORDERNUMBER")
    private String internalordernumber;
    @Column(name = "TOTALWEIGHT")
    private String totalweight;
    @Column(name = "TOTALWEIGHTMEASURE")
    private String totalweightmeasure;
    @Column(name = "PLANNEDDEPARTUREDATEFROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date planneddeparturedatefrom;
    @Column(name = "PLANNEDDEPARTUREDATETO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date planneddeparturedateto;
    @Column(name = "ORDERDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderdate;
    @Column(name = "SENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date senddate;
    @Column(name = "ORDERSTATUS")
    private String orderstatus;
    @JoinColumn(name = "ID_ORDER", referencedColumnName = "ID_ORDER")
    @ManyToOne
    private OrOrder idOrder;

    public OrTrain() {
    }
    /*
    public OrTrain(BigDecimal idTrain) {
        this.idTrain = idTrain;
    }

    public BigDecimal getIdTrain() {
        return idTrain;
    }

    public void setIdTrain(BigDecimal idTrain) {
        this.idTrain = idTrain;
    }

    public String getTrainnumber() {
        return trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        this.trainnumber = trainnumber;
    }

    public String getInternalordernumber() {
        return internalordernumber;
    }

    public void setInternalordernumber(String internalordernumber) {
        this.internalordernumber = internalordernumber;
    }

    public String getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(String totalweight) {
        this.totalweight = totalweight;
    }

    public String getTotalweightmeasure() {
        return totalweightmeasure;
    }

    public void setTotalweightmeasure(String totalweightmeasure) {
        this.totalweightmeasure = totalweightmeasure;
    }

    public Date getPlanneddeparturedatefrom() {
        return planneddeparturedatefrom;
    }

    public void setPlanneddeparturedatefrom(Date planneddeparturedatefrom) {
        this.planneddeparturedatefrom = planneddeparturedatefrom;
    }

    public Date getPlanneddeparturedateto() {
        return planneddeparturedateto;
    }

    public void setPlanneddeparturedateto(Date planneddeparturedateto) {
        this.planneddeparturedateto = planneddeparturedateto;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public OrOrder getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(OrOrder idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrain != null ? idTrain.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrTrain)) {
            return false;
        }
        OrTrain other = (OrTrain) object;
        if ((this.idTrain == null && other.idTrain != null) || (this.idTrain != null && !this.idTrain.equals(other.idTrain))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccl.transfesa.ci_orden.OrTrain[ idTrain=" + idTrain + " ]";
    }
    */
}
