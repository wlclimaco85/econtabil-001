package com.econtabil.integration.domain.banco.model;

import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * The Class Document represents a generic formal business or personal document, such as driver's license or bylaws.
 */
@SuppressWarnings("serial")
public class Banco extends ModelCosmeDamiao
{

	/** Attributes. */
	private Integer id;

	private String codigo;

	private String nome;

	private String descricao;

	public Banco(Integer id)
	{
		super();
		this.id = id;
	}

	/**
	 * The Constructor.
	 */
	public Banco()
	{

	}

	public Banco(Integer id, String nome, PersistenceActionEnum modelAction)
	{
		super();
		this.id = id;
		this.nome = nome;
	}

	public Banco(int i, String string) {
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Banco [getId()=" + getId() + ", getNome()=" + getNome() + ", getDescricao()=" + getDescricao()
				+ ", getCodigo()=" + getCodigo() + ", toString()=" + super.toString() + "]";
	}

}