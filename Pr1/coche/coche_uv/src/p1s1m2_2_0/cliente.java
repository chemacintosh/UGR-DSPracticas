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
    private double revoluciones;
    private Salpicadero salpi;
    private GestorFiltros gestor;
    
    public cliente(Salpicadero salpicad){
        revoluciones = 0;
        
        salpi = salpicad;
        gestor = new GestorFiltros(salpi);
    }
    
    @Override
    public void run(){
        while(true) {
            estado = salpi.getEstadoMotor();
            
            gestor.actualizar(revoluciones, estado);
            revoluciones = gestor.peticionFiltros();
            
        }
    }
    
    public void setEstadoMotor(EstadoMotor est) {
        estado = estado;
    }
    
    public static void main(String[] args){
        
    }
}
