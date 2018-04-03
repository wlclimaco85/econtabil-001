package com.qat.samples.sysmgmt.produto.model;

import java.util.List;

import com.qat.samples.sysmgmt.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Porcao extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	private Integer idproduto;

	/** The type of an account. */
	private List<PorcaoItens> porcaoItens;

	private Double valor;

	/**
	 * Default constructor.
	 */
	public Porcao()
	{
		super();
	}

	public Porcao(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Integer getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id the new id
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	/**
	 * @return the idproduto
	 */
	public Integer getIdproduto()
	{
		return idproduto;
	}

	/**
	 * @param idproduto the idproduto to set
	 */
	public void setIdproduto(Integer idproduto)
	{
		this.idproduto = idproduto;
	}

	/**
	 * @return the porcaoItens
	 */
	public List<PorcaoItens> getPorcaoItens()
	{
		return porcaoItens;
	}

	/**
	 * @param porcaoItens the porcaoItens to set
	 */
	public void setPorcaoItens(List<PorcaoItens> porcaoItens)
	{
		this.porcaoItens = porcaoItens;
	}

	/**
	 * @return the valor
	 */
	public Double getValor()
	{
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor)
	{
		this.valor = valor;
	}

	@Override
	public String toString()
	{
		return "Porcao [getId()=" + getId() + ", getIdproduto()=" + getIdproduto() + ", getPorcaoItens()="
				+ getPorcaoItens() + ", getValor()=" + getValor() + ", toString()=" + super.toString() + "]";
	}

}
