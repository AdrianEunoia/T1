package clases;

public class EntradaCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Coche cocheCompleto = new Coche("Seat","Ibiza",123,90);
        System.out.printf("Antes de modificar el primer coche sus cv eran: %d\n",coche.getCv());
        coche.setCv(300);
        System.out.printf("Despues de modificar el primer coche sus cv eran: %d\n",coche.getCv());
        System.out.printf("La velocidad antes de modificar el primer coche era: %d\n",coche.getVelocidad());
        coche.acelerar();
        System.out.printf("La velocidad despues de modificar el primer coche era: %d\n",coche.getVelocidad());
        coche.acelerar(300);
        System.out.printf("La velocidad despues de modificar el primer coche era: %d\n",coche.getVelocidad());
        if (coche.estaParado()){
            System.out.println("El coche está parado");
        }else{
            System.out.println("El coche está en movimiento");
        }
        coche.decelerar();
        coche.decelerar(100);
        System.out.printf("La velocidad despues de decelerar el primer coche es: %d\n",coche.getVelocidad());
        coche.decelerarReusando(500);
        System.out.printf("La velocidad despues de decelerar, re-usando codigo, el primer coche es: %d\n",coche.getVelocidad());

    }
}
