package com.econtabil.integration.domain.nf.model;

import com.econtabil.integration.domain.enumerate.Enum.NotaTypeEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class HistoricoNF extends ModelCosmeDamiao
{

	private Integer id;

	private Integer notaId;

	private Long data;

	private NotaTypeEnum notaTypeEnum;


	public HistoricoNF(Long data, NotaTypeEnum notaTypeEnum)
	{
		super();
		this.data = data;
		this.notaTypeEnum = notaTypeEnum;
	}

	public HistoricoNF()
	{
		super();
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getNotaId()
	{
		return notaId;
	}

	public void setNotaId(Integer notaId)
	{
		this.notaId = notaId;
	}

	public Long getData()
	{
		return data;
	}

	public void setData(Long data)
	{
		this.data = data;
	}

	/**
	 * @return the notaTypeEnum
	 */
	public NotaTypeEnum getNotaTypeEnum()
	{
		return notaTypeEnum;
	}

	/**
	 * @param notaTypeEnum the notaTypeEnum to set
	 */
	public void setNotaTypeEnum(NotaTypeEnum notaTypeEnum)
	{
		this.notaTypeEnum = notaTypeEnum;
	}

	@Override
	public String toString()
	{
		return "HistoricoNF [getId()=" + getId()
				+ ", getNotaId()=" + getNotaId() + ", getData()=" + getData() + ", getNotaTypeEnum()="
				+ getNotaTypeEnum() + ", toString()=" + super.toString() + "]";
	}

}
