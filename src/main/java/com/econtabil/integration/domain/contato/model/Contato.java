package com.econtabil.integration.domain.contato.model;

import com.econtabil.integration.domain.enumerate.Enum.ContatoTypeEnum;
import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

// TODO: Auto-generated Javadoc
/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class Contato extends ModelCosmeDamiao
{
	/** The SendSolv id for the account. */
	private Integer id;

	private Integer lido;

	/** The data contato. */
	private Long dataContato;

	/** The nome. */
	private String nome;
	private String assunto;

	/** The email. */
	private String email;

	/** The telefone. */
	private String telefone;

	/** The motivo. */
	private ContatoTypeEnum motivo;

	private String texto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getDataContato() {
		return dataContato;
	}

	public void setDataContato(Long dataContato) {
		this.dataContato = dataContato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ContatoTypeEnum getMotivo() {
		return motivo;
	}

	public void setMotivo(ContatoTypeEnum motivo) {
		this.motivo = motivo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getLido() {
		return lido;
	}

	public void setLido(Integer ledo) {
		this.lido = ledo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	@Override
	public String toString() {
		return "Contato [getDataContato()="
				+ getDataContato() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getTelefone()="
				+ getTelefone() + ", getMotivo()=" + getMotivo() + ", getTexto()=" + getTexto() + ", getLido()="
				+ getLido() + ", getAssunto()=" + getAssunto() + ", toString()=" + super.toString() + "]";
	}


}
