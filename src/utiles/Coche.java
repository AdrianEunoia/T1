package utiles;

public class Coche {
    private String marca, modelo, matricula;
    private int bastidor, cv, velocidad;
    boolean estado;
    // Constructor
    public Coche(String marca, String modelo, String matricula, int bastidor, int cv, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.cv = cv;
        this.estado = estado;
    }
    // Setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setBastidor(int bastidor) { this.bastidor = bastidor; }
    public void setCv(int cv) { this.cv = cv; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public void setEstado(boolean estado) { this.estado = estado; }
    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getMatricula(){ return matricula; }
    public int getBastidor() { return bastidor; }
    public int getCv() { return cv; }
    public int getVelocidad() { return velocidad; }
    public boolean isEstado() { return estado; }
    // Metodo comprobar garaje
    public boolean garajeCoche(String matricula){
        return estado;
    }
    // Metodo acelerar
    public void acelerar(int vel){
        velocidad = velocidad+vel;
    }
    // Metodo deacelerar
    public void deAcelerar(int vel){
        velocidadValida(vel);
    }
    public void velocidadValida(int velocidad){
        // this es el que tenemos aqui y velocidad el que nos pasamos como parametro
        if (this.velocidad >= velocidad){
            this.velocidad = this.velocidad - velocidad;
        }
    }

}
