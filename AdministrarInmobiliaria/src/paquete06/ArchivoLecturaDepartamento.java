/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.io.*;
import java.util.*;
/**
 *
 * @author Edgar Espinoza
 *         Jostin Alvarado 
 */
public class ArchivoLecturaDepartamento {
    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamentos;
    private String nombreArchivo;
    
    
    public ArchivoLecturaDepartamento(String n) {
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
    
    public void establecerDepartamento() {
        departamentos = new ArrayList<>();
        File f = new File(nombreArchivo);
        if (f.exists()) {
            while (true) {
                
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamentos.add(registro);
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
    
    public ArrayList<Departamento> obtenerDepartamentos() {
        return departamentos;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < departamentos.size(); i++) {
            cadena = String.format("%s(%d) Informacion del Departamento\n"
                    + "Nombre Edificio: %s \n"
                    + "Ubicaci??n en el Edificio: %s\n"
                    + "Precio por metro cuadrado: %.2f \n"
                    + "Numero de metros cuadrados: %.2f\n"
                    + "Valor Al??cuota Mensual: %.2f \n"
                    + "Costo final: %.2f\n"
                    + "PROPIETARIO\n"
                    + "Nombres: %s Apellidos: %s Identificacion: %s\n"
                    + "BARRIO\n"
                    + "Nombre Barrio: %s \n"
                    + "Referencia%s\n"
                    + "CIUDAD\n"
                    + "Nombre Ciudad: %s \n"
                    + "Nombre Provincia: %s\n"
                    + "CONSTRUCTORA\n"
                    + "Nombre Constructora: %s \n"
                    + "ID Empresa: %s\n", cadena, (i + 1),
                    departamentos.get(i).obtenerNombreEdi(), departamentos.get(i).obtenerUbicacion(),
                    departamentos.get(i).obtenerPreciom2(), departamentos.get(i).obtenerNumM2(),
                    departamentos.get(i).obtenerValorAlicuotaMensual(), 
                    departamentos.get(i).obtenerCostoFinal(),
                    departamentos.get(i).obtenerPropietario().obtenerNombres(), 
                    departamentos.get(i).obtenerPropietario().obtenerApellidos(), 
                    departamentos.get(i).obtenerPropietario().obtenerIdentificacion(),
                    departamentos.get(i).obtenerBarrio().obtenerNombreBarrio(), 
                    departamentos.get(i).obtenerBarrio().obtenerReferencia(),
                    departamentos.get(i).obtenerCiudad().obtenerNombreCiudad(), 
                    departamentos.get(i).obtenerCiudad().obtenerNombreProvincia(),
                    departamentos.get(i).obtenerConstructora().obtenerNombreConstructora(),     
                    departamentos.get(i).obtenerConstructora().obteneridEmpresa());
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
