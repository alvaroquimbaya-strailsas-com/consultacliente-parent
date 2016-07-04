
package com.bnpparibas.cardif.lam.schema.policy.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bnpaparibas.cardif.lam.schema.common.fileupload.v1.FileUploadType;
import com.bnpparibas.cardif.lam.schema.common.planoption.v1.PlanOptionType;
import com.bnpparibas.cardif.lam.schema.common.policysalechanneltype.v1.PolicySaleChannelTypeType;
import com.bnpparibas.cardif.lam.schema.common.policystate.v1.PolicyStateType;
import com.bnpparibas.cardif.lam.schema.common.premiumperiodicity.v1.PremiumPeriodicityType;
import com.bnpparibas.cardif.lam.schema.financialmovement.paymentcomponent.v1.PaymentComponentType;
import com.bnpparibas.cardif.lam.schema.product.v1.ProductType;
import com.bnpparibas.cardif.lam.schema.riskunit.v1.RiskUnitType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationbroker.v1.ParticipationbrokerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationpartner.v1.ParticipationPartnerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationpremiumpayer.v1.ParticipationPremiumPayerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationseller.v1.ParticipationSellerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationsuscriber.v1.ParticipationSuscriberType;


/**
 * <p>Clase Java para Policy_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Policy_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product" type="{http://cardif.bnpparibas.com/lam/schema/product/v1}Product_Type" minOccurs="0"/&gt;
 *         &lt;element name="policyPartnerProdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="policyStartDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="policyEndDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="policySubscriptionDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="policyDurationDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planOption" type="{http://cardif.bnpparibas.com/lam/schema/common/planOption/v1}PlanOption_Type" minOccurs="0"/&gt;
 *         &lt;element name="policyState" type="{http://cardif.bnpparibas.com/lam/schema/common/policyState/v1}PolicyState_Type" minOccurs="0"/&gt;
 *         &lt;element name="premiumPeriodicity" type="{http://cardif.bnpparibas.com/lam/schema/common/premiumPeriodicity/v1}PremiumPeriodicity_Type" minOccurs="0"/&gt;
 *         &lt;element name="riskUnit" type="{http://cardif.bnpparibas.com/lam/schema/riskunit/v1}RiskUnit_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="policySaleChannelType" type="{http://cardif.bnpparibas.com/lam/schema/common/policySaleChannelType/v1}policySaleChannelType_Type" minOccurs="0"/&gt;
 *         &lt;element name="policySellerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyCashierDeskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyPartnerShopName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyPartnerShopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerParticipations" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationPartner/v1}participationPartner_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="premiumPayerParticipations" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationPremiumPayer/v1}participationPremiumPayer_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="brokerParticipations" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationBroker/v1}participationbroker_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="sellerParticipations" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationSeller/v1}participationSeller_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="subscriberParticipations" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationSuscriber/v1}participationSuscriber_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentComponent" type="{http://cardif.bnpparibas.com/lam/schema/financialmovement/paymentComponent/v1}PaymentComponent_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ipc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileUpload" type="{http:cardif.bnpaparibas.com/lam/schema/common/fileUpload/v1}FileUpload_Type" minOccurs="0"/&gt;
 *         &lt;element name="efectiveBills" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="condicionalPolicyVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoverageDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FirstBillsDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="referenceReversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastBillsDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reverseBills" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="sentReversionDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="confirmReversionDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="monthsPastDue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="stateDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Policy_Type", propOrder = {
    "product",
    "policyPartnerProdCode",
    "policyNumber",
    "policyStartDate",
    "policyEndDate",
    "policySubscriptionDate",
    "policyDurationDays",
    "planOption",
    "policyState",
    "premiumPeriodicity",
    "riskUnit",
    "policySaleChannelType",
    "policySellerName",
    "policyCashierDeskCode",
    "policyPartnerShopName",
    "policyPartnerShopCode",
    "partnerParticipations",
    "premiumPayerParticipations",
    "brokerParticipations",
    "sellerParticipations",
    "subscriberParticipations",
    "source",
    "paymentComponent",
    "ipc",
    "fileUpload",
    "efectiveBills",
    "condicionalPolicyVersion",
    "coverageDate",
    "firstBillsDate",
    "referenceReversion",
    "lastBillsDate",
    "reverseBills",
    "sentReversionDate",
    "confirmReversionDate",
    "monthsPastDue",
    "stateDue"
})
public class PolicyType {

    protected ProductType product;
    protected String policyPartnerProdCode;
    protected String policyNumber;
    protected XMLGregorianCalendar policyStartDate;
    protected XMLGregorianCalendar policyEndDate;
    protected XMLGregorianCalendar policySubscriptionDate;
    protected BigDecimal policyDurationDays;
    protected PlanOptionType planOption;
    protected PolicyStateType policyState;
    protected PremiumPeriodicityType premiumPeriodicity;
    @XmlElement(required = true)
    protected List<RiskUnitType> riskUnit;
    protected PolicySaleChannelTypeType policySaleChannelType;
    protected String policySellerName;
    protected String policyCashierDeskCode;
    protected String policyPartnerShopName;
    protected String policyPartnerShopCode;
    @XmlElement(required = true)
    protected List<ParticipationPartnerType> partnerParticipations;
    @XmlElement(required = true)
    protected List<ParticipationPremiumPayerType> premiumPayerParticipations;
    @XmlElement(required = true)
    protected List<ParticipationbrokerType> brokerParticipations;
    @XmlElement(required = true)
    protected List<ParticipationSellerType> sellerParticipations;
    @XmlElement(required = true)
    protected List<ParticipationSuscriberType> subscriberParticipations;
    protected String source;
    @XmlElement(required = true)
    protected List<PaymentComponentType> paymentComponent;
    protected String ipc;
    protected FileUploadType fileUpload;
    protected BigInteger efectiveBills;
    protected String condicionalPolicyVersion;
    @XmlElement(name = "CoverageDate")
    protected XMLGregorianCalendar coverageDate;
    @XmlElement(name = "FirstBillsDate")
    protected XMLGregorianCalendar firstBillsDate;
    protected String referenceReversion;
    @XmlElement(name = "LastBillsDate")
    protected XMLGregorianCalendar lastBillsDate;
    protected BigInteger reverseBills;
    protected XMLGregorianCalendar sentReversionDate;
    protected XMLGregorianCalendar confirmReversionDate;
    protected BigDecimal monthsPastDue;
    protected String stateDue;

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
     * Obtiene el valor de la propiedad policyPartnerProdCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyPartnerProdCode() {
        return policyPartnerProdCode;
    }

    /**
     * Define el valor de la propiedad policyPartnerProdCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyPartnerProdCode(String value) {
        this.policyPartnerProdCode = value;
    }

    /**
     * Obtiene el valor de la propiedad policyNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Define el valor de la propiedad policyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad policyStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyStartDate() {
        return policyStartDate;
    }

    /**
     * Define el valor de la propiedad policyStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyStartDate(XMLGregorianCalendar value) {
        this.policyStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad policyEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyEndDate() {
        return policyEndDate;
    }

    /**
     * Define el valor de la propiedad policyEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyEndDate(XMLGregorianCalendar value) {
        this.policyEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad policySubscriptionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicySubscriptionDate() {
        return policySubscriptionDate;
    }

    /**
     * Define el valor de la propiedad policySubscriptionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicySubscriptionDate(XMLGregorianCalendar value) {
        this.policySubscriptionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad policyDurationDays.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyDurationDays() {
        return policyDurationDays;
    }

    /**
     * Define el valor de la propiedad policyDurationDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyDurationDays(BigDecimal value) {
        this.policyDurationDays = value;
    }

    /**
     * Obtiene el valor de la propiedad planOption.
     * 
     * @return
     *     possible object is
     *     {@link PlanOptionType }
     *     
     */
    public PlanOptionType getPlanOption() {
        return planOption;
    }

    /**
     * Define el valor de la propiedad planOption.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanOptionType }
     *     
     */
    public void setPlanOption(PlanOptionType value) {
        this.planOption = value;
    }

    /**
     * Obtiene el valor de la propiedad policyState.
     * 
     * @return
     *     possible object is
     *     {@link PolicyStateType }
     *     
     */
    public PolicyStateType getPolicyState() {
        return policyState;
    }

    /**
     * Define el valor de la propiedad policyState.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyStateType }
     *     
     */
    public void setPolicyState(PolicyStateType value) {
        this.policyState = value;
    }

    /**
     * Obtiene el valor de la propiedad premiumPeriodicity.
     * 
     * @return
     *     possible object is
     *     {@link PremiumPeriodicityType }
     *     
     */
    public PremiumPeriodicityType getPremiumPeriodicity() {
        return premiumPeriodicity;
    }

    /**
     * Define el valor de la propiedad premiumPeriodicity.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumPeriodicityType }
     *     
     */
    public void setPremiumPeriodicity(PremiumPeriodicityType value) {
        this.premiumPeriodicity = value;
    }

    /**
     * Gets the value of the riskUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskUnitType }
     * 
     * 
     */
    public List<RiskUnitType> getRiskUnit() {
        if (riskUnit == null) {
            riskUnit = new ArrayList<RiskUnitType>();
        }
        return this.riskUnit;
    }

    /**
     * Obtiene el valor de la propiedad policySaleChannelType.
     * 
     * @return
     *     possible object is
     *     {@link PolicySaleChannelTypeType }
     *     
     */
    public PolicySaleChannelTypeType getPolicySaleChannelType() {
        return policySaleChannelType;
    }

    /**
     * Define el valor de la propiedad policySaleChannelType.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySaleChannelTypeType }
     *     
     */
    public void setPolicySaleChannelType(PolicySaleChannelTypeType value) {
        this.policySaleChannelType = value;
    }

    /**
     * Obtiene el valor de la propiedad policySellerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySellerName() {
        return policySellerName;
    }

    /**
     * Define el valor de la propiedad policySellerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySellerName(String value) {
        this.policySellerName = value;
    }

    /**
     * Obtiene el valor de la propiedad policyCashierDeskCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCashierDeskCode() {
        return policyCashierDeskCode;
    }

    /**
     * Define el valor de la propiedad policyCashierDeskCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCashierDeskCode(String value) {
        this.policyCashierDeskCode = value;
    }

    /**
     * Obtiene el valor de la propiedad policyPartnerShopName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyPartnerShopName() {
        return policyPartnerShopName;
    }

    /**
     * Define el valor de la propiedad policyPartnerShopName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyPartnerShopName(String value) {
        this.policyPartnerShopName = value;
    }

    /**
     * Obtiene el valor de la propiedad policyPartnerShopCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyPartnerShopCode() {
        return policyPartnerShopCode;
    }

    /**
     * Define el valor de la propiedad policyPartnerShopCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyPartnerShopCode(String value) {
        this.policyPartnerShopCode = value;
    }

    /**
     * Gets the value of the partnerParticipations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerParticipations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerParticipations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipationPartnerType }
     * 
     * 
     */
    public List<ParticipationPartnerType> getPartnerParticipations() {
        if (partnerParticipations == null) {
            partnerParticipations = new ArrayList<ParticipationPartnerType>();
        }
        return this.partnerParticipations;
    }

    /**
     * Gets the value of the premiumPayerParticipations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumPayerParticipations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumPayerParticipations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipationPremiumPayerType }
     * 
     * 
     */
    public List<ParticipationPremiumPayerType> getPremiumPayerParticipations() {
        if (premiumPayerParticipations == null) {
            premiumPayerParticipations = new ArrayList<ParticipationPremiumPayerType>();
        }
        return this.premiumPayerParticipations;
    }

    /**
     * Gets the value of the brokerParticipations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerParticipations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerParticipations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipationbrokerType }
     * 
     * 
     */
    public List<ParticipationbrokerType> getBrokerParticipations() {
        if (brokerParticipations == null) {
            brokerParticipations = new ArrayList<ParticipationbrokerType>();
        }
        return this.brokerParticipations;
    }

    /**
     * Gets the value of the sellerParticipations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerParticipations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerParticipations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipationSellerType }
     * 
     * 
     */
    public List<ParticipationSellerType> getSellerParticipations() {
        if (sellerParticipations == null) {
            sellerParticipations = new ArrayList<ParticipationSellerType>();
        }
        return this.sellerParticipations;
    }

    /**
     * Gets the value of the subscriberParticipations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberParticipations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberParticipations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipationSuscriberType }
     * 
     * 
     */
    public List<ParticipationSuscriberType> getSubscriberParticipations() {
        if (subscriberParticipations == null) {
            subscriberParticipations = new ArrayList<ParticipationSuscriberType>();
        }
        return this.subscriberParticipations;
    }

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the paymentComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentComponentType }
     * 
     * 
     */
    public List<PaymentComponentType> getPaymentComponent() {
        if (paymentComponent == null) {
            paymentComponent = new ArrayList<PaymentComponentType>();
        }
        return this.paymentComponent;
    }

    /**
     * Obtiene el valor de la propiedad ipc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpc() {
        return ipc;
    }

    /**
     * Define el valor de la propiedad ipc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpc(String value) {
        this.ipc = value;
    }

    /**
     * Obtiene el valor de la propiedad fileUpload.
     * 
     * @return
     *     possible object is
     *     {@link FileUploadType }
     *     
     */
    public FileUploadType getFileUpload() {
        return fileUpload;
    }

    /**
     * Define el valor de la propiedad fileUpload.
     * 
     * @param value
     *     allowed object is
     *     {@link FileUploadType }
     *     
     */
    public void setFileUpload(FileUploadType value) {
        this.fileUpload = value;
    }

    /**
     * Obtiene el valor de la propiedad efectiveBills.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEfectiveBills() {
        return efectiveBills;
    }

    /**
     * Define el valor de la propiedad efectiveBills.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEfectiveBills(BigInteger value) {
        this.efectiveBills = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionalPolicyVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionalPolicyVersion() {
        return condicionalPolicyVersion;
    }

    /**
     * Define el valor de la propiedad condicionalPolicyVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionalPolicyVersion(String value) {
        this.condicionalPolicyVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad coverageDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverageDate() {
        return coverageDate;
    }

    /**
     * Define el valor de la propiedad coverageDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverageDate(XMLGregorianCalendar value) {
        this.coverageDate = value;
    }

    /**
     * Obtiene el valor de la propiedad firstBillsDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstBillsDate() {
        return firstBillsDate;
    }

    /**
     * Define el valor de la propiedad firstBillsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstBillsDate(XMLGregorianCalendar value) {
        this.firstBillsDate = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceReversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceReversion() {
        return referenceReversion;
    }

    /**
     * Define el valor de la propiedad referenceReversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceReversion(String value) {
        this.referenceReversion = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBillsDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBillsDate() {
        return lastBillsDate;
    }

    /**
     * Define el valor de la propiedad lastBillsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBillsDate(XMLGregorianCalendar value) {
        this.lastBillsDate = value;
    }

    /**
     * Obtiene el valor de la propiedad reverseBills.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReverseBills() {
        return reverseBills;
    }

    /**
     * Define el valor de la propiedad reverseBills.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReverseBills(BigInteger value) {
        this.reverseBills = value;
    }

    /**
     * Obtiene el valor de la propiedad sentReversionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentReversionDate() {
        return sentReversionDate;
    }

    /**
     * Define el valor de la propiedad sentReversionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentReversionDate(XMLGregorianCalendar value) {
        this.sentReversionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmReversionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmReversionDate() {
        return confirmReversionDate;
    }

    /**
     * Define el valor de la propiedad confirmReversionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmReversionDate(XMLGregorianCalendar value) {
        this.confirmReversionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad monthsPastDue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthsPastDue() {
        return monthsPastDue;
    }

    /**
     * Define el valor de la propiedad monthsPastDue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthsPastDue(BigDecimal value) {
        this.monthsPastDue = value;
    }

    /**
     * Obtiene el valor de la propiedad stateDue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDue() {
        return stateDue;
    }

    /**
     * Define el valor de la propiedad stateDue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDue(String value) {
        this.stateDue = value;
    }

}
