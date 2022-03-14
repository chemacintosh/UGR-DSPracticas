/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr1s2m1;

import java.lang.Thread;
import java.util.Observable;

/**
 *
 * @author chemit
 */
public class HebraTemperaturas extends Thread{
    
    private ObsHebra TempObservable;
    private double temperaturaMin, temperaturaMax;
    
    public HebraTemperaturas(ObsHebra obs){
        TempObservable = obs;
        temperaturaMin = TempObservable.getMin();
        temperaturaMax = TempObservable.getMax();
    }
    
    public Observable getObservable(){
        return TempObservable;
    }
    
    @Override
    public void run(){
        
        
        double[] temperatura;
        temperatura = new double[7];
        

        for(int i= 0; i<7; i++){
            temperatura[i] = Math.random()*((temperaturaMax-temperaturaMin+1)+temperaturaMin);
        }
        System.out.println(temperatura[1]);
        
        TempObservable.setValor(temperatura);
    }
}
