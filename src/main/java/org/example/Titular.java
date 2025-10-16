package org.example;

public class Titular extends Docente {
    private int antiguedad;

    public Titular(int legajo, double salario, String fechaNacimiento, int edad, String apellido, String nombre, int antiguedad) {
        super(legajo, salario, fechaNacimiento, edad, apellido, nombre);
        this.antiguedad = antiguedad;
    }



    @Override
    public void calcular_plus_salarial() {
        if (edad > 30 && antiguedad > 6) {
            salario += PLUS_RURALIDAD;
            System.out.println("Plus aplicado al titular: $" + PLUS_RURALIDAD);
        } else {
            System.out.println("Titular no cumple requisitos para plus.");
        }
    }
    }

