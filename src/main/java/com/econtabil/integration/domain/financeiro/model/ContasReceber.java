package com.econtabil.integration.domain.financeiro.model;

import com.econtabil.integration.domain.pessoa.model.Cliente;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class ContasReceber extends Titulo
{
	/** The SendSolv id for the account. */

	/** The description. */
	private Cliente cliente;

	/**
	 * Default constructor.
	 */
	public ContasReceber()
	{
		super();
	}

	public ContasReceber(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "ContasReceber [getCliente()=" + getCliente() + ", toString()=" + super.toString() + "]";
	}



}
