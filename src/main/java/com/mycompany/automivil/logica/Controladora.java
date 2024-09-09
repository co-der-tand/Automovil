
package com.mycompany.automivil.logica;

import com.mycompany.automivil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAuto(String modelo, String marca, String motor, String color, String patente, int puertas) {
       
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);
        
        controlPersis.crearAuto(auto);
        
        
    }

    public List<Automovil> traerAutos() {
       return controlPersis.traerAutos();
    }

    public void borrarAuto(int id) {
       controlPersis.borrarAuto(id);
    }

    public Automovil traerAuto(int id) {
       return controlPersis.traerAuto(id);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor,
            String color, String patente, int puertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);
        
        controlPersis.modificarAuto(auto);
        
    }

  

   

   
    


    
    
}
