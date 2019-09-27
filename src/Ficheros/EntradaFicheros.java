package Ficheros;

import java.io.*;
import java.util.ArrayList;

public class EntradaFicheros {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList();

        listaAlumnos.add(new Alumno("N1","","",123));
        listaAlumnos.add(new Alumno("N2","","",123));
        listaAlumnos.add(new Alumno("N3","","",123));
        listaAlumnos.add(new Alumno("N4","","",123));
        listaAlumnos.add(new Alumno("N5","","",123));
        listaAlumnos.add(new Alumno("N6","","",123));

        // Escribir Fichero
        //Ruta relativa desde la raiz del proyecto.
        File ficheroAlumnos = new File("src/Ficheros/alumnos.obj");
        //Tener un objeto que posibilita a escribir cosas
        // Declaro fuera
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(ficheroAlumnos));
            oos.writeObject(listaAlumnos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Leer fichero
        File ficheroAlumnosLectura = new File("src/Ficheros/alumnos.obj");
        ObjectInputStream oii = null;
        ArrayList<Alumno> listaAlumnos2;
        try {
            oii = new ObjectInputStream(new FileInputStream(ficheroAlumnosLectura));
            listaAlumnos2 = (ArrayList<Alumno>) oii.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}