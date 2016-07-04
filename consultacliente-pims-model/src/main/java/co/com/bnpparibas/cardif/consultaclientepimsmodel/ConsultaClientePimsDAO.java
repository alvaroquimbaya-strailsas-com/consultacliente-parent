package co.com.bnpparibas.cardif.consultaclientepimsmodel;

import java.util.List;

import javax.ejb.Remote;

import co.com.bnpparibas.cardif.consultaclientepimsmodel.entities.ConsultaClientePims;

@Remote
public interface ConsultaClientePimsDAO {
	public List<ConsultaClientePims> ExecConsultaCliente_Pims(String cc_asegurado);
	
}
