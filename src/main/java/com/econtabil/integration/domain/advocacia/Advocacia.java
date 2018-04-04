package com.econtabil.integration.domain.advocacia;

import java.util.Date;

import com.econtabil.integration.domain.entidade.model.Entidade;
import com.econtabil.integration.domain.enumerate.Enum.EmpresaTypeEnum;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Advocacia extends Entidade
{

	public Advocacia()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Advocacia(Integer id,String nome) {
		super();
		setId(id);
		setNome(nome);
		setEntidadeEnum(EmpresaTypeEnum.ADVOCACIA);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	public Advocacia(String string, String string2, Object object) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Advogado [toString()=" + super.toString() + "]";
	}

}
