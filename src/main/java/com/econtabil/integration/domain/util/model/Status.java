package com.econtabil.integration.domain.util.model;

import java.util.Date;

import com.econtabil.integration.domain.enumerate.Enum.CdStatusTypeEnum;

/**
 * The Class Document represents a generic formal business or personal document, such as driver's license or bylaws.
 */
@SuppressWarnings("serial")
public class Status extends ModelCosmeDamiao
{

	/** Attributes. */
	private Integer id;

	/** The parent key. */
	private Long dataStatus;

	/** The parent key type. */
	private CdStatusTypeEnum status;

	private String note;

	public Status(Integer id, Long dataStatus, CdStatusTypeEnum status, String note) {
		super();
		this.id = id;
		this.dataStatus = dataStatus;
		this.status = status;
		this.note = note;
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	/**
	 * The Constructor.
	 */
	public Status()
	{

	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Long getDataStatus()
	{
		return dataStatus;
	}

	public void setDataStatus(Long dataStatus)
	{
		this.dataStatus = dataStatus;
	}

	public CdStatusTypeEnum getStatus()
	{
		return status;
	}

	public void setStatus(CdStatusTypeEnum status)
	{
		this.status = status;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

	@Override
	public String toString()
	{
		return "Status [getId()=" + getId() + ", getDataStatus()=" + getDataStatus() + ", getStatus()=" + getStatus()
				+ ", getNote()=" + getNote() + ", toString()=" + super.toString() + "]";
	}

}