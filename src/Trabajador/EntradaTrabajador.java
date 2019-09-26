package Trabajador;

public class EntradaTrabajador {
    public static void main(String[] args) {
        //Trabajador asalariado = new TrabajadorAsalariado("","","",120);
        //asalariado.mostrarDatos();
        Empresa empresa = new Empresa();
        Trabajador asalariado = new TrabajadorAsalariado("","","",1,1);
        Trabajador autonomo =  new TrabajadorAutonomo("","","",1);


    }
}
