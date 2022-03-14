/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2;


/**
 *
 * @author cangu
 */
public class CalcularVelocidad implements Filtro{

    double incrementoVelocidad = 0;

    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor){
        
    final double MAX = 5000;
    
    switch (estadoMotor.getEstado()){
        case 0:
            incrementoVelocidad = 100;
        case 1:
            incrementoVelocidad = -100;
        case 2:
        case 3:
            incrementoVelocidad = 0;
    }
        
    revoluciones += incrementoVelocidad;
    if(revoluciones > 5000){
        revoluciones = 5000;
    } else if(revoluciones < 0){
        revoluciones = 0;
    }

    return revoluciones;
    }  
}
