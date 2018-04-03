package com.econtabil.integration.domain.entidade.model;

import com.econtabil.integration.domain.util.model.DoisValores;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Boleto extends ModelCosmeDamiao
{
	private Integer id;
	private Integer ativarBolOnLine;
	private DoisValores tipoBoleto;
	private Integer agencia;
	private Integer cedente;
	private Double juros;
	private DoisValores tipoCalcMora;
	private Double mora;
	private String instrucoes;
	private String demonstrativo;
	private Integer impJuros;

	public Boleto()
	{
		super();
	}

	public Boleto(Integer id)
	{
		setId(id);
	}

	public Boleto(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAtivarBolOnLine() {
		return ativarBolOnLine;
	}

	public void setAtivarBolOnLine(Integer ativarBolOnLine) {
		this.ativarBolOnLine = ativarBolOnLine;
	}

	public DoisValores getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(DoisValores tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getCedente() {
		return cedente;
	}

	public void setCedente(Integer cedente) {
		this.cedente = cedente;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

	public DoisValores getTipoCalcMora() {
		return tipoCalcMora;
	}

	public void setTipoCalcMora(DoisValores tipoCalcMora) {
		this.tipoCalcMora = tipoCalcMora;
	}

	public Double getMora() {
		return mora;
	}

	public void setMora(Double mora) {
		this.mora = mora;
	}

	public String getInstrucoes() {
		return instrucoes;
	}

	public void setInstrucoes(String instrucoes) {
		this.instrucoes = instrucoes;
	}

	public String getDemonstrativo() {
		return demonstrativo;
	}

	public void setDemonstrativo(String demonstrativo) {
		this.demonstrativo = demonstrativo;
	}

	public Integer getImpJuros() {
		return impJuros;
	}

	public void setImpJuros(Integer impJuros) {
		this.impJuros = impJuros;
	}

	@Override
	public String toString() {
		return "Boleto [getId()=" + getId() + ", getAtivarBolOnLine()=" + getAtivarBolOnLine() + ", getTipoBoleto()="
				+ getTipoBoleto() + ", getAgencia()=" + getAgencia() + ", getCedente()=" + getCedente()
				+ ", getJuros()=" + getJuros() + ", getTipoCalcMora()=" + getTipoCalcMora() + ", getMora()=" + getMora()
				+ ", getInstrucoes()=" + getInstrucoes() + ", getDemonstrativo()=" + getDemonstrativo()
				+ ", getImpJuros()=" + getImpJuros() + ", toString()=" + super.toString() + "]";
	}


}
