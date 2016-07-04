
package com.bnpparibas.assurance.ea.internal.schema.lam.common.exception.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.assurance.ea.internal.schema.lam.common.exception.v1 package. 
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

    private final static QName _TechFault_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/schema/lam/common/exception/v1", "TechFault");
    private final static QName _FuncFault_QNAME = new QName("http://ea.assurance.bnpparibas.com/internal/schema/lam/common/exception/v1", "FuncFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.assurance.ea.internal.schema.lam.common.exception.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorMessageType }
     * 
     */
    public ErrorMessageType createErrorMessageType() {
        return new ErrorMessageType();
    }

    /**
     * Create an instance of {@link ErrorMessageType.Params }
     * 
     */
    public ErrorMessageType.Params createErrorMessageTypeParams() {
        return new ErrorMessageType.Params();
    }

    /**
     * Create an instance of {@link TechnicalBaseFaultType }
     * 
     */
    public TechnicalBaseFaultType createTechnicalBaseFaultType() {
        return new TechnicalBaseFaultType();
    }

    /**
     * Create an instance of {@link FunctionalBaseFaultType }
     * 
     */
    public FunctionalBaseFaultType createFunctionalBaseFaultType() {
        return new FunctionalBaseFaultType();
    }

    /**
     * Create an instance of {@link ErrorMessageType.Reasons }
     * 
     */
    public ErrorMessageType.Reasons createErrorMessageTypeReasons() {
        return new ErrorMessageType.Reasons();
    }

    /**
     * Create an instance of {@link ErrorMessageType.Params.Param }
     * 
     */
    public ErrorMessageType.Params.Param createErrorMessageTypeParamsParam() {
        return new ErrorMessageType.Params.Param();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalBaseFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/schema/lam/common/exception/v1", name = "TechFault")
    public JAXBElement<TechnicalBaseFaultType> createTechFault(TechnicalBaseFaultType value) {
        return new JAXBElement<TechnicalBaseFaultType>(_TechFault_QNAME, TechnicalBaseFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionalBaseFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ea.assurance.bnpparibas.com/internal/schema/lam/common/exception/v1", name = "FuncFault")
    public JAXBElement<FunctionalBaseFaultType> createFuncFault(FunctionalBaseFaultType value) {
        return new JAXBElement<FunctionalBaseFaultType>(_FuncFault_QNAME, FunctionalBaseFaultType.class, null, value);
    }

}
