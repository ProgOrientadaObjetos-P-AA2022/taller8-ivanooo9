/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int seleccion;
        String Nombre;
        String cedula;
        System.out.println("Ingrese el nombre del Docente");
        Nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula del docente");
        cedula = entrada.nextLine();
        Docente dc = new Docente();

        dc.establecerNombres(Nombre);
        dc.establecerIdentificacion(cedula);

        System.out.println("----------------------------");
        System.out.println("Nombre del docente");
        System.out.println(Nombre);
        System.out.println("----------------------------");


        System.out.println("----------------------------");
        System.out.println("Identificacion del docente");
        System.out.println(cedula);
        System.out.println("----------------------------");


        System.out.println("----------------------------------------------------");
        System.out.println("Menu de opciones");
        System.out.println("1: Crear objeto de tipo Docente Nombramiento");
        System.out.println("2: Crear objeto de tipo Docente Factura");
        System.out.println("Seleccione que desea crear");
        System.out.println("----------------------------------------------------");
        seleccion = entrada.nextInt();
        while (seleccion <= 2) {
            switch (seleccion) {
                case 1 -> {
                    DocenteNombramiento dc1 = new DocenteNombramiento();
                    double sueldo;
                    double valorextra;
                    int horas;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Ingrese de datos para el docente");
                    System.out.println(Nombre);
                    System.out.println("De Identificacion");
                    System.out.println(cedula);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Ingrese el sueldo del docente");
                    sueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor extra del sueldo del docente");
                    valorextra = entrada.nextDouble();
                    System.out.println("Ingrese la cantidad de horas extra");
                    horas = entrada.nextInt();
                    dc1.establecerValorSueldo(sueldo);
                    dc1.establecerValorHoraExtra(valorextra);
                    dc1.establecerCantidadHoras(horas);
                    dc1.calcularSueldoTotal();
                    dc1.obtenerSueldoTotal();
                    System.out.println(dc1);
                }
                case 2 -> {
                    DocenteFactura dc2 = new DocenteFactura();
                    double fc;
                    double iva;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Ingrese de datos para el docente");
                    System.out.println(Nombre);
                    System.out.println("De Identificacion");
                    System.out.println(cedula);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Ingrese el valor de la factura");
                    fc = entrada.nextDouble();
                    System.out.println("Ingrese el valor del iva");
                    iva = entrada.nextDouble();
                    dc2.establecerValorFactura(fc);
                    dc2.establecerValorIva(iva);
                    dc2.calcularValorCancelar();
                    dc2.obtenerValorCancelar();
                }
            }

        }
        System.out.println("Error, opción no válida\n");

    }


}