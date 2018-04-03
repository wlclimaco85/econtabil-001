package com.econtabil.integration.domain.advocacia;

import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Audiencia extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The type of an account. */
	private Integer dataAudiencia;

	private String descricao;

	public Audiencia()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Audiencia(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getDataAudiencia()
	{
		return dataAudiencia;
	}

	public void setDataAudiencia(Integer dataAudiencia)
	{
		this.dataAudiencia = dataAudiencia;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Audiencia [getId()=" + getId() + ", getDataAudiencia()=" + getDataAudiencia() + ", getDescricao()="
				+ getDescricao() + ", toString()=" + super.toString() + "]";
	}

}
