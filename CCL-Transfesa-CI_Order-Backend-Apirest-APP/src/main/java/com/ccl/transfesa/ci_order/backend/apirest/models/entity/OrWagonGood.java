/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccl.transfesa.ci_order.backend.apirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author decgp1
 */
@Entity
@Table(name = "OR_WAGON_GOOD", catalog = "", schema = "INTFS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrWagonGood.findAll", query = "SELECT o FROM OrWagonGood o")})
public class OrWagonGood implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_WAGON_GOOD")
    private BigDecimal idWagonGood;
    @Column(name = "NATUREOFPACKING")
    private String natureofpacking;
    @Column(name = "NUMBEROFPACKAGES")
    private Long numberofpackages;
    @Column(name = "NHMCODE")
    private String nhmcode;
    @Column(name = "AVVKEY")
    private String avvkey;
    @Column(name = "CARBRAND")
    private String carbrand;
    @Column(name = "CARMODEL")
    private String carmodel;
    @Column(name = "GOODDESCRIPTION")
    private String gooddescription;
    @Column(name = "GOODLONGDESCRIPTION")
    private String goodlongdescription;
    @Column(name = "ADDITIONALGOODINFORMATION")
    private String additionalgoodinformation;
    @Column(name = "GROSSMASS")
    private BigDecimal grossmass;
    @Column(name = "GROSSVOLUME")
    private BigDecimal grossvolume;
    @Column(name = "GROSSVOLUMEUOM")
    private String grossvolumeuom;
    @Column(name = "DISCARDEDMETAL")
    private String discardedmetal;
    @Column(name = "WASTEGOOD")
    private String wastegood;
    @Column(name = "DANGERGOOD")
    private String dangergood;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "ID_WAGON", referencedColumnName = "ID_WAGON")
    @ManyToOne
    private OrWagon idWagon;

    public OrWagonGood() {
    }

    public OrWagonGood(BigDecimal idWagonGood) {
        this.idWagonGood = idWagonGood;
    }

    public BigDecimal getIdWagonGood() {
        return idWagonGood;
    }

    public void setIdWagonGood(BigDecimal idWagonGood) {
        this.idWagonGood = idWagonGood;
    }

    public String getNatureofpacking() {
        return natureofpacking;
    }

    public void setNatureofpacking(String natureofpacking) {
        this.natureofpacking = natureofpacking;
    }

    public Long getNumberofpackages() {
        return numberofpackages;
    }

    public void setNumberofpackages(Long numberofpackages) {
        this.numberofpackages = numberofpackages;
    }

    public String getNhmcode() {
        return nhmcode;
    }

    public void setNhmcode(String nhmcode) {
        this.nhmcode = nhmcode;
    }

    public String getAvvkey() {
        return avvkey;
    }

    public void setAvvkey(String avvkey) {
        this.avvkey = avvkey;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getGooddescription() {
        return gooddescription;
    }

    public void setGooddescription(String gooddescription) {
        this.gooddescription = gooddescription;
    }

    public String getGoodlongdescription() {
        return goodlongdescription;
    }

    public void setGoodlongdescription(String goodlongdescription) {
        this.goodlongdescription = goodlongdescription;
    }

    public String getAdditionalgoodinformation() {
        return additionalgoodinformation;
    }

    public void setAdditionalgoodinformation(String additionalgoodinformation) {
        this.additionalgoodinformation = additionalgoodinformation;
    }

    public BigDecimal getGrossmass() {
        return grossmass;
    }

    public void setGrossmass(BigDecimal grossmass) {
        this.grossmass = grossmass;
    }

    public BigDecimal getGrossvolume() {
        return grossvolume;
    }

    public void setGrossvolume(BigDecimal grossvolume) {
        this.grossvolume = grossvolume;
    }

    public String getGrossvolumeuom() {
        return grossvolumeuom;
    }

    public void setGrossvolumeuom(String grossvolumeuom) {
        this.grossvolumeuom = grossvolumeuom;
    }

    public String getDiscardedmetal() {
        return discardedmetal;
    }

    public void setDiscardedmetal(String discardedmetal) {
        this.discardedmetal = discardedmetal;
    }

    public String getWastegood() {
        return wastegood;
    }

    public void setWastegood(String wastegood) {
        this.wastegood = wastegood;
    }

    public String getDangergood() {
        return dangergood;
    }

    public void setDangergood(String dangergood) {
        this.dangergood = dangergood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrWagon getIdWagon() {
        return idWagon;
    }

    public void setIdWagon(OrWagon idWagon) {
        this.idWagon = idWagon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWagonGood != null ? idWagonGood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrWagonGood)) {
            return false;
        }
        OrWagonGood other = (OrWagonGood) object;
        if ((this.idWagonGood == null && other.idWagonGood != null) || (this.idWagonGood != null && !this.idWagonGood.equals(other.idWagonGood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccl.transfesa.ci_orden.OrWagonGood[ idWagonGood=" + idWagonGood + " ]";
    }
    
}
