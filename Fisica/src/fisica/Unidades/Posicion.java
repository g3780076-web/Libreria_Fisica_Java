/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fisica.Unidades;

/**
 *
 * @author usumaniana
 */
public class Posicion {
    private double x1;
    private double x2;

    public Posicion(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    
    
    public double obtenerPosicion(){
        return x2-x1;
    }
    
    
}
