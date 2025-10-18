package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main() throws AntiguedadInvalidaException {
    Scanner sc = new Scanner(System.in);
    boolean seguir = true;



    while (seguir) {
        try {
            System.out.println("\nSeleccione el tipo de docente a ingresar:");
            System.out.println("1. Titular");
            System.out.println("2. Suplente");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            if (opcion != 1 && opcion != 2 && opcion != 3) {
                throw new OpcionInvalidaException("Debe elegir 1 (Titular) o 2 (Suplente) o 3(Salir)");
            } else {

                switch (opcion) {

                    case 1:
                        System.out.println("===Sistema de Gestión de Docentes===");
                        System.out.println("\nIngresar datos del docente TITULAR:");
                        System.out.print("Legajo: ");
                        int legajoT = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombreT = sc.nextLine();
                        System.out.print("Apellido: ");
                        String apellidoT = sc.nextLine();
                        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
                        String fnT = sc.nextLine();
                        System.out.print("Edad: ");
                        int edadT = sc.nextInt();
                        System.out.print("Salario: ");
                        double salarioT = sc.nextDouble();
                        System.out.print("Antigüedad (años): ");
                        int antiguedadT = sc.nextInt();
                        sc.nextLine();

                        Titular titular = new Titular(legajoT, salarioT, fnT, edadT, apellidoT, nombreT, antiguedadT);
                        titular.calcular_plus_salarial();
                        titular.mostrarInfo();
                        break;
                    case 2:
                        System.out.println("\nIngresar datos del docente SUPLENTE:");
                        System.out.print("Legajo: ");
                        int legajoS = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombreS = sc.nextLine();
                        System.out.print("Apellido: ");
                        String apellidoS = sc.nextLine();
                        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
                        String fnS = sc.nextLine();
                        System.out.print("Edad: ");
                        int edadS = sc.nextInt();
                        System.out.print("Salario: ");
                        double salarioS = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Zona rural: ");
                        String zonaS = sc.nextLine();

                        Suplente suplente = new Suplente(legajoS, salarioS, fnS, edadS, apellidoS, nombreS, zonaS);
                        suplente.calcular_plus_salarial();
                        suplente.mostrarInfo();
                        break;

                    case 3:
                        seguir = false;
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            }

        } catch (EdadInvalidaException | SalarioInvalidoException | AntiguedadInvalidaException |
                 LegajoInvalidoException e) {
            System.err.println("Error al crear docente: " + ((Exception) e).getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }}}

