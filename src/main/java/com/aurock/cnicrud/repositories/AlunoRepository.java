package com.aurock.cnicrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurock.cnicrud.entites.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	Aluno findByMatricula(String matricula);
}
