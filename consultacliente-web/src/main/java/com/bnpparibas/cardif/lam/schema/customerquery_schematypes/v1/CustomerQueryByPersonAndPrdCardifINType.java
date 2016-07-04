
package com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.common.v1.IdentityType;
import com.bnpparibas.cardif.lam.schema.product.v1.ProductType;


/**
 * <p>Clase Java para CustomerQueryByPersonAndPrdCardif_INType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerQueryByPersonAndPrdCardif_INType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/common/v1}Identity"/&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/product/v1}product"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQueryByPersonAndPrdCardif_INType", propOrder = {
    "identity",
    "product"
})
public class CustomerQueryByPersonAndPrdCardifINType {

    @XmlElement(name = "Identity", namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", required = true)
    protected IdentityType identity;
    @XmlElement(namespace = "http://cardif.bnpparibas.com/lam/schema/product/v1", required = true)
    protected ProductType product;

    /**
     * Obtiene el valor de la propiedad identity.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getIdentity() {
        return identity;
    }

    /**
     * Define el valor de la propiedad identity.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setIdentity(IdentityType value) {
        this.identity = value;
    }

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

}
