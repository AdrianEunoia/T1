import java.util.Arrays;

public class Repaso3_ArrayMultidimensional {
    public static void main(String[] args) {
        Object[][] multidimensionalCuatro = {{"adri",4},{"jose",18},{"carlos",12}};
        int totalArray=0;
        // Leer cuantas posiciones va a tener nuestro array
        for (int i = 0; i < multidimensionalCuatro.length; ++i) {
            totalArray++;
        }
        // Obtener indice de veces qué ha pasado el bucle
        int numeroBucle=totalArray-1;
        // Obtener los resultados pasando de array multidimensional a array unidimensional
        int [] resultadosJugadores = new int[totalArray];
        for (int i = 0; i < multidimensionalCuatro.length; ++i) {
            resultadosJugadores[i] = (int) multidimensionalCuatro[i][1];
        }
        // Hacemos una copia del array sin ordenar para luego obtener el index de la posicion
        int[] resultadosJugadoresNotSorted = Arrays.copyOf(resultadosJugadores, totalArray);
        // Ordenamos el primer array
        Arrays.sort(resultadosJugadores);
        // Obtener el index de la posicion del mayor valor
        int posicionDelMayorValor=0;
        for (int i = 0;i<resultadosJugadoresNotSorted.length;i++){
            if (resultadosJugadoresNotSorted[i] == resultadosJugadores[numeroBucle]){
                posicionDelMayorValor = i;
            }
        }
        System.out.println(multidimensionalCuatro[posicionDelMayorValor][0]);
    }
}

