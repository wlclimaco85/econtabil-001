package com.econtabil.integration.domain.pessoa.model;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.clinica.model.Consulta;
import com.econtabil.integration.domain.clinica.model.PlanoSaudePessoa;
import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Paciente extends Pessoa
{

	private List<PlanoSaudePessoa> planoSaudeList;
	private List<Consulta> consultaList;

	/**
	 * Default constructor.
	 */
	public Paciente()
	{
		super();
	}

	public Paciente(Integer id)
	{
		super();
		setId(id);
	}

	public Paciente(int i, String string) {
		setId(i);
		setNome(string);
		setModelAction(PersistenceActionEnum.INSERT);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	public List<PlanoSaudePessoa> getPlanoSaudeList()
	{
		return planoSaudeList;
	}

	public void setPlanoSaudeList(List<PlanoSaudePessoa> planoSaudeList)
	{
		this.planoSaudeList = planoSaudeList;
	}

	public List<Consulta> getConsultaList()
	{
		return consultaList;
	}

	public void setConsultaList(List<Consulta> consultaList)
	{
		this.consultaList = consultaList;
	}

	@Override
	public String toString()
	{
		return "Paciente [getPlanoSaudeList()=" + getPlanoSaudeList() + ", getConsultaList()=" + getConsultaList()
				+ ", toString()=" + super.toString() + "]";
	}

}
