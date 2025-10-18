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
        if (legajo <= 0) {
            throw new LegajoInvalidoException("El legajo debe ser mayor a 0");
        } else if (edad >= 18 && edad <= 100) {
            if (salario <= (double)0.0F) {
                throw new SalarioInvalidoException("El salario debe ser mayor a 0");
            } else {
                this.legajo = legajo;
                this.nombre = nombre;
                this.apellido = apellido;
                this.fechaNacimiento = fechaNacimiento;
                this.edad = edad;
                this.salario = salario;
            }
        } else {
            throw new EdadInvalidaException("La edad debe estar entre 18 y 100 años");
        }
    }







    public void mostrarInfo(){
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre+ "" + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }


    public abstract void calcular_plus_salarial();
}
