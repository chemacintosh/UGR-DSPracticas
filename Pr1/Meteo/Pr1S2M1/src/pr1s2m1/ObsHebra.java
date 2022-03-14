/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr1s2m1;

import java.lang.Thread;
import java.util.Observable;
import java.util.Arrays;


/**
 *
 * @author chemit
 */
public class ObsHebra extends Observable{

    private double[] temperatura;
    private double tempMin, tempMax;

    public ObsHebra(double tempMini, double tempMaxi){
        tempMin = tempMini;
        tempMax = tempMaxi;
        temperatura = new double[]{10,10,10,10,10,10,10};
    }

    public void setValor(double[] nuevastemp){
        for(int i = 0; i<7; i++){
            temperatura[i] = nuevastemp[i];
        }

        setChanged();
        notifyObservers();
    }

    public double[] getValor(){
        return temperatura;
    }
    
    public double getMin(){
        return tempMin;
    }
    
    public double getMax(){
        return tempMax;
    }


    
};