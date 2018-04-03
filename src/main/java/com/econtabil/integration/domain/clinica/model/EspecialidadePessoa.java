package com.econtabil.integration.domain.clinica.model;

import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class EspecialidadePessoa extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	private Especialidade especialidade;

	public EspecialidadePessoa()
	{

	}



	public EspecialidadePessoa(String specialidade,Integer id,PersistenceActionEnum action) {
		super();
		this.especialidade = new Especialidade(specialidade,action);
		setParentId(id);
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

	public Especialidade getEspecialidade()
	{
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade)
	{
		this.especialidade = especialidade;
	}

	@Override
	public String toString()
	{
		return "EspecialidadePessoa [getId()=" + getId() + ", getEspecialidade()=" + getEspecialidade()
				+ ", toString()=" + super.toString() + "]";
	}

}
