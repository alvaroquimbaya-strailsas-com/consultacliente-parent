
package com.bnpparibas.cardif.lam.schema.coverage.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.common.coveragetype.v1.CoverageTypeType;


/**
 * <p>Clase Java para coverage_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="coverage_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coverageType" type="{http://cardif.bnpparibas.com/lam/schema/common/coverageType/v1}CoverageType_Type" minOccurs="0"/&gt;
 *         &lt;element name="coverGrossPremiumAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="coverNetPremiumAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="coverInsuredAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="coverBusinessLineCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="coverRiskId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="waitingPeriodQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CoverFreePeriodQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="claimMaxInstallmentQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="maxNmbrOfClaimsPerYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CoverDurationQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coverage_Type", propOrder = {
    "coverageType",
    "coverGrossPremiumAmnt",
    "coverNetPremiumAmnt",
    "coverInsuredAmnt",
    "coverBusinessLineCode",
    "coverRiskId",
    "waitingPeriodQty",
    "coverFreePeriodQty",
    "claimMaxInstallmentQty",
    "maxNmbrOfClaimsPerYear",
    "coverDurationQty"
})
public class CoverageType {

    protected CoverageTypeType coverageType;
    protected BigDecimal coverGrossPremiumAmnt;
    protected BigDecimal coverNetPremiumAmnt;
    protected BigDecimal coverInsuredAmnt;
    protected BigDecimal coverBusinessLineCode;
    protected BigDecimal coverRiskId;
    protected BigDecimal waitingPeriodQty;
    @XmlElement(name = "CoverFreePeriodQty")
    protected BigDecimal coverFreePeriodQty;
    protected BigDecimal claimMaxInstallmentQty;
    protected BigDecimal maxNmbrOfClaimsPerYear;
    @XmlElement(name = "CoverDurationQty")
    protected BigDecimal coverDurationQty;

    /**
     * Obtiene el valor de la propiedad coverageType.
     * 
     * @return
     *     possible object is
     *     {@link CoverageTypeType }
     *     
     */
    public CoverageTypeType getCoverageType() {
        return coverageType;
    }

    /**
     * Define el valor de la propiedad coverageType.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageTypeType }
     *     
     */
    public void setCoverageType(CoverageTypeType value) {
        this.coverageType = value;
    }

    /**
     * Obtiene el valor de la propiedad coverGrossPremiumAmnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverGrossPremiumAmnt() {
        return coverGrossPremiumAmnt;
    }

    /**
     * Define el valor de la propiedad coverGrossPremiumAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverGrossPremiumAmnt(BigDecimal value) {
        this.coverGrossPremiumAmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad coverNetPremiumAmnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverNetPremiumAmnt() {
        return coverNetPremiumAmnt;
    }

    /**
     * Define el valor de la propiedad coverNetPremiumAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverNetPremiumAmnt(BigDecimal value) {
        this.coverNetPremiumAmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad coverInsuredAmnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverInsuredAmnt() {
        return coverInsuredAmnt;
    }

    /**
     * Define el valor de la propiedad coverInsuredAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverInsuredAmnt(BigDecimal value) {
        this.coverInsuredAmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad coverBusinessLineCode.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverBusinessLineCode() {
        return coverBusinessLineCode;
    }

    /**
     * Define el valor de la propiedad coverBusinessLineCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverBusinessLineCode(BigDecimal value) {
        this.coverBusinessLineCode = value;
    }

    /**
     * Obtiene el valor de la propiedad coverRiskId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverRiskId() {
        return coverRiskId;
    }

    /**
     * Define el valor de la propiedad coverRiskId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverRiskId(BigDecimal value) {
        this.coverRiskId = value;
    }

    /**
     * Obtiene el valor de la propiedad waitingPeriodQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaitingPeriodQty() {
        return waitingPeriodQty;
    }

    /**
     * Define el valor de la propiedad waitingPeriodQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaitingPeriodQty(BigDecimal value) {
        this.waitingPeriodQty = value;
    }

    /**
     * Obtiene el valor de la propiedad coverFreePeriodQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverFreePeriodQty() {
        return coverFreePeriodQty;
    }

    /**
     * Define el valor de la propiedad coverFreePeriodQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverFreePeriodQty(BigDecimal value) {
        this.coverFreePeriodQty = value;
    }

    /**
     * Obtiene el valor de la propiedad claimMaxInstallmentQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClaimMaxInstallmentQty() {
        return claimMaxInstallmentQty;
    }

    /**
     * Define el valor de la propiedad claimMaxInstallmentQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClaimMaxInstallmentQty(BigDecimal value) {
        this.claimMaxInstallmentQty = value;
    }

    /**
     * Obtiene el valor de la propiedad maxNmbrOfClaimsPerYear.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNmbrOfClaimsPerYear() {
        return maxNmbrOfClaimsPerYear;
    }

    /**
     * Define el valor de la propiedad maxNmbrOfClaimsPerYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNmbrOfClaimsPerYear(BigDecimal value) {
        this.maxNmbrOfClaimsPerYear = value;
    }

    /**
     * Obtiene el valor de la propiedad coverDurationQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverDurationQty() {
        return coverDurationQty;
    }

    /**
     * Define el valor de la propiedad coverDurationQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverDurationQty(BigDecimal value) {
        this.coverDurationQty = value;
    }

}
