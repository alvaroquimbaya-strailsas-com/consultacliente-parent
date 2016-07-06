package com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1.facade;

import java.util.List;
import java.util.Iterator;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPersonAndPrdCardifINType;
import com.bnpparibas.cardif.lam.schema.customerquery_schematypes.v1.CustomerQueryByPersonAndPrdCardifOUTType;

import com.bnpparibas.cardif.lam.schema.policy.v1.PolicyType;

import co.com.bnpparibas.cardif.consultaclientepimsmodel.ConsultaClientePimsDAO;
import co.com.bnpparibas.cardif.consultaclientepimsmodel.entities.ConsultaClientePims;

@Stateless
@WebService (endpointInterface="com.bnpparibas.assurance.ea.internal.service.lam.customerquery.v1.CustomerQueryPort", targetNamespace="http://ea.assurance.bnpparibas.com/internal/service/lam/customerquery/v1", serviceName="CustomerQueryService", portName="CustomerQueryPort", wsdlLocation="WEB-INF/wsdl/CustomerQuery/V1.0.0/CustomerQuery.wsdl")
public class CustomerQueryImpl {
	
	@EJB
	ConsultaClientePimsDAO pimsFacede;
	
	public CustomerQueryByPersonAndPrdCardifOUTType customerQueryByPersonAndPrdCardif(CustomerQueryByPersonAndPrdCardifINType customerQueryByPersonAndPrdCardifInput){
		List<ConsultaClientePims> Lista = pimsFacede.ExecConsultaCliente_Pims("12332");
		String Numero_Poliza = "";
		for ( Iterator iterador = Lista.listIterator(); iterador.hasNext(); ) {
			ConsultaClientePims Temporal = (ConsultaClientePims) iterador.next();
			Numero_Poliza = "hay Datos : la oficina de venta es : " + Temporal.get_oficina_venta();
		}
		//
		CustomerQueryByPersonAndPrdCardifOUTType Salida = new CustomerQueryByPersonAndPrdCardifOUTType();
		PolicyType poliza = new PolicyType();
		poliza.setPolicySellerName(Numero_Poliza);
		poliza.setPolicyNumber("");
		Salida.setPolicy(poliza);
		//
		//return pimsFacede.ExecConsultaCliente_Pims(customerQueryByPersonAndPrdCardifInput);
		return Salida;
	}
	



}
