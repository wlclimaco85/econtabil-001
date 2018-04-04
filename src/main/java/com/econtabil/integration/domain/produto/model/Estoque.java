package com.econtabil.integration.domain.produto.model;

import com.econtabil.integration.domain.enumerate.Enum.EstoqueTypeEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Estoque extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The type of an account. */
	private EstoqueTypeEnum estoqueTypeEnum;

	/** The description. */
	private Long ultimoMov;

	private Double quant;

	/**
	 * Default constructor.
	 */
	public Estoque()
	{
		super();
	}

	public Estoque(int i, String string) {
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
	 * @return the estoqueTypeEnum
	 */
	public EstoqueTypeEnum getEstoqueTypeEnum()
	{
		return estoqueTypeEnum;
	}

	/**
	 * @param estoqueTypeEnum the estoqueTypeEnum to set
	 */
	public void setEstoqueTypeEnum(EstoqueTypeEnum estoqueTypeEnum)
	{
		this.estoqueTypeEnum = estoqueTypeEnum;
	}

	/**
	 * @return the ultimoMov
	 */
	public Long getUltimoMov()
	{
		return ultimoMov;
	}

	/**
	 * @param ultimoMov the ultimoMov to set
	 */
	public void setUltimoMov(Long ultimoMov)
	{
		this.ultimoMov = ultimoMov;
	}

	/**
	 * @return the quant
	 */
	public Double getQuant()
	{
		return quant;
	}

	/**
	 * @param quant the quant to set
	 */
	public void setQuant(Double quant)
	{
		this.quant = quant;
	}

}
