import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayNumeros = new int[50];
        int opcion;
        boolean menu=true;
        while(menu){
            System.out.println("Opcion 1 Rellenar array con numeros aleatorios del 1 al 200");
            System.out.println("Opcion 2 Mostrar los elementos del array");
            System.out.println("Opcion 3 Ordenar elementos del array");
            System.out.println("Opcion 4 Vaciar el array");
            System.out.println("Opcion 5 Salir del menu");
            // Recojo opcion
            System.out.printf("Opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Relleno array");
                    for (int i = 0;i<arrayNumeros.length;i++){
                        arrayNumeros[i] = (int) (Math.random()*200);
                    }
                    break;
                case 2:
                    System.out.println("Muestro array");
                    for (int i = 0;i<arrayNumeros.length;i++){
                        System.out.printf("Elemento n.%d %d \n",i,arrayNumeros[i]);
                    }
                    break;
                case 3:
                    System.out.println("Ordena array");
                    Arrays.sort(arrayNumeros);
                    for (int i = 0;i<arrayNumeros.length;i++){
                        System.out.printf("Elemento n.%d %d \n",i,arrayNumeros[i]);
                    }
                    break;
                case 4:
                    System.out.println("Vaciar array");
                    for (int i = 0;i<arrayNumeros.length;i++){
                        arrayNumeros[i] = 0;
                    }
                    break;
                case 5:
                    System.out.println("Salir del menu");
                    menu=false;
                    break;
            }
        }
    }
}
