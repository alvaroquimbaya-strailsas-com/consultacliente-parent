
package com.bnpparibas.cardif.lam.schema.common.roletype.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.cardif.lam.schema.common.roletype.v1 package. 
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

    private final static QName _RoleType_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/common/roleType/v1", "RoleType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.cardif.lam.schema.common.roletype.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoleTypeType }
     * 
     */
    public RoleTypeType createRoleTypeType() {
        return new RoleTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/common/roleType/v1", name = "RoleType")
    public JAXBElement<RoleTypeType> createRoleType(RoleTypeType value) {
        return new JAXBElement<RoleTypeType>(_RoleType_QNAME, RoleTypeType.class, null, value);
    }

}
