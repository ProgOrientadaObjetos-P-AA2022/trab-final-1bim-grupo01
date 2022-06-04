/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {

    private String nombreConstructora;
    private String idEmpresa;

    public Constructora(String n, String id){
        nombreConstructora = n;
        idEmpresa = id;
    }

    public void establecerNombreConstructora(String n) {
        nombreConstructora = n;
    }

    public void estableceridEmpresa(String id) {
        idEmpresa = id;
    }

    public String obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public String obteneridEmpresa() {
        return idEmpresa;
    }
}
