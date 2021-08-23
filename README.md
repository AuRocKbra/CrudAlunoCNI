# CrudAlunoCNI

<h4>Projeto criado com o objetivo de oferecer uma API Rest de CRUD para com os alunos de uma instituição</h4>

<h5>Tecnologias e métodos usados:</h5>

=================
<!--ts-->
 * Spring Boot (Framework usado para desenvolvimento do back-end);
 * Java (Linguagem usada pelo Framework);
 * Modelo de 3 camadas de serviço:
    * Resource (Para disponibilizar as chamadas rest para o cliente);
    * Service (Para receber os dados das requisições vindas da camada de resource, aplicar regras de negócio e retornar os resultados do processamento);
    * Repository (Para manipulação com o banco de dados);
 * JPA para uso de bando de dados;
 * Banco de dados H2;
 * Padrão de criação de entidade DTO para controlar a exposição dos dados da entidade cliente, bem como limitar os método implementados na entidade;
 * Maven como gerenciador de dependências do projeto;
 * JDK 11;
 <!--te-->
 
 <h5>Chamadas rest implementadas</h5>
 
 ###Funcionalidades
  - [x] Listar dados de todos os alunos (/alunos);
  - [x] Listar dados de um aluno com matricula específica(/alunos/{matricula});
  - [x] Cadastrar novo aluno(/alunos/cadastrar). Deve-se passa um JSON do tipo aluno contendo os dados do novo aluno;
  - [x] Deletar aluno de matricula ou email específico(/alunos/deletar/{dadoBusca});
  - [x] Atualizar dados do aluno de matricula especifica(/alunos/atualizar/{matricula}). Deve-se informar um JSON do tipo AlunoDTO para atualização dos dados;
 
 
 <h5>Ferramentas de desenvolvimento usadas</h5>
 
 =================
<!--ts-->
 * Spring Tool Suite 4;
 * Postman;
 <!--te-->
