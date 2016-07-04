
package com.bnpparibas.cardif.lam.schema.product.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Product_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Product_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productLegalRegstrtnNb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productMigratedIndic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productDeudorIndic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="subscriberEntryMaxAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="subscriberEntryMinAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="incapacityMinimumQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="incapacityMaximumQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product_Type", propOrder = {
    "productName",
    "productLegalRegstrtnNb",
    "productMigratedIndic",
    "productDeudorIndic",
    "subscriberEntryMaxAge",
    "subscriberEntryMinAge",
    "incapacityMinimumQty",
    "incapacityMaximumQty"
})
public class ProductType {

    protected String productName;
    protected String productLegalRegstrtnNb;
    protected Boolean productMigratedIndic;
    protected Boolean productDeudorIndic;
    protected BigDecimal subscriberEntryMaxAge;
    protected BigDecimal subscriberEntryMinAge;
    protected BigDecimal incapacityMinimumQty;
    protected BigDecimal incapacityMaximumQty;

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad productLegalRegstrtnNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLegalRegstrtnNb() {
        return productLegalRegstrtnNb;
    }

    /**
     * Define el valor de la propiedad productLegalRegstrtnNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLegalRegstrtnNb(String value) {
        this.productLegalRegstrtnNb = value;
    }

    /**
     * Obtiene el valor de la propiedad productMigratedIndic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductMigratedIndic() {
        return productMigratedIndic;
    }

    /**
     * Define el valor de la propiedad productMigratedIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductMigratedIndic(Boolean value) {
        this.productMigratedIndic = value;
    }

    /**
     * Obtiene el valor de la propiedad productDeudorIndic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductDeudorIndic() {
        return productDeudorIndic;
    }

    /**
     * Define el valor de la propiedad productDeudorIndic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductDeudorIndic(Boolean value) {
        this.productDeudorIndic = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberEntryMaxAge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberEntryMaxAge() {
        return subscriberEntryMaxAge;
    }

    /**
     * Define el valor de la propiedad subscriberEntryMaxAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberEntryMaxAge(BigDecimal value) {
        this.subscriberEntryMaxAge = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberEntryMinAge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberEntryMinAge() {
        return subscriberEntryMinAge;
    }

    /**
     * Define el valor de la propiedad subscriberEntryMinAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberEntryMinAge(BigDecimal value) {
        this.subscriberEntryMinAge = value;
    }

    /**
     * Obtiene el valor de la propiedad incapacityMinimumQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncapacityMinimumQty() {
        return incapacityMinimumQty;
    }

    /**
     * Define el valor de la propiedad incapacityMinimumQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncapacityMinimumQty(BigDecimal value) {
        this.incapacityMinimumQty = value;
    }

    /**
     * Obtiene el valor de la propiedad incapacityMaximumQty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncapacityMaximumQty() {
        return incapacityMaximumQty;
    }

    /**
     * Define el valor de la propiedad incapacityMaximumQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncapacityMaximumQty(BigDecimal value) {
        this.incapacityMaximumQty = value;
    }

}
