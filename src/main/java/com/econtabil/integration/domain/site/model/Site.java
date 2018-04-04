package com.econtabil.integration.domain.site.model;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.Empresa;
import com.econtabil.integration.domain.contabilidade.model.Plano;
import com.econtabil.integration.domain.enumerate.Enum.SiteTypeEnum;
import com.econtabil.integration.domain.produto.model.Servico;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Site extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	/** The type of an account. */
	private String nome;
	
	private String comoTrabalhamos;

	private String url;

	private String quemSomos;

	private String missao;

	private String visao;

	private String titulo;

	private String logo;

	private SiteTypeEnum siteTypeEnum;

	private boolean atorization;

	private Empresa empresa;

	private List<Servico> servicoList;

	private List<Plano> planoList;

	

	public Site()
	{

	}

	public Site(int i, String string) {
		this.id = i;
		this.nome = string;
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	public SiteTypeEnum getSiteTypeEnum() {
		return siteTypeEnum;
	}

	public void setSiteTypeEnum(SiteTypeEnum siteTypeEnum) {
		this.siteTypeEnum = siteTypeEnum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Servico> getServicoList() {
		return servicoList;
	}

	public void setServicoList(List<Servico> servicoList) {
		this.servicoList = servicoList;
	}

	public List<Plano> getPlanoList() {
		return planoList;
	}

	public void setPlanoList(List<Plano> planoList) {
		this.planoList = planoList;
	}

	public String getQuemSomos() {
		return quemSomos;
	}

	public void setQuemSomos(String quemSomos) {
		this.quemSomos = quemSomos;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public String getVisao() {
		return visao;
	}

	public void setVisao(String visao) {
		this.visao = visao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public boolean isAtorization() {
		return atorization;
	}

	public void setAtorization(boolean atorization) {
		this.atorization = atorization;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getComoTrabalhamos() {
		return comoTrabalhamos;
	}

	public void setComoTrabalhamos(String comoTrabalhamos) {
		this.comoTrabalhamos = comoTrabalhamos;
	}

	@Override
	public String toString() {
		return "Site [getSiteTypeEnum()=" + getSiteTypeEnum()
				+ ", getId()=" + getId() + ", getNome()=" + getNome() + ", getUrl()=" + getUrl() + ", getServicoList()="
				+ getServicoList() + ", getPlanoList()=" + getPlanoList() + ", getQuemSomos()=" + getQuemSomos()
				+ ", getMissao()=" + getMissao() + ", getVisao()=" + getVisao() + ", getTitulo()=" + getTitulo()
				+ ", getLogo()=" + getLogo() + ", isAtorization()=" + isAtorization() + ", getEmpresa()=" + getEmpresa()
				+ ", getComoTrabalhamos()=" + getComoTrabalhamos() + ", toString()=" + super.toString() + "]";
	}


}
