
package com.bnpparibas.cardif.lam.schema.common.policysalechanneltype.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.cardif.lam.schema.common.policysalechanneltype.v1 package. 
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

    private final static QName _PolicySaleChannelType_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/policySaleChannelType/v1", "policySaleChannelType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.cardif.lam.schema.common.policysalechanneltype.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PolicySaleChannelTypeType }
     * 
     */
    public PolicySaleChannelTypeType createPolicySaleChannelTypeType() {
        return new PolicySaleChannelTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicySaleChannelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/policySaleChannelType/v1", name = "policySaleChannelType")
    public JAXBElement<PolicySaleChannelTypeType> createPolicySaleChannelType(PolicySaleChannelTypeType value) {
        return new JAXBElement<PolicySaleChannelTypeType>(_PolicySaleChannelType_QNAME, PolicySaleChannelTypeType.class, null, value);
    }

}
