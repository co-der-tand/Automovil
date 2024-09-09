package com.mycompany.automivil.igu;

import com.mycompany.automivil.logica.Automovil;
import com.mycompany.automivil.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consultas extends javax.swing.JFrame implements lanzarMensaje{

    Controladora control = null;

    public Consultas() {

        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAutomoviles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\Ford logo (1).jpg")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTA DE AUTOMOVILES");

        jbEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\icons8-trash-can-48.png")); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\icons8-edit-property-48.png")); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTAutomoviles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTAutomoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTAutomoviles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbEliminar)
                        .addComponent(jbModificar)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        // Validamos que la tabla no este vacía
        if(jTAutomoviles.getRowCount() > 0){
            
            //validamos que se halla seleccionado una fila
            if(jTAutomoviles.getSelectedRow() != -1){
                
               //obtenemos el id de la fila seleccionada de dos maneras
               // int id = (int) jTAutomoviles.getValueAt(jTAutomoviles.getSelectedRow(), 0);
                int id = Integer.parseInt( String.valueOf(jTAutomoviles.getValueAt(jTAutomoviles.getSelectedRow(), 0)));
                 
                control.borrarAuto(id);
                
                mostrarMensaje("Eliminado con éxito", "Info", "Eliminar automovil");
            }else{
                
                mostrarMensaje("Deve seleccionár un elemento de la tabla", "Error", "Error");
            }
            
            
            
        }else{
            mostrarMensaje("No hay elementos para eliminar", "Error", "Error");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed


    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        
                // Validamos que la tabla no este vacía
        if(jTAutomoviles.getRowCount() > 0){
            
            //validamos que se halla seleccionado una fila
            if(jTAutomoviles.getSelectedRow() != -1){
                
               //obtenemos el id de la fila seleccionada de dos maneras
               // int id = (int) jTAutomoviles.getValueAt(jTAutomoviles.getSelectedRow(), 0);
                int id = Integer.parseInt( String.valueOf(jTAutomoviles.getValueAt(jTAutomoviles.getSelectedRow(), 0)));
                 
                  ModificarAutomovil modificar = new ModificarAutomovil(id);
                  modificar.setVisible(true);
                  modificar.setLocationRelativeTo(null);
                  
                  this.dispose();
                  
    
            }else{
                
                mostrarMensaje("Deve seleccionár un elemento de la tabla", "Error", "Error");
            }
     
        }else{
            mostrarMensaje("No hay elementos para modificar", "Error", "Error");
        }
        
     
        
        
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAutomoviles;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
       
        DefaultTableModel modeloTabla = new DefaultTableModel(){
           
            // hacemos que la tabla no sea editable
            @Override
            public boolean isCellEditable(int row, int column){
                
                return false;
            }
        }; 
  

        String titulos[] = {"Id", "Modelo", "Marca", "Motor", "Color", "Patente", "Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        
        List<Automovil> listaAutomoviles = control.traerAutos();
        
        
       if(listaAutomoviles != null){
           
           for(Automovil auto: listaAutomoviles){
              
               Object objeto[] = {
                   
                   auto.getId(), auto.getModelo(), auto.getMarca(), auto.getMotor(),
                   auto.getColor(), auto.getPatente(), auto.getCantPuertas()
               };
               
               modeloTabla.addRow(objeto);
               
           }
       }
        
        
        jTAutomoviles.setModel(modeloTabla);
    }

    @Override
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        }else if(tipo.equals("Error")){
             optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
