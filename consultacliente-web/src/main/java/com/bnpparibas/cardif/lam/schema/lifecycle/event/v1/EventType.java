
package com.bnpparibas.cardif.lam.schema.lifecycle.event.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.lifecycle.event.eventparameter.v1.EventParameterType;


/**
 * <p>Clase Java para Event_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Event_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventParameter" type="{http://cardif.bnpparibas.com/lam/schema/lifecycle/event/eventParameter/v1}eventParameter_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event_Type", propOrder = {
    "eventParameter"
})
public class EventType {

    @XmlElement(name = "EventParameter")
    protected EventParameterType eventParameter;

    /**
     * Obtiene el valor de la propiedad eventParameter.
     * 
     * @return
     *     possible object is
     *     {@link EventParameterType }
     *     
     */
    public EventParameterType getEventParameter() {
        return eventParameter;
    }

    /**
     * Define el valor de la propiedad eventParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link EventParameterType }
     *     
     */
    public void setEventParameter(EventParameterType value) {
        this.eventParameter = value;
    }

}
