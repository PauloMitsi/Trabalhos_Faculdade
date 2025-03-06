package GUI;

// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Apache NetBeans IDE 15 - JDK-18.0.2.1
import Modelo.*;
import DAO.*;
import Factory.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PauloMitsi
 */
public class CadCliente extends javax.swing.JFrame {

    protected Cliente cli;
    protected Conta conta;
    protected ContaDAO cDAO = new ContaDAO();
    protected ClienteDAO cliDAO = new ClienteDAO();
    private static Connection bd = new Factory.ConnectionFactory().getConnection("MaximusBank");
    private static CadCliente CDI;

    public static CadCliente getCadCliente() {
        if (CDI == null) {
            CDI = new CadCliente();
        }
        return CDI;
    }

    /**
     * Creates new form CadCliente
     */
    public CadCliente() {
        new Principal().getPrincipal().setVisible(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        cxCPF = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btLimp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbContas = new javax.swing.JComboBox<>();
        cxAgencia = new javax.swing.JTextField();
        cxNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();

        setTitle("Cadastro de Cliente");
        setResizable(false);

        jLabel1.setText("Nome");

        cxNome.setToolTipText("Insira seu Nome Completo");
        cxNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cxNomeKeyTyped(evt);
            }
        });

        jLabel2.setText("Idade");

        jLabel3.setText("CPF");

        cxIdade.setToolTipText("Insira sua Idade");
        cxIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cxIdadeKeyTyped(evt);
            }
        });

        cxCPF.setToolTipText("Insira seu CPF");
        cxCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cxCPFKeyTyped(evt);
            }
        });

        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btLimp.setText("Limpar");
        btLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Conta");

        cbContas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta Poupança", "Seguro de Vida" }));
        cbContas.setToolTipText("Selecione o tipo de conta");
        cbContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContasActionPerformed(evt);
            }
        });

        cxAgencia.setToolTipText("Digite os digitos da agência\n");
        cxAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cxAgenciaKeyTyped(evt);
            }
        });

        cxNumero.setToolTipText("Digite os digitos do número");
        cxNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cxNumeroKeyTyped(evt);
            }
        });

        jLabel5.setText("Agência");

        jLabel6.setText("Numero");

        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbContas, 0, 132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxIdade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxAgencia))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNumero)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbContas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFinalizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cxNome.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadCliente();
        attTab();

    }//GEN-LAST:event_btCadActionPerformed

    private void btLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpActionPerformed
        limpar();
    }//GEN-LAST:event_btLimpActionPerformed

    private void cxNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxNomeKeyTyped
        char k = evt.getKeyChar();

        if (String.valueOf(k).matches("[0-9]")) {
            cxNome.setEditable(false);
        } else {
            cxNome.setEditable(true);
        }
    }//GEN-LAST:event_cxNomeKeyTyped

    private void cxIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxIdadeKeyTyped
        char k = evt.getKeyChar();

        if (Character.isAlphabetic(k) || cxIdade.getText().length() >= 3) {
            evt.setKeyChar((char) evt.VK_NONCONVERT);
        }
    }//GEN-LAST:event_cxIdadeKeyTyped

    private void cxCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxCPFKeyTyped
        char k = evt.getKeyChar();

        if (Character.isAlphabetic(k) || cxCPF.getText().length() >= 11) {
            evt.setKeyChar((char) evt.VK_NONCONVERT);
        }
    }//GEN-LAST:event_cxCPFKeyTyped

    private void cxAgenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxAgenciaKeyTyped
        char k = evt.getKeyChar();

        if (Character.isAlphabetic(k) || cxAgencia.getText().length() >= 4) {
            evt.setKeyChar((char) evt.VK_NONCONVERT);
        }
    }//GEN-LAST:event_cxAgenciaKeyTyped

    private void cxNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxNumeroKeyTyped
        char k = evt.getKeyChar();

        if (Character.isAlphabetic(k) || cxNumero.getText().length() >= 5) {
            evt.setKeyChar((char) evt.VK_NONCONVERT);
        }
    }//GEN-LAST:event_cxNumeroKeyTyped

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        finalizaCad();
        attTab();
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void cbContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbContasActionPerformed

    public void limpar() {
        cxNome.setText("");
        cxIdade.setText("");
        cxCPF.setText("");
        cxNumero.setText("");
        cxAgencia.setText("");
        cxNome.requestFocus();
    }

    public void cadCliente() {
        String nome = cxNome.getText();
        String idade = cxIdade.getText();
        String cpf = cxCPF.getText();
        String agencia = cxAgencia.getText();
        String numero = cxNumero.getText();
        boolean confirma = nome.equals("") || idade.equals("") || cpf.equals("") || numero.equals("") || agencia.equals("");

        if (confirma) {
            JOptionPane.showMessageDialog(null,
                    "INSIRA TODOS OS DADOS",
                    "cadastro erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            cli = new Cliente(nome, Integer.parseInt(idade), cpf);
            boolean foi = setConta(cli, Integer.parseInt(agencia), Integer.parseInt(numero), cbContas.getSelectedItem().toString()
            );
            if (foi) {
                int v = JOptionPane.showConfirmDialog(null,
                        "Cliente Cadastrado com sucesso! Deseja realizar mais cadastros?",
                        "cadastro efetuado",
                        JOptionPane.YES_NO_OPTION);
                if (v == 0) {
                    limpar();
                } else {
                    abreSistema();
                    dispose();
                }
            }
        }
    }

    public boolean setConta(Cliente c, int agencia, int numero, String tipCont) {

        if (tipCont.equals("Conta Corrente")) {

            conta = new ContaCorrente(agencia, numero, c);

            if ((cliDAO.search(c) && !cDAO.search(conta))) {
                try {
                    cDAO.add(conta);
                    return true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "agencia já existe!",
                            "Cadastro erro",
                            JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
            } else if ((!cliDAO.search(c) && !cDAO.search(conta))) {
                try {
                    cliDAO.add(c);
                    cDAO.add(conta);
                    return true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "agencia ou numero já existem!",
                            "Cadastro erro",
                            JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "agencia ou numero já existem!",
                        "Cadastro erro",
                        JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        } else if (tipCont.equals("Conta Poupança")) {

            conta = new ContaPoupanca(agencia, numero, c);
            if ((cliDAO.search(c) && !cDAO.search(conta))) {
                try {
                    cDAO.add(conta);
                    return true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "agencia ou numero já existem!",
                            "Cadastro erro",
                            JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
            } else if ((!cliDAO.search(c) && !cDAO.search(conta))) {
                try {
                    cliDAO.add(c);
                    cDAO.add(conta);
                    return true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "agencia ou numero já existem!",
                            "Cadastro erro",
                            JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "agencia ou numero já existem!",
                        "Cadastro erro",
                        JOptionPane.PLAIN_MESSAGE);
                return false;
            }
        } else {
            conta = new SeguroDeVida(agencia, numero, c);

            if ((cliDAO.search(c) && !cDAO.search(conta))) {
                try {
                    cDAO.add(conta);
                    return true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "agencia ou numero já existem!",
                            "Cadastro erro",
                            JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
            } else if ((!cliDAO.search(c) && !cDAO.search(conta))) {
                try {
                    cliDAO.add(c);
                    cDAO.add(conta);
                    return true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "agencia ou numero já existem!",
                            "Cadastro erro",
                            JOptionPane.PLAIN_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "agencia ou numero já existem!",
                        "Cadastro erro",
                        JOptionPane.PLAIN_MESSAGE);
                return false;
            }

        }

    }

    public void abreSistema() {
        new Sistema().getSistema().setVisible(true);
    }

    public void attTab() {
        Sistema s = new Sistema().getSistema();
        s.atualizaContas();
    }

    public void finalizaCad() {

        try {
            ResultSet rs = bd.createStatement().executeQuery("select count(*) from cliente");
            rs.next();
            if (rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null,
                        "ADICIONE PELO MENOS UMA CONTA!",
                        "cadastro erro",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                new Sistema().getSistema().setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btLimp;
    private javax.swing.JComboBox<String> cbContas;
    private javax.swing.JTextField cxAgencia;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
