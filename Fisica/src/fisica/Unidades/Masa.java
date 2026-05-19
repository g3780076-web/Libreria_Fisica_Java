/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fisica.Unidades;

/**
 *
 * @author usumaniana
 * Esta clase pretende representar la masa de un objeto.
 * Puedes introducir la unidad de masa que 
 * mas te guste pero bajo tu propia responsabilidad
 */
public class Masa extends Unidades{
    
    private double masa;

    public Masa(double masa) {
        this.masa = masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    @Override
    public double mostrarUnidades() {
        return masa;
    }
    
    
    
}
