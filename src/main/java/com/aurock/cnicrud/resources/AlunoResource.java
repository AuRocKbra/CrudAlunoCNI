package com.aurock.cnicrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurock.cnicrud.entites.Aluno;
import com.aurock.cnicrud.entitesDto.AlunoDTO;
import com.aurock.cnicrud.services.AlunoService;

@RestController
@RequestMapping(value="/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService alunoService;
	/*
	 * @Titulo: findAllAluno
	 * @Descrição: Metodo GET que retorna uma lista de usuarios cadastrados
	 * */
	
	@GetMapping
	public ResponseEntity<List<AlunoDTO>> findAllAluno(){
		List<AlunoDTO> alunos = new ArrayList<>();
		alunos = alunoService.findAllAlunos();
		return ResponseEntity.ok().body(alunos);
	}
	
	/*
	 * @Titulo: findByMatricula
	 * @Descrição: Metodo GET que retorna dados do aluno com a matricula informada
	 * */
	@GetMapping(value = "/{matricula}")
	public ResponseEntity<Aluno> findByMatricula(@PathVariable String matricula){
		Aluno aluno = alunoService.findByMatricula(matricula);
		return ResponseEntity.ok().body(aluno);
	}
	
	/*
	 * @Titulo: cadastrar
	 * @Descrição: Metodo POST que cadastra um novo registro do tipo aluno.
	 * @Retorno: String contendo a informação sobre o resultado do processo.
	 * */
	@PostMapping(value = "/cadastrar")
	public ResponseEntity<String> cadastrar(@RequestBody Aluno novoAluno){
		return ResponseEntity.ok().body(alunoService.inserAluno(novoAluno));
	}
	
	/*
	 * @Titulo: deletar
	 * @Descrição: Metodo DELETE deleta um novo registro do tipo aluno.
	 * @Retorno: String contendo a informação sobre o resultado do processo.
	 * */
	@DeleteMapping(value = "/deletar/{dadoBusca}")
	public ResponseEntity<String> deletar(@PathVariable String dadoBusca){
		return ResponseEntity.ok().body(alunoService.deleteAluno(dadoBusca));
	}
	
	/*
	 * @Titulo: atualizar
	 * @Descrição: Metodo PUT que atualiza um registro do tipo aluno.
	 * @Retorno: String contendo a informação sobre o resultado do processo.
	 * */
	@PutMapping(value = "/atualizar/{matricula}")
	public ResponseEntity<String> atualizar(@PathVariable String matricula, @RequestBody AlunoDTO novosDados){
		return ResponseEntity.ok().body(alunoService.atualuzaDadosAluno(matricula, novosDados));
	}
}
