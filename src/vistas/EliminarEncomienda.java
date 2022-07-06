package vistas;

import accesodatos.DAO;

import javax.swing.JOptionPane;
import negocio.Encomienda;
import static vistas.AgregarEncomienda.registro;

/**
 *
 * @author mselfene
 */
public class EliminarEncomienda extends javax.swing.JFrame {
    
    private static EliminarEncomienda instancia;
    
    public static EliminarEncomienda getInstancia(){
        
        if (instancia == null) {
            instancia = new EliminarEncomienda();
        }
        
        return instancia;
        
    }

    public EliminarEncomienda() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_elimina_encomienda = new javax.swing.JLabel();
        lbl_id_elimina = new javax.swing.JLabel();
        txt_id_elimina = new javax.swing.JTextField();
        btn_elimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_elimina_encomienda.setText("Eliminacion de Encomienda");

        lbl_id_elimina.setText("id :");

        txt_id_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_eliminaActionPerformed(evt);
            }
        });

        btn_elimina.setText("Eliminar");
        btn_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbl_id_elimina)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_elimina_encomienda)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_id_elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btn_elimina)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_elimina_encomienda)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id_elimina)
                    .addComponent(txt_id_elimina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_elimina))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed

        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar?");
        
        if(txt_id_elimina.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID");
            return;  // quiebra y retorna al formulario
        }

        if (respuesta == JOptionPane.YES_OPTION) {
        
            if (true) {
                registro.eliminarUsuario(Integer.parseInt(this.txt_id_elimina.getText()));
                JOptionPane.showMessageDialog(null, "ID numero " + Integer.parseInt(txt_id_elimina.getText()) + " fue removido con exito"); //aqui
                txt_id_elimina.setText("");
            } 
            else {
                JOptionPane.showMessageDialog(null, "ID numero " + Integer.parseInt(txt_id_elimina.getText()) + " no pertenece a la base de datos."); //aqui
              
            }

        }
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void txt_id_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_eliminaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_eliminaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEncomienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_elimina;
    private javax.swing.JLabel lbl_elimina_encomienda;
    private javax.swing.JLabel lbl_id_elimina;
    private javax.swing.JTextField txt_id_elimina;
    // End of variables declaration//GEN-END:variables




}
