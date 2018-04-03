package com.qat.samples.sysmgmt.produto.model;

import com.qat.samples.sysmgmt.nfeItens.model.NFNotaInfoItemProdutoArmamento;
import com.qat.samples.sysmgmt.nfeItens.model.NFNotaInfoItemProdutoCombustivel;
import com.qat.samples.sysmgmt.nfeItens.model.NFNotaInfoItemProdutoMedicamento;
import com.qat.samples.sysmgmt.nfeItens.model.NFNotaInfoItemProdutoVeiculo;
import com.qat.samples.sysmgmt.util.model.DoisValores;
import com.qat.samples.sysmgmt.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Produto extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The type of an account. */
	private String ncm;

	/** The description. */
	private String cdBarras;

	/** The nome. */
	private Long dataCreate;

	/** The left. */
	private String produto;

	private DoisValores excTabIPI;

	private String cEST;

	private Double quant;

	private UniMed uniMed;

	private Marca marca;

	private DoisValores origem;

	private DoisValores produtoTipo;

	/** The econtabil veiculo for the NFNotaInfoItemProduto. */
	private NFNotaInfoItemProdutoVeiculo veiculo;

	/** The econtabil medicamentos for the NFNotaInfoItemProduto. */
	private NFNotaInfoItemProdutoMedicamento medicamento;

	/** The econtabil armamentos for the NFNotaInfoItemProduto. */
	private NFNotaInfoItemProdutoArmamento armamento;

	/** The econtabil combustivel for the NFNotaInfoItemProduto. */
	private NFNotaInfoItemProdutoCombustivel combustivel;

	/**
	 * Default constructor.
	 */
	public Produto()
	{
		super();
	}

	public Produto(Integer id)
	{
		super();
		this.id = id;
	}

	public Produto(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCdBarras() {
		return cdBarras;
	}

	public void setCdBarras(String cdBarras) {
		this.cdBarras = cdBarras;
	}

	public Long getDataCreate() {
		return dataCreate;
	}

	public void setDataCreate(Long dataCreate) {
		this.dataCreate = dataCreate;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public DoisValores getExcTabIPI() {
		return excTabIPI;
	}

	public void setExcTabIPI(DoisValores excTabIPI) {
		this.excTabIPI = excTabIPI;
	}

	public String getcEST() {
		return cEST;
	}

	public void setcEST(String cEST) {
		this.cEST = cEST;
	}

	public Double getQuant() {
		return quant;
	}

	public void setQuant(Double quant) {
		this.quant = quant;
	}

	public UniMed getUniMed() {
		return uniMed;
	}

	public void setUniMed(UniMed uniMed) {
		this.uniMed = uniMed;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public DoisValores getProdutoTipo() {
		return produtoTipo;
	}

	public void setProdutoTipo(DoisValores produtoTipo) {
		this.produtoTipo = produtoTipo;
	}

	public NFNotaInfoItemProdutoVeiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(NFNotaInfoItemProdutoVeiculo veiculo) {
		this.veiculo = veiculo;
	}


	public NFNotaInfoItemProdutoCombustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(NFNotaInfoItemProdutoCombustivel combustivel) {
		this.combustivel = combustivel;
	}



	public NFNotaInfoItemProdutoMedicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(NFNotaInfoItemProdutoMedicamento medicamento) {
		this.medicamento = medicamento;
	}

	public NFNotaInfoItemProdutoArmamento getArmamento() {
		return armamento;
	}

	public void setArmamento(NFNotaInfoItemProdutoArmamento armamento) {
		this.armamento = armamento;
	}

	public DoisValores getOrigem() {
		return origem;
	}

	public void setOrigem(DoisValores origem) {
		this.origem = origem;
	}

	@Override
	public String toString() {
		return "Produto [getId()=" + getId() + ", getNcm()=" + getNcm() + ", getCdBarras()=" + getCdBarras()
				+ ", getDataCreate()=" + getDataCreate() + ", getProduto()=" + getProduto() + ", getExcTabIPI()="
				+ getExcTabIPI() + ", getcEST()=" + getcEST() + ", getQuant()=" + getQuant() + ", getUniMed()="
				+ getUniMed() + ", getMarca()=" + getMarca() + ", getProdutoTipo()=" + getProdutoTipo()
				+ ", getVeiculo()=" + getVeiculo() + ", getCombustivel()=" + getCombustivel() + ", getMedicamento()="
				+ getMedicamento() + ", getArmamento()=" + getArmamento() + ", getOrigem()=" + getOrigem()
				+ ", toString()=" + super.toString() + "]";
	}

}
