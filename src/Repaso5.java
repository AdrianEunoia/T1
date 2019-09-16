import com.sun.corba.se.spi.ior.ObjectKey;
import utiles.Alumno;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;

public class Repaso5 {
    public static void main(String[] args) {
        // Array antigua
        int [] elementos = new int[7];
        // Arraylist
        ArrayList<Object> listaElementos = new ArrayList<Object>();
        System.out.println(listaElementos.size());
            // Eliminar cosas
            listaElementos.remove(4);
            // Limpiar
            listaElementos.clear();
            // Añadir cosas
            listaElementos.add(9);
            // Saber si contiene un elementos
            listaElementos.contains(4);
        // Recorrer con for
        for (int i=0;i<listaElementos.size();i++){
            System.out.println(listaElementos.get(i));
        }
        // Recorrer con foreach
        for (Object item : listaElementos){
            System.out.println(item);
        }
        // Obtener el valor mas alto de arraylist
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(10);
        numeros.add(8);
        ArrayList<Integer> numerosOriginal = (ArrayList<Integer>) numeros.clone();
        Collections.sort(numeros);
        Collections.reverse(numeros);
        System.out.println(numerosOriginal.get(0));
        int mayorResultado = numeros.get(0);
        System.out.println(numerosOriginal.indexOf(mayorResultado));
        // Recoger valor de un objeto
        int elementoParseado = Integer.valueOf((String)listaElementos.get(0));

        // Hashtables
        // Son el mismo concepto que arraylist pero diferentes
        Hashtable<String, Alumno> listaAlumno = new Hashtable();
        // Añadir
            // Primera forma, no recomendable
        listaAlumno.put("123456789P",new Alumno("Pepe","Pepe","123456789P",123));
            // Segunda forma, recomendable
        Alumno a = new Alumno("Juan","Juan","123F",123);
        listaAlumno.put(a.getDni(),a);
        // Eliminar
        listaAlumno.remove("123F");
        // Comprobar si contiene
        listaAlumno.containsKey("123F");
        // Recoger todo el objeto a partir de su key
        Alumno alumnoEncontrado = listaAlumno.get("123F");
        // Sacar todos los elementos del objeto
        Enumeration<Alumno> alumnos = listaAlumno.elements();
        while (alumnos.hasMoreElements()){
            Alumno alumno = alumnos.nextElement();
            System.out.println(alumno.getNombre());
        }
        // Segunda forma
        Enumeration<Alumno> claves = listaAlumno.elements();
        while (claves.hasMoreElements()){
            Alumno alumnoDos = listaAlumno.get(claves.nextElement());
            System.out.println(alumnoDos.getNombre());
            System.out.println(listaAlumno.get(claves.nextElement()).toString());
        }
    }
}
