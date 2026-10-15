/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Connection.Conexao;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * model - define os dados a serem salvo
 * View - define as nossas telas
 * Control - responsavel pelas acoes (salvar, listar, excluir
 * , atualizar, logar, deslogar)
 */
public class UsuarioController {
    // throws SQLException - é obrigatorio em metodos que usam
    // conexao com banco de dados!
    // Usuario user - e o objeto da classe Usuario
    public void CadastrarUsuario(Usuario user)throws SQLException{
        //criando codigo sql para cadastrar info da tabela
        String sql = "INSERT INTO usuario " + "(nome,cpf,sexo,email,senha,telefone,endereco,"
                + "datanascimento) VALUES (?,?,?,?,?,?,?,?)";
        
        //criando um try catch - para lidar com erros
        try(Connection conexao = Conexao.conectar();
                PreparedStatement comando = conexao.prepareStatement(sql)){
            //informar
            comando.setString(1, user.getNome());
            comando.setString(2, user.getCpf());
            comando.setString(3, user.getSexo());
            comando.setString(4, user.getEmail());
            comando.setString(5, user.getSenha());
            comando.setString(6, user.getTelefone());
            comando.setString(7, user.getEndereco());
            comando.setString(8, user.getDataNascimento());
            // executando o comando dentro do mysql
            comando.executeUpdate();
             JOptionPane.showMessageDialog(null,"Usuario  cadastrado!");
            
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Usuario nao cadastrado!");
        }
    }
    
        
    }
    

