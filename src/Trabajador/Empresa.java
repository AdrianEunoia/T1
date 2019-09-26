package Trabajador;

import java.util.Hashtable;

public class Empresa {
    Hashtable<String, Trabajador> listaTrabajadores;

    public Empresa() {
        listaTrabajadores = new Hashtable();
    }
    // Metodo agregar trabajador
    public void agregarTrabajador(Trabajador trabajador){
        listaTrabajadores.put(trabajador.getDni(),trabajador);
    }
}
