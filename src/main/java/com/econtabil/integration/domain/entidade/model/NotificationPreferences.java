package com.econtabil.integration.domain.entidade.model;

import com.econtabil.integration.domain.enumerate.Enum.NotificationTypeEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class NotificationPreferences extends ModelCosmeDamiao
{
	private NotificationTypeEnum notificationType;

	private Integer quantidade;

	public NotificationTypeEnum getNotificationType()
	{
		return notificationType;
	}

	public void setNotificationType(NotificationTypeEnum notificationType)
	{
		this.notificationType = notificationType;
	}

	public Integer getQuantidade()
	{
		return quantidade;
	}

	public void setQuantidade(Integer quantidade)
	{
		this.quantidade = quantidade;
	}

	@Override
	public String toString()
	{
		return "NotificationPreferences [getNotificationType()=" + getNotificationType() + ", getQuantidade()="
				+ getQuantidade() + ", toString()=" + super.toString() + "]";
	}

}
