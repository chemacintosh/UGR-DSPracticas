/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;

/**
 *
 * @author cangu
 */
public class RepercutirRozamiento implements Filtro{
    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor){
        if(revoluciones >= 0)
            return (revoluciones -= 1);
        else
            return revoluciones;
    }
}
