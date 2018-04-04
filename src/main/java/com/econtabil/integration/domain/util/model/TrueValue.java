package com.econtabil.integration.domain.util.model;

import com.econtabil.integration.domain.enumerate.Enum.TrueValueTypeEnum;

// TODO: Auto-generated Javadoc
/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class TrueValue extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The description. */
	private TrueValueTypeEnum valueType;

	/** The numero. */
	private String valor;

	/** The data. */
	private Long label;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TrueValueTypeEnum getValueType() {
		return valueType;
	}

	public void setValueType(TrueValueTypeEnum valueType) {
		this.valueType = valueType;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Long getLabel() {
		return label;
	}

	public void setLabel(Long label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "TrueValue [getId()=" + getId()
				+ ", getValueType()=" + getValueType() + ", getValor()=" + getValor() + ", getLabel()=" + getLabel()
				+ ", toString()=" + super.toString() + "]";
	}


}
