
package com.bnpparibas.cardif.lam.schema.common.v1;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.cardif.lam.schema.common.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Email_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "Email");
    private final static QName _Identity_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "Identity");
    private final static QName _BankReference_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "BankReference");
    private final static QName _Currency_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "Currency");
    private final static QName _Phone_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "Phone");
    private final static QName _City_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "City");
    private final static QName _State_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "State");
    private final static QName _District_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "District");
    private final static QName _Country_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "Country");
    private final static QName _PhoneTypePhoneIdentifier_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "phoneIdentifier");
    private final static QName _PhoneTypePhoneType_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "phoneType");
    private final static QName _PhoneTypeCountryCode_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "countryCode");
    private final static QName _PhoneTypeAreaCode_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "areaCode");
    private final static QName _EmailTypeEmailIdentifier_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "emailIdentifier");
    private final static QName _EmailTypeEmailType_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/v1", "emailType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.cardif.lam.schema.common.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    /**
     * Create an instance of {@link BankReferenceType }
     * 
     */
    public BankReferenceType createBankReferenceType() {
        return new BankReferenceType();
    }

    /**
     * Create an instance of {@link CurrencyType }
     * 
     */
    public CurrencyType createCurrencyType() {
        return new CurrencyType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link IdNameType }
     * 
     */
    public IdNameType createIdNameType() {
        return new IdNameType();
    }

    /**
     * Create an instance of {@link Properties.Property }
     * 
     */
    public Properties.Property createPropertiesProperty() {
        return new Properties.Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "Email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "Identity")
    public JAXBElement<IdentityType> createIdentity(IdentityType value) {
        return new JAXBElement<IdentityType>(_Identity_QNAME, IdentityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "BankReference")
    public JAXBElement<BankReferenceType> createBankReference(BankReferenceType value) {
        return new JAXBElement<BankReferenceType>(_BankReference_QNAME, BankReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "Currency")
    public JAXBElement<CurrencyType> createCurrency(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_Currency_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "Phone")
    public JAXBElement<PhoneType> createPhone(PhoneType value) {
        return new JAXBElement<PhoneType>(_Phone_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "City")
    public JAXBElement<IdNameType> createCity(IdNameType value) {
        return new JAXBElement<IdNameType>(_City_QNAME, IdNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "State")
    public JAXBElement<IdNameType> createState(IdNameType value) {
        return new JAXBElement<IdNameType>(_State_QNAME, IdNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "District")
    public JAXBElement<IdNameType> createDistrict(IdNameType value) {
        return new JAXBElement<IdNameType>(_District_QNAME, IdNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "Country")
    public JAXBElement<IdNameType> createCountry(IdNameType value) {
        return new JAXBElement<IdNameType>(_Country_QNAME, IdNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "phoneIdentifier", scope = PhoneType.class)
    public JAXBElement<BigInteger> createPhoneTypePhoneIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_PhoneTypePhoneIdentifier_QNAME, BigInteger.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "phoneType", scope = PhoneType.class)
    public JAXBElement<String> createPhoneTypePhoneType(String value) {
        return new JAXBElement<String>(_PhoneTypePhoneType_QNAME, String.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "countryCode", scope = PhoneType.class)
    public JAXBElement<Long> createPhoneTypeCountryCode(Long value) {
        return new JAXBElement<Long>(_PhoneTypeCountryCode_QNAME, Long.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "areaCode", scope = PhoneType.class)
    public JAXBElement<Long> createPhoneTypeAreaCode(Long value) {
        return new JAXBElement<Long>(_PhoneTypeAreaCode_QNAME, Long.class, PhoneType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "emailIdentifier", scope = EmailType.class)
    public JAXBElement<BigInteger> createEmailTypeEmailIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_EmailTypeEmailIdentifier_QNAME, BigInteger.class, EmailType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/v1", name = "emailType", scope = EmailType.class)
    public JAXBElement<String> createEmailTypeEmailType(String value) {
        return new JAXBElement<String>(_EmailTypeEmailType_QNAME, String.class, EmailType.class, value);
    }

}
