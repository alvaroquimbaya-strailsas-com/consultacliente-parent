
package com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.policy.v1.PolicyType;


/**
 * <p>Clase Java para CustomerQueryByLoanNb_OUTType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerQueryByLoanNb_OUTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/policy/v1}Policy"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQueryByLoanNb_OUTType", propOrder = {
    "policy"
})
public class CustomerQueryByLoanNbOUTType {

    @XmlElement(name = "Policy", namespace = "http://cardif.bnpparibas.com/lam/schema/policy/v1", required = true)
    protected PolicyType policy;

    /**
     * Obtiene el valor de la propiedad policy.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicy() {
        return policy;
    }

    /**
     * Define el valor de la propiedad policy.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicy(PolicyType value) {
        this.policy = value;
    }

}
