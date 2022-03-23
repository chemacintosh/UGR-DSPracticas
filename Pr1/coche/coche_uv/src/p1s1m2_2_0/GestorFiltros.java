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
    CadenaFiltros cadenaF;
    Filtro filtro;
    double revoluciones;
    EstadoMotor estado;
    
    public GestorFiltros(Salpicadero salpicadero) {
        cadenaF = new CadenaFiltros(salpicadero);
    }
    
    public double peticionFiltros(){
        filtro = new CalcularVelocidad();
        cadenaF.añadirFiltro(filtro);
        filtro = new RepercutirRozamiento();
        cadenaF.añadirFiltro(filtro);
        return cadenaF.ejecutar(revoluciones, estado);
    }
    
    public void actualizar(double revo, EstadoMotor est) {
        this.revoluciones = revo;
        estado = est;
    }
}
