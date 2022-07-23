/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    
    private String nombres;
    private int poblacion;
    
    public void establecerNombre(String c){
        nombres = c;
    }
    
    public String obtenerNombre(){
        return nombres;
    }
    
    public void establecerPoblacion(int c){
        poblacion = c;
    }
    
    public int obtenerPoblacion(){
        return poblacion;
    }
    
    @Override
    public String toString(){
        return String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                nombres,
                poblacion);
    }
    
}
