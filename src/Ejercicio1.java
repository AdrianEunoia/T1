import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int flag = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor introduce tu nombre: ");
            String nombre = scanner.nextLine();
            int anio = Calendar.getInstance().get(Calendar.YEAR);
            int mes = Calendar.getInstance().get(Calendar.MONTH);
            int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            String horadeldia = "";
            String nombremes = "";
            String loop = "n";
            switch (mes) {
                case 0:
                    nombremes = "Enero";
                    break;
                case 1:
                    nombremes = "Febrero";
                    break;
                case 2:
                    nombremes = "Marzo";
                    break;
                case 3:
                    nombremes = "Abril";
                    break;
                case 4:
                    nombremes = "Mayo";
                    break;
                case 5:
                    nombremes = "Junio";
                    break;
                case 6:
                    nombremes = "Julio";
                    break;
                case 7:
                    nombremes = "Agosto";
                    break;
                case 8:
                    nombremes = "Septiembre";
                    break;
                case 9:
                    nombremes = "Octumbre";
                    break;
                case 10:
                    nombremes = "Noviembre";
                    break;
                case 11:
                    nombremes = "Diciembre";
                    break;
            }
            if (hora >= 6 && hora <= 12) {
                horadeldia = "Buenos días";
            } else if (hora > 12 && hora <= 19) {
                horadeldia = "Buenas tardes";
            } else {
                horadeldia = "Buenas noches";
            }
            System.out.printf("%s %s, Son las %d del %d de %s de %d \n", horadeldia, nombre, hora, dia, nombremes, anio);
            System.out.printf("¿Desea continuar? s/n");
            String continuar = scanner.nextLine();
            if (continuar.equals(loop)) {
                flag++;
            }
        } while (flag < 1);
    }
}
