
package com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.bnpparibas.assurance.ea.internal.schema.lam.common.exception.v1.FunctionalBaseFaultType;
import com.bnpparibas.assurance.ea.internal.schema.lam.common.exception.v1.TechnicalBaseFaultType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByLoanNbINType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByLoanNbOUTType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPersonAndPrdCardifINType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPersonAndPrdCardifOUTType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPolicyNbINType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPolicyNbOUTType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryParametersINType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryParametersOUTType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1 package. 
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

    private final static QName _CustomerQueryByLoanNbIN_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryByLoanNb_IN");
    private final static QName _CustomerQueryByLoanNbOUT_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryByLoanNb_OUT");
    private final static QName _CustomerQueryByPolicyNbIN_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryByPolicyNb_IN");
    private final static QName _CustomerQueryByPolicyNbOUT_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryByPolicyNb_OUT");
    private final static QName _CustomerQueryByPersonAndPrdCardifIN_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryByPersonAndPrdCardif_IN");
    private final static QName _CustomerQueryByPersonAndPrdCardifOUT_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryByPersonAndPrdCardif_OUT");
    private final static QName _CustomerQueryParametersIN_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryParameters_IN");
    private final static QName _CustomerQueryParametersOUT_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "CustomerQueryParameters_OUT");
    private final static QName _TechFault_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "TechFault");
    private final static QName _FuncFault_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", "FuncFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryByLoanNbINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryByLoanNb_IN")
    public JAXBElement<CustomerQueryByLoanNbINType> createCustomerQueryByLoanNbIN(CustomerQueryByLoanNbINType value) {
        return new JAXBElement<CustomerQueryByLoanNbINType>(_CustomerQueryByLoanNbIN_QNAME, CustomerQueryByLoanNbINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryByLoanNbOUTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryByLoanNb_OUT")
    public JAXBElement<CustomerQueryByLoanNbOUTType> createCustomerQueryByLoanNbOUT(CustomerQueryByLoanNbOUTType value) {
        return new JAXBElement<CustomerQueryByLoanNbOUTType>(_CustomerQueryByLoanNbOUT_QNAME, CustomerQueryByLoanNbOUTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryByPolicyNbINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryByPolicyNb_IN")
    public JAXBElement<CustomerQueryByPolicyNbINType> createCustomerQueryByPolicyNbIN(CustomerQueryByPolicyNbINType value) {
        return new JAXBElement<CustomerQueryByPolicyNbINType>(_CustomerQueryByPolicyNbIN_QNAME, CustomerQueryByPolicyNbINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryByPolicyNbOUTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryByPolicyNb_OUT")
    public JAXBElement<CustomerQueryByPolicyNbOUTType> createCustomerQueryByPolicyNbOUT(CustomerQueryByPolicyNbOUTType value) {
        return new JAXBElement<CustomerQueryByPolicyNbOUTType>(_CustomerQueryByPolicyNbOUT_QNAME, CustomerQueryByPolicyNbOUTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryByPersonAndPrdCardifINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryByPersonAndPrdCardif_IN")
    public JAXBElement<CustomerQueryByPersonAndPrdCardifINType> createCustomerQueryByPersonAndPrdCardifIN(CustomerQueryByPersonAndPrdCardifINType value) {
        return new JAXBElement<CustomerQueryByPersonAndPrdCardifINType>(_CustomerQueryByPersonAndPrdCardifIN_QNAME, CustomerQueryByPersonAndPrdCardifINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryByPersonAndPrdCardifOUTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryByPersonAndPrdCardif_OUT")
    public JAXBElement<CustomerQueryByPersonAndPrdCardifOUTType> createCustomerQueryByPersonAndPrdCardifOUT(CustomerQueryByPersonAndPrdCardifOUTType value) {
        return new JAXBElement<CustomerQueryByPersonAndPrdCardifOUTType>(_CustomerQueryByPersonAndPrdCardifOUT_QNAME, CustomerQueryByPersonAndPrdCardifOUTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryParametersINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryParameters_IN")
    public JAXBElement<CustomerQueryParametersINType> createCustomerQueryParametersIN(CustomerQueryParametersINType value) {
        return new JAXBElement<CustomerQueryParametersINType>(_CustomerQueryParametersIN_QNAME, CustomerQueryParametersINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerQueryParametersOUTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryParameters_OUT")
    public JAXBElement<CustomerQueryParametersOUTType> createCustomerQueryParametersOUT(CustomerQueryParametersOUTType value) {
        return new JAXBElement<CustomerQueryParametersOUTType>(_CustomerQueryParametersOUT_QNAME, CustomerQueryParametersOUTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalBaseFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "TechFault")
    public JAXBElement<TechnicalBaseFaultType> createTechFault(TechnicalBaseFaultType value) {
        return new JAXBElement<TechnicalBaseFaultType>(_TechFault_QNAME, TechnicalBaseFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionalBaseFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "FuncFault")
    public JAXBElement<FunctionalBaseFaultType> createFuncFault(FunctionalBaseFaultType value) {
        return new JAXBElement<FunctionalBaseFaultType>(_FuncFault_QNAME, FunctionalBaseFaultType.class, null, value);
    }

}
