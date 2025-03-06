package Modelo;

import java.sql.*;
// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1

public class BancoDados {

    public static Connection connection = null;

    public BancoDados() {
        String driverName = "org.postgresql.Driver";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConexao() {

        String serverName = "localhost"; // Endereço do servidor do BD
        String mydatabase = "cliente"; // Nome do seu banco de dados
        String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
        String username = "postgres"; // Nome de um usuário de seu BD
        String password = "postgres"; // Senha de acesso do usuário.
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

;
}
