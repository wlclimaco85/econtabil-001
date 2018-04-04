/** create by system gera-java version 1.0.0 03/12/2016 13:29 : 12*/
package com.econtabil.integration.domain.nfeItens.model;

import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@SuppressWarnings("serial")
public class NFNotaInfoItemExportacaoIndireta extends ModelCosmeDamiao {

	/** The econtabil id for the NFNotaInfoItemExportacaoIndireta. */
	private Integer id;

	/**
	 * The econtabil numeroRegistroExportacao for the
	 * NFNotaInfoItemExportacaoIndireta.
	 */
	private Long numeroRegistroExportacao;

	/**
	 * The econtabil chaveAcessoNFe for the NFNotaInfoItemExportacaoIndireta.
	 */
	private String chaveAcessoNFe;

	/**
	 * The econtabil quantidadeItemEfetivamenteExportado for the
	 * NFNotaInfoItemExportacaoIndireta.
	 */
	private String quantidadeItemEfetivamenteExportado;

	/**
	 * Default constructor.
	 */
	public NFNotaInfoItemExportacaoIndireta() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the numeroRegistroExportacao.
	 *
	 * @return the numeroRegistroExportacao
	 */
	/**
	 * Gets the numeroRegistroExportacao.
	 *
	 * @return the numeroRegistroExportacao
	 */
	public Long getNumeroRegistroExportacao() {
		return numeroRegistroExportacao;
	}

	/**
	 * Sets the numeroregistroexportacao.
	 *
	 * @param id
	 *            the numeroregistroexportacao to set
	 */
	public void setNumeroRegistroExportacao(Long numeroregistroexportacao) {
		this.numeroRegistroExportacao = numeroregistroexportacao;
	}

	/**
	 * Gets the chaveAcessoNFe.
	 *
	 * @return the chaveAcessoNFe
	 */
	/**
	 * Gets the chaveAcessoNFe.
	 *
	 * @return the chaveAcessoNFe
	 */
	public String getChaveAcessoNFe() {
		return chaveAcessoNFe;
	}

	/**
	 * Sets the chaveacessonfe.
	 *
	 * @param id
	 *            the chaveacessonfe to set
	 */
	public void setChaveAcessoNFe(String chaveacessonfe) {
		this.chaveAcessoNFe = chaveacessonfe;
	}

	/**
	 * Gets the quantidadeItemEfetivamenteExportado.
	 *
	 * @return the quantidadeItemEfetivamenteExportado
	 */
	/**
	 * Gets the quantidadeItemEfetivamenteExportado.
	 *
	 * @return the quantidadeItemEfetivamenteExportado
	 */
	public String getQuantidadeItemEfetivamenteExportado() {
		return quantidadeItemEfetivamenteExportado;
	}

	/**
	 * Sets the quantidadeitemefetivamenteexportado.
	 *
	 * @param id
	 *            the quantidadeitemefetivamenteexportado to set
	 */
	public void setQuantidadeItemEfetivamenteExportado(String quantidadeitemefetivamenteexportado) {
		this.quantidadeItemEfetivamenteExportado = quantidadeitemefetivamenteexportado;
	}

	@Override
	public String toString() {
		return "NFNotaInfoItemExportacaoIndireta [getId()=" + getId() + ", getNumeroRegistroExportacao()="
				+ getNumeroRegistroExportacao() + ", getChaveAcessoNFe()=" + getChaveAcessoNFe()
				+ ", getQuantidadeItemEfetivamenteExportado()=" + getQuantidadeItemEfetivamenteExportado()
				+ ", toString()=" + super.toString() + "]";
	}

}
