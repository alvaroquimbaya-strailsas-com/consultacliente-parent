
package com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1.RiskUnitLoanType;


/**
 * <p>Clase Java para CustomerQueryByLoanNb_INType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerQueryByLoanNb_INType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/RiskUnit/RiskUnitLoan/v1}RiskUnitLoan"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQueryByLoanNb_INType", propOrder = {
    "riskUnitLoan"
})
public class CustomerQueryByLoanNbINType {

    @XmlElement(name = "RiskUnitLoan", namespace = "http://cardif.bnpparibas.com/lam/schema/RiskUnit/RiskUnitLoan/v1", required = true)
    protected RiskUnitLoanType riskUnitLoan;

    /**
     * Obtiene el valor de la propiedad riskUnitLoan.
     * 
     * @return
     *     possible object is
     *     {@link RiskUnitLoanType }
     *     
     */
    public RiskUnitLoanType getRiskUnitLoan() {
        return riskUnitLoan;
    }

    /**
     * Define el valor de la propiedad riskUnitLoan.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskUnitLoanType }
     *     
     */
    public void setRiskUnitLoan(RiskUnitLoanType value) {
        this.riskUnitLoan = value;
    }

}
