package com.econtabil.integration.domain.cotacao.model;

import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * The Class Document represents a generic formal business or personal document, such as driver's license or bylaws.
 */
@SuppressWarnings("serial")
public class Cotacao extends ModelCosmeDamiao
{

	/** Attributes. */
	private Integer id;

	private String nome;

	public Cotacao(Integer id)
	{
		super();
		this.id = id;
	}

	/**
	 * The Constructor.
	 */
	public Cotacao()
	{

	}

	public Cotacao(Integer id, String nome, PersistenceActionEnum modelAction)
	{
		super();
		this.id = id;
		this.nome = nome;
	}

	public Cotacao(int i, String string) {
		// TODO Auto-generated constructor stub
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
	 * @param id the id
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String toString()
	{
		return "Banco [getId()=" + getId() + ", getNome()=" + getNome()
				+ ", toString()=" + super.toString() + "]";
	}

}