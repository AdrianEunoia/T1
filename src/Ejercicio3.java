import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vecesJugadas=0;
        boolean inicioJuego=true;
        // Declaracion de arraylist
        ArrayList<String> arrayNombres = new ArrayList<String>();
        ArrayList<Integer> arryaPuntuaciones = new ArrayList<Integer>();
        // Bucle partida
        while (inicioJuego){
            vecesJugadas++;
            // Generamos numero aleatorio a adivinar
            int aleatorioAdivinar = (int) (Math.random()*10);
            System.out.printf("Aleatorio generado %d  \n",aleatorioAdivinar);
            // Flags
            boolean adivinado=true;
            int intentos=0;
            // Jugador
            System.out.printf("Introduce tu nombre para empezar a jugar: ");
            String nombreJugador = scanner.nextLine();
            // Bucle adivinar
            while (adivinado){
                System.out.printf("Introduce un número %s: ",nombreJugador);
                int numeroIntroducido = scanner.nextInt();
                if(numeroIntroducido == aleatorioAdivinar){
                    intentos++;
                    System.out.printf("Número Acertado, has utilizado %d intentos %s \n",intentos,nombreJugador);
                    adivinado=false;
                    // Añado jugador a la arraylist
                    arrayNombres.add(nombreJugador);
                    // Añado jugador a la arraylist
                    arryaPuntuaciones.add(intentos);
                    // Copio arraylist antes de ordenarla
                    ArrayList<Integer> numerosOriginal = (ArrayList<Integer>) arryaPuntuaciones.clone();
                    // Ordeno arraylist
                    Collections.sort(arryaPuntuaciones);
                    // Me quedo con la posicion inicial despues de ordenar, que sera la mas baja, la mejor
                    int mayorResultado = arryaPuntuaciones.get(0);
                    // De esa posicion busco el indice que era desde el array copiado no ordenado
                    int indexMasFavorable = (numerosOriginal.indexOf(mayorResultado));
                    // Con el indice del record busco el nombre del jugador
                    String nombreRecord = arrayNombres.get(indexMasFavorable);
                    if (intentos <= mayorResultado) {
                        System.out.printf("Enhorabuena acabas de batir un record con %d intentos\n %s",mayorResultado,nombreJugador);
                    }
                    else if (intentos > mayorResultado) {
                        System.out.printf("Lo sentimos el record actual lo tiene %s con %d intentos\n",nombreRecord,mayorResultado);
                    }
                }
                else{
                    intentos++;
                    System.out.println("Vuelve a intentarlo");
                }
            }
            // Vacio buffer
            scanner.nextLine();
            // Pregunto si volvemos a jugar
            System.out.printf("¿Desea jugar de nuevo? Si/No: ");
            String repetir = scanner.nextLine();
            if (repetir.equals("Si")){
                System.out.println("#####################");
                System.out.println("Cargando nuevo Juego");
                System.out.println("#####################");
                System.out.printf("Se han jugado %d veces\n",vecesJugadas);
            }
            else {
                System.out.printf("Se han jugado %d veces\n", vecesJugadas);
                inicioJuego = false;
            }
        }
    }

}
