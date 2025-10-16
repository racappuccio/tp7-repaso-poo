package org.example;

public class Suplente extends Docente {

    private String zonaRural;

    public Suplente(int legajo, double salario, String fechaNacimiento, int edad, String apellido, String nombre, String zonaRural) {
        super(legajo, salario, fechaNacimiento, edad, apellido, nombre);
        this.zonaRural = zonaRural;
    }


    @Override
    public void calcular_plus_salarial() {
        if (edad < 25 && zonaRural.equalsIgnoreCase("Zona Rural A")) {
            salario += PLUS_RURALIDAD;
            System.out.println("Plus aplicado al suplente: $" + PLUS_RURALIDAD);
        } else {
            System.out.println("Suplente no cumple requisitos para plus.");
        }
    }
    }





