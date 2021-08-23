package com.aurock.cnicrud.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * @Titulo: Aluno
 * @Descrição: Classe que define a entidade aluno
 * */
@Entity
public class Aluno implements Serializable{
	

		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer alunoId;
		private String nomeCompleto;
		private String primeiroNome;
		private String email;
		private char sexo;
		private String cpf;
		private String matricula;
		private Date dataDeNacimento;
		private String telefonePrimario;
		private String telefoneSecundario;
		
		public Aluno() {};
		
		public Aluno(String nomeCompleto, String primeiroNome, String email, char sexo, String cpf, Date dataDeNacimento, String telefonePrimario, String telefoneSecundario) {
			super();
			this.nomeCompleto = nomeCompleto;
			this.primeiroNome = primeiroNome;
			this.email = email;
			this.sexo = sexo;
			this.cpf = cpf;
			this.dataDeNacimento = dataDeNacimento;
			this.telefonePrimario = telefonePrimario;
			this.telefoneSecundario = telefoneSecundario;
		}

		public Integer getAlunoId() {
			return alunoId;
		}

		public void setAlunoId(Integer alunoId) {
			this.alunoId = alunoId;
		}

		public String getNomeCompleto() {
			return nomeCompleto;
		}

		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}

		public String getPrimeiroNome() {
			return primeiroNome;
		}

		public void setPrimeiroNome(String primeiroNome) {
			this.primeiroNome = primeiroNome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public Date getDataDeNacimento() {
			return dataDeNacimento;
		}

		public void setDataDeNacimento(Date dataDeNacimento) {
			this.dataDeNacimento = dataDeNacimento;
		}

		public String getTelefonePrimario() {
			return telefonePrimario;
		}

		public void setTelefonePrimario(String telefonePrimario) {
			this.telefonePrimario = telefonePrimario;
		}

		public String getTelefoneSecundario() {
			return telefoneSecundario;
		}

		public void setTelefoneSecundario(String telefoneSecundario) {
			this.telefoneSecundario = telefoneSecundario;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			return true;
		}
		
		
}
