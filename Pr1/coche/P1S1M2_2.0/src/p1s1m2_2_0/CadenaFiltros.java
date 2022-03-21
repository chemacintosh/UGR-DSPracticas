/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s1m2_2_0;

/**
 *
 * @author USUARIO
 */
public class CadenaFiltros {
    java.util.List<Filtro> listaFiltros;
    
    public void añadirFiltro(Filtro e){
        listaFiltros.add(e);
    }
    
    public void ejecutar(int revoluciones, EstadoMotor estado){
        while(!listaFiltros.isEmpty()){
            //listaFiltros.
        }
        
        for(int i = 0; i < listaFiltros.size(); i++){
            //listaFiltros[i].ejecutar();
        }
    }
}
