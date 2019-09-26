package Herencia;

import java.awt.*;

public class Punto3D extends Point {
    int z;
    // Constructor
    public Punto3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    // Move
    public void move(int x, int y, int z){
        super.move(x,y);
        this.z = z;
    }
    // Translate
    public void translate(int dx, int dy, int dz) {
        super.translate(dx, dy);
        this.z += dz;
    }
}