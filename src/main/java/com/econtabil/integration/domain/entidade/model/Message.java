package com.econtabil.integration.domain.entidade.model;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.conta.model.ContaCorrente;
import com.econtabil.integration.domain.contabilidade.model.Plano;
import com.econtabil.integration.domain.enumerate.Enum.EmpresaTypeEnum;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Message extends Entidade
{

	private List<Plano> planoList;

	private Integer qntFilial;

	private Integer qntDeposito;

	private List<Filial> filialList;

	private List<Deposito> depositoList;

	private List<ContaCorrente> contaCorrenteList;

	private List<TarefaEnt> tarefaList;

	private Integer parceiroId;

	private Integer contabilidadeId;

	private EmpresaTypeEnum permissaoTypeEnum;

	public Message()
	{
		super();
	}

	public EmpresaTypeEnum getPermissaoTypeEnum() {
		return permissaoTypeEnum;
	}

	public void setPermissaoTypeEnum(EmpresaTypeEnum permissaoTypeEnum) {
		this.permissaoTypeEnum = permissaoTypeEnum;
	}

	public Message(Integer id)
	{
		setId(id);
	}

	public Message(Integer id,String nome) {
		super();
		setId(id);
		setNome(nome);
		setEntidadeEnum(EmpresaTypeEnum.ADVOCACIA);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	/**
	 * @return the planoList
	 */
	public List<Plano> getPlanoList()
	{
		return planoList;
	}

	/**
	 * @param planoList the planoList to set
	 */
	public void setPlanoList(List<Plano> planoList)
	{
		this.planoList = planoList;
	}

	/**
	 * @return the qntFilial
	 */
	public Integer getQntFilial()
	{
		return qntFilial;
	}

	/**
	 * @param qntFilial the qntFilial to set
	 */
	public void setQntFilial(Integer qntFilial)
	{
		this.qntFilial = qntFilial;
	}

	/**
	 * @return the qntDeposito
	 */
	public Integer getQntDeposito()
	{
		return qntDeposito;
	}

	/**
	 * @param qntDeposito the qntDeposito to set
	 */
	public void setQntDeposito(Integer qntDeposito)
	{
		this.qntDeposito = qntDeposito;
	}



	/**
	 * @return the filialList
	 */
	public List<Filial> getFilialList()
	{
		return filialList;
	}

	/**
	 * @param filialList the filialList to set
	 */
	public void setFilialList(List<Filial> filialList)
	{
		this.filialList = filialList;
	}

	/**
	 * @return the depositoList
	 */
	public List<Deposito> getDepositoList()
	{
		return depositoList;
	}

	/**
	 * @param depositoList the depositoList to set
	 */
	public void setDepositoList(List<Deposito> depositoList)
	{
		this.depositoList = depositoList;
	}

	public List<ContaCorrente> getContaCorrenteList()
	{
		return contaCorrenteList;
	}

	public void setContaCorrenteList(List<ContaCorrente> contaCorrenteList)
	{
		this.contaCorrenteList = contaCorrenteList;
	}

	public List<TarefaEnt> getTarefaList() {
		return tarefaList;
	}

	public void setTarefaList(List<TarefaEnt> tarefaList) {
		this.tarefaList = tarefaList;
	}

	public Integer getParceiroId() {
		return parceiroId;
	}

	public void setParceiroId(Integer parceiroId) {
		this.parceiroId = parceiroId;
	}

	public Integer getContabilidadeId() {
		return contabilidadeId;
	}

	public void setContabilidadeId(Integer contabilidadeId) {
		this.contabilidadeId = contabilidadeId;
	}

	@Override
	public String toString() {
		return "Empresa [getPermissaoTypeEnum()="
				+ getPermissaoTypeEnum() + ", getPlanoList()=" + getPlanoList() + ", getQntFilial()=" + getQntFilial()
				+ ", getQntDeposito()=" + getQntDeposito() + ", getFilialList()=" + getFilialList()
				+ ", getDepositoList()=" + getDepositoList() + ", getContaCorrenteList()=" + getContaCorrenteList()
				+ ", getTarefaList()=" + getTarefaList() + ", getParceiroId()=" + getParceiroId()
				+ ", getContabilidadeId()=" + getContabilidadeId() + ", toString()=" + super.toString() + "]";
	}




}
