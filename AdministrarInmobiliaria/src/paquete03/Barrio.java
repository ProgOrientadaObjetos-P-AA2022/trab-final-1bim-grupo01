/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Barrio implements Serializable{

    private String nomBa;
    private String referencia;

    public Barrio(String nom, String refe) {

        nomBa = nom;
        referencia = refe;

    }

    public void establecerNombreBarrio(String nom) {

        nomBa = nom;

    }

    public void establecerReferencia(String re) {

        referencia = re;

    }

    public String obtenerNombreBarrio() {

        return nomBa;

    }

    public String obtenerReferencia() {

        return referencia;

    }
    @Override
    public String toString(){
        String valor = String.format("%s - %s\n"
                , obtenerNombreBarrio(), 
                 obtenerReferencia());
        return valor;
    }
}
