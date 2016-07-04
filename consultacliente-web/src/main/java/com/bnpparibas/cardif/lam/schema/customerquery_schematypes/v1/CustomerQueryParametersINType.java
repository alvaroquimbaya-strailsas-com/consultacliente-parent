
package com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bnpparibas.cardif.lam.schema.common.coveragetype.v1.CoverageTypeType;
import com.bnpparibas.cardif.lam.schema.common.v1.IdentityType;
import com.bnpparibas.cardif.lam.schema.product.v1.ProductType;
import com.bnpparibas.cardif.lam.schema.role.partner.v1.PartnerType;


/**
 * <p>Clase Java para CustomerQueryParameters_INType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerQueryParameters_INType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/role/partner/v1}partner"/&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/common/v1}Identity"/&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/common/coverageType/v1}CoverageType"/&gt;
 *         &lt;element ref="{http://cardif.bnpparibas.com/lam/schema/product/v1}product"/&gt;
 *         &lt;element name="eventDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQueryParameters_INType", propOrder = {
    "partner",
    "identity",
    "coverageType",
    "product",
    "eventDate"
})
public class CustomerQueryParametersINType {

    @XmlElement(namespace = "http://cardif.bnpparibas.com/lam/schema/role/partner/v1", required = true)
    protected PartnerType partner;
    @XmlElement(name = "Identity", namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", required = true)
    protected IdentityType identity;
    @XmlElement(name = "CoverageType", namespace = "http://cardif.bnpparibas.com/lam/schema/common/coverageType/v1", required = true)
    protected CoverageTypeType coverageType;
    @XmlElement(namespace = "http://cardif.bnpparibas.com/lam/schema/product/v1", required = true)
    protected ProductType product;
    protected XMLGregorianCalendar eventDate;

    /**
     * Obtiene el valor de la propiedad partner.
     * 
     * @return
     *     possible object is
     *     {@link PartnerType }
     *     
     */
    public PartnerType getPartner() {
        return partner;
    }

    /**
     * Define el valor de la propiedad partner.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerType }
     *     
     */
    public void setPartner(PartnerType value) {
        this.partner = value;
    }

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

    /**
     * Obtiene el valor de la propiedad eventDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Define el valor de la propiedad eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

}
