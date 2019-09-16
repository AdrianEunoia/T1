package utiles;

public class Alumno {
    // Hacemos privadas las cualidades del objeto para que no pueda acceder otro
    private String nombre, apellido, dni;
    private int matricula;

    public Alumno(String nombre, String apellido, String dni, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.matricula = matricula;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public int getMatricula() { return matricula; }
    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(String dni) { this.dni = dni; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    @Override
    // Cuando llamamos a un objeto saldrá el nombre en vez de el puntero de memoria
    public String toString() {
        return getNombre();
    }
}
