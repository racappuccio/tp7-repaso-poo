import java.time.LocalDate;

public class Suplente extends Docente {
    private String zonaRural;

    @Override
    public double calcularPlusSalarial(){
        if (getEdad() < 25 && zonaRural.equals("A")){
            return getSalario() + PLUS_RURALIDAD;
        }
        return getSalario();
    }

    public Suplente(int legajo, String nombre, String apellido, LocalDate fechaNacimiento, int edad, double salario, String zonaRural){
        super(legajo, nombre, apellido, fechaNacimiento, edad, salario);
        this.zonaRural = zonaRural;
    }
}
