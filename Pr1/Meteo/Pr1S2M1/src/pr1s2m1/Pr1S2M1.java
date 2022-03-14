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
            ObsHebra oh;
            ObsGraficaTemp og;
            HebraTemperaturas ht;
            
            oh = new ObsHebra(10, 30);
            ht = new HebraTemperaturas(oh);
            og = new ObsGraficaTemp(oh);
            
            oh.addObserver(og);
            
            ht.run();

    }
    
}
