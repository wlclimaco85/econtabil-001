package com.econtabil.integration.domain.cnae.model;

import java.util.Date;

import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Cnae extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The account number. */
	private String codigo;

	/** The type of an account. */
	private String cnae;

	/** The description. */
	private String descricao;

	/** The abreviado. */
	private String abreviado;

	/**
	 * Default constructor.
	 */
	public Cnae()
	{
		super();
	}

	public Cnae(String codigo) {
		super();
		this.codigo = codigo;
	}

	public Cnae(Integer id, String cnae, String descricao, String abreviacao, PersistenceActionEnum mode)
	{
		super();
		this.id = id;
		this.cnae = cnae;
		this.descricao = descricao;
		abreviado = abreviacao;
		setModelAction(mode);
	}

	public Cnae(Integer id) {
		super();
		this.id = id;
	}

	public Cnae(Integer id, String cnae) {
		super();
		this.id = id;
		this.cnae = cnae;
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
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
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public String getCodigo()
	{
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the new codigo
	 */
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	/**
	 * Gets the cnae.
	 *
	 * @return the cnae
	 */
	public String getCnae()
	{
		return cnae;
	}

	/**
	 * Sets the cnae.
	 *
	 * @param cnae the new cnae
	 */
	public void setCnae(String cnae)
	{
		this.cnae = cnae;
	}

	/**
	 * Gets the descricao.
	 *
	 * @return the descricao
	 */
	public String getDescricao()
	{
		return descricao;
	}

	/**
	 * Sets the descricao.
	 *
	 * @param descricao the new descricao
	 */
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	/**
	 * Gets the abreviado.
	 *
	 * @return the abreviado
	 */
	public String getAbreviado()
	{
		return abreviado;
	}

	/**
	 * Sets the abreviado.
	 *
	 * @param abreviado the new abreviado
	 */
	public void setAbreviado(String abreviado)
	{
		this.abreviado = abreviado;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * @see com.prosperitasglobal.sendsolv.model.ModelCosmeDamiao#toString()
	 */
	@Override
	public String toString()
	{
		return "Cnae [getId()=" + getId() + ", getCodigo()=" + getCodigo() + ", getCnae()=" + getCnae()
				+ ", getDescricao()=" + getDescricao() + ", getAbreviado()=" + getAbreviado() + ", getType()="
				+ getType() + ", getAcaoType()=" + getAcaoType()
				+ ", getTabelaEnum()=" + getTabelaEnum() + ", toString()=" + super.toString() + "]";
	}

}
