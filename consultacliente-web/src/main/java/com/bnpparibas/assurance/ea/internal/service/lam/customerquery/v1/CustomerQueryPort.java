package com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-01T10:31:43.941-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", name = "CustomerQueryPort")
@XmlSeeAlso({com.bnpparibas.cardif.lam.schema.lifecycle.event.eventparameter.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationpremiumpayer.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationpartner.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.insuredobjectparticipation.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.riskunit.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationseller.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.product.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.coverage.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.role.partner.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.address.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.policyparticipation.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationsuscriber.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.roletype.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.policystate.v1.ObjectFactory.class, com.bnpparibas.assurance.ea.internal.schema.lam.common.exception.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.policy.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationinsured.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.coverage.plan.v1.ObjectFactory.class, com.bnpparibas.assurance.ea.internal.schema.ref.header.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.lifecycle.event.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.financialmovement.paymentcomponent.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.policysalechanneltype.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.participationbroker.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.role.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.coveragetype.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.insuredobject.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.financialplan.paymentmode.v1.ObjectFactory.class, ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.premiumperiodicity.v1.ObjectFactory.class, com.bnpaparibas.cardif.lam.schema.common.fileupload.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.thirdpartytype.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.common.planoption.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.thirdparty.participation.v1.ObjectFactory.class, com.bnpparibas.cardif.lam.schema.riskunit.riskunitloan.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerQueryPort {

    @WebResult(name = "CustomerQueryByPersonAndPrdCardif_OUT", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", partName = "customerQueryByPersonAndPrdCardifOutput")
    @WebMethod(action = "http://ea.assurance.bnpparibas.com/internal/service/lam/paymentintegration/v1/customerQueryByPersonAndPrdCardif")
    public com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPersonAndPrdCardifOUTType customerQueryByPersonAndPrdCardif(
        @WebParam(partName = "customerQueryByPersonAndPrdCardifInput", name = "CustomerQueryByPersonAndPrdCardif_IN", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1")
        com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPersonAndPrdCardifINType customerQueryByPersonAndPrdCardifInput
    ) throws FuncFaultMessage, TechFaultMessage;

    @WebResult(name = "CustomerQueryByLoanNb_OUT", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", partName = "customerQueryByLoanNbOutput")
    @WebMethod(action = "http://ea.assurance.bnpparibas.com/internal/service/lam/paymentintegration/v1/customerQueryByLoanNb")
    public com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByLoanNbOUTType customerQueryByLoanNb(
        @WebParam(partName = "customerQueryByLoanNbInput", name = "CustomerQueryByLoanNb_IN", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1")
        com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByLoanNbINType customerQueryByLoanNbInput
    ) throws FuncFaultMessage, TechFaultMessage;

    @WebResult(name = "CustomerQueryByPolicyNb_OUT", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", partName = "customerQueryByPolicyNbOutput")
    @WebMethod(action = "http://ea.assurance.bnpparibas.com/internal/service/lam/paymentintegration/v1/customerQueryByPolicyNb")
    public com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPolicyNbOUTType customerQueryByPolicyNb(
        @WebParam(partName = "customerQueryByPolicyNbInput", name = "CustomerQueryByPolicyNb_IN", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1")
        com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPolicyNbINType customerQueryByPolicyNbInput
    ) throws FuncFaultMessage, TechFaultMessage;

    @WebResult(name = "CustomerQueryParameters_OUT", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", partName = "CustomerQueryParametersOutput")
    @WebMethod(action = "http://ea.assurance.bnpparibas.com/internal/service/lam/paymentintegration/v1/customerQueryParameters")
    public com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryParametersOUTType customerQueryParameters(
        @WebParam(partName = "CustomerQueryParametersInput", name = "CustomerQueryParameters_IN", targetNamespace = "http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1")
        com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryParametersINType customerQueryParametersInput
    ) throws FuncFaultMessage, TechFaultMessage;
}
