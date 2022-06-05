/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

/**
 *
 * @author josti
 */
public class Entidad_Inmobiliaria {
    
    private Propietario [] propi;
    private Barrio [] barrio;
    private Ciudad [] ciudad;
    private Constructora [] constru;
    private Casa [] casa;
    private Departamento [] depar;
    
    public Entidad_Inmobiliaria(Propietario [] p, Barrio [] b, Ciudad [] c, Constructora [] cos,    
            Casa [] ca, Departamento [] d){
        
        propi = p;
        barrio = b;
        ciudad = c;
        constru = constru;
        casa = ca;
        depar = d;
        
    }
    
    public void establecerPropietario(Propietario [] p){
        propi = p;
    }
    
    public void establecerBarrio(Barrio [] b){
        barrio = b;
    }
    
    public void establecerCiudad(Ciudad [] c){
        ciudad = c;
    }
    
    public void establecerConstructora(Constructora [] con){
        constru = con;
    }
    
    public void establecerCasa(Casa [] ca){
        casa = ca;
    }
    public void establecerDepartamento(Departamento [] d){
        depar = d;
    }
    
    public Propietario [] obtenerPropietario(){
        return propi;
    }
    
    public Barrio [] obtenerBarrio(){
        return barrio;
    }
    
    public Ciudad [] obtenerCiudad(){
        return ciudad;
    }
    
    public Constructora [] obtenerConstructora(){
        return constru;
    }
    
    public Casa [] obtenerCasa(){
        return casa;
    }
    public Departamento [] obtenerDepartamento(){
        return depar;
    }
    
    
}
