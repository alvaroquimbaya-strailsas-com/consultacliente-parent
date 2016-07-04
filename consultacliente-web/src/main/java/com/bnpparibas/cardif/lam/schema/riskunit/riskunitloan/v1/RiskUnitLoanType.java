
package com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.riskunit.v1.RiskUnitType;


/**
 * <p>Clase Java para RiskUnitLoan_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RiskUnitLoan_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cardif.bnpparibas.com/lam/schema/riskunit/v1}RiskUnit_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanNb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanInstallmentAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="loanAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskUnitLoan_Type", propOrder = {
    "loanNb",
    "loanInstallmentAmnt",
    "loanAmnt"
})
public class RiskUnitLoanType
    extends RiskUnitType
{

    protected String loanNb;
    protected BigDecimal loanInstallmentAmnt;
    protected BigDecimal loanAmnt;

    /**
     * Obtiene el valor de la propiedad loanNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNb() {
        return loanNb;
    }

    /**
     * Define el valor de la propiedad loanNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNb(String value) {
        this.loanNb = value;
    }

    /**
     * Obtiene el valor de la propiedad loanInstallmentAmnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanInstallmentAmnt() {
        return loanInstallmentAmnt;
    }

    /**
     * Define el valor de la propiedad loanInstallmentAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanInstallmentAmnt(BigDecimal value) {
        this.loanInstallmentAmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad loanAmnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmnt() {
        return loanAmnt;
    }

    /**
     * Define el valor de la propiedad loanAmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmnt(BigDecimal value) {
        this.loanAmnt = value;
    }

}
