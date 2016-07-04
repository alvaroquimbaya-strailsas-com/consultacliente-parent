
package com.bnpparibas.cardif.lam.schema.financialplan.paymentmode.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentMode_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentMode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentModeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMode_Type", propOrder = {
    "paymentModeName"
})
public class PaymentModeType {

    protected String paymentModeName;

    /**
     * Obtiene el valor de la propiedad paymentModeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentModeName() {
        return paymentModeName;
    }

    /**
     * Define el valor de la propiedad paymentModeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentModeName(String value) {
        this.paymentModeName = value;
    }

}
