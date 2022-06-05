/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Departamento {

    private Propietario propietario;
    private double preciom2;
    private double numm2;
    private double valAliM;
    private double costofinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nomEdi;
    private String ubi;
    private Constructora constructora;

    public Departamento(Propietario p, double pm2, double nM2, double valA, Barrio b,
            Ciudad c, String nom, String u, Constructora cons) {
        propietario = p;
        preciom2 = pm2;
        numm2 = nM2;
        valAliM = valA;
        barrio = b;
        ciudad = c;
        nomEdi = nom;
        ubi = u;
        constructora = cons;
    }

    public void establecerPropietario(Propietario p) {
        propietario = p;
    }

    public void establecerPreciom2(double pm2) {
        preciom2 = pm2;
    }

    public void establecerNumM2(double nM2) {
        numm2 = nM2;
    }
    
    public void establecerValorAlicuotaMensual(double val){
        valAliM = val;
    }
    
    public void establecerNombreEdi(String nom){
        nomEdi = nom;
    }
    
    public void establecerUbicacion(String u){
        ubi = u;
    }

    public void calcularCostoFinal() {
        costofinal = (numm2 * preciom2)+ (valAliM * 12) ;
    }

    public void establecerBarrio(Barrio b) {
        barrio = b;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public void establecerConstructora(Constructora cons) {
        constructora = cons;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPreciom2() {
        return preciom2;
    }

    public double establecerNumM2() {
        return numm2;
    }
    
    public double obtenerValorAlicuotaMensual(){
        return valAliM;
    }
    
    public String obtenerNombreEdi(){
        return nomEdi;
    }
    
    public String obtenerUbicacion(){
        return ubi;
    }

    public double obtenerCostoFinal() {
        return costofinal;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }
}
