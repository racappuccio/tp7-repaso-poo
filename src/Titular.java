import java.time.LocalDate;

public class Titular extends Docente {
    private int antiguedad;

    @Override
    public double calcularPlusSalarial(){
        if (getEdad() == 30 && antiguedad > 6){
            return getSalario() + PLUS_RURALIDAD; //devuelve salario + 80000
        }
        return getSalario();
    }

    public Titular(int legajo, String nombre, String apellido, LocalDate fechaNacimiento, int edad, double salario, int antiguedad){
        super(legajo, nombre, apellido, fechaNacimiento, edad, salario);
        this.antiguedad = antiguedad;
    }
}
