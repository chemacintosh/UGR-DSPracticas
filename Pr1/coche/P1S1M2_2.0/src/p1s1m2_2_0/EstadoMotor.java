/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;

/**
 *
 * @author cangu
 */

//Acelerando 0, Frenando 1, Apagado 2, Encendido 3

public class EstadoMotor {
    private int estado;

    EstadoMotor(){
        estado = 2;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }



}
