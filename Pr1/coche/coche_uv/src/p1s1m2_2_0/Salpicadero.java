/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p1s1m2_2_0;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author USUARIO
 */
public class Salpicadero extends javax.swing.JFrame{
    cliente cliente;    
    EstadoMotor estadoMotor;
    Timer timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
    
    /**
     * Creates new form Frame1
     */
    public Salpicadero() {
        estadoMotor = new EstadoMotor();
        cliente = new cliente(this);
        
        initComponents();
        
        cliente.start();
        timer.start();
    }
    
    public EstadoMotor getEstadoMotor() {
        return estadoMotor;
    }

    public void setEstadoMotor(EstadoMotor estadoMotor) {
        this.estadoMotor = estadoMotor;
    }
    
    public void ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        double v_lineal = 2.0*Math.PI*0.15*revoluciones*(60.0/1000.0);
        double distancia = 0;
        double distancia_reciente = 0;
        
        kmh.setText(String.valueOf(v_lineal));
        RPM.setText(String.valueOf(revoluciones));

        //La distancia representada en el salpicadero.
        distancia = v_lineal / timer.getDelay()*3600;
        distancia_reciente = v_lineal / timer.getDelay()*60;
        contador_total.setText(String.valueOf(distancia));
        contador_reciente.setText(String.valueOf(distancia_reciente));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mandos = new javax.swing.JPanel();
        Salpica = new javax.swing.JPanel();
        Velocimetro = new javax.swing.JPanel();
        kmh = new javax.swing.JLabel();
        Cuentakilometros = new javax.swing.JPanel();
        contador_reciente = new javax.swing.JLabel();
        contador_total = new javax.swing.JLabel();
        Cuentarrevoluciones = new javax.swing.JPanel();
        RPM = new javax.swing.JLabel();
        EstadoMotor = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        Encender = new javax.swing.JToggleButton();
        Acelerar = new javax.swing.JToggleButton();
        Frenar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salpicadero");

        Mandos.setLayout(new java.awt.BorderLayout());

        Salpica.setLayout(new java.awt.BorderLayout());

        Velocimetro.setLayout(new java.awt.GridLayout(1, 0));

        kmh.setText("0");
        kmh.setBorder(javax.swing.BorderFactory.createTitledBorder("Km/h"));
        Velocimetro.add(kmh);

        Salpica.add(Velocimetro, java.awt.BorderLayout.NORTH);

        Cuentakilometros.setLayout(new java.awt.BorderLayout());

        contador_reciente.setText("0");
        contador_reciente.setBorder(javax.swing.BorderFactory.createTitledBorder("contador reciente"));
        Cuentakilometros.add(contador_reciente, java.awt.BorderLayout.PAGE_START);

        contador_total.setText("0");
        contador_total.setBorder(javax.swing.BorderFactory.createTitledBorder("contador total"));
        Cuentakilometros.add(contador_total, java.awt.BorderLayout.PAGE_END);

        Salpica.add(Cuentakilometros, java.awt.BorderLayout.CENTER);

        Cuentarrevoluciones.setName(""); // NOI18N
        Cuentarrevoluciones.setLayout(new java.awt.GridLayout(1, 0));

        RPM.setText("0");
        RPM.setBorder(javax.swing.BorderFactory.createTitledBorder("RPM"));
        Cuentarrevoluciones.add(RPM);

        Salpica.add(Cuentarrevoluciones, java.awt.BorderLayout.SOUTH);

        Mandos.add(Salpica, java.awt.BorderLayout.PAGE_START);

        EstadoMotor.setForeground(new java.awt.Color(255, 0, 0));
        EstadoMotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EstadoMotor.setText("APAGADO");
        EstadoMotor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Mandos.add(EstadoMotor, java.awt.BorderLayout.CENTER);

        PanelBotones.setLayout(new java.awt.GridLayout(1, 0));

        Encender.setForeground(new java.awt.Color(0, 255, 0));
        Encender.setText("ENCENDER");
        Encender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncenderActionPerformed(evt);
            }
        });
        PanelBotones.add(Encender);

        Acelerar.setText("ACELERAR");
        Acelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcelerarActionPerformed(evt);
            }
        });
        PanelBotones.add(Acelerar);

        Frenar.setText("FRENAR");
        Frenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrenarActionPerformed(evt);
            }
        });
        PanelBotones.add(Frenar);

        Mandos.add(PanelBotones, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mandos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mandos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncenderActionPerformed
        if(this.Encender.getText() == "ENCENDER"){
            this.Encender.setText("APAGAR");
            this.Encender.setForeground(Color.RED);
            estadoMotor.setEstado(3);
        } else {
            this.Encender.setText("ENCENDER");
            this.Encender.setForeground(Color.green);
            this.Acelerar.setSelected(false);
            this.Frenar.setSelected(false);
            this.EstadoMotor.setText("APAGADO");
            estadoMotor.setEstado(2);
        }
        //this.hebra.run();
    }//GEN-LAST:event_EncenderActionPerformed

    private void AcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcelerarActionPerformed
        if(this.Encender.getText() == "APAGAR" && !this.Frenar.isSelected()){
            if(this.Acelerar.getText() == "ACELERAR") {
                this.Acelerar.setText("Soltar acelerador");
                this.Acelerar.setForeground(Color.red);
                this.EstadoMotor.setText("ACELERANDO");
                estadoMotor.setEstado(0);
            } else {
                this.Acelerar.setText("ACELERAR");
                this.Acelerar.setForeground(Color.BLACK);
                estadoMotor.setEstado(3);
                //this.EstadoMotor.setText("APAGADO");
            }
        } else {
            this.Acelerar.setSelected(false);
        }
    }//GEN-LAST:event_AcelerarActionPerformed

    private void FrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrenarActionPerformed
        if(this.Encender.getText() == "APAGAR" && !this.Acelerar.isSelected()){
            if(this.Frenar.isSelected()) {
                this.Frenar.setForeground(Color.red);
                this.EstadoMotor.setText("FRENANDO");
                estadoMotor.setEstado(1);
            } else {
                this.Frenar.setForeground(Color.BLACK);
                estadoMotor.setEstado(3);
                //this.EstadoMotor.setText("APAGADO");
            }
        } else {
            this.Frenar.setSelected(false);
        }
    }//GEN-LAST:event_FrenarActionPerformed

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
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salpicadero().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Acelerar;
    private javax.swing.JPanel Cuentakilometros;
    private javax.swing.JPanel Cuentarrevoluciones;
    private javax.swing.JToggleButton Encender;
    private javax.swing.JLabel EstadoMotor;
    private javax.swing.JToggleButton Frenar;
    private javax.swing.JPanel Mandos;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JLabel RPM;
    private javax.swing.JPanel Salpica;
    private javax.swing.JPanel Velocimetro;
    private javax.swing.JLabel contador_reciente;
    private javax.swing.JLabel contador_total;
    private javax.swing.JLabel kmh;
    // End of variables declaration//GEN-END:variables
}
