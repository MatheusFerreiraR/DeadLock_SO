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
public class TelaProcessos extends javax.swing.JFrame {
    private List<Processo> listaProcesso;
    private List<Processo> listaProcessWai;
    private List<Processo> listaProcessSuc;
    private Processo processRun;
    public boolean run1;
    private boolean iniciado;
    
    
    public TelaProcessos() {
        initComponents();
        
//        inicializando flag
        this.iniciado = false;
        this.run1 = true;
        
        
//        Configurando Barra de Progresso
        barraProgresso1.setStringPainted(true);
        barraProgresso1.setMaximum(3);
        barraProgresso1.setValue(0);
        barraProgresso1.setForeground(Color.GREEN);
        
        barraProgresso2.setStringPainted(true);
        barraProgresso2.setMaximum(3);
        barraProgresso2.setValue(0);
        barraProgresso2.setForeground(Color.GREEN);
        
        this.listaProcesso = new ArrayList(); 
        this.listaProcessWai = new ArrayList<>();
        this.listaProcessSuc = new ArrayList<>();
        
        this.createListProcess("Processo - ", false, 10);
        
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
        if(this.iniciado){
            JOptionPane.showMessageDialog(null, "Simulação já inicializada!!");
        }else if(listaProcesso.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum processo adicionado");            
        }else{
            this.iniciado = true;
            
            this.runSimulation();
            

//            this.iniciado = false;  
        }
    }//GEN-LAST:event_jbRunSmulationActionPerformed
    
    private void createListProcess(String name, Boolean complementary, int qtdProcess){
        Random tempo = new Random();
        
        Requerimento r1 = new Requerimento("Requerimento 1");
        Requerimento r2 = new Requerimento("Requerimento 2");
        
        for (int i = 0; i < qtdProcess; i++) {
            Processo p;
            if(tempo.nextInt(2) == 1){
                p = new Processo(name + (i+1), "Bola"+(i+1), r1);
            }else{
                p = new Processo(name + (i+1), "Bola"+(i+1), r2);
            }
            this.listaProcesso.add(p);
        }
        
       
        
        this.addTableProcess();
    }
    
    private void runSimulation(){
        
        DefaultTableModel jtabP =  (DefaultTableModel) tabProcess.getModel();
        
        
        while(this.listaProcesso.size() == 0){
            this.runSimulation();
        }
        
        try {
            jtabP.removeRow(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        this.processRun = listaProcesso.get(0); 
        listaProcesso.remove(0);
        
         this.simulation();
    }
    
    public void simulation(){
        DefaultTableModel jtabR1 =  (DefaultTableModel) tabProcessRun1.getModel();
        DefaultTableModel jtabR2 =  (DefaultTableModel) tabProcessRun2.getModel();
        
        Object[] obj = {
            this.processRun.getNome(), 
            this.processRun.getRecurso()
        };
        
        if(this.run1){
            jtabR1.addRow(obj);
            this.run1 = false;
        }else{
            jtabR2.addRow(obj);
            this.run1 = true;
        }
        
        
        new Processing().start();
      
//        Chamando a Thread Que simula o tempo de processo
        
    }
    
    public void addTableProcess(){
        DefaultTableModel jtab =  (DefaultTableModel) tabProcess.getModel();
        jtab.setRowCount(0);
        
        jtab.setRowCount(0);
        
//        System.out.println("QTD PRO: " + this.listaProcesso.size());
        
        for (Processo process : this.listaProcesso) {
            Object[] obj = {
                process.getNome(), 
                process.getRecurso(),
                process.getRequerimento().getNome()
            };
            jtab.addRow(obj);
        }
    }
    
    public void updateBarProcess(){
        this.barraProgresso1.setValue(0);
        this.barraProgresso1.setMaximum(10);
        this.barraProgresso2.setValue(0);
        this.barraProgresso2.setMaximum(10);
    }
    
    public void updateListTable(){
        
        this.updateBarProcess();
        
        DefaultTableModel jtabRun1 =  (DefaultTableModel) tabProcessRun1.getModel();
        DefaultTableModel jtabRun2 =  (DefaultTableModel) tabProcessRun2.getModel();
        DefaultTableModel jtabLivre =  (DefaultTableModel) tabProcessLivre.getModel();
        
        
        
        Object[] obj = {this.processRun.getRecurso()};
        
        if(run1){
            try {
                jtabRun1.removeRow(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            try {
                jtabRun2.removeRow(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        
        this.listaProcessSuc.add(this.processRun);
        
        jtabLivre.addRow(obj);
        
        this.run1 = false;
        if(this.listaProcesso.size() >= 1){
           this.runSimulation();
        }else{
            JOptionPane.showMessageDialog(null, "Concluido");
        }
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
  
    public class Processing extends Thread{
        
        @Override
        public void  run(){
            int contador = 0;
            int ma;

            if(run1){
                ma = (barraProgresso1.getMaximum()) * 100;
                barraProgresso1.setMaximum(ma);
                while(barraProgresso1.getValue() < barraProgresso1.getMaximum()){
                    try {
                        sleep(10);
                        barraProgresso1.setValue(barraProgresso1.getValue() + 1);
                        barraProgresso1.repaint();
                        contador += 10;

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                ma = (barraProgresso2.getMaximum()) * 100;
                barraProgresso2.setMaximum(ma);
                while(barraProgresso2.getValue() < barraProgresso2.getMaximum()){
                    try {
                        sleep(10);
                        barraProgresso2.setValue(barraProgresso2.getValue() + 1);
                        barraProgresso2.repaint();
                        contador += 10;

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            updateListTable();
        }
        
    }
    
    public class WaitProcess extends Thread{
        
        @Override
        public void  run(){
            try {
                sleep(4500);
                //listaProcessWai.get(0).setEstado(EstadoProcesso.PRONTO);
                listaProcesso.add(listaProcessWai.get(0));
                
                DefaultTableModel jtabWai =  (DefaultTableModel) tabProcessLivre.getModel();
                jtabWai.removeRow(0);
                
                addTableProcess();
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
   
    
}
