/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr1s2m1;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author chemit
 */
public class HebraTemperaturas extends JFrame implements runnable{
    
    private ArrayList<Double> temperaturas;
    private ObsHebra observable;
    
    public HebraTemperaturas(ObsHebra ob){
        temperaturas = new ArrayList<Double>();
        observable = ob;
        temperaturas.add(10.2);
        temperaturas.add(11.2);
        temperaturas.add(12.2);
        temperaturas.add(13.2);
        temperaturas.add(14.2);
        temperaturas.add(15.2);
        temperaturas.add(16.2);
        temperaturas.add(17.2);
        temperaturas.add(18.2);
    }
    
    @Override
    public void run(){
        for(Double temperatura: temperaturas){
            observable.aniadeTemperatura(temperatura);
        }
    }
}
