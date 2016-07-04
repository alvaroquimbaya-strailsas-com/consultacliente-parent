
package com.bnpparibas.cardif.lam.schema.riskunit.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.insuredobject.v1.InsuredObjectType;
import com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1.RiskUnitLoanType;


/**
 * <p>Clase Java para RiskUnit_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RiskUnit_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuredObject" type="{http://cardif.bnpparibas.com/lam/schema/insuredobject/v1}InsuredObject_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskUnit_Type", propOrder = {
    "insuredObject"
})
@XmlSeeAlso({
    RiskUnitLoanType.class
})
public class RiskUnitType {

    @XmlElement(name = "InsuredObject", required = true)
    protected List<InsuredObjectType> insuredObject;

    /**
     * Gets the value of the insuredObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredObjectType }
     * 
     * 
     */
    public List<InsuredObjectType> getInsuredObject() {
        if (insuredObject == null) {
            insuredObject = new ArrayList<InsuredObjectType>();
        }
        return this.insuredObject;
    }

}
