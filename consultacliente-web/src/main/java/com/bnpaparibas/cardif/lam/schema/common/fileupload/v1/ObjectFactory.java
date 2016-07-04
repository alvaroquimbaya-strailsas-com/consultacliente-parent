
package com.bnpaparibas.cardif.lam.schema.common.fileupload.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bnpaparibas.cardif.lam.schema.common.fileupload.v1 package. 
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

    private final static QName _FileUpload_QNAME = new QName("http:cardif.bnpaparibas.com/lam/schema/common/fileUpload/v1", "fileUpload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bnpaparibas.cardif.lam.schema.common.fileupload.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileUploadType }
     * 
     */
    public FileUploadType createFileUploadType() {
        return new FileUploadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileUploadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:cardif.bnpaparibas.com/lam/schema/common/fileUpload/v1", name = "fileUpload")
    public JAXBElement<FileUploadType> createFileUpload(FileUploadType value) {
        return new JAXBElement<FileUploadType>(_FileUpload_QNAME, FileUploadType.class, null, value);
    }

}
