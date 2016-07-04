
package com.bnpparibas.cardif.lam.schema.insuredobject.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.coverage.plan.v1.PlanType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationinsured.v1.ParticipationInsuredType;


/**
 * <p>Clase Java para InsuredObject_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsuredObject_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plan" type="{http://cardif.bnpparibas.com/lam/schema/coverage/plan/v1}Plan_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="participationInsured" type="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/participationInsured/v1}participationInsured_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredObject_Type", propOrder = {
    "plan",
    "participationInsured"
})
public class InsuredObjectType {

    @XmlElement(required = true)
    protected List<PlanType> plan;
    protected ParticipationInsuredType participationInsured;

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanType }
     * 
     * 
     */
    public List<PlanType> getPlan() {
        if (plan == null) {
            plan = new ArrayList<PlanType>();
        }
        return this.plan;
    }

    /**
     * Obtiene el valor de la propiedad participationInsured.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationInsuredType }
     *     
     */
    public ParticipationInsuredType getParticipationInsured() {
        return participationInsured;
    }

    /**
     * Define el valor de la propiedad participationInsured.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationInsuredType }
     *     
     */
    public void setParticipationInsured(ParticipationInsuredType value) {
        this.participationInsured = value;
    }

}
