/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {

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
}
