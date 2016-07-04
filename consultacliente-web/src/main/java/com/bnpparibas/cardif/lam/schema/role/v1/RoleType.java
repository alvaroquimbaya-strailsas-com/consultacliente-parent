
package com.bnpparibas.cardif.lam.schema.role.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.common.roletype.v1.RoleTypeType;
import com.bnpparibas.cardif.lam.schema.role.partner.v1.PartnerType;


/**
 * <p>Clase Java para Role_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Role_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleType" type="{http://cardif.bnpparibas.com/lam/schema/common/roleType/v1}RoleType_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role_Type", propOrder = {
    "roleType"
})
@XmlSeeAlso({
    PartnerType.class
})
public class RoleType {

    @XmlElement(required = true)
    protected RoleTypeType roleType;

    /**
     * Obtiene el valor de la propiedad roleType.
     * 
     * @return
     *     possible object is
     *     {@link RoleTypeType }
     *     
     */
    public RoleTypeType getRoleType() {
        return roleType;
    }

    /**
     * Define el valor de la propiedad roleType.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleTypeType }
     *     
     */
    public void setRoleType(RoleTypeType value) {
        this.roleType = value;
    }

}
