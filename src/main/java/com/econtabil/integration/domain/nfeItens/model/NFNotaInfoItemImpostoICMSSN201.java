/** create by system gera-java version 1.0.0 03/12/2016 13:29 : 12*/
package com.econtabil.integration.domain.nfeItens.model;

import com.econtabil.integration.domain.util.model.DoisValores;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.).
 * This represents an account for a transfer setting.
 */

@SuppressWarnings("serial")
public class NFNotaInfoItemImpostoICMSSN201 extends ModelCosmeDamiao {

	/** The econtabil id for the NFNotaInfoItemImpostoICMSSN201. */
	private Integer id;

	/** The econtabil origem for the NFNotaInfoItemImpostoICMSSN201. */
	private DoisValores origem;

	/**
	 * The econtabil situacaoOperacaoSN for the NFNotaInfoItemImpostoICMSSN201.
	 */
	private DoisValores situacaoOperacaoSN;

	/**
	 * The econtabil modalidadeBCICMSST for the NFNotaInfoItemImpostoICMSSN201.
	 */
	private DoisValores modalidadeBCICMSST;

	/**
	 * The econtabil percentualMargemValorAdicionadoICMSST for the
	 * NFNotaInfoItemImpostoICMSSN201.
	 */
	private String percentualMargemValorAdicionadoICMSST;

	/**
	 * The econtabil percentualReducaoBCICMSST for the
	 * NFNotaInfoItemImpostoICMSSN201.
	 */
	private String percentualReducaoBCICMSST;

	/** The econtabil valorBCICMSST for the NFNotaInfoItemImpostoICMSSN201. */
	private String valorBCICMSST;

	/**
	 * The econtabil percentualAliquotaImpostoICMSST for the
	 * NFNotaInfoItemImpostoICMSSN201.
	 */
	private String percentualAliquotaImpostoICMSST;

	/** The econtabil valorICMSST for the NFNotaInfoItemImpostoICMSSN201. */
	private String valorICMSST;

	/**
	 * The econtabil percentualAliquotaAplicavelCalculoCreditoSN for the
	 * NFNotaInfoItemImpostoICMSSN201.
	 */
	private String percentualAliquotaAplicavelCalculoCreditoSN;

	/**
	 * The econtabil valorCreditoICMSSN for the NFNotaInfoItemImpostoICMSSN201.
	 */
	private String valorCreditoICMSSN;

