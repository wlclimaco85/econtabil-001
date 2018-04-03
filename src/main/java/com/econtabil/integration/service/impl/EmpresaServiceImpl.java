package com.econtabil.integration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.econtabil.integration.domain.Empresa;
import com.econtabil.integration.repository.EmpresaRepository;
import com.econtabil.integration.service.EmpresaService;

@Service("empresaService")
public class EmpresaServiceImpl implements EmpresaService{

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	
	public Empresa findEmpresaByEmail(String email) {
		return empresaRepository.findByEmail(email);
	}
	@Override
	public void saveEmpresa(Empresa user) {
		
		empresaRepository.save(user);
		
	}
	@Override
	public void updateEmpresa(Empresa user) {
		empresaRepository.save(user);
		
	}
	@Override
	public void deleteEmpresa(Empresa user) {
		empresaRepository.delete(user);
	}
	//@Override
	//public List<Empresa> findEmpresaByUser(Empresa user) {
	//	return empresaRepository.findEmpresaByUser(user);
		
	//}

	@Override
	public List<Empresa> findAllEmpresa() {
		return empresaRepository.findAll();
	}
	@Override
	public List<Empresa> findEmpresaByUser(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
