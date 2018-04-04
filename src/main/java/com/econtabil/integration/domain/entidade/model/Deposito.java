package com.econtabil.integration.domain.entidade.model;

import java.util.Date;

import com.econtabil.integration.domain.enumerate.Enum.EmpresaTypeEnum;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Deposito extends Entidade
{

	/**
	 * Default constructor.
	 */
	public Deposito()
	{
		super();
	}

	public Deposito(Integer id,String nome) {
		super();
		setId(id);
		setNome(nome);
		setEntidadeEnum(EmpresaTypeEnum.ADVOCACIA);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	@Override
	public String toString()
	{
		return "Deposito [toString()=" + super.toString() + "]";
	}

}
