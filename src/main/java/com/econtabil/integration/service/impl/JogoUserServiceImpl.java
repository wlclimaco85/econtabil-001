package com.econtabil.integration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.econtabil.integration.domain.UserJogo2;
import com.econtabil.integration.domain.UserJogo2.StatusUser;
import com.econtabil.integration.repository.JogoUserRepository;
import com.econtabil.integration.service.JogoUserService;

@Service("jogoUserService")
public class JogoUserServiceImpl implements JogoUserService{

	@Autowired
	private JogoUserRepository jogoUserRepository;



	@Override
	public void deleteJogoUser(UserJogo2 empresa) {
		jogoUserRepository.delete(empresa);
	}

	@Override
	public void saveUserJogo(List<UserJogo2> jogos) {
		jogoUserRepository.save(jogos);
		
	}

	@Override
	public List<UserJogo2> findJogoUserByJogoId(Integer jogoId) {
		return jogoUserRepository.findJogoUserByJogoId(jogoId);
	}

	@Override
	public void updateStatus(StatusUser status, Integer jogoId) {
		jogoUserRepository.updateStatus(status,jogoId);
		
	}

	@Override
	public void updateJogoUser(UserJogo2 empresa) {
		// TODO Auto-generated method stub
		
	}
	
		

}
