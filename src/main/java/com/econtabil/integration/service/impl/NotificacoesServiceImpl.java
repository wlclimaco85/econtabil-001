package com.econtabil.integration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.econtabil.integration.domain.Notificacoes;
import com.econtabil.integration.repository.NotificacoesRepository;
import com.econtabil.integration.service.NotificacoesService;

@Service("notificacoesService")
public class NotificacoesServiceImpl implements NotificacoesService{

	@Autowired
	private NotificacoesRepository notificacoesRepository;

	@Override
	public void insertNotificacoes(Notificacoes notificacoes) {
		notificacoesRepository.save(notificacoes);
		
	}

	@Override
	public void updateNotificacoes(Notificacoes notificacoes) {
		notificacoesRepository.save(notificacoes);
		
	}

	@Override
	public void deleteNotificacoes(Notificacoes notificacoes) {
		notificacoesRepository.delete(notificacoes);
		
	}

	@Override
	public List<Notificacoes> findAllNotificacoes() {
		return notificacoesRepository.findAll();
	}

	@Override
	public List<Notificacoes> findNotificacoesByUser(Integer email) {
		// TODO Auto-generated method stub
		return notificacoesRepository.findNotificacoesByUser(email);
	}

	@Override
	public List<Notificacoes> findNotificacoesByEmpr(Integer email) {
		return notificacoesRepository.findNotificacoesByEmpr(email);
	}

	@Override
	public List<Notificacoes> findNotificacoesByJogo(Integer email) {
		return notificacoesRepository.findNotificacoesByJogo(email);
	}

	

}
