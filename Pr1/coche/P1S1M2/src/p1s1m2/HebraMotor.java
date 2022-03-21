/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2;

/**
 *
 * @author cangu
 */
public class HebraMotor extends Thread{

    private CalcularVelocidad calc_velocidad = new CalcularVelocidad();
    private RepercutirRozamiento rep_rozamiento = new RepercutirRozamiento();
    //private Salpicadero salpi = new Salpicadero();
   private int revoluciones; 
   private EstadoMotor estado;
   
    
    public void Hebra(){
        revoluciones += 5;
        estado.setEstado(2);
        //salpi.setRevoluciones(revoluciones);
        System.out.println("hola");
    }
    
    @Override
    public void run(){
        
        //while(true){
            System.out.println("hola");
        //}
        
}
   @Override
    public void start(){
        
        //while(true){
            System.out.println("hola");
        //}
} 

}
