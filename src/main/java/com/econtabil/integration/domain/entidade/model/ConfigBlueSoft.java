package com.econtabil.integration.domain.entidade.model;

import com.econtabil.integration.domain.util.model.ModelCosmeDamiao;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */
@SuppressWarnings("serial")
public class ConfigBlueSoft extends ModelCosmeDamiao
{
	private Integer id;


	private Integer ativBlue;
	private String url;
	private String token;

	public ConfigBlueSoft()
	{
		super();
	}

	public ConfigBlueSoft(Integer id)
	{
		setId(id);
	}

	public ConfigBlueSoft(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAtivBlue() {
		return ativBlue;
	}

	public void setAtivBlue(Integer ativBlue) {
		this.ativBlue = ativBlue;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "ConfigBlueSoft [getId()=" + getId() + ", getAtivBlue()=" + getAtivBlue() + ", getUrl()=" + getUrl()
				+ ", getToken()=" + getToken() + ", toString()=" + super.toString() + "]";
	}




}
