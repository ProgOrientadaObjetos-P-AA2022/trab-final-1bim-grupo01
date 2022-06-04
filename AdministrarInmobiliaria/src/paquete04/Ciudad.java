/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {
    
    private String nomCiu;
    private String nomPro;
    
    public Ciudad(String nC, String nP){
        
        nomCiu = nC;
        nomPro = nP;
        
    }
    
    public void establecerNombreCiudad(String nomC){
        
        nomCiu = nomC;
        
    }
    
    public void establecerNombreProvincia(String nomP){
        
        nomPro = nomP;
        
    }
    
    public String obtenerNombreCiudad(){
        
        return nomCiu;
        
    }
    
    public String obtenerNombreProvincia(){
        
        return nomPro;
        
    }
}
