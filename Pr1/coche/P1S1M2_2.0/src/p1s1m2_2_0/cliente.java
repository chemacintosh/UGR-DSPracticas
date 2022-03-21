/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;

/**
 *
 * @author USUARIO
 */
public class cliente extends Thread{
    private EstadoMotor estado;
    private int revoluciones;
    private Salpicadero salpi;
    
    public cliente(Salpicadero salpicad){
        salpi = salpicad;
    }
    
    @Override
    public void run(){
        revoluciones = 5;
        salpi.ponRevoluciones(revoluciones);        
    }
    
    public static void main(String[] args){
        
    }
}
