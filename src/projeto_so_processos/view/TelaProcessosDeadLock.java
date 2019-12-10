/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_so_processos.view;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Collation;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import projeto_so_processos.model.EstadoProcesso;
import projeto_so_processos.model.Processo;
import projeto_so_processos.model.Requerimento;

/**
 *
 * @author a1980009
 */
public class TelaProcessosDeadLock extends javax.swing.JFrame {
    
//    Atributos
   // protected list<Processo> listProcess;
    
    
    
//    Construdor
    public TelaProcessosDeadLock() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraProgresso1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabProcessRun1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabProcess = new javax.swing.JTable();
        jbRunSmulation = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabProcessLivre = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        barraProgresso2 = new javax.swing.JProgressBar();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabProcessRun2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(barraProgresso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 260, 30));

        tabProcessRun1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Recursos"
            }
        ));
        tabProcessRun1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabProcessRun1);
        tabProcessRun1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 260, 50));

        tabProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Recurso Alocado", "Requerimento"
            }
        ));
        jScrollPane3.setViewportView(tabProcess);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 310));

        jbRunSmulation.setText("Inciar Simulação");
        jbRunSmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRunSmulationActionPerformed(evt);
            }
        });
        getContentPane().add(jbRunSmulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 160, 50));

        jLabel4.setText("Lista de Processos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel5.setText("Recursos Livres");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        tabProcessLivre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabProcessLivre);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 260, 310));

        jLabel2.setText("Núcleo 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));
        getContentPane().add(barraProgresso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 260, 30));

        tabProcessRun2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Recursos"
            }
        ));
        jScrollPane6.setViewportView(tabProcessRun2);
        tabProcessRun2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 260, 50));

        jLabel3.setText("Processos em execução");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel7.setText("Núcleo 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        setSize(new java.awt.Dimension(1032, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRunSmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRunSmulationActionPerformed
        
    }//GEN-LAST:event_jbRunSmulationActionPerformed
    
   
//    Minhas Funções
    public void updateListTable(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgresso1;
    private javax.swing.JProgressBar barraProgresso2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbRunSmulation;
    private javax.swing.JTable tabProcess;
    private javax.swing.JTable tabProcessLivre;
    private javax.swing.JTable tabProcessRun1;
    private javax.swing.JTable tabProcessRun2;
    // End of variables declaration//GEN-END:variables
  
    public class Processing1 extends Thread{
        
        @Override
        public void  run(){
            int contador = 0;
            int ma = (barraProgresso1.getMaximum()) * 100;
            barraProgresso1.setMaximum(ma);
            while(barraProgresso1.getValue() < barraProgresso1.getMaximum()){
                try {
                    sleep(10);
                    barraProgresso1.setValue(barraProgresso1.getValue() + 1);
                    barraProgresso1.repaint();
                    contador += 10;

                } catch (InterruptedException ex) {
                    Logger.getLogger(Processing1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        updateListTable();
        }
        
    }
    
    public class Processing2 extends Thread{
        
        @Override
        public void  run(){
            int contador = 0;
            int ma = (barraProgresso2.getMaximum()) * 100;
            barraProgresso2.setMaximum(ma);
                
            while(barraProgresso2.getValue() < barraProgresso2.getMaximum()){
                try {
                    sleep(10);
                    barraProgresso2.setValue(barraProgresso2.getValue() + 1);
                    barraProgresso2.repaint();
                    contador += 10;

                } catch (InterruptedException ex) {
                    Logger.getLogger(Processing2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            updateListTable();
        }
    }
    
}
  
    