	/**
	 * Default constructor.
	 */
	public NFNotaInfoItemImpostoICMSSN201() {
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
	 * Gets the origem.
	 *
	 * @return the origem
	 */
	/**
	 * Gets the origem.
	 *
	 * @return the origem
	 */
	public DoisValores getOrigem() {
		return origem;
	}

	/**
	 * Sets the origem.
	 *
	 * @param id
	 *            the origem to set
	 */
	public void setOrigem(DoisValores origem) {
		this.origem = origem;
	}

	/**
	 * Gets the situacaoOperacaoSN.
	 *
	 * @return the situacaoOperacaoSN
	 */
	/**
	 * Gets the situacaoOperacaoSN.
	 *
	 * @return the situacaoOperacaoSN
	 */
	public DoisValores getSituacaoOperacaoSN() {
		return situacaoOperacaoSN;
	}

	/**
	 * Sets the situacaooperacaosn.
	 *
	 * @param id
	 *            the situacaooperacaosn to set
	 */
	public void setSituacaoOperacaoSN(DoisValores situacaooperacaosn) {
		this.situacaoOperacaoSN = situacaooperacaosn;
	}

	/**
	 * Gets the modalidadeBCICMSST.
	 *
	 * @return the modalidadeBCICMSST
	 */
	/**
	 * Gets the modalidadeBCICMSST.
	 *
	 * @return the modalidadeBCICMSST
	 */
	public DoisValores getModalidadeBCICMSST() {
		return modalidadeBCICMSST;
	}

	/**
	 * Sets the modalidadebcicmsst.
	 *
	 * @param id
	 *            the modalidadebcicmsst to set
	 */
	public void setModalidadeBCICMSST(DoisValores modalidadebcicmsst) {
		this.modalidadeBCICMSST = modalidadebcicmsst;
	}

	/**
	 * Gets the percentualMargemValorAdicionadoICMSST.
	 *
	 * @return the percentualMargemValorAdicionadoICMSST
	 */
	/**
	 * Gets the percentualMargemValorAdicionadoICMSST.
	 *
	 * @return the percentualMargemValorAdicionadoICMSST
	 */
	public String getPercentualMargemValorAdicionadoICMSST() {
		return percentualMargemValorAdicionadoICMSST;
	}

	/**
	 * Sets the percentualmargemvaloradicionadoicmsst.
	 *
	 * @param id
	 *            the percentualmargemvaloradicionadoicmsst to set
	 */
	public void setPercentualMargemValorAdicionadoICMSST(String percentualmargemvaloradicionadoicmsst) {
		this.percentualMargemValorAdicionadoICMSST = percentualmargemvaloradicionadoicmsst;
	}

	/**
	 * Gets the percentualReducaoBCICMSST.
	 *
	 * @return the percentualReducaoBCICMSST
	 */
	/**
	 * Gets the percentualReducaoBCICMSST.
	 *
	 * @return the percentualReducaoBCICMSST
	 */
	public String getPercentualReducaoBCICMSST() {
		return percentualReducaoBCICMSST;
	}

	/**
	 * Sets the percentualreducaobcicmsst.
	 *
	 * @param id
	 *            the percentualreducaobcicmsst to set
	 */
	public void setPercentualReducaoBCICMSST(String percentualreducaobcicmsst) {
		this.percentualReducaoBCICMSST = percentualreducaobcicmsst;
	}

	/**
	 * Gets the valorBCICMSST.
	 *
	 * @return the valorBCICMSST
	 */
	/**
	 * Gets the valorBCICMSST.
	 *
	 * @return the valorBCICMSST
	 */
	public String getValorBCICMSST() {
		return valorBCICMSST;
	}

	/**
	 * Sets the valorbcicmsst.
	 *
	 * @param id
	 *            the valorbcicmsst to set
	 */
	public void setValorBCICMSST(String valorbcicmsst) {
		this.valorBCICMSST = valorbcicmsst;
	}

	/**
	 * Gets the percentualAliquotaImpostoICMSST.
	 *
	 * @return the percentualAliquotaImpostoICMSST
	 */
	/**
	 * Gets the percentualAliquotaImpostoICMSST.
	 *
	 * @return the percentualAliquotaImpostoICMSST
	 */
	public String getPercentualAliquotaImpostoICMSST() {
		return percentualAliquotaImpostoICMSST;
	}

	/**
	 * Sets the percentualaliquotaimpostoicmsst.
	 *
	 * @param id
	 *            the percentualaliquotaimpostoicmsst to set
	 */
	public void setPercentualAliquotaImpostoICMSST(String percentualaliquotaimpostoicmsst) {
		this.percentualAliquotaImpostoICMSST = percentualaliquotaimpostoicmsst;
	}

	/**
	 * Gets the valorICMSST.
	 *
	 * @return the valorICMSST
	 */
	/**
	 * Gets the valorICMSST.
	 *
	 * @return the valorICMSST
	 */
	public String getValorICMSST() {
		return valorICMSST;
	}

	/**
	 * Sets the valoricmsst.
	 *
	 * @param id
	 *            the valoricmsst to set
	 */
	public void setValorICMSST(String valoricmsst) {
		this.valorICMSST = valoricmsst;
	}

	/**
	 * Gets the percentualAliquotaAplicavelCalculoCreditoSN.
	 *
	 * @return the percentualAliquotaAplicavelCalculoCreditoSN
	 */
	/**
	 * Gets the percentualAliquotaAplicavelCalculoCreditoSN.
	 *
	 * @return the percentualAliquotaAplicavelCalculoCreditoSN
	 */
	public String getPercentualAliquotaAplicavelCalculoCreditoSN() {
		return percentualAliquotaAplicavelCalculoCreditoSN;
	}

	/**
	 * Sets the percentualaliquotaaplicavelcalculocreditosn.
	 *
	 * @param id
	 *            the percentualaliquotaaplicavelcalculocreditosn to set
	 */
	public void setPercentualAliquotaAplicavelCalculoCreditoSN(String percentualaliquotaaplicavelcalculocreditosn) {
		this.percentualAliquotaAplicavelCalculoCreditoSN = percentualaliquotaaplicavelcalculocreditosn;
	}

	/**
	 * Gets the valorCreditoICMSSN.
	 *
	 * @return the valorCreditoICMSSN
	 */
	/**
	 * Gets the valorCreditoICMSSN.
	 *
	 * @return the valorCreditoICMSSN
	 */
	public String getValorCreditoICMSSN() {
		return valorCreditoICMSSN;
	}

	/**
	 * Sets the valorcreditoicmssn.
	 *
	 * @param id
	 *            the valorcreditoicmssn to set
	 */
	public void setValorCreditoICMSSN(String valorcreditoicmssn) {
		this.valorCreditoICMSSN = valorcreditoicmssn;
	}

	@Override
	public String toString() {
		return "NFNotaInfoItemImpostoICMSSN201 [getId()=" + getId() + ", getOrigem()=" + getOrigem()
				+ ", getSituacaoOperacaoSN()=" + getSituacaoOperacaoSN() + ", getModalidadeBCICMSST()="
				+ getModalidadeBCICMSST() + ", getPercentualMargemValorAdicionadoICMSST()="
				+ getPercentualMargemValorAdicionadoICMSST() + ", getPercentualReducaoBCICMSST()="
				+ getPercentualReducaoBCICMSST() + ", getValorBCICMSST()=" + getValorBCICMSST()
				+ ", getPercentualAliquotaImpostoICMSST()=" + getPercentualAliquotaImpostoICMSST()
				+ ", getValorICMSST()=" + getValorICMSST() + ", getPercentualAliquotaAplicavelCalculoCreditoSN()="
				+ getPercentualAliquotaAplicavelCalculoCreditoSN() + ", getValorCreditoICMSSN()="
				+ getValorCreditoICMSSN() + ", toString()=" + super.toString() + "]";
	}

}
