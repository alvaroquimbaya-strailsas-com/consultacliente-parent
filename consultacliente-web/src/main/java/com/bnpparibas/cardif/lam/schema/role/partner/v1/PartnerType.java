
package com.bnpparibas.cardif.lam.schema.role.partner.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.role.v1.RoleType;


/**
 * <p>Clase Java para Partner_type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Partner_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cardif.bnpparibas.com/lam/schema/role/v1}Role_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partnerNb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Partner_type", propOrder = {
    "partnerNb"
})
public class PartnerType
    extends RoleType
{

    @XmlElement(required = true)
    protected String partnerNb;

    /**
     * Obtiene el valor de la propiedad partnerNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerNb() {
        return partnerNb;
    }

    /**
     * Define el valor de la propiedad partnerNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerNb(String value) {
        this.partnerNb = value;
    }

}
