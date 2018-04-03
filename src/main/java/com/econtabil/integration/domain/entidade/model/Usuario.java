package com.econtabil.integration.domain.entidade.model;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.pessoa.model.Pessoa;
import com.econtabil.integration.domain.util.model.Documento;
import com.econtabil.integration.domain.util.model.Email;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Usuario extends Pessoa
{

	private String email;

	private String senha;

	private Documento cpf;

	private String pergunta;

	private List<Role> roles;

	private String telefone;

	private String language;

	private Long ultAcesso;

	private List<Email> emails;


	private ConfiguracaoNFe configNFe;

	public Usuario(Integer id) {
		super();
		setId(id);
		setModifyDateUTC((new Date()).getTime());
		setModifyUser("system");
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public String getSenha()
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

	public String getPergunta()
	{
		return pergunta;
	}

	public void setPergunta(String pergunta)
	{
		this.pergunta = pergunta;
	}



	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public Long getUltAcesso()
	{
		return ultAcesso;
	}

	public void setUltAcesso(Long ultAcesso)
	{
		this.ultAcesso = ultAcesso;
	}

	@Override
	public List<Email> getEmails()
	{
		return emails;
	}

	@Override
	public void setEmails(List<Email> emails)
	{
		this.emails = emails;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Documento getCpf() {
		return cpf;
	}

	public void setCpf(Documento cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public ConfiguracaoNFe getConfigNFe() {
		return configNFe;
	}

	public void setConfigNFe(ConfiguracaoNFe configNFe) {
		this.configNFe = configNFe;
	}

	@Override
	public String toString() {
		return "Usuario [getSenha()=" + getSenha() + ", getPergunta()=" + getPergunta() + ", getRoles()=" + getRoles()
				+ ", getLanguage()=" + getLanguage() + ", getUltAcesso()=" + getUltAcesso() + ", getEmails()="
				+ getEmails() + ", getTelefone()=" + getTelefone() + ", getCpf()=" + getCpf() + ", getEmail()="
				+ getEmail() + ", getConfigNFe()=" + getConfigNFe() + ", toString()=" + super.toString() + "]";
	}

}
