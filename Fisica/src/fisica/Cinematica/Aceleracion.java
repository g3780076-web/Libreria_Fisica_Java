/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinematica;

import fisica.Unidades.Tiempo;

/**
 *
 * @author usumaniana
 */
public class Aceleracion {
    private Velocidad vi;
    private Velocidad vf;
    private Tiempo t;

    public Aceleracion(Velocidad vi, Velocidad vf, Tiempo t) {
        this.vi = vi;
        this.vf = vf;
        this.t = t;
    }
    public double calcularAceleracion(){
        return(vf.calcularVelocidad()-vi.calcularVelocidad())/t.Obtenertiempo();
    }
    
}
