package com.econtabil.integration.domain.banco.model;

import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class BancoCC extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	private Banco banco;

	/** The type of an account. */
	private String numeroConta;

	private double saldo;

	public BancoCC()
	{

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
	 * @return the banco
	 */
	public Banco getBanco()
	{
		return banco;
	}

	/**
	 * @param banco the banco to set
	 */
	public void setBanco(Banco banco)
	{
		this.banco = banco;
	}

	/**
	 * @return the numeroConta
	 */
	public String getNumeroConta()
	{
		return numeroConta;
	}

	/**
	 * @param numeroConta the numeroConta to set
	 */
	public void setNumeroConta(String numeroConta)
	{
		this.numeroConta = numeroConta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo()
	{
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	@Override
	public String toString()
	{
		return "BancoCC [getId()=" + getId() + ", getBanco()=" + getBanco() + ", getNumeroConta()=" + getNumeroConta()
				+ ", getSaldo()=" + getSaldo() + ", toString()=" + super.toString() + "]";
	}

}
