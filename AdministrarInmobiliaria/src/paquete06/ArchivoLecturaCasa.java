/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.io.*;
import java.util.*;

/**
 *
 * @author Edgar Espinoza Jostin Alvarado
 */
public class ArchivoLecturaCasa {

    private ObjectInputStream entrada;
    private ArrayList<Casa> casas;
    private String nombreArchivo;

    public ArchivoLecturaCasa(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(nombreArchivo));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo" + ioException);
            }
        }
    }

    public void establecerCasa() {
        casas = new ArrayList<>();
        File f = new File(nombreArchivo);
        if (f.exists()) {
            while (true) {

                try {
                    Casa registro = (Casa) entrada.readObject();
                    casas.add(registro);
                } catch (EOFException endOfFileException) {
                    break;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo");
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto" + ex);
                }
            }
        }

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public ArrayList<Casa> obtenerCasas() {
        return casas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < casas.size(); i++) {
            Casa ca = casas.get(i);
            cadena = String.format("%s(%d) \tInformacion casa:\n"
                    + "Precio metro cuadrado: %.2f \n"
                    + "Numero metros Cuadrados: %.2f \n"
                    + "Numero Cuartos: %d \n"
                    + "Costo final: %.2f\n"
                    + "->PROPIETARIO\n"
                    + "Nombres: %s \n"
                    + "Apellidos: %s \n"
                    + "Identificacion: %s\n"
                    + "->BARRIO\n"
                    + "Nombre barrio: %s \n"
                    + "Referencia: %s\n"
                    + "->CIUDAD\n"
                    + "Nombre Ciudad: %s \n"
                    + "Nombre Provincia: %s \n"
                    + "->CONSTRUCTORA\n"
                    + "Nombre Constructora: %s \n"
                    + "Id Empresa: %s\n",
                    cadena,
                    (i + 1),
                    casas.get(i).obtenerPrecioM2(),
                    casas.get(i).obtenerNumeroM2(),
                    casas.get(i).obtenerNumeroCuartos(),
                    casas.get(i).obtenerCostoFinal(),
                    casas.get(i).obtenerPropietario().obtenerNombres(),
                    casas.get(i).obtenerPropietario().obtenerApellidos(),
                    casas.get(i).obtenerPropietario().obtenerIdentificacion(),
                    casas.get(i).obtenerBarrio().obtenerNombreBarrio(),
                    casas.get(i).obtenerBarrio().obtenerReferencia(),
                    casas.get(i).obtenerCiudad().obtenerNombreCiudad(),
                    casas.get(i).obtenerCiudad().obtenerNombreProvincia(),
                    casas.get(i).obtenerConstructora().obtenerNombreConstructora(),
                    casas.get(i).obtenerConstructora().obteneridEmpresa());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }
}
