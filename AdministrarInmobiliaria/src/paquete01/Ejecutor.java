/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcion;

        System.out.println("------------------------------------------------------------------------");

        System.out.println("\t\t REGISTRO DE DATOS DE UNA INMOBILIARIA");

        System.out.println("------------------------------------------------------------------------");
        boolean bandera = true;
        while (bandera) {
            System.out.println("De la siguiente lista ingrese la opcion a igresar: \n"
                    + "-1- Datos de Propietario\n"
                    + "-2- Datos de Barrios\n"
                    + "-3- Datos de Ciudad\n"
                    + "-4- Datos de Constructora\n");

            String datos = entrada.nextLine();
            switch (datos) {
                case "1":
                    opcion = propietario();
                    System.out.println(opcion);
                    break;
                case "2":
                    opcion = barrio();
                    System.out.println(opcion);
                    break;
                case "3":
                    opcion = ciudad();
                    System.out.println(opcion);
                    break;
                case "4":
                    opcion = constructora();
                    System.out.println(opcion);
                    break;
            }
            System.out.println("¿Desea ingresar mas datos?");
            String salida = entrada.nextLine();
            if (salida.equals("no")) {
                bandera = false;
            }
        }
    }

    private static String propietario() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de propietarios");
        System.out.println("Cuantos propietarios desea ingresar?");
        int limite_prop = entrada.nextInt();
        entrada.nextLine();
        Propietario[] prop = new Propietario[limite_prop];

        for (int i = 0; i < limite_prop; i++) {
            System.out.printf("Ingrese el nombre del propietario %d\n", i + 1);
            String nombre = entrada.nextLine();

            System.out.printf("Ingrese el apellido de propietario %s\n", nombre);
            String apellido = entrada.nextLine();

            System.out.printf("Ingrese la cedula del propietario %s %s\n", nombre, apellido);
            String cedula = entrada.nextLine();

            Propietario propietario = new Propietario(nombre, apellido, cedula);
            prop[i] = propietario;

        }
        return "propietarios ingresados correctamente";
    }

    private static String barrio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de Barrios");
        System.out.println("Cuantos barrios desea ingresar?");
        int limite_ba = entrada.nextInt();
        entrada.nextLine();
        Barrio[] ba = new Barrio[limite_ba];

        for (int i = 0; i < limite_ba; i++) {
            System.out.printf("Ingrese el nombre del barrio %d\n", i + 1);
            String nombreB = entrada.nextLine();

            System.out.printf("Ingrese la referencia del barrio: %s\n", nombreB);
            String referencia = entrada.nextLine();

            Barrio barrio = new Barrio(nombreB, referencia);
            ba[i] = barrio;

        }
        return "Barrios ingresados correctamente";
    }

    private static String ciudad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de Ciudades");
        System.out.println("Cuantas ciudades desea ingresar?");
        int limite_ci = entrada.nextInt();
        entrada.nextLine();
        Ciudad[] ci = new Ciudad[limite_ci];

        for (int i = 0; i < limite_ci; i++) {
            System.out.printf("Ingrese el nombre de la ciudad %d\n", i + 1);
            String nombreCi = entrada.nextLine();
            System.out.printf("Ingrese el nombre de la provincia de %s\n", nombreCi);
            String prov = entrada.nextLine();

            Ciudad ciudad = new Ciudad(nombreCi, prov);
            ci[i] = ciudad;

        }
        return "Ciudades ingresadas correctamente";
    }

    private static String constructora() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingreso de constructoras");
        System.out.println("Cuantas constructoras desea ingresar?");
        int limite_co = entrada.nextInt();
        entrada.nextLine();
        Constructora[] co = new Constructora[limite_co];

        for (int i = 0; i < limite_co; i++) {
            System.out.printf("Ingrese el nombre de la constructora %d\n", i + 1);
            String nombreC = entrada.nextLine();

            System.out.printf("Ingrese el ID de la empresa %s\n", nombreC);
            String id = entrada.nextLine();

            Constructora constructora = new Constructora(nombreC, id);
            co[i] = constructora;

        }
        return "Constructoras ingresadas correctamente";
    }

}
