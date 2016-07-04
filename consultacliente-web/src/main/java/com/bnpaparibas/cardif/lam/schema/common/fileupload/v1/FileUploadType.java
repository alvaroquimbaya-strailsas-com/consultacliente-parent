
package com.bnpaparibas.cardif.lam.schema.common.fileupload.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileUpload_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileUpload_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUpload" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="fileUploadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileUpload_Type", propOrder = {
    "idUpload",
    "fileUploadName"
})
public class FileUploadType {

    protected BigInteger idUpload;
    protected String fileUploadName;

    /**
     * Obtiene el valor de la propiedad idUpload.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdUpload() {
        return idUpload;
    }

    /**
     * Define el valor de la propiedad idUpload.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdUpload(BigInteger value) {
        this.idUpload = value;
    }

    /**
     * Obtiene el valor de la propiedad fileUploadName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUploadName() {
        return fileUploadName;
    }

    /**
     * Define el valor de la propiedad fileUploadName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUploadName(String value) {
        this.fileUploadName = value;
    }

}
