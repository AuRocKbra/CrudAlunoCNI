package com.aurock.cnicrud.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aurock.cnicrud.entites.Aluno;
import com.aurock.cnicrud.repositories.AlunoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public void run(String... args) throws Exception {
		Aluno a1 = new Aluno("Fulano de Tal", "Fulano", "fulano@gmail.com", 'M', "12039012301", new Date(), "06133191230", "01239123121");
		a1.setMatricula("1");
		Aluno a2 = new Aluno("Beltrano de Tal", "Beltrano", "beltrano@gmail.com", 'M', "103102390129", new Date(), "06133191231", "11239123121");
		a2.setMatricula("2");
		alunoRepository.saveAll(Arrays.asList(a1,a2));
	}
	
	
}
