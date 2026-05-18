/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fisica.Unidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author usumaniana
 */
public class Tiempo {
    private LocalDateTime t1;
    private LocalDateTime t2;
    private LocalDate l1;
    private LocalDate l2;

    public Tiempo(LocalDate l1 , LocalDate l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public Tiempo(LocalDateTime t1, LocalDateTime t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public long Obtenertiempo(){
        
        if(l1==null && l2==null){
        return ChronoUnit.SECONDS.between(t1, t2);
        }else{
          return ChronoUnit.SECONDS.between(l1, l2);
        }
        
        
    }
    
    
}
