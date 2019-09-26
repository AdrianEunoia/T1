package Trabajador;

public abstract class Trabajador {
    String nombre,apellido,dni;
    int sueldo,sueldomes;
    // Constructor
    public Trabajador(String nombre, String apellido, String dni, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
    }
    // Metodos
    public void mostrarDatos(){
        System.out.printf("Nombre %s",nombre);
        System.out.printf("Apellido %s",apellido);
        System.out.printf("DNI %s",dni);
        System.out.printf("Sueldo %d",sueldo);
        System.out.printf("Sueldo mes %d\n",sueldomes);
    }
    // Metodos abstractos
    public abstract void calcularSueldo();
    // Getter Setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public int getSueldo() { return sueldo; }
    public void setSueldo(int sueldo) { this.sueldo = sueldo; }
    public int getSueldomes() { return sueldomes; }
    public void setSueldomes(int sueldomes) { this.sueldomes = sueldomes; }
    // Metodo para obtener clave

}
