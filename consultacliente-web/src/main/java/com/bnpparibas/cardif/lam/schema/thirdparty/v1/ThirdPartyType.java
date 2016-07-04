
package com.bnpparibas.cardif.lam.schema.thirdparty.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.financialplan.paymentmode.v1.PaymentModeType;
import com.bnpparibas.cardif.lam.schema.role.v1.RoleType;
import com.bnpparibas.cardif.lam.schema.thirdparty.address.v1.AddressType;
import com.bnpparibas.cardif.lam.schema.thirdparty.thirdpartytype.v1.ThirdPartyTypeType;


/**
 * <p>Clase Java para ThirdParty_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ThirdParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thirdPartyType" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/thirdPartyType/v1}ThirdPartyType_Type" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://cardif.bnpparibas.com/lam/schema/role/v1}Role_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="address" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/address/v1}Address_Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentMode" type="{http://cardif.bnpparibas.com/lam/schema/financialplan/paymentmode/v1}PaymentMode_Type" minOccurs="0"/&gt;
 *         &lt;element name="electronicAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyNb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdParty_Type", propOrder = {
    "thirdPartyType",
    "role",
    "address",
    "paymentMode",
    "electronicAddressName",
    "phoneNb",
    "thirdPartyFullName",
    "thirdPartyNb"
})
public class ThirdPartyType {

    protected ThirdPartyTypeType thirdPartyType;
    @XmlElement(required = true)
    protected List<RoleType> role;
    protected AddressType address;
    protected PaymentModeType paymentMode;
    protected String electronicAddressName;
    protected String phoneNb;
    protected String thirdPartyFullName;
    protected String thirdPartyNb;

    /**
     * Obtiene el valor de la propiedad thirdPartyType.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyTypeType }
     *     
     */
    public ThirdPartyTypeType getThirdPartyType() {
        return thirdPartyType;
    }

    /**
     * Define el valor de la propiedad thirdPartyType.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyTypeType }
     *     
     */
    public void setThirdPartyType(ThirdPartyTypeType value) {
        this.thirdPartyType = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRole() {
        if (role == null) {
            role = new ArrayList<RoleType>();
        }
        return this.role;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentModeType }
     *     
     */
    public PaymentModeType getPaymentMode() {
        return paymentMode;
    }

    /**
     * Define el valor de la propiedad paymentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentModeType }
     *     
     */
    public void setPaymentMode(PaymentModeType value) {
        this.paymentMode = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicAddressName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicAddressName() {
        return electronicAddressName;
    }

    /**
     * Define el valor de la propiedad electronicAddressName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAddressName(String value) {
        this.electronicAddressName = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNb() {
        return phoneNb;
    }

    /**
     * Define el valor de la propiedad phoneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNb(String value) {
        this.phoneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyFullName() {
        return thirdPartyFullName;
    }

    /**
     * Define el valor de la propiedad thirdPartyFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyFullName(String value) {
        this.thirdPartyFullName = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyNb() {
        return thirdPartyNb;
    }

    /**
     * Define el valor de la propiedad thirdPartyNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyNb(String value) {
        this.thirdPartyNb = value;
    }

}
