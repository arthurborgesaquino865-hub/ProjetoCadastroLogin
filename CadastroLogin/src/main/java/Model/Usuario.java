/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ArthurAquino
 */
public class Usuario {
    /*Primeira regra de seguranca:
    - todos os atributos sao declarados como privados
    - private informa que somente a classe pode acessar
    */
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;
    private String senha;
    private String sexo;
    private String endereco;
    private String telefone;
    
    // construtor - metodo que inicializa o objeto criado
    // construtor - precisa ter o mesmo nome da classe
    public void Ususario(){
        
    }
    
    // SETTER - é utilizado para cadastrar e atualizar dados 
    // metodo com parametro - quem chamar tem que passar texto 
    public void setNome(String valor){
        this.nome = valor;
    }//fim do setNome
    
    public void setCpf(String valor){
        this.cpf = valor;
    }// fim do setCpf
    
    public void setDataNascimento(String valor){
        this.dataNascimento = valor;
    }//fim do setDataNascimento

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    // GETTER - possibilita ler o dado que tem na variavel
    // metodo com retorno do tipo String
    public String getNome(){
        return this.nome;
    }// fim do getNome

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }
    
    





}
