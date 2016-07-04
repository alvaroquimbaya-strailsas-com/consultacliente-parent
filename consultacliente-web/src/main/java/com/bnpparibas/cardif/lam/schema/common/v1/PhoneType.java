
package com.bnpparibas.cardif.lam.schema.common.v1;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Phone_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Phone_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phoneIdentifier" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/&gt;
 *         &lt;element name="phoneType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="residential"/&gt;
 *               &lt;enumeration value="commercial"/&gt;
 *               &lt;enumeration value="office"/&gt;
 *               &lt;enumeration value="billing"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone_Type", propOrder = {
    "phoneIdentifier",
    "phoneType",
    "countryCode",
    "areaCode",
    "phoneNumber"
})
public class PhoneType {

    @XmlElementRef(name = "phoneIdentifier", namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> phoneIdentifier;
    @XmlElementRef(name = "phoneType", namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneType;
    @XmlElementRef(name = "countryCode", namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> countryCode;
    @XmlElementRef(name = "areaCode", namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> areaCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger phoneNumber;

    /**
     * Obtiene el valor de la propiedad phoneIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getPhoneIdentifier() {
        return phoneIdentifier;
    }

    /**
     * Define el valor de la propiedad phoneIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setPhoneIdentifier(JAXBElement<BigInteger> value) {
        this.phoneIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneType() {
        return phoneType;
    }

    /**
     * Define el valor de la propiedad phoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneType(JAXBElement<String> value) {
        this.phoneType = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<Long> value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad areaCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAreaCode() {
        return areaCode;
    }

    /**
     * Define el valor de la propiedad areaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAreaCode(JAXBElement<Long> value) {
        this.areaCode = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneNumber(BigInteger value) {
        this.phoneNumber = value;
    }

}
