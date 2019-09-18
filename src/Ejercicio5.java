import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import utiles.Alumno;
import utiles.Coche;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean menu=true;
        Hashtable<String, Coche> hastableCoches = new Hashtable<String, Coche>();
        while(menu){
            System.out.println("Opcion 1 Agregar coches sin que se repita matricula.");
            System.out.println("Opcion 2 Sacar coche del garaje según matricula");
            System.out.println("Opcion 3 Acelerar coche");
            System.out.println("Opcion 4 Deacelerar coche");
            System.out.println("Opcion 5 Listar los coches que están dentro del garaje");
            System.out.println("Opcion 6 Salir del menu");
            // Var
            String marca,modelo,matricula,respuestaEstado;
            int bastidor=0, cv=0,velocidad=0;
            boolean estado=true;

            // Recojo opcion
            System.out.printf("Opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.printf("Teclea una marca a introducir: ");
                    marca = scanner.next();
                    System.out.printf("Teclea un modelo a introducir: ");
                    modelo = scanner.next();
                    System.out.printf("Teclea un bastidor a introducir: ");
                    bastidor = scanner.nextInt();
                    System.out.printf("Teclea unos cv a introducir: ");
                    cv = scanner.nextInt();
                    System.out.printf("Teclea una matricula a introducir: ");
                    matricula = scanner.next();
                    System.out.printf("¿Está el coche dentro del garaje? si/no: ");
                    respuestaEstado = scanner.next();
                    if(respuestaEstado.equals("si")){
                        estado=true;
                    }
                    if(hastableCoches.containsKey(matricula)) {
                        System.out.println("No se puede introducir un coche con matricula duplicada");
                    }
                    else {
                        Coche objetoCoche = new Coche(marca,modelo,matricula,bastidor,cv,estado);
                        hastableCoches.put(objetoCoche.getMatricula(),objetoCoche);
                        System.out.println("Introducido con exito");
                    }
                    break;
                case 2:
                    System.out.printf("Teclea la matricula del coche que quieras sacar del garaje: ");
                    matricula = scanner.next();
                    if(hastableCoches.containsKey(matricula)) {
                        Coche cocheEncontrado = hastableCoches.get(matricula);
                        cocheEncontrado.setEstado(false);
                        System.out.println("Se ha sacado el coche del garaje con exito");
                    }else{
                        System.out.println("No se encuentran coches con esa matricula en el garaje.");
                    }
                    break;
                case 3:
                    System.out.println("Teclea la matricula del coche a acelerar");
                    matricula = scanner.next();
                    Coche cocheEncontrado = hastableCoches.get(matricula);
                    if(hastableCoches.containsKey(matricula) && (cocheEncontrado.garajeCoche(matricula))){
                        System.out.println("Está dentro del garaje y no se le puede aumentar la velocidad");
                    }else{
                        System.out.println("Introduce la velocidad a la que deseas acelerar: ");
                        velocidad = scanner.nextInt();
                        cocheEncontrado.acelerar(velocidad);
                        System.out.println("Velocidad aumentada con exito");
                    }
                    break;
                case 4:
                    System.out.println("Teclea la matricula del coche a deacelerar");
                    matricula = scanner.next();
                    Coche cocheDeacelerar = hastableCoches.get(matricula);
                    if(hastableCoches.containsKey(matricula) && (cocheDeacelerar.garajeCoche(matricula))){
                        System.out.println("Está dentro del garaje y no se le puede aumentar la velocidad");
                    }else{
                        System.out.println("Introduce la velocidad a la que deseas deacelerar: ");
                        velocidad = scanner.nextInt();
                        cocheDeacelerar.deAcelerar(velocidad);
                        System.out.println("Velocidad aumentada con exito");
                    }
                    break;
                case 5:
                    // Enumerar coches que esten en el garaje
                    Enumeration<Coche> alumnos = hastableCoches.elements();
                    while (alumnos.hasMoreElements()) {
                        Coche coche = alumnos.nextElement();
                        if (coche.isEstado()) {
                            System.out.printf("Hay un %s en el garaje.",coche.getMarca());
                        }
                    }
                    break;
                case 6:
                    menu=false;
                    break;
            }
        }
    }
}
