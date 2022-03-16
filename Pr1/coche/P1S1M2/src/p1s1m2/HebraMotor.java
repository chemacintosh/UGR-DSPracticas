/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2;

/**
 *
 * @author cangu
 */
class HebraMotor extends Thread{

    private CalcularVelocidad calc_velocidad = new CalcularVelocidad();
    private RepercutirRozamiento rep_rozamiento = new RepercutirRozamiento();
    
    
    @Override
    public void run(){

        while(true){
            System.out.println("hola");
        }
}


}
