package clases;

public class Coche {
    /*// Constructor, como minimo hay uno, este está vacio
    public Coche(){
    }
    // Metodos
        // acceso - retonor - nombre - (parametros)
    public void acelerar(int velocidad){
    }
    public void acelerar(int velocidad, String modelo){ // Solo se pueden duplicar metodos si los parametros a introducir son diferentes
    }
    public void acelerar(Coche coche){ // Le puedes pasar un tarametro de tipo objeto
    }
    public int velocidad(){ // Tiene que tener una devolucion si o si.
        return 0;
    }*/

    private String marca, modelo;
    private int bastidor, cv;
    private int velocidad;

    public Coche(String marca, String modelo, int bastidor, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.cv = cv;
    }

    public Coche(){
        this.marca="Generico";
        this.modelo="Generico";
        this.bastidor=0;
        this.cv=0;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getBastidor() {
        return bastidor;
    }
    public int getCv() {
        return cv;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad = getVelocidad()+50;
    }
    public void acelerar(int vel){
        velocidad = velocidad+vel;
    }
    public boolean estaParado(){
        boolean parado;
        if(velocidad > 0){
            parado=false;
            return parado;
        }else{
            parado=true;
            return parado;
        }
    }
    public void decelerar(int vel) {
        velocidad = getVelocidad();
        if ((velocidad - vel) >= 0) {
            velocidad = velocidad - vel;
        } else {
            velocidad = getVelocidad();
        }
    }
    public void decelerar() {
        velocidad = getVelocidad();
        if ((velocidad - 50) >= 0) {
            velocidad = velocidad - 50;
        } else {
            velocidad = getVelocidad();
        }
    }
    // Ahorrar codigo usando un metodo para validar
    public void decelerarReusando(int vel){
        velocidadValida(vel);
    }
    public void velocidadValida(int velocidad){
            // this es el que tenemos aqui y velocidad el que nos pasamos como parametro
        if (this.velocidad >= velocidad){
            this.velocidad = this.velocidad - velocidad;
        }
    }
}
