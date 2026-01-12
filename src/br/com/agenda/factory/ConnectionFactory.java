package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    //Nome do usuário mysql
    private static final String USERNAME = "root";

    //Senha do banco de dados
    private static final String PASSWORD = "";

    //Caminho do banco de dados, porta, nome do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:/agenda";

    /*
    * Conexão com o banco de dados
    */
    public static Connection createConnectionToMySQL() throws  Exception{
        //faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;

    }

    public static void main(String[] args) throws Exception {
        //Recuperar uma conexão com o banco de dados
        Connection conn = createConnectionToMySQL();

        if(conn!=null) {
            System.out.println("Conexão obetida com sucesso!");
            conn.close();
        }
    }

}
