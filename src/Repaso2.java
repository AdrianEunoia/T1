public class Repaso2 {
    public static void main(String[] args) {
        // Hay dos posibilidades de iniciar un array
        int[] numeros = {1,2,3,4};

        int [] numeros2 = new int[4];
            numeros2[0] = 1;

        // Si queremos añadir números y strings debemos añadir objetos
        Object[] objetos = {"String",2,true};
        System.out.println(objetos[0]);

        // Llamar elementos del array con foreach
            // For normal
        for (int i = 0;i<numeros.length;i++){
            System.out.printf("Elemento %d ",numeros[i]);
        }
            // For each
        for (int cosas:numeros){
            System.out.println(cosas);
        }
    }
}
