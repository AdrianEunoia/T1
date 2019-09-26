public class Repaso1_Menu
{
    public static void main(String[] args) {
        boolean salida;
        int nota = 7;

        switch (nota){
            case 1:
                salida=true;
                break;
            case 2:
                salida=true;
                break;
            case 3:
                salida=true;
                break;
            case 4:
                salida=true;
                break;
            case 5:
                salida=true;
                break;
            default:
                salida=false;
        }
        System.out.printf("El valor de salida es:"+salida);

        int anios=18;
        String nombre = "Borja";
        String apellido = "Martin";

        // Formateo basico
        System.out.printf("Hola "+nombre);
        System.out.printf("Hola %s",nombre);
    }
}
