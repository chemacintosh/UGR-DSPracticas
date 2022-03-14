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

    private double temperatura;

    public double getTemp(){
        return temperatura;
    }
    
    public ObsHebra(){
        super();
    }
    
    public void aniadeTemperatura (double nuevaTemperatura){
        temperatura = nuevaTemperatura;
        setChanged();
        notifyObservers(temperatura);
    }
    
    
    
};