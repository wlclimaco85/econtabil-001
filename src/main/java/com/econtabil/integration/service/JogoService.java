package com.econtabil.integration.service;

import java.util.Date;
import java.util.List;

import com.econtabil.integration.domain.Jogo;
import com.econtabil.integration.domain.Jogo.Status;
import com.econtabil.integration.domain.JogoPorData;
import com.econtabil.integration.domain.User;



public interface JogoService {
	public void updateJogo(Jogo empresa);
	public void deleteJogo(Jogo empresa);
	public List<Jogo> findJogoByUser(Jogo empresa);
	public Jogo findJogoById(Integer empresa);
	public List<Jogo> findAllJogo();
	public List<Jogo> findJogoByUser(User user);
	public List<JogoPorData> findJogoPorDataUserConfirmDTO(Integer JogoId, Date dataJogo);
	void saveJogo(List<Jogo> jogos);
	void saveUpdateJogo(Jogo jogos);
	void saveJogoPorData(List<JogoPorData> jogos);
	void saveJogoPorData(JogoPorData jogoPorData);
	public void updateStatus(Status indisponivel, Integer id);
}
