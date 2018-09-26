/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccl.transfesa.ci_order.backend.apirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author decgp1
 */
@Entity
@Table(name = "OR_WAGON", catalog = "", schema = "INTFS")
@Data

/*@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrWagon.findAll", query = "SELECT o FROM OrWagon o")})
*/    
public class OrWagon implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    //@Basic(optional = false)
    @NonNull
    @Column(name = "ID_WAGON")
    private Long idWagon;
    @Column(name = "ORDERPOSNR")
    private Short orderposnr;
    @Column(name = "WAGONNUMBER")
    private String wagonnumber;
    @Column(name = "WAGONCODE")
    private String wagoncode;
    @Column(name = "WAGONDESCRIPTION")
    private String wagondescription;
    @Column(name = "WAGONINFO")
    private String wagoninfo;
    @Column(name = "WAGONSIZETYPE")
    private String wagonsizetype;
    @Column(name = "WAGONWEIGHT")
    private BigDecimal wagonweight;
    @Column(name = "WAGONWEIGHTMEASURE")
    private String wagonweightmeasure;
    @Column(name = "AXLENUMBER")
    private Short axlenumber;
    @Column(name = "WAGONLENGTH")
    private BigDecimal wagonlength;
    @Column(name = "WAGONLENGTHMEASURE")
    private String wagonlengthmeasure;
    @Column(name = "TOTALWEIGHT")
    private BigDecimal totalweight;
    @Column(name = "TOTALWEIGHTMEASURE")
    private String totalweightmeasure;
    @Column(name = "NETWEIGHTPAYLOADWAGGON")
    private BigDecimal netweightpayloadwaggon;
    @Column(name = "NETWEIGHTPAYLOADWAGGONMEASURE")
    private String netweightpayloadwaggonmeasure;
    @Column(name = "TOTALWEIGHTLOADINGTACKLE")
    private BigDecimal totalweightloadingtackle;
    @Column(name = "TOTWEIGHTLOADINGTACKLEMEASURE")
    private String totweightloadingtacklemeasure;
    @Column(name = "LOADLIMIT")
    private BigDecimal loadlimit;
    @Column(name = "LOADLIMITMEASURE")
    private String loadlimitmeasure;
    @Column(name = "LOADINGSTATUS")
    private String loadingstatus;
    @Column(name = "NUMBEROFSEALS")
    private Short numberofseals;
    @Column(name = "DELIVERYREFERENCE")
    private String deliveryreference;
    @Column(name = "SHUNTINGMODALLABEL")
    private String shuntingmodallabel;
    @Column(name = "CUSTOMSANNOTATION")
    private String customsannotation;
    @Column(name = "IMPORTEXPORTRESTRICTION")
    private String importexportrestriction;
    @Column(name = "WAGONSTATUS")
    private String wagonstatus;
    @JoinColumn(name = "ID_ORDER", referencedColumnName = "ID_ORDER")
    @ManyToOne
    private OrOrder idOrder;
    @OneToMany(mappedBy = "idWagon")
    private List<OrWagonGood> orWagonGoodList;

    public OrWagon() {
    }
    /*
    public OrWagon(BigDecimal idWagon) {
        this.idWagon = idWagon;
    }

    public BigDecimal getIdWagon() {
        return idWagon;
    }

    public void setIdWagon(BigDecimal idWagon) {
        this.idWagon = idWagon;
    }

    public Short getOrderposnr() {
        return orderposnr;
    }

    public void setOrderposnr(Short orderposnr) {
        this.orderposnr = orderposnr;
    }

    public String getWagonnumber() {
        return wagonnumber;
    }

    public void setWagonnumber(String wagonnumber) {
        this.wagonnumber = wagonnumber;
    }

    public String getWagoncode() {
        return wagoncode;
    }

    public void setWagoncode(String wagoncode) {
        this.wagoncode = wagoncode;
    }

    public String getWagondescription() {
        return wagondescription;
    }

    public void setWagondescription(String wagondescription) {
        this.wagondescription = wagondescription;
    }

    public String getWagoninfo() {
        return wagoninfo;
    }

    public void setWagoninfo(String wagoninfo) {
        this.wagoninfo = wagoninfo;
    }

    public String getWagonsizetype() {
        return wagonsizetype;
    }

    public void setWagonsizetype(String wagonsizetype) {
        this.wagonsizetype = wagonsizetype;
    }

    public BigDecimal getWagonweight() {
        return wagonweight;
    }

    public void setWagonweight(BigDecimal wagonweight) {
        this.wagonweight = wagonweight;
    }

    public String getWagonweightmeasure() {
        return wagonweightmeasure;
    }

    public void setWagonweightmeasure(String wagonweightmeasure) {
        this.wagonweightmeasure = wagonweightmeasure;
    }

    public Short getAxlenumber() {
        return axlenumber;
    }

    public void setAxlenumber(Short axlenumber) {
        this.axlenumber = axlenumber;
    }

    public BigDecimal getWagonlength() {
        return wagonlength;
    }

    public void setWagonlength(BigDecimal wagonlength) {
        this.wagonlength = wagonlength;
    }

    public String getWagonlengthmeasure() {
        return wagonlengthmeasure;
    }

    public void setWagonlengthmeasure(String wagonlengthmeasure) {
        this.wagonlengthmeasure = wagonlengthmeasure;
    }

    public BigDecimal getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(BigDecimal totalweight) {
        this.totalweight = totalweight;
    }

    public String getTotalweightmeasure() {
        return totalweightmeasure;
    }

    public void setTotalweightmeasure(String totalweightmeasure) {
        this.totalweightmeasure = totalweightmeasure;
    }

    public BigDecimal getNetweightpayloadwaggon() {
        return netweightpayloadwaggon;
    }

    public void setNetweightpayloadwaggon(BigDecimal netweightpayloadwaggon) {
        this.netweightpayloadwaggon = netweightpayloadwaggon;
    }

    public String getNetweightpayloadwaggonmeasure() {
        return netweightpayloadwaggonmeasure;
    }

    public void setNetweightpayloadwaggonmeasure(String netweightpayloadwaggonmeasure) {
        this.netweightpayloadwaggonmeasure = netweightpayloadwaggonmeasure;
    }

    public BigDecimal getTotalweightloadingtackle() {
        return totalweightloadingtackle;
    }

    public void setTotalweightloadingtackle(BigDecimal totalweightloadingtackle) {
        this.totalweightloadingtackle = totalweightloadingtackle;
    }

    public String getTotweightloadingtacklemeasure() {
        return totweightloadingtacklemeasure;
    }

    public void setTotweightloadingtacklemeasure(String totweightloadingtacklemeasure) {
        this.totweightloadingtacklemeasure = totweightloadingtacklemeasure;
    }

    public BigDecimal getLoadlimit() {
        return loadlimit;
    }

    public void setLoadlimit(BigDecimal loadlimit) {
        this.loadlimit = loadlimit;
    }

    public String getLoadlimitmeasure() {
        return loadlimitmeasure;
    }

    public void setLoadlimitmeasure(String loadlimitmeasure) {
        this.loadlimitmeasure = loadlimitmeasure;
    }

    public String getLoadingstatus() {
        return loadingstatus;
    }

    public void setLoadingstatus(String loadingstatus) {
        this.loadingstatus = loadingstatus;
    }

    public Short getNumberofseals() {
        return numberofseals;
    }

    public void setNumberofseals(Short numberofseals) {
        this.numberofseals = numberofseals;
    }

    public String getDeliveryreference() {
        return deliveryreference;
    }

    public void setDeliveryreference(String deliveryreference) {
        this.deliveryreference = deliveryreference;
    }

    public String getShuntingmodallabel() {
        return shuntingmodallabel;
    }

    public void setShuntingmodallabel(String shuntingmodallabel) {
        this.shuntingmodallabel = shuntingmodallabel;
    }

    public String getCustomsannotation() {
        return customsannotation;
    }

    public void setCustomsannotation(String customsannotation) {
        this.customsannotation = customsannotation;
    }

    public String getImportexportrestriction() {
        return importexportrestriction;
    }

    public void setImportexportrestriction(String importexportrestriction) {
        this.importexportrestriction = importexportrestriction;
    }

    public String getWagonstatus() {
        return wagonstatus;
    }

    public void setWagonstatus(String wagonstatus) {
        this.wagonstatus = wagonstatus;
    }

    public OrOrder getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(OrOrder idOrder) {
        this.idOrder = idOrder;
    }

    @XmlTransient
    public List<OrWagonGood> getOrWagonGoodList() {
        return orWagonGoodList;
    }

    public void setOrWagonGoodList(List<OrWagonGood> orWagonGoodList) {
        this.orWagonGoodList = orWagonGoodList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWagon != null ? idWagon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrWagon)) {
            return false;
        }
        OrWagon other = (OrWagon) object;
        if ((this.idWagon == null && other.idWagon != null) || (this.idWagon != null && !this.idWagon.equals(other.idWagon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccl.transfesa.ci_orden.OrWagon[ idWagon=" + idWagon + " ]";
    }
    */
}
