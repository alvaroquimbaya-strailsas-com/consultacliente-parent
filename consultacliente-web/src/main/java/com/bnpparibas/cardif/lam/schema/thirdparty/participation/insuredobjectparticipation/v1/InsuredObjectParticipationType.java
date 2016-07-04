
package com.bnpparibas.cardif.lam.schema.thirdparty.participation.insuredobjectparticipation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationinsured.v1.ParticipationInsuredType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.v1.ParticipationType;


/**
 * <p>Clase Java para insuredObjectParticipation_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuredObjectParticipation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cardif.bnpparibas.com/lam/schema/thirdparty/participation/v1}Participation_Type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuredObjectParticipation_Type")
@XmlSeeAlso({
    ParticipationInsuredType.class
})
public class InsuredObjectParticipationType
    extends ParticipationType
{


}
