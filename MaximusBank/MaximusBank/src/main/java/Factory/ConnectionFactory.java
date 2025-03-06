/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection connection = null;

    public ConnectionFactory() {
        String driverName = "org.postgresql.Driver";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String mydatabase) {

        String serverName = "localhost"; // Endereço do servidor do BD
        String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
        try {
            connection = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

  

}
