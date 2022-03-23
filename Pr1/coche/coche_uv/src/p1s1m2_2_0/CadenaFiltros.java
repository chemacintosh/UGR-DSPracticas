/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class CadenaFiltros {
    private ArrayList<Filtro> listaFiltros;
    private Salpicadero salpi;
    
    public CadenaFiltros(Salpicadero salpicadero) {
        this.salpi = salpicadero;
        listaFiltros = new ArrayList<>();
    }
    
    public void añadirFiltro(Filtro e){
        listaFiltros.add(e);
    }
    
    public double ejecutar(double revoluciones, EstadoMotor estado){
        double RPM = listaFiltros.get(0).ejecutar(revoluciones, estado);
        //RPM = listaFiltros.get(1).ejecutar(revoluciones, estado);
        
        listaFiltros.clear();
        
        salpi.ejecutar(RPM, estado);
        
        return RPM;
    }
}
