package co.com.bnpparibas.cardif.consultaclientepimsmodel;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;


import co.com.bnpparibas.cardif.consultaclientepimsmodel.entities.ConsultaClientePims;

@Stateless
public class ConsultaClientePimsDAOImpl implements ConsultaClientePimsDAO {

	@PersistenceContext(unitName ="consultaclientepimsmodelPU")
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<ConsultaClientePims> ExecConsultaCliente_Pims(String cc_asegurado) {
		// 
		//
		String st_Query = this.ArmaQuery(cc_asegurado);
		//
		st_Query = "select * from pims";
		return em.createNativeQuery(st_Query, ConsultaClientePims.class).getResultList();
	}
	
	private String ArmaQuery(String cc_asegurado)
	{
		StringBuilder Sql = new StringBuilder();
         //-- QUERY GENERAL POR ASEGURADO.
		Sql.append("SELECT ") ; 
		Sql.append("DISTINCT " ) ; 
		Sql.append("CCPRD.PRODUCTLEGALREGSTRTNNBINPUT AS NUMERO_PRODUCTO, --NUMERO PRODUCTO CARDIF  " ) ; 
         Sql.append("CCPRD.PRODUCTDEUDORINDICINPUT AS INDICADOR_DEUDOR, -- INDICADOR DE PRODUCTO DEUDORES  " ) ; 
         Sql.append("CCTHP2.THIRDPARTYFULLNAMEINPUT AS NOMBRE_SOCIO,--NOMBRE DEL SOCIO  " ) ; 
         Sql.append("PRT.PARTNERNBINPUT AS CODIGO_SOCIO, -- CODIGO DEL SOCIO  " ) ; 
         Sql.append("PRD.DESCRIPTION AS NOMBRE_PRODUCTO, --NOMBRE DEL PRODUCTO  " ) ; 
         Sql.append("CCTHP.THIRDPARTYFULLNAMEINPUT AS PAGADOR, --NOMBRE DEL PAGADOR  " ) ; 
         //
         Sql.append("REPLACE(PVI.DESCRIPTION,':Insured','') AS ASEGURADO, -- NOMBRE DEL ASEGURADO  " ) ; 
         Sql.append("NP.THIRDPARTYDOCUMENTTYPEINPUT AS TIPO_DOCUMENTO, --TIPO DE DOCUMENTO  " ) ; 
         Sql.append("CCTHP3.THIRDPARTYNBINPUT AS NUMERO_IDENTIFICACION,-- NUMERO DE INDENTIFICACION DEL ASEGURADO  " ) ; 
         Sql.append("CCPAD.ADDRESSNAMEINPUT AS DIRECCION_ASEGURADO, -- DIRECCION ASEGURADO  " ) ; 
         Sql.append("CCTHP.PHONENBINPUT AS NUMERO_TELEFONO, --NUMERO DE TELEFONO  " ) ; 
         Sql.append("CCPAD.TOWNCODEVALUE AS CODIGO_CIUDAD, -- CODIGO DE CIUDAD  " ) ; 
         Sql.append("CCPAD.TOWNNAMEINPUT AS CIUDAD,-- CIUDAD  " ) ; 
         Sql.append("CCTHP3.ELECTRONICADDRESSNAMEINPUT AS MAIL, -- DIRECCION DE CORREO ELECTRONICO  " ) ; 
         Sql.append("CASE UPPER(ST.DESCRIPTION)   " ) ; 
         Sql.append("  WHEN  'IN FORCE' THEN  TRUNC(SYSDATE - PDCO.INITIALDATE)  " ) ; 
         Sql.append("END  AS DIAS_PERMANENCIA,-- DIAS DE PERMANENCIA  " ) ; 
         Sql.append(" CASE THPM.TEMPLATENAME  " ) ; 
         Sql.append("  WHEN 'PaymentCard' THEN PC.CARDNBINPUT -- No DE TARJETA  " ) ; 
         Sql.append("  WHEN 'PaymentBankAccount' THEN PBK.BANKACCOUNTNBINPUT -- No DE CUENTA BANCARIA  " ) ; 
         Sql.append("END AS NUM_TARJETA_CUENTA,  " ) ; 
         Sql.append("CASE THPM.TEMPLATENAME  " ) ; 
         Sql.append("  WHEN 'PaymentCard' THEN PC.CARDINTRNTNLACCNTNBINPUT -- No DE TARJETA INTERNACIONAL  " ) ; 
         Sql.append("  WHEN 'PaymentBankAccount' THEN PBK.BANKACCOUNTNBINPUT -- No DE CUENTA BANCARIA  " ) ; 
         Sql.append("END AS NUMERO_CUENTA_INTERNACIONAL,  " ) ; 
         Sql.append("CASE THPM.TEMPLATENAME " ) ; 
         Sql.append("  WHEN 'PaymentCard' THEN PC.CARDTYPEINPUT  -- FRANQUICIA " ) ; 
         Sql.append("END AS FRANQUICIA, " ) ; 
         Sql.append("PDCO.POD_POLICYNUMBER AS CERTIFICADO,-- No DE CERTIFICADO " ) ; 
         //
         Sql.append("CASE  " ) ; 
         Sql.append("WHEN CCIR.DYNAMICTABLEPRODUCTNBINPUT IS NULL THEN 'NO IPC' " ) ; 
         Sql.append("WHEN CCIR.DYNAMICTABLEPRODUCTNBINPUT IS NOT NULL THEN 'IPC'  " ) ; 
         Sql.append("END AS IPC, -- INDICADOR DE IPC " ) ; 
         Sql.append("CASE UPPER(ST.DESCRIPTION)  " ) ; 
         Sql.append("  WHEN 'RENOUNCED' THEN REN.CALCULTDREFUNDREFDATEINPUT " ) ; 
         Sql.append("  WHEN 'RESCINDED' THEN RES.CALCULTDREFUNDREFDATEINPUT  " ) ; 
         Sql.append("END  AS FECHA_EFECTIVA_CANCELACION, -- FECHA EFECTIVA DE CANCELACION " ) ; 
         Sql.append("CASE UPPER(ST.DESCRIPTION)  " ) ; 
         Sql.append("  WHEN 'RENOUNCED' THEN REN.REFUNDEFFECTIVEDATEINPUT  " ) ; 
         Sql.append("  WHEN 'RESCINDED' THEN RES.REFUNDEFFECTIVEDATEINPUT  " ) ; 
         Sql.append("END  AS FECHA_CANCELACION, -- FECHA DE CANCELACION " ) ;
         Sql.append("CASE UPPER(ST.DESCRIPTION)  " ) ; 
         Sql.append("  WHEN 'RENOUNCED' THEN REN.REASONDESCINPUT  " ) ; 
         Sql.append("  WHEN 'RESCINDED' THEN RES.REASONDESCINPUT  " ) ; 
         Sql.append("END AS DESCRIPCION_CAUSAL, -- CAUSAL DE CANCELACION  " ) ; 
         Sql.append("CASE CCPOL.PREMIUMPERIODICITYTYPEINPUT  " ) ; 
         Sql.append("          when 'Single' then 'PAGO_UNICO' " ) ; 
         Sql.append("          when 'Yearly' then 'PAGO_ANUAL' " ) ; 
         Sql.append("          when 'Montly' then 'PAGO_MENSUAL' " ) ; 
         Sql.append("          else '' " ) ; 
         Sql.append("END AS PERIODICIDAD, -- TIPO DE PRIMA " ) ; 
         Sql.append("OPIT.AMOUNT AS PRIMABRUTA, -- VALOR DE PRIMA BRUTA " ) ; 
         Sql.append("PDCO.AUDITDATE AS FECHA_EMISION, -- FECHA DE EMISION  " ) ; 
         Sql.append("CCPOL.POLLASTPREMBILLNGDATEINPUT as FECHA_INICIO_ULTIMO_MOV, -- FECHA DE INICIO DE ULTIMO PERIODO " ) ; 
         Sql.append("PDCO.INITIALDATE AS FECHA_INICIO, -- FECHA DE INICIO DE LA POLIZA " ) ; 
         Sql.append("PDCO.FINISHDATE AS FECHA_FINAL, -- FECHA FINAL DE LA POLIZA " ) ; 
         Sql.append("LRU.LOANNBINPUT AS NUMERO_OBLIGACION, -- NUMERO DE PRODUCTO - OBLIGACION - CREDITO " ) ; 
         Sql.append("CCPOL.PLANOPTIONTYPEINPUT AS PLAN, -- PLAN " ) ; 
         Sql.append("CCPOL.POLICYPARTNERPRODCODEINPUT AS CODIGO_INTERNO, -- CODIGO INTERNO DE LA POLIZA " ) ; 
         Sql.append("COV.COVERRISKIDINPUT AS CODIGO_COBERTURA, -- CODIGO DE LA COBERTURA " ) ; 
         Sql.append("COV.COVERNAMEINPUT AS NOMBRE_COBERTURA, -- NOMBRE DE LA COBERTURA " ) ; 
         Sql.append("COV.COVERBUSINESSLINECODEINPUT AS CODIGO_RAMO, -- CODIGO DE RAMO  " ) ; 
         Sql.append("COV.COVERBUSINESSLINENAMEINPUT AS RAMO, -- NOMBRE DE RAMO " ) ; 
         Sql.append("COV.MAXINSUREDAMNTINPUT AS VALOR_MAXIMO_ASEGURADO, -- VALOR MAXIMO ASEGURADO " ) ; 
         Sql.append("LRU.LOANINSTALLMENTAMNTINPUT AS VALOR_CUOTA_CREDITO, -- VALOR DE LA CUOTA DEL CREDITO " ) ; 
         Sql.append("LRU.LOANAMNTINPUT AS VALOR_CREDITO, --  VALOR TOTAL DEL CREDITO " ) ; 
         Sql.append("COV.CLAIMMAXINSTALLMENTQTYINPUT AS NUM_CUOTAS_COBERTURA, -- NUMERO DE CUOTAS DE LA COBERTURA " ) ; 
         Sql.append("CONFCL.CLCC_CLAIMNOTIFICATIONPERIOD AS PERIODO_CARENCIA, -- PERIODO DE CARENCIA " ) ; 
         Sql.append("CONFCL.CLCC_WAITINGPERIODDAYS AS PERIODO_ESPERA, -- PERIODO DE ESPERA " ) ; 
         Sql.append("CONFCL.CLCC_MAXNMBROFCLAIMSPERYEAR AS EVENTOS, -- NUMERO DE EVENTOS " ) ; 
         Sql.append("CCPOL.POLICYSALECHANNELTYPEINPUT AS CANAL_VENTA, -- CANAL DE VENTA " ) ; 
         Sql.append("CCPOL.POLICYPARTNERSHOPNAMEINPUT AS OFICINA_VENTA, -- OFICINA DE VENTA " ) ; 
         Sql.append("CCPOL.POLICYCASHIERDESKCODEINPUT AS CODIGO_ASESOR, -- CODIGO INTERNO DE DEL ASESOR " ) ; 
         Sql.append("CCPOL.POLICYSELLERNAMEINPUT AS NOMBRE_ASESOR, -- NOMBRE DEL ASESOR DE VENTA " ) ; 
         Sql.append("'ACSELE' AS FUENTE -- FUENTE DE DATOS  " ) ; 
         Sql.append("FROM BRAXTS_CFG.AGREGATEDPOLICY AGP " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.POLICYDCO PDCO ON PDCO.OPERATIONPK = AGP.OPERATIONPK -- ULTIMO MOVIMIENTO " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.PRODUCT PRD ON PRD.PRODUCTID = AGP.PRODUCTID -- TODOS LOS PRODUCTOS  " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOPTPPRODUCT CCPRD ON CCPRD.STATIC = PRD.PRODUCTID -- DESCRIPCION DEL PRODUCTO " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.AGREGATEDPOLICYTYPE AGPT ON AGPT.PRODUCTID = PRD.PRODUCTID  " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.STPS_CONFROLETHIRDPARTY SCRTP ON SCRTP.CRTP_CONTAINERID = AGPT.AGREGATEDPOLICYID -- ROLES DEL PRODUCTO " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.STATE ST ON ST.STATEID = PDCO.STATEID -- ESTADO DE LA POLIZA " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOPTPPOLICY CCPOL ON CCPOL.STATIC = PDCO.AGREGATEDOBJECTID -- DESCRIPCION DE LA POLIZA " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.PARTICIPATIONVERSION PV ON PV.AGREGATEDPARENTID = PDCO.AGREGATEDOBJECTID " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.PARTICIPATIONVERSIONINSURANCE PVI ON PVI.OPERATIONPK = PDCO.OPERATIONPK -- ASEGURADO " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOPTPTHIRDPARTY CCTHP ON CCTHP.STATIC = PV.THIRDPARTYID -- PAGADOR " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOPTPTHIRDPARTY CCTHP3 ON CCTHP3.STATIC = PVI.THIRDPARTYID -- TERCEROS " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOPTPTHIRDPARTY CCTHP2 ON CCTHP2.STATIC = SCRTP.TPT_ID -- SOCIO " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.THIRDPARTYROLE TPR ON TPR.THIRDPARTYID = CCTHP2.STATIC " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.STTE_THIRDPARTY STTP ON STTP.TPT_ID = TPR.THIRDPARTYID --and TPR.rol_id = 120 " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.PARTNER PRT ON PRT.pk = TPR.IDDCOROLE " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.NATURALPERSON NP ON NP.STATIC = CCTHP.STATIC -- INFORMACION ADICIONAL TERCEROS PERSONA NATURAL " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.MORALPERSON MP ON MP.STATIC = CCTHP2.STATIC  -- INFORMACION ADICIONAL TERCEROS PERSONA JURIDICA " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.STTE_THIRDPARTYADDRESSBOOK STPDB ON STPDB.TPT_ID =  CCTHP.STATIC " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOXTPPOSTALADDRESS CCPAD ON CCPAD.PK = STPDB.IDDCO -- DIRECCIONES Y CIUDADES " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.THIRDPARTYPAYMENTMODE THPM ON THPM.THIRDPARTYID = CCTHP.STATIC --AND THPM.COLLECTORID IS NOT NULL --MODOS DE PAGO " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.PAYMENTBANKACNT PBK ON PBK.STATIC = THPM.DCOPK -- INFORMACION DE CUENTA BANCARIA " ) ; 
         Sql.append("LEFT  JOIN BRAXTS_CFG.PAYMENTCARD PC ON PC.STATIC = THPM.DCOPK -- INFORMACION DE TARJETA DE CREDITO " ) ; 
         Sql.append("INNER JOIN   BRAXTS_CFG.OPENITEM OPIT  ON  OPIT.OPERATIONPK = PDCO.OPERATIONPK AND OPIT.DTY_ID = 513 -- MOVIMIENTOS DE LA POLIZA " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.AGREGATEDRISKUNIT AGRU on AGRU.OPERATIONPK = PDCO.OPERATIONPK -- UNIDAD DE RIESGO " ) ; 
         Sql.append("LEFT OUTER JOIN BRAXTS_CFG.LOANRU LRU ON LRU.STATIC = AGRU.AGREGATEDRISKUNITID " ) ; 
         Sql.append("--LEFT JOIN BRAXTS_CFG.stpo_aslpolicylog STPO ON STPO.ASLP_POLICYNUMBER = PDCO.POD_POLICYNUMBER " ) ; 
         Sql.append("--LEFT JOIN BRAXTS_CFG.STPO_ASLPOLICYLOG_HISTORY STPOH ON STPOH.ASLP_POLICYNUMBER = PDCO.POD_POLICYNUMBER " ) ; 
         Sql.append("--LEFT JOIN BRAXTS_CFG.LIFE_UPL UPL ON UPL.UPLD_ID = STPO.ASL_PIMS_ID " ) ; 
         Sql.append("--LEFT JOIN BRAXTS_CFG.LIFE_UPL UPL2 ON UPL2.UPLD_ID = STPOH.ASL_PIMS_ID " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.COVERAGEDCO CDCO ON CDCO.OPERATIONPK = PDCO.OPERATIONPK " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CCOXTPCOVERAGE COV ON COV.STATIC = CDCO.AGREGATEDOBJECTID -- VALORES POR COBERTURA " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.CONFIGURATEDCOVERAGE CONFCOV ON CONFCOV.PRO_ID = CCPRD.STATIC AND CONFCOV.CCV_HIERARCHYSTATE = '2' and REPLACE(COV.COVERRISKIDINPUT,'.0','') = CONFCOV.COVERAGETYTLEID  " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.STPS_CLAIMCOVCONFIGURATION CONFCL ON CONFCL.CCV_ID = CONFCOV.CONFIGURATEDCOVERAGEID -- VALORES DE SINIETROS " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.CCOXTPINDEXRATE CCIR ON CCIR.DYNAMICTABLEPRODUCTNBINPUT = CCPRD.PRODUCTNBINPUT " ) ; 
         Sql.append("INNER JOIN BRAXTS_CFG.EVENTDCO EV ON EV.OPERATIONPK = AGP.OPERATIONPK " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.CCOXTPRENUNCIATIONEVENT  REN ON  REN.PK = EV.IDDCOEVENT --RENOUNCED " ) ; 
         Sql.append("LEFT JOIN BRAXTS_CFG.CCOXTPRESCINDINGEVENT  RES ON RES.PK = EV.IDDCOEVENT --RESCINDED  " ) ; 
         Sql.append("WHERE " ) ;
         //Sql.append(" CCTHP3.THIRDPARTYNBINPUT = '2774916' " ) ;
         Sql.append(" CCTHP3.THIRDPARTYNBINPUT = '" + cc_asegurado + "' " ) ;
         Sql.append(" AND SCRTP.ROL_ID = 120 " ) ;
         Sql.append(" AND PV.ROLEID = 112 " ) ;
         Sql.append(" ORDER BY 1,5,CERTIFICADO; " ) ; 
		//
		return Sql.toString();
	}
	
}