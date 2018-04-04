package com.econtabil.integration.domain.advocacia;

import java.util.Date;

import com.econtabil.integration.domain.enumerate.Enum.PersistenceActionEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */
@SuppressWarnings("serial")
public class GrupoTrabalho extends ModelCosmeDamiao {

	private Integer id;

	private Integer doisValorId;


	/**
	 * Instantiates a new advogado.
	 */
	public GrupoTrabalho() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new advogado.
	 *
	 * @param i the i
	 * @param string the string
	 */
	public GrupoTrabalho(int i, String string) {
		setId(i);
		setModelAction(PersistenceActionEnum.INSERT);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	/**
	 * Instantiates a new advogado.
	 *
	 * @param string the string
	 * @param string2 the string 2
	 * @param object the object
	 */
	public GrupoTrabalho(String string, String string2, Object object) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDoisValorId() {
		return doisValorId;
	}

	public void setDoisValorId(Integer doisValorId) {
		this.doisValorId = doisValorId;
	}

	@Override
	public String toString() {
		return "GrupoTrabalho [getId()=" + getId() + ", getDoisValorId()=" + getDoisValorId() + ", toString()="
				+ super.toString() + "]";
	}



}
