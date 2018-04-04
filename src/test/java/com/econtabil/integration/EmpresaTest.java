package com.econtabil.integration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.econtabil.integration.repository.EmpresaRepository;

@DataJpaTest
@RunWith(SpringRunner.class)
public class EmpresaTest {

	@Autowired
	EmpresaRepository empresaRepository;

	@Autowired
	TestEntityManager entityManager;

	@Test
	public void check_todo_count() {
		assertEquals(3, empresaRepository.count());
	}

}
