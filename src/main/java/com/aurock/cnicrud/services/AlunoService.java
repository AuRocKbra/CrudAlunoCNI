package com.aurock.cnicrud.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurock.cnicrud.entites.Aluno;
import com.aurock.cnicrud.entitesDto.AlunoDTO;
import com.aurock.cnicrud.repositories.AlunoRepository;



@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	/*
	 * @Titulo: findAllAlunos
	 * @Descrição: retorna uma lista do tipo AlunoDTO contendo os dados de todos os alunos cadastrados na base 
	 * */
	public List<AlunoDTO> findAllAlunos(){
		List<Aluno> alunos = new ArrayList<>();
		alunos = alunoRepository.findAll();
		List<AlunoDTO> alunoDTOs = new ArrayList<>();
		for(Aluno aluno : alunos) {
			AlunoDTO alunoDTO = new AlunoDTO(aluno.getNomeCompleto(), aluno.getEmail(), aluno.getTelefonePrimario(), aluno.getTelefoneSecundario(), aluno.getMatricula());
			alunoDTOs.add(alunoDTO);
		}
		return alunoDTOs;
	}
	
	/*
	 * @Titulo: findAllAlunos
	 * @Descrição: retorna os dados do aluno correspondente a matricula informada 
	 * */
	public Aluno findByMatricula(String matricula) {
		Aluno aluno = new Aluno();
		aluno = alunoRepository.findByMatricula(matricula);
		if(aluno == null) {
			aluno = new Aluno("Não existe aluno cadastrado com o número de matrícula informado", null, null, ' ', null, null, null, null);
		}
		return aluno;
	}
	
	/*
	 * @Titulo: insetAluno
	 * @Descrição: Cadastra um novo registro do tipo aluno
	 * */
	public String inserAluno(Aluno novoAluno) {
		List<Aluno> alunos = alunoRepository.findAll();
		for(Aluno alunoAntigo : alunos) {
			if(novoAluno.getEmail().equals(alunoAntigo.getEmail()) || novoAluno.getCpf().equals(alunoAntigo.getCpf())) {
				return "Já existe um aluno cadastrado com os dados informados!";
			}
		}
		Integer matriculaNovoAluno = alunos.get(alunos.size()-1).getAlunoId()+1;
		novoAluno.setMatricula(matriculaNovoAluno.toString());
		alunoRepository.save(novoAluno);
		return "Novo aluno cadastrado com sucesso!";
	}
	
	/*
	 * @Titulo: deleteAluno
	 * @Descrição:Deleta um registro do tipo aluno
	 * */
	public String deleteAluno(String dadoBusca) {
		List<Aluno> alunos = alunoRepository.findAll();
		for(Aluno aluno: alunos) {
			if(aluno.getEmail().equals(dadoBusca) || aluno.getMatricula().equals(dadoBusca)) {
				alunoRepository.delete(aluno);
				return "Registro do aluno deletado com sucesso!";
			}
		}
		return "Nenhum aluno foi encontrado com o dados de busca informado!";
	}
	
	/*
	 * @Titulo: atualuzaDadosAluno
	 * @Descrição:Atualiza um registro do tipo aluno
	 * */
	public String atualuzaDadosAluno(String matricula, AlunoDTO novosDadosAluno) {
		Aluno aluno = findByMatricula(matricula);
		if(aluno.getPrimeiroNome() == null) {
			return aluno.getNomeCompleto();
		}
		else {
			aluno.setNomeCompleto(novosDadosAluno.getNomeCompleto());
			aluno.setEmail(novosDadosAluno.getEmail());
			aluno.setTelefonePrimario(novosDadosAluno.getTelefonePrimario());
			aluno.setTelefoneSecundario(novosDadosAluno.getTelefoneSecundario());
			alunoRepository.save(aluno);
			return "Dados do aluno de matricula "+novosDadosAluno.getMatricula()+" atualizado com sucesso!";
		}
	}
}
