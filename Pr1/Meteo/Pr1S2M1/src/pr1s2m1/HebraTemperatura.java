/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pr1s2m1;
import java.awt.Color;
import java.math.*;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author chemit
 */
public class HebraTemperatura extends javax.swing.JFrame implements Runnable{
    private ArrayList<Double> temperaturas;
    private ObsHebra observable;
    private botonCambio boton;
    private graficaTemperatura grafica;
    private pantallaTemperatura pantalla;
    
    
    /**
     * Creates new form HebraTemperatura
     */
    public HebraTemperatura(ObsHebra ob) {
        observable = ob;
        boton = new botonCambio(ob);
        grafica = new graficaTemperatura();
        pantalla = new pantallaTemperatura();
        temperaturas =  grafica.getTemp();
        
        initComponents();
        
        ob.addObserver(boton);
        ob.addObserver(grafica);
        ob.addObserver(pantalla);
        
        //ob.aniadeTemperatura(10.0);
        
        
        
        
    }
   
    
    /* FUNCION CREADA CON LA ILUSION DE QUE META VALORES DURANTE LA EJECUCION PERO NO FUNCIONA :(
    static void setTexto(String texto){
        textoTemps.setText(texto);
    }
    */
    @Override
    public void run(){
       temperaturas = grafica.getTemp();
        String devol = "";
        devol += pantalla.getCelsius();
        valorCelsius.setText(devol);

        String array = "";
        array += temperaturas.toString();
        TextoArray.setText(array);
     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextoACambiar = new javax.swing.JTextField();
        BotonCambio = new javax.swing.JButton();
        nuevaTemp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorCelsius = new javax.swing.JTextField();
        valorF = new javax.swing.JTextField();
        TextoArray = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TextoACambiar.setText("Temperatura a cambiar");
        TextoACambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoACambiarActionPerformed(evt);
            }
        });

        BotonCambio.setText("Confirmar");
        BotonCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambioActionPerformed(evt);
            }
        });

        nuevaTemp.setText("Generar");
        nuevaTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaTempActionPerformed(evt);
            }
        });

        jLabel1.setText("Generar temperatura aleatoria");

        jLabel2.setText("Temperatura en ºC:");

        jLabel3.setText("Temperatura en F:");

        valorCelsius.setText("jTextField1");
        valorCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorCelsiusActionPerformed(evt);
            }
        });

        valorF.setText("jTextField2");

        TextoArray.setText("Sucesion Temperaturas");
        TextoArray.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                TextoArrayHierarchyChanged(evt);
            }
        });
        TextoArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoArrayActionPerformed(evt);
            }
        });

        jLabel4.setText("Temperatura media en las ultimas 7 semanas");

        jButton1.setText("Bar Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TextoArray, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nuevaTemp)
                    .addComponent(jLabel1)
                    .addComponent(BotonCambio)
                    .addComponent(TextoACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TextoArray, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaTemp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(valorCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(valorF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoACambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaTempActionPerformed
        double tempCandi = Math.random()*50.0;
        tempCandi *= Math.pow(10, 2);
        tempCandi = Math.round(tempCandi)/Math.pow(10, 2);
        observable.aniadeTemperatura(tempCandi);
        temperaturas = grafica.getTemp();
        TextoArray.setText(""+temperaturas);
        
        valorCelsius.setText(""+pantalla.getCelsius());
        valorF.setText(""+pantalla.getFahrenheit());
        
    }//GEN-LAST:event_nuevaTempActionPerformed

    private void TextoACambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoACambiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoACambiarActionPerformed

    private void TextoArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoArrayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoArrayActionPerformed

    private void BotonCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambioActionPerformed
        boton.cambiaTemperatura(Double.parseDouble(TextoACambiar.getText()));
        TextoACambiar.setText("actualizada");        // TODO add your handling code here:
        temperaturas = grafica.getTemp();
        TextoArray.setText(""+temperaturas);
        
        valorCelsius.setText(""+pantalla.getCelsius());
        valorF.setText(""+pantalla.getFahrenheit());
    }//GEN-LAST:event_BotonCambioActionPerformed

    private void valorCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorCelsiusActionPerformed
        
    }//GEN-LAST:event_valorCelsiusActionPerformed

    private void TextoArrayHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_TextoArrayHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoArrayHierarchyChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultPieDataset data = new DefaultPieDataset();
        
        ArrayList<Double> temperaturas = grafica.getTemp();
        
        Integer porcentaje = 100/temperaturas.size();
        
        for(Double temperatura: temperaturas){
            data.setValue(temperatura.toString(), porcentaje);
        }

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Temperaturas dadas", 
         data, 
         true, 
         true, 
         false);

        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("JFreeChart", chart);
        frame.pack();
        frame.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ObsHebra observable;
        observable = new ObsHebra();
        
        HebraTemperatura ht;
        ht = new HebraTemperatura(observable);
        
        
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
            java.util.logging.Logger.getLogger(HebraTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HebraTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HebraTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HebraTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ht.run();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HebraTemperatura(observable).setVisible(true);
                
               // String textos = "Grados Celsius: " + pantalla.getCelsius() + "\nGrados Fahrenheit: " + pantalla.getFahrenheit();
               // setTexto(textos);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCambio;
    private javax.swing.JTextField TextoACambiar;
    private javax.swing.JTextField TextoArray;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nuevaTemp;
    private javax.swing.JTextField valorCelsius;
    private javax.swing.JTextField valorF;
    // End of variables declaration//GEN-END:variables
}
