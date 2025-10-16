import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Menú para elegir que tipo de docente crear
        System.out.println("¿Qué tipo de docente desea crear?");
        System.out.println("1. Titular");
        System.out.println("2. Suplente");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el legajo: ");
        int legajo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Docente docente = null; //????

        if (opcion == 1) {
            System.out.print("Ingrese la antiguedad (en años): ");
            int antiguedad = scanner.nextInt();
            scanner.nextLine();
            docente  = new Titular(legajo, nombre, apellido, fechaNacimiento, edad, salario, antiguedad);
        } else if (opcion == 2){
            System.out.print("Ingrese zona rural (ej: A): ");
            String zonaRural = scanner.nextLine();
            docente  = new Suplente(legajo, nombre, apellido, fechaNacimiento, edad, salario, zonaRural);
        }

        System.out.println("----- DOCENTE CREADO -----");
        System.out.println("Nombre: " + docente.getNombre() + " " + docente.getApellido());
        System.out.println("Fecha de nacimiento: " + docente.getFechaNacimiento());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Salario base: $" + docente.getSalario());
        System.out.println("Salario con plus: $" + docente.calcularPlusSalarial());




    }
}
