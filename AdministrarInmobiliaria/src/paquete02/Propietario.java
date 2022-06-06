/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable {

    private String nombres;
    private String apellidos;
    private String identificacion;

    public Propietario(String n, String a, String c) {
        nombres = n;
        apellidos = a;
        identificacion = c;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
    @Override
    public String toString(){
        String valor = String.format("%s - %s - %s\n"
                , obtenerNombres(), 
                 obtenerApellidos(), obtenerIdentificacion());
        return valor;
    }
}
