/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Departamento {

    private Propietario propietario;
    private double preciom2;
    private double numm2;
    private double costofinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int num_cuartos;
    private Constructora constructora;

    public Departamento(Propietario p, double pm2, double nM2, Barrio b,
            Ciudad c, int nc, Constructora cons) {
        propietario = p;
        preciom2 = pm2;
        numm2 = nM2;
        barrio = b;
        ciudad = c;
        num_cuartos = nc;
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

    public void establecerCostoFinal(double cf) {
        costofinal = cf;
    }

    public void establecerBarrio(Barrio b) {
        barrio = b;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public void establecerNumCuartos(int nc) {
        num_cuartos = nc;
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

    public double obtenerCostoFinal() {
        return costofinal;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumCuartos() {
        return num_cuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }
}
