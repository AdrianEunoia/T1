package Herencia;

import java.util.Hashtable;

public class Entrada {

    public static void main(String[] args) {
        ClaseA claseA = new ClaseA("Objeto de clase A","A",1);
        claseA.mostrarDatos();

        ClaseA claseB = new ClaseB("Objeto de clase B","B",2,false);
        claseB.mostrarDatos();
        // Llamamos metodo particular
        //claseB.miMetodoParticular();
        // Llamamos metodo agregar elemento
        agregarElemento(claseA);
        // Sino lo casteamos no podremos llamar a los elementos de clase B
        //((ClaseB)claseB;


    }

    // Hashtable fuera del main
    public static Hashtable<String, ClaseA> listaClases = new Hashtable();
    // Metodo fuera del main
    public static void agregarElemento(ClaseA claseA){
        listaClases.put("111",claseA);
    }
}
