/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;

/**
 *
 * @author USUARIO
 */
public class GestorFiltros {
    CadenaFiltros cadenaF = new CadenaFiltros();
    Filtro filtro;
    int revoluciones;
    EstadoMotor estado;
    
    public void peticionFiltros(){
        filtro = new CalcularVelocidad();
        cadenaF.añadirFiltro(filtro);
        filtro = new RepercutirRozamiento();
        cadenaF.añadirFiltro(filtro);
        cadenaF.ejecutar(revoluciones, estado);
    }
}
