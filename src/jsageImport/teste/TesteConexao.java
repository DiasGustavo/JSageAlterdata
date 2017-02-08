/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jsageImport.exception.JSageImportException;

/**
 *
 * @author Gustavo
 */
public class TesteConexao {
    
    public static void main (String[] args){
        System.out.println("Conectando ao banco");
        String driver = "org.postgresql.Driver";
        //String url ="jdbc:postgresql://192.168.10.127:5433/ALTERDATA,postgres,java1203";
        //System.out.println(url);
	try{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection("jdbc:postgresql://192.200.250.10:5433/ALTERDATA","postgres","qwe123;");
                //System.out.println("Conexão realizada com sucesso!");
                if (conn != null){
                    System.out.println("conectado.");
                }else{
                    System.out.println("Falha na conexao.");
                }
	} catch (SQLException ex){
            String mensagem = "Não foi possível realizar a conexão com o banco de dados";
            System.out.println(mensagem);
	} catch (ClassNotFoundException ex) {
            String mensagem = "Não foi possível localizar o driver de conexão!";
            System.out.println(mensagem);
        
        }
    }
    
}
