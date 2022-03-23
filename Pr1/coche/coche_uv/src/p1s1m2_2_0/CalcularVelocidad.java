/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;


/**
 *
 * @author cangu
 */
public class CalcularVelocidad implements Filtro{

    double incrementoVelocidad = 0;

    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor){
        final double MAX = 5000;
        double velocidad;

        switch (estadoMotor.getEstado()){
            case 0:
                incrementoVelocidad = 10;
                break;
            case 1:
                incrementoVelocidad = -10;
                break;
            case 2:
            case 3:
                incrementoVelocidad = 0;
                break;
        }

        velocidad = revoluciones + incrementoVelocidad;
        
        if(velocidad > 5000){
            velocidad = 5000;
        } else if(velocidad < 0){
            velocidad = 0;
        }

        System.out.println(velocidad);
        return velocidad;
    }  
}
