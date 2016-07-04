
package com.bnpparibas.cardif.lam.schema.thirdparty.participation.policyparticipation.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationbroker.v1.ParticipationbrokerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationpartner.v1.ParticipationPartnerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationpremiumpayer.v1.ParticipationPremiumPayerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationseller.v1.ParticipationSellerType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationsuscriber.v1.ParticipationSuscriberType;
import com.bnpparibas.cardif.lam.schema.thirdparty.participation.v1.ParticipationType;


/**
 * <p>Clase Java para policyParticipation_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="policyParticipation_Type"&gt;
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
@XmlType(name = "policyParticipation_Type")
@XmlSeeAlso({
    ParticipationbrokerType.class,
    ParticipationSellerType.class,
    ParticipationPartnerType.class,
    ParticipationSuscriberType.class,
    ParticipationPremiumPayerType.class
})
public class PolicyParticipationType
    extends ParticipationType
{


}
