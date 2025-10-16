import java.time.LocalDate;
public abstract class Docente {
    private int legajo;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;
    private double salario;
    protected static final double PLUS_RURALIDAD = 80000;

    public abstract double calcularPlusSalarial();

    public Docente(int legajo, String nombre, String apellido, LocalDate fechaNacimiento, int edad, double salario) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.salario = salario;

    }

    public int getEdad() {return edad;}
    public double getSalario(){ return salario;}
    public int getLegajo(){return legajo;}
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public LocalDate getFechaNacimiento(){return fechaNacimiento;}
}
