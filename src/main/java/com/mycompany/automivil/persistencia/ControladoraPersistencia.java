
package com.mycompany.automivil.persistencia;

import com.mycompany.automivil.igu.lanzarMensaje;
import com.mycompany.automivil.logica.Automovil;
import com.mycompany.automivil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ControladoraPersistencia  {
    
    AutomovilJpaController autoJpa = new  AutomovilJpaController();

    public void crearAuto(Automovil auto) {
        
        autoJpa.create(auto);
        
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
       return autoJpa.findAutomovil(id);
    }

    public void modificarAuto(Automovil auto) {
        
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  

   

  

   

   
    
    
    
}
