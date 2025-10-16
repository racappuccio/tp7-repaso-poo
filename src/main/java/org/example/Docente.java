package org.example;

public  abstract class Docente {
    protected int legajo;
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected int edad;
    protected double salario;
    protected static final double PLUS_RURALIDAD = 80000;


    public Docente(int legajo, double salario, String fechaNacimiento, int edad, String apellido, String nombre) {
        this.legajo = legajo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public void mostrarInfo(){
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre+ "" + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }


    public abstract void calcular_plus_salarial();
}
