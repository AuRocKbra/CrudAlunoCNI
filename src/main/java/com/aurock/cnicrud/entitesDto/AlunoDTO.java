package com.aurock.cnicrud.entitesDto;

import java.io.Serializable;

/*
 * @Titulo: AlunoDTO
 * @Descrição: Classe DTO para retorno de dados da entidade aluno
 * */

public class AlunoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeCompleto;
	private String email;
	private String telefonePrimario;
	private String telefoneSecundario;
	private String matricula;
	
	public AlunoDTO() {}

	public AlunoDTO(String nomeCompleto, String email, String telefonePrimario, String telefoneSecundario,
			String matricula) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefonePrimario = telefonePrimario;
		this.telefoneSecundario = telefoneSecundario;
		this.matricula = matricula;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefonePrimario() {
		return telefonePrimario;
	}

	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	public String getMatricula() {
		return matricula;
	}
	
	
}
