/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr1s2m1;

/**
 *
 * @author chemit
 */
public class Pr1S2M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ObsHebra observable1 = new ObsHebra();
           graficaTemperatura observer1 = new graficaTemperatura();
           pantallaTemperatura observer2 = new pantallaTemperatura();
           
           observable1.addObserver(observer1);
           observable1.addObserver(observer2);
           
           HebraTemperaturas hebra = new HebraTemperaturas(observable1);
           hebra.run();
           
           
           
           
           
    }
    
   
    
}
