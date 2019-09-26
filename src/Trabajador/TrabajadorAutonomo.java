package Trabajador;

public class TrabajadorAutonomo extends Trabajador{

    public TrabajadorAutonomo(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
    }
    @Override
    public void calcularSueldo(){
    }
}
