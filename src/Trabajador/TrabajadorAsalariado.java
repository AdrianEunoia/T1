package Trabajador;

public class TrabajadorAsalariado extends Trabajador {
    // Var de la clase herencia
    int pagas;
    // Constructor de super
    public TrabajadorAsalariado(String nombre, String apellido, String dni, int sueldo, int pagas) {
        super(nombre, apellido, dni, sueldo);
        this.pagas = pagas;
    }
    // Traemos el metodo abstracto de arriba
    @Override
    public void calcularSueldo() {
        sueldomes = sueldo / pagas;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("Numero de pagas %d",pagas);
    }
}
