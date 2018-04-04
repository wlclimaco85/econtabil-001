package com.econtabil.integration.domain.clinica.model;

import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Especialidade extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The type of an account. */
	private String nome;

	public Especialidade()
	{

	}



	public Especialidade(String nome,PersistenceActionEnum action) {
		super();
		this.nome = nome;
		setModelAction(action);
	}



	/**
	 * @return the id
	 */
	public Integer getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String toString()
	{
		return "Especialidade [getId()=" + getId() + ", getNome()=" + getNome() + ", toString()=" + super.toString()
				+ "]";
	}

}
