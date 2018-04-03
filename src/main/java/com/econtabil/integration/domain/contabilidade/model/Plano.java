package com.econtabil.integration.domain.contabilidade.model;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.produto.model.Preco;
import com.econtabil.integration.domain.produto.model.Servico;
import com.econtabil.integration.domain.util.model.DoisValores;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * The Class Document represents a generic formal business or personal document, such as driver's license or bylaws.
 */
@SuppressWarnings("serial")
public class Plano extends ModelCosmeDamiao
{

	private Integer id;

	private Long dataInicio;

	private Long dataFinal;

	private List<Preco> precoList;

	private Integer numeroContrato;

	private List<Servico> servicoList;

	private List<DoisValores> itensList;

	private String descricao;

	private String cor;

	private String titulo;

	public Plano(Integer id)
	{
		super();
	}

	/**
	 * The Constructor.
	 */
	public Plano()
	{

	}

	public Plano(int i, String string) {

		this.id = i;
		this.titulo = string;
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	/**
	 * @return the dataInicio
	 */
	public Long getDataInicio()
	{
		return dataInicio;
	}

	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Long dataInicio)
	{
		this.dataInicio = dataInicio;
	}

	/**
	 * @return the dataFinal
	 */
	public Long getDataFinal()
	{
		return dataFinal;
	}

	/**
	 * @param dataFinal the dataFinal to set
	 */
	public void setDataFinal(Long dataFinal)
	{
		this.dataFinal = dataFinal;
	}

	/**
	 * @return the numeroContrato
	 */
	public Integer getNumeroContrato()
	{
		return numeroContrato;
	}

	/**
	 * @param numeroContrato the numeroContrato to set
	 */
	public void setNumeroContrato(Integer numeroContrato)
	{
		this.numeroContrato = numeroContrato;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Preco> getPrecoList() {
		return precoList;
	}

	public void setPrecoList(List<Preco> precoList) {
		this.precoList = precoList;
	}

	public List<Servico> getServicoList() {
		return servicoList;
	}

	public void setServicoList(List<Servico> servicoList) {
		this.servicoList = servicoList;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public List<DoisValores> getItensList() {
		return itensList;
	}

	public void setItensList(List<DoisValores> itensList) {
		this.itensList = itensList;
	}

	@Override
	public String toString() {
		return "Plano [getDataInicio()=" + getDataInicio() + ", getDataFinal()=" + getDataFinal()
				+ ", getNumeroContrato()=" + getNumeroContrato() + ", getId()=" + getId() + ", getPrecoList()="
				+ getPrecoList() + ", getServicoList()=" + getServicoList() + ", getDescricao()=" + getDescricao()
				+ ", getTitulo()=" + getTitulo() + ", getCor()=" + getCor() + ", getItensList()=" + getItensList()
				+ ", toString()=" + super.toString() + "]";
	}



}