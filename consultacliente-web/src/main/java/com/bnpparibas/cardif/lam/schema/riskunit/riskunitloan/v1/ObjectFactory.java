
package com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1 package. 
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

    private final static QName _RiskUnitLoan_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/RiskUnit/RiskUnitLoan/v1", "RiskUnitLoan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RiskUnitLoanType }
     * 
     */
    public RiskUnitLoanType createRiskUnitLoanType() {
        return new RiskUnitLoanType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskUnitLoanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/RiskUnit/RiskUnitLoan/v1", name = "RiskUnitLoan")
    public JAXBElement<RiskUnitLoanType> createRiskUnitLoan(RiskUnitLoanType value) {
        return new JAXBElement<RiskUnitLoanType>(_RiskUnitLoan_QNAME, RiskUnitLoanType.class, null, value);
    }

}
