package com.econtabil.integration.domain.pessoa.model;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.convenio.model.ConvenioPessoa;
import com.econtabil.integration.domain.dp.model.Profissao;
import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Cliente extends Pessoa
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The horarios. */
	private List<Profissao> profissao;

	private List<ConvenioPessoa> convenioList;

	/**
	 * Default constructor.
	 */
	public Cliente()
	{
		super();
	}

	public Cliente(int i, String string) {
		setId(i);
		setNome(string);
		setModelAction(PersistenceActionEnum.INSERT);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Override
	public Integer getId()
	{
		return id;
	}

	/**
	 * @return the profissao
	 */
	public List<Profissao> getProfissao()
	{
		return profissao;
	}

	/**
	 * @param profissao the profissao to set
	 */
	public void setProfissao(List<Profissao> profissao)
	{
		this.profissao = profissao;
	}

	/**
	 * @return the convenioList
	 */
	public List<ConvenioPessoa> getConvenioList()
	{
		return convenioList;
	}

	/**
	 * @param convenioList the convenioList to set
	 */
	public void setConvenioList(List<ConvenioPessoa> convenioList)
	{
		this.convenioList = convenioList;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	@Override
	public void setId(Integer id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "Cliente [getId()=" + getId() + ", getProfissao()=" + getProfissao() + ", getConvenioList()="
				+ getConvenioList() + ", toString()=" + super.toString() + "]";
	}

}
