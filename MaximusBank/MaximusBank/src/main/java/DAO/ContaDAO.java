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
public class ContaDAO {

    private static Connection con;

    public ContaDAO() {
        this.con = new ConnectionFactory().getConnection("MaximusBank");
    }

    public static void add(Conta c) throws Exception {
        String sql = String.format("insert into conta(cpf,conta_tipo,agencia,numero,saldo,divida) values('%s','%s','%d','%d','%s','%s')",
                c.getTitular().getCpf(),
                c.getClass().getSimpleName(),
                c.getAgencia(),
                c.getNumero(),
                c.getSaldo(),
                c.getDivida()
        );
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public static void remove(Conta c) throws Exception {
        String sql = String.format("delete from conta where cpf = '%s' and agencia = '%d' and numero = '%d'",
                c.getTitular().getCpf(),
                c.getAgencia(),
                c.getNumero()
        );
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public static void remove(String cpf, int agencia, int numero) throws Exception {
        String sql = String.format("delete from conta where cpf = '%s' and agencia = '%d' and numero = '%d'",
                cpf,
                agencia,
                numero
        );
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    public static Conta search(String cpf, int agencia, int numero) {
        String sql = String.format("select * from conta join cliente using (cpf) where cpf='%s' and agencia ='%d' and numero='%d'",
                cpf,
                agencia,
                numero
        );
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            Conta auxC = null;
            switch (rs.getString("conta_tipo")) {
                case "ContaCorrente":
                    auxC = new ContaCorrente(rs.getInt("agencia"), rs.getInt("numero"), new Cliente(rs.getString("nome"), rs.getInt("idade"), rs.getString("cpf")));
                    auxC.depositar(rs.getDouble("saldo"));
                    auxC.setDivida(rs.getDouble("divida"));
                    return auxC;
                case "ContaPoupanca":
                    auxC = new ContaPoupanca(rs.getInt("agencia"), rs.getInt("numero"), new Cliente(rs.getString("nome"), rs.getInt("idade"), rs.getString("cpf")));
                    auxC.depositar(rs.getDouble("saldo"));
                    auxC.setDivida(rs.getDouble("divida"));
                    return auxC;
                case "SeguroDeVida":
                    auxC = new SeguroDeVida(rs.getInt("agencia"), rs.getInt("numero"), new Cliente(rs.getString("nome"), rs.getInt("idade"), rs.getString("cpf")));
                    auxC.depositar(rs.getDouble("saldo"));
                    auxC.setDivida(rs.getDouble("divida"));
                    return auxC;
                default:
                    return auxC;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean search(Conta c) {
        String sql = String.format("select * from cliente where cpf='%s' and agencia ='%d'",
                c.getTitular().getCpf(),
                c.getAgencia()
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

    public static void updateSaldo(Conta c) {
        String sql = String.format("update conta set saldo = " + c.getSaldo() + " where cpf='%s' and agencia ='%d'",
                c.getTitular().getCpf(),
                c.getAgencia()
        );
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateDivida(Conta c) {
        String sql = String.format("update conta set divida = " + c.getDivida() + " where cpf='%s' and agencia ='%d'",
                c.getTitular().getCpf(),
                c.getAgencia()
        );
        try {
            Statement stmt = con.createStatement();
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
