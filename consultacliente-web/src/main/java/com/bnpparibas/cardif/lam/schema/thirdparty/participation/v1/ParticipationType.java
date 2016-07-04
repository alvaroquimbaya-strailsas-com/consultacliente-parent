
package com.bnpparibas.cardif.lam.schema.thirdparty.participation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.common.roletype.v1.RoleTypeType;
import com.bnpparibas.cardif.lam.schema.financialplan.paymentmode.v1.PaymentModeType;
import com.bnpparibas.cardif.lam.schema.thirdparty.address.v1.AddressType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.insuredobjectparticipation.v1.InsuredObjectParticipationType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.policyparticipation.v1.PolicyParticipationType;
import com.bnpparibas.cardif.lam.schema.thirdparty.v1.ThirdPartyType;


/**
 * <p>Clase Java para Participation_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Participation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thirdParty" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/v1}ThirdParty_Type" minOccurs="0"/&gt;
 *         &lt;element name="roleType" type="{http://cardif.bnpparibas.com/lam/schema/common/roleType/v1}RoleType_Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentMode" type="{http://cardif.bnpparibas.com/lam/schema/financialplan/paymentmode/v1}PaymentMode_Type" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/address/v1}Address_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participation_Type", propOrder = {
    "thirdParty",
    "roleType",
    "paymentMode",
    "address"
})
@XmlSeeAlso({
    InsuredObjectParticipationType.class,
    PolicyParticipationType.class
})
public class ParticipationType {

    protected ThirdPartyType thirdParty;
    protected RoleTypeType roleType;
    protected PaymentModeType paymentMode;
    protected AddressType address;

    /**
     * Obtiene el valor de la propiedad thirdParty.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyType }
     *     
     */
    public ThirdPartyType getThirdParty() {
        return thirdParty;
    }

    /**
     * Define el valor de la propiedad thirdParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyType }
     *     
     */
    public void setThirdParty(ThirdPartyType value) {
        this.thirdParty = value;
    }

    /**
     * Obtiene el valor de la propiedad roleType.
     * 
     * @return
     *     possible object is
     *     {@link RoleTypeType }
     *     
     */
    public RoleTypeType getRoleType() {
        return roleType;
    }

    /**
     * Define el valor de la propiedad roleType.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleTypeType }
     *     
     */
    public void setRoleType(RoleTypeType value) {
        this.roleType = value;
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

}
