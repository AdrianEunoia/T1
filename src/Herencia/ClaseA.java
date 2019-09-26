package Herencia;

public class ClaseA {
    String nombre, tipo;
    int codigo;
    // Constructor
    public ClaseA(String nombre, String tipo, int codigo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigo = codigo;
    }
    // Constructor vacio, para poder extender
    /*public ClaseA() {
    }*/
    // Creo metodo para mostrar datos
    public void mostrarDatos(){
        System.out.printf("El nombre es %s\n ",nombre);
        System.out.printf("El tipo es %s\n ",tipo);
        System.out.printf("El codigo es %d\n ",codigo);

    }
}
