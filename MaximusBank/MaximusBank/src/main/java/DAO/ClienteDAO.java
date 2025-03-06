/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectionFactory;
import Modelo.*;
import java.sql.*;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
public class ClienteDAO {

    private static Connection con;

    public ClienteDAO() {
        this.con = new ConnectionFactory().getConnection("MaximusBank");
    }

    public static void add(Cliente c) throws Exception {
        String sql = String.format("insert into cliente(nome, idade, cpf) values('%s','%d','%s')",
                c.getNome(),
                c.getIdade(),
                c.getCpf()
        );

        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public static void remove(Cliente c) throws Exception {
        String sql = String.format("delete from cliente where cpf = '%s' and nome = '%s' and idade = '%d'",
                c.getCpf(),
                c.getNome(),
                c.getIdade()
        );
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public static boolean search(Cliente c) {
        String sql = String.format("select * from cliente where cpf='%s' and nome='%s' and idade ='%d'",
                c.getCpf(),
                c.getNome(),
                c.getIdade()
        );
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            rs.getString("cpf");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
