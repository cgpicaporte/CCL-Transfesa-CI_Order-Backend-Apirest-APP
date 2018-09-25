/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccl.transfesa.ci_order.backend.apirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author decgp1
 */
@Entity
@Table(name = "OR_UTI", catalog = "", schema = "INTFS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrUti.findAll", query = "SELECT o FROM OrUti o")})
public class OrUti implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_UTI")
    private BigDecimal idUti;
    @Column(name = "ORDERPOSNR")
    private Short orderposnr;
    @Column(name = "UTITYPE")
    private String utitype;
    @Column(name = "ISOCONTAINERTYPE")
    private String isocontainertype;
    @Column(name = "GATTUNG")
    private String gattung;
    @Column(name = "PREFIX")
    private String prefix;
    @Column(name = "CONTAINERNUMBER")
    private String containernumber;
    @Column(name = "CHECKDIGIT")
    private String checkdigit;
    @Column(name = "LOADINGSTATUS")
    private String loadingstatus;
    @Column(name = "CONTAINEROWNER")
    private String containerowner;
    @Column(name = "ADDITIONALINFORMATION")
    private String additionalinformation;
    @Column(name = "CODIFICATION")
    private String codification;
    @Column(name = "CUSTOMERINSTRUCTSATRECEIVING")
    private String customerinstructsatreceiving;
    @Column(name = "CUSTOMERINSTRUCTSATSHIPPING")
    private String customerinstructsatshipping;
    @Column(name = "CUSTOMSPROCEDURES")
    private String customsprocedures;
    @Column(name = "CUSTOMINDICATOR")
    private String customindicator;
    @Column(name = "PAPERHANDLING")
    private String paperhandling;
    @Column(name = "CUSTOMSTATIONACCEPTANCECODE")
    private String customstationacceptancecode;
    @Column(name = "CUSTOMSTATIONACCEPTANCENAME")
    private String customstationacceptancename;
    @Column(name = "CUSTOMSTATIONDELIVERYCODE")
    private String customstationdeliverycode;
    @Column(name = "CUSTOMSTATIONDELIVERYNAME")
    private String customstationdeliveryname;
    @Column(name = "DELIVERYREFERENCE")
    private String deliveryreference;
    @Column(name = "LENGTHCODE")
    private String lengthcode;
    @Column(name = "LENGTHVALUE")
    private BigDecimal lengthvalue;
    @Column(name = "LENGTHMEASURE")
    private String lengthmeasure;
    @Column(name = "WIDTHVALUE")
    private BigDecimal widthvalue;
    @Column(name = "WIDTHMEASURE")
    private String widthmeasure;
    @Column(name = "HEIGHTCODE")
    private String heightcode;
    @Column(name = "HEIGHTVALUE")
    private BigDecimal heightvalue;
    @Column(name = "HEIGHTMEASURE")
    private String heightmeasure;
    @Column(name = "FORWARDING")
    private String forwarding;
    @Column(name = "REEFERCARGO")
    private String reefercargo;
    @Column(name = "REFEERALLOWED")
    private String refeerallowed;
    @Column(name = "WASTEALLOWED")
    private String wasteallowed;
    @Column(name = "DARGERALLOWED")
    private String dargerallowed;
    @Column(name = "MINTEMPERATURE")
    private BigDecimal mintemperature;
    @Column(name = "MAXTEMPERATURE")
    private BigDecimal maxtemperature;
    @Column(name = "NUMBEROFSEALS")
    private Short numberofseals;
    @Column(name = "LOADWEIGHT")
    private BigDecimal loadweight;
    @Column(name = "TAREWEIGHT")
    private BigDecimal tareweight;
    @Column(name = "UTIGROSSWEIGHT")
    private BigDecimal utigrossweight;
    @Column(name = "TURNINNUMBER")
    private String turninnumber;
    @Column(name = "WAGONNUMBER")
    private String wagonnumber;
    @Column(name = "UTISTATUS")
    private String utistatus;
    @Column(name = "HANDOVERCONDITIONS")
    private String handoverconditions;
    @Column(name = "TAKEOVERCONDITIONS")
    private String takeoverconditions;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TAKEOVERTRANSSHIPMENTTYPE")
    private String takeovertransshipmenttype;
    @Column(name = "HANDOVERTRANSSHIPMENTTYPE")
    private String handovertransshipmenttype;
    @Column(name = "CUSTOMSDOCTYPE")
    private String customsdoctype;
    @Column(name = "CUSTOMSDOCNUMBER")
    private String customsdocnumber;
    @JoinColumn(name = "ID_ORDER", referencedColumnName = "ID_ORDER")
    @ManyToOne
    private OrOrder idOrder;
    @OneToMany(mappedBy = "idUti")
    private List<OrUtiGood> orUtiGoodList;

    public OrUti() {
    }

    public OrUti(BigDecimal idUti) {
        this.idUti = idUti;
    }

    public BigDecimal getIdUti() {
        return idUti;
    }

    public void setIdUti(BigDecimal idUti) {
        this.idUti = idUti;
    }

    public Short getOrderposnr() {
        return orderposnr;
    }

    public void setOrderposnr(Short orderposnr) {
        this.orderposnr = orderposnr;
    }

    public String getUtitype() {
        return utitype;
    }

    public void setUtitype(String utitype) {
        this.utitype = utitype;
    }

    public String getIsocontainertype() {
        return isocontainertype;
    }

    public void setIsocontainertype(String isocontainertype) {
        this.isocontainertype = isocontainertype;
    }

    public String getGattung() {
        return gattung;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getContainernumber() {
        return containernumber;
    }

    public void setContainernumber(String containernumber) {
        this.containernumber = containernumber;
    }

    public String getCheckdigit() {
        return checkdigit;
    }

    public void setCheckdigit(String checkdigit) {
        this.checkdigit = checkdigit;
    }

    public String getLoadingstatus() {
        return loadingstatus;
    }

    public void setLoadingstatus(String loadingstatus) {
        this.loadingstatus = loadingstatus;
    }

    public String getContainerowner() {
        return containerowner;
    }

    public void setContainerowner(String containerowner) {
        this.containerowner = containerowner;
    }

    public String getAdditionalinformation() {
        return additionalinformation;
    }

    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation;
    }

    public String getCodification() {
        return codification;
    }

    public void setCodification(String codification) {
        this.codification = codification;
    }

    public String getCustomerinstructsatreceiving() {
        return customerinstructsatreceiving;
    }

    public void setCustomerinstructsatreceiving(String customerinstructsatreceiving) {
        this.customerinstructsatreceiving = customerinstructsatreceiving;
    }

    public String getCustomerinstructsatshipping() {
        return customerinstructsatshipping;
    }

    public void setCustomerinstructsatshipping(String customerinstructsatshipping) {
        this.customerinstructsatshipping = customerinstructsatshipping;
    }

    public String getCustomsprocedures() {
        return customsprocedures;
    }

    public void setCustomsprocedures(String customsprocedures) {
        this.customsprocedures = customsprocedures;
    }

    public String getCustomindicator() {
        return customindicator;
    }

    public void setCustomindicator(String customindicator) {
        this.customindicator = customindicator;
    }

    public String getPaperhandling() {
        return paperhandling;
    }

    public void setPaperhandling(String paperhandling) {
        this.paperhandling = paperhandling;
    }

    public String getCustomstationacceptancecode() {
        return customstationacceptancecode;
    }

    public void setCustomstationacceptancecode(String customstationacceptancecode) {
        this.customstationacceptancecode = customstationacceptancecode;
    }

    public String getCustomstationacceptancename() {
        return customstationacceptancename;
    }

    public void setCustomstationacceptancename(String customstationacceptancename) {
        this.customstationacceptancename = customstationacceptancename;
    }

    public String getCustomstationdeliverycode() {
        return customstationdeliverycode;
    }

    public void setCustomstationdeliverycode(String customstationdeliverycode) {
        this.customstationdeliverycode = customstationdeliverycode;
    }

    public String getCustomstationdeliveryname() {
        return customstationdeliveryname;
    }

    public void setCustomstationdeliveryname(String customstationdeliveryname) {
        this.customstationdeliveryname = customstationdeliveryname;
    }

    public String getDeliveryreference() {
        return deliveryreference;
    }

    public void setDeliveryreference(String deliveryreference) {
        this.deliveryreference = deliveryreference;
    }

    public String getLengthcode() {
        return lengthcode;
    }

    public void setLengthcode(String lengthcode) {
        this.lengthcode = lengthcode;
    }

    public BigDecimal getLengthvalue() {
        return lengthvalue;
    }

    public void setLengthvalue(BigDecimal lengthvalue) {
        this.lengthvalue = lengthvalue;
    }

    public String getLengthmeasure() {
        return lengthmeasure;
    }

    public void setLengthmeasure(String lengthmeasure) {
        this.lengthmeasure = lengthmeasure;
    }

    public BigDecimal getWidthvalue() {
        return widthvalue;
    }

    public void setWidthvalue(BigDecimal widthvalue) {
        this.widthvalue = widthvalue;
    }

    public String getWidthmeasure() {
        return widthmeasure;
    }

    public void setWidthmeasure(String widthmeasure) {
        this.widthmeasure = widthmeasure;
    }

    public String getHeightcode() {
        return heightcode;
    }

    public void setHeightcode(String heightcode) {
        this.heightcode = heightcode;
    }

    public BigDecimal getHeightvalue() {
        return heightvalue;
    }

    public void setHeightvalue(BigDecimal heightvalue) {
        this.heightvalue = heightvalue;
    }

    public String getHeightmeasure() {
        return heightmeasure;
    }

    public void setHeightmeasure(String heightmeasure) {
        this.heightmeasure = heightmeasure;
    }

    public String getForwarding() {
        return forwarding;
    }

    public void setForwarding(String forwarding) {
        this.forwarding = forwarding;
    }

    public String getReefercargo() {
        return reefercargo;
    }

    public void setReefercargo(String reefercargo) {
        this.reefercargo = reefercargo;
    }

    public String getRefeerallowed() {
        return refeerallowed;
    }

    public void setRefeerallowed(String refeerallowed) {
        this.refeerallowed = refeerallowed;
    }

    public String getWasteallowed() {
        return wasteallowed;
    }

    public void setWasteallowed(String wasteallowed) {
        this.wasteallowed = wasteallowed;
    }

    public String getDargerallowed() {
        return dargerallowed;
    }

    public void setDargerallowed(String dargerallowed) {
        this.dargerallowed = dargerallowed;
    }

    public BigDecimal getMintemperature() {
        return mintemperature;
    }

    public void setMintemperature(BigDecimal mintemperature) {
        this.mintemperature = mintemperature;
    }

    public BigDecimal getMaxtemperature() {
        return maxtemperature;
    }

    public void setMaxtemperature(BigDecimal maxtemperature) {
        this.maxtemperature = maxtemperature;
    }

    public Short getNumberofseals() {
        return numberofseals;
    }

    public void setNumberofseals(Short numberofseals) {
        this.numberofseals = numberofseals;
    }

    public BigDecimal getLoadweight() {
        return loadweight;
    }

    public void setLoadweight(BigDecimal loadweight) {
        this.loadweight = loadweight;
    }

    public BigDecimal getTareweight() {
        return tareweight;
    }

    public void setTareweight(BigDecimal tareweight) {
        this.tareweight = tareweight;
    }

    public BigDecimal getUtigrossweight() {
        return utigrossweight;
    }

    public void setUtigrossweight(BigDecimal utigrossweight) {
        this.utigrossweight = utigrossweight;
    }

    public String getTurninnumber() {
        return turninnumber;
    }

    public void setTurninnumber(String turninnumber) {
        this.turninnumber = turninnumber;
    }

    public String getWagonnumber() {
        return wagonnumber;
    }

    public void setWagonnumber(String wagonnumber) {
        this.wagonnumber = wagonnumber;
    }

    public String getUtistatus() {
        return utistatus;
    }

    public void setUtistatus(String utistatus) {
        this.utistatus = utistatus;
    }

    public String getHandoverconditions() {
        return handoverconditions;
    }

    public void setHandoverconditions(String handoverconditions) {
        this.handoverconditions = handoverconditions;
    }

    public String getTakeoverconditions() {
        return takeoverconditions;
    }

    public void setTakeoverconditions(String takeoverconditions) {
        this.takeoverconditions = takeoverconditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTakeovertransshipmenttype() {
        return takeovertransshipmenttype;
    }

    public void setTakeovertransshipmenttype(String takeovertransshipmenttype) {
        this.takeovertransshipmenttype = takeovertransshipmenttype;
    }

    public String getHandovertransshipmenttype() {
        return handovertransshipmenttype;
    }

    public void setHandovertransshipmenttype(String handovertransshipmenttype) {
        this.handovertransshipmenttype = handovertransshipmenttype;
    }

    public String getCustomsdoctype() {
        return customsdoctype;
    }

    public void setCustomsdoctype(String customsdoctype) {
        this.customsdoctype = customsdoctype;
    }

    public String getCustomsdocnumber() {
        return customsdocnumber;
    }

    public void setCustomsdocnumber(String customsdocnumber) {
        this.customsdocnumber = customsdocnumber;
    }

    public OrOrder getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(OrOrder idOrder) {
        this.idOrder = idOrder;
    }

    @XmlTransient
    public List<OrUtiGood> getOrUtiGoodList() {
        return orUtiGoodList;
    }

    public void setOrUtiGoodList(List<OrUtiGood> orUtiGoodList) {
        this.orUtiGoodList = orUtiGoodList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUti != null ? idUti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrUti)) {
            return false;
        }
        OrUti other = (OrUti) object;
        if ((this.idUti == null && other.idUti != null) || (this.idUti != null && !this.idUti.equals(other.idUti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ccl.transfesa.ci_orden.OrUti[ idUti=" + idUti + " ]";
    }
    
}
