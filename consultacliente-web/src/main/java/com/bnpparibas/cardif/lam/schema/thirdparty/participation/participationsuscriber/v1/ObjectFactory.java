
package com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationsuscriber.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationsuscriber.v1 package. 
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

    private final static QName _ParticipationSuscriber_QNAME = new QName("http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationSuscriber/v1", "participationSuscriber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationsuscriber.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParticipationSuscriberType }
     * 
     */
    public ParticipationSuscriberType createParticipationSuscriberType() {
        return new ParticipationSuscriberType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipationSuscriberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationSuscriber/v1", name = "participationSuscriber")
    public JAXBElement<ParticipationSuscriberType> createParticipationSuscriber(ParticipationSuscriberType value) {
        return new JAXBElement<ParticipationSuscriberType>(_ParticipationSuscriber_QNAME, ParticipationSuscriberType.class, null, value);
    }

}
