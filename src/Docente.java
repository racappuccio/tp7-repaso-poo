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

    public Docente(int legajo, String nombre, String apellido, LocalDate fechaNacimiento, int edad, double salario) throws LegajoInvalidoException, EdadInvalidaException, SalarioInvalidoException {

        if (legajo <= 0){
            throw new LegajoInvalidoException("El legajo debe ser mayor a 0");
        }
        if (edad < 18 || edad > 100){
            throw new EdadInvalidaException("La edad debe estar entre 18 y 100 años");
        }
        if (salario <= 0){
            throw new SalarioInvalidoException("El salario debe ser mayor a 0");
        }

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
