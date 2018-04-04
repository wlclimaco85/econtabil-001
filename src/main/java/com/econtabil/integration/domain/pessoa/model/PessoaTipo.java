package com.econtabil.integration.domain.pessoa.model;


import java.util.Date;

import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;
import com.econtabil.integration.domain.enumerate.Enum.PessoaTypeEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class PessoaTipo extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;


	/** The type of an account. */
	private PessoaTypeEnum pessoaTypeEnum;



	/**
	 * Default constructor.
	 */
	public PessoaTipo()
	{
		super();
	}





	public PessoaTipo(PessoaTypeEnum pessoaTypeEnum,Integer parentId,PersistenceActionEnum action) {
		super();
		this.pessoaTypeEnum = pessoaTypeEnum;
		setParentId(parentId);
		setModelAction(action);
		setCreateDateUTC((new Date()).getTime());
		setCreateUser("System");
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
	 * @param id the id to set
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	public PessoaTypeEnum getPessoaTypeEnum() {
		return pessoaTypeEnum;
	}

	public void setPessoaTypeEnum(PessoaTypeEnum pessoaTypeEnum) {
		this.pessoaTypeEnum = pessoaTypeEnum;
	}

	@Override
	public String toString() {
		return "PessoaTipo [getId()=" + getId()
				+ ", getPessoaTypeEnum()=" + getPessoaTypeEnum() + ", toString()=" + super.toString() + "]";
	}


}
