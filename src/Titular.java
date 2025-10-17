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

    public Titular(int legajo, String nombre, String apellido, LocalDate fechaNacimiento, int edad, double salario, int antiguedad) throws LegajoInvalidoException, EdadInvalidaException, SalarioInvalidoException, AntiguedadInvalidaException {
        super(legajo, nombre, apellido, fechaNacimiento, edad, salario);

        if (antiguedad < 0) {
            throw new AntiguedadInvalidaException("La antiguedad no puede ser negativa");
        }
        if (antiguedad > edad - 18) {
            throw new AntiguedadInvalidaException("La antiguedad no puede ser mayor a los años laborales posibles");
        }

        this.antiguedad = antiguedad;
    }
}
