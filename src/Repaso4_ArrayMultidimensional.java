public class Repaso4_ArrayMultidimensional {
    public static void main(String[] args) {
        Object[][] multidimensional = new Object[2][2];
        multidimensional[0][0] = "Juan";
        multidimensional[0][1] = 5;


        for (Object[] temp : multidimensional){
            for (int y = 0;y<temp.length;y++){
                String frase = "La posición %d tiene asignado el valor %s";
                System.out.println(String.format(frase,y,temp[y]));
            }

        }
    }
}
