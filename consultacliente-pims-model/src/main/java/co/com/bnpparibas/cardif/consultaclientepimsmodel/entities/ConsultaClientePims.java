package co.com.bnpparibas.cardif.consultaclientepimsmodel.entities;

import java.io.Serializable;
import javax.persistence.*;

/** 
 * 
 * @author Nectia-Cardif
 * Define la estructura de los campos del query de PIMS
 */
@Entity
public class ConsultaClientePims implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NUMERO_PRODUCTO")
	private String numero_producto;
	//
	@Column(name="INDICADOR_DEUDOR")
	private String indicador_deudor;
	//
	@Column(name="NOMBRE_SOCIO")
	private String nombre_socio;
	//
	@Column(name="CODIGO_SOCIO")
	private String codigo_socio;
	//
	@Column(name="NOMBRE_PRODUCTO")
	private String nombre_producto;
	//
	@Column(name="PAGADOR")
	private String pagador;
	//
	@Column(name="ASEGURADO")
	private String asegurado;
	//
	@Column(name="TIPO_DOCUMENTO")
	private String tipo_documento;
	//
	@Column(name="NUMERO_IDENTIFICACION")
	private String numero_identificacion;
	//
	@Column(name="DIRECCION_ASEGURADO")
	private String direccion_asegurado;
	//
	@Column(name="NUMERO_TELEFONO")
	private String numero_telefono;
	//
	@Column(name="CODIGO_CIUDAD")
	private String codigo_ciudad;
	//
	@Column(name="CIUDAD")
	private String ciudad;
	//
	@Column(name="MAIL")
	private String mail;
	//
	@Column(name="DIAS_PERMANENCIA")
	private int dias_permanencia;
	//
	@Column(name="NUM_TARJETA_CUENTA")
	private String num_tarjeta_cuenta;
	//
	@Column(name="NUMERO_CUENTA_INTERNACIONAL")
	private String numero_cuenta_internacional;
	//
	@Column(name="CERTIFICADO")
	private String certificado;
	//
	@Column(name="IPC")
	private String ipc;
	//
	@Column(name="FECHA_EFECTIVA_CANCELACION")
	private String fecha_efectiva_cancelacion;
	//
	@Column(name="FECHA_CANCELACION")
	private String fecha_cancelacion;
	//
	@Column(name="DESCRIPCION_CAUSAL")
	private String descripcion_causal;
	//
	@Column(name="PERIODICIDAD")
	private String periodicidad;
	//
	@Column(name="PRIMABRUTA")
	private double primabruta;
	//
	@Column(name="FECHA_EMISION")
	private String fecha_emision;
	//
	@Column(name="FECHA_INICIO_ULTIMO_MOV")
	private String fecha_inicio_ultimo_mov;
	//
	@Column(name="FECHA_INICIO")
	private String fecha_inicio;
	//
	@Column(name="FECHA_FINAL")
	private String fecha_final;
	//
	@Column(name="NUMERO_OBLIGACION")
	private String numero_obligacion;
	//
	@Column(name="PLAN")
	private String plan;
	//
	@Column(name="CODIGO_INTERNO")
	private String codigo_interno;
	//
	@Column(name="CODIGO_COBERTURA")
	private String codigo_cobertura;
	//
	@Column(name="NOMBRE_COBERTURA")
	private String nombre_cobertura;
	//
	@Column(name="CODIGO_RAMO")
	private String codigo_ramo;
	//
	@Column(name="RAMO")
	private String ramo;
	//
	@Column(name="VALOR_MAXIMO_ASEGURADO")
	private double valor_maximo_asegurado;
	//
	@Column(name="VALOR_CUOTA_CREDITO")
	private double valor_cuota_credito;
	//
	@Column(name="NUM_CUOTAS_COBERTURA")
	private int num_cuotas_cobertura;
	//
	@Column(name="PERIODO_CARENCIA")
	private int periodo_carencia;
	//
	@Column(name="PERIODO_ESPERA")
	private int periodo_espera;
	//
	@Column(name="EVENTOS")
	private int eventos;
	//
	@Column(name="CANAL_VENTA")
	private String canal_venta;
	//
	@Column(name="OFICINA_VENTA")
	private String oficina_venta;
	//
	@Column(name="CODIGO_ASESOR")
	private String codigo_asesor;
	//
	@Column(name="NOMBRE_ASESOR")
	private String nombre_asesor;
	//
	@Column(name="FUENTE")
	private String fuente;
	//
	
	public String get_oficina_venta()
	{
		return this.oficina_venta;
	}
}
