package Herencia;

public class ClaseB extends ClaseA {
    // Para extender vas a necesitar un constructor vacio obligatoriamente
    // Ademas, obligatoriamente tenemos que usar alguno de los constructores de la clase padre
    // En este caso el super se está refiriendo al comportamiento de las caracteristicas de clase clase A

    // Añadimos una caracteristica, lo estamos extendiendo
    boolean modificado;
    // Alteramos el constructor y cogemos las caracteristicas de arriba
    public ClaseB(String nombre, String tipo, int codigo, boolean modificado) {
        super(nombre, tipo, codigo);
        this.modificado = modificado;
    }
    // Añadimos el segundo metodo de mostrar los datos, cogemos el de arriba y le añadimos el de esta clase
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("Es modificado %b \n",modificado);
    }

    // Mi metodo particular, estudiamos poliformismo
    public void miMetodoParticular(){
        System.out.println("Esto es un metodo particular de la clase B");
    }

}
