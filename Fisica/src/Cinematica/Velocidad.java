/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinematica;

import fisica.Unidades.Posicion;
import fisica.Unidades.Tiempo;

/**
 *
 * @author usumaniana
 */
public class Velocidad {
    private Tiempo t;
    private Posicion p;
    
    /**
     * 
     * @param t Es un objeto de clase Tiempo
     * @param p Es un objeto de clase Posicion
     */
    public Velocidad(Tiempo t, Posicion p) {
        this.t = t;
        this.p = p;
    }

    public Tiempo getTi() {
        return t;
    }

    public void setTi(Tiempo t) {
        this.t = t;
    }

    public Posicion getPi() {
        return p;
    }

    public void setPi(Posicion pi) {
        this.p = p;
    }
    
    public double calcularVelocidad(){
        return p.obtenerPosicion()/t.Obtenertiempo();//Revisar la formula
    }
    
}
