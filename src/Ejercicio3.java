import javax.swing.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vecesJugadas=0;
        boolean inicioJuego=true;
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
                }
                else{
                    intentos++;
                    System.out.println("Vuelve a intentarlo");
                }
            }
            // Vacio buffer
            scanner.nextLine();
            //
            System.out.printf("¿Desea jugar de nuevo? Si/No: ");
            String repetir = scanner.nextLine();
            if (repetir.equals("Si")){
                System.out.println("#####################");
                System.out.println("Cargando nuevo Juego");
                System.out.println("#####################");
                System.out.printf("Se han jugado %d veces",vecesJugadas);
            }
            else{
                System.out.printf("Se han jugado %d veces",vecesJugadas);
                inicioJuego=false;
            }
        }
    }
}
