/*
 * Gerenciamento das conexões com o banco de dados
 */
package jsageImport.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jsageImport.exception.JSageImportException;

/**
 * @author Gustavo Dias
 * Criação: 06/06/2016
 * Última modificação: 07/06/2016
 */
class GerenciadorConexao {
    
    /**
     * Gera conexão com o banco de dados sem parâmetro
     * @return Connection
     * @throws ClassNotFoundException 
     */
    static Connection getConnection() throws JSageImportException{
		//System.out.println("Conectando ao banco");
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        //jdbc:sqlserver://servidor:porta;databaseName=banco;user=usuario;password=senha;"
			return DriverManager.getConnection("jdbc:sqlserver://192.168.10.105:1433;databaseName=sage_gestao_contabil;user=sa;password=S@geBr.2014;");
		} catch (SQLException ex){
                    String mensagem = "Não foi possível realizar a conexão com o banco de dados";
                    throw new JSageImportException(mensagem);
		} catch (ClassNotFoundException ex) {
                    String mensagem = "Não foi possível localizar o driver de conexão!";
                    throw new JSageImportException (mensagem);
                }
	}
    static Connection getConnectionPostgresql (String url) throws JSageImportException{
        try{
			Class.forName("org.postgresql.Driver");
                        //jdbc:sqlserver://servidor:porta;databaseName=banco;user=usuario;password=senha;"
			return DriverManager.getConnection(url);
		} catch (SQLException ex){
                    String mensagem = "Não foi possível realizar a conexão com o banco de dados";
                    throw new JSageImportException(mensagem);
		} catch (ClassNotFoundException ex) {
                    String mensagem = "Não foi possível localizar o driver de conexão!";
                    throw new JSageImportException (mensagem);
                }
    }
    
    static Connection getConnectionPostGresql(String server, String bd, String port, String user, String password){
        
        String driver = "org.postgresql.Driver";
        String url ="jdbc:postgresql://"+server+":"+port+"/"+bd;
        String usuario = user;
        String senha = password;
        Connection con = null;        
	try{
		Class.forName(driver);
                con = DriverManager.getConnection(url, usuario, senha);
               
	// return con;	
	} catch (SQLException ex){
            String mensagem = "Não foi possível realizar a conexão com o banco de dados";
            //throw new JsageImportException(mensagem);
	} catch (ClassNotFoundException ex) {
            String mensagem = "Não foi possível localizar o driver de conexão!";
            //throw new JsageImportException (mensagem);
        }  
        return con;
    }
    
    static Connection getConnectionPostgresUrl(String url, String user, String password){
        
        String driver = "org.postgresql.Driver";
        String urlBD = url;
        String usuario = user;
        String senha = password;
        Connection con = null;        
	try{
		Class.forName(driver);
                con = DriverManager.getConnection(urlBD, usuario, senha);
               
	// return con;	
	} catch (SQLException ex){
            String mensagem = "Não foi possível realizar a conexão com o banco de dados";
            //throw new JsageImportException(mensagem);
	} catch (ClassNotFoundException ex) {
            String mensagem = "Não foi possível localizar o driver de conexão!";
            //throw new JsageImportException (mensagem);
        }  
        return con;
    }
    
    static Connection getConnection(String url) throws JSageImportException{
		//System.out.println("Conectando ao banco");
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        //jdbc:sqlserver://servidor:porta;databaseName=banco;user=usuario;password=senha;"
			return DriverManager.getConnection(url);
		} catch (SQLException ex){
                    String mensagem = "Não foi possível realizar a conexão com o banco de dados";
                    throw new JSageImportException(mensagem);
		} catch (ClassNotFoundException ex) {
                    String mensagem = "Não foi possível localizar o driver de conexão!";
                    throw new JSageImportException (mensagem);
                }
	}
    /**
     * Gera a conexao do banco de dados repassando os parâmetros
     * @param server
     * @param bd
     * @param port
     * @param user
     * @param password
     * @return Connection
     * @throws ClassNotFoundException 
     */
    static Connection getConnection(String server, String bd, String port, String user, String password){
        
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url ="jdbc:sqlserver://"+server+":"+port+";databaseName="+bd+";user="+user+";password="+password+";";
        Connection con = null;        
	try{
		Class.forName(driver);
                con = DriverManager.getConnection(url);
               
	// return con;	
	} catch (SQLException ex){
            String mensagem = "Não foi possível realizar a conexão com o banco de dados";
            //throw new JsageImportException(mensagem);
	} catch (ClassNotFoundException ex) {
            String mensagem = "Não foi possível localizar o driver de conexão!";
            //throw new JsageImportException (mensagem);
        }  
        return con;
    }
   /**
    * Fecha a conexao com o banco apenas passando a conexao utilizada
    * @param con conexao a ser fechada
    * @throws JSageImportException 
    */ 
   static void closeConnection (Connection con) throws JSageImportException{
       closeConexao(con, null, null);
   }
   
   /**
    * Fecha a conexão com o banco de dados e o objeto PreparedStatement
    * @param con a conexão a ser fechada
    * @param stmt o objeto PreparedStatement a ser fechado
    * @throws JSageImportException
    */
    static void closeConexao(Connection con, PreparedStatement stmt)throws JSageImportException {
        closeConexao(con, stmt, null);
    }
   
    /**
    * Fecha a conexão com o banco de dados e os objetos PreparedStatement e ResultSet
    * @param con a conexão a ser fechada
    * @param stmt o objeto PreparedStatement a ser fechado
    * @param rs o objeto ResultSet a ser fechado
    * @throws JSageImportException
    */
    static void closeConexao(Connection con, PreparedStatement stmt, ResultSet rs) throws JSageImportException {
        try {
            if (rs != null){
                rs.close();
            }
            if (stmt != null){
                stmt.close();
            }
            if (con != null){
                con.close();
            }
        } catch (SQLException exc) {
            StringBuffer mensagem = new StringBuffer("Não foi possível finalizar a conexão com banco de dados.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JSageImportException(mensagem.toString());
        }
    }
}
