package com.qat.samples.sysmgmt.pessoa.model;

import java.util.Date;
import java.util.List;

import com.qat.samples.sysmgmt.clinica.model.Consulta;
import com.qat.samples.sysmgmt.dp.model.HorarioFunc;
import com.qat.samples.sysmgmt.util.model.DoisValoresParent;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Medico extends Pessoa
{
	private List<DoisValoresParent> especialidadeList;
	private List<Consulta> consultaList;
	private List<HorarioFunc> horarioList;

	/**
	 * Default constructor.
	 */
	public Medico()
	{
		super();
	}

	public Medico(Integer id)
	{
		super();
		setId(id);
	}

	public Medico(int i, String string) {
		setId(i);
		setNome(string);
		setModelAction(PersistenceActionEnum.INSERT);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	public List<DoisValoresParent> getEspecialidadeList()
	{
		return especialidadeList;
	}

	public void setEspecialidadeList(List<DoisValoresParent> especialidadeList)
	{
		this.especialidadeList = especialidadeList;
	}

	public List<Consulta> getConsultaList()
	{
		return consultaList;
	}

	public void setConsultaList(List<Consulta> consultaList)
	{
		this.consultaList = consultaList;
	}

	public List<HorarioFunc> getHorarioList()
	{
		return horarioList;
	}

	public void setHorarioList(List<HorarioFunc> horarioList)
	{
		this.horarioList = horarioList;
	}

	@Override
	public String toString()
	{
		return "Medico [getEspecialidadeList()=" + getEspecialidadeList() + ", getConsultaList()=" + getConsultaList()
				+ ", getHorarioList()=" + getHorarioList() + ", toString()=" + super.toString() + "]";
	}

}
