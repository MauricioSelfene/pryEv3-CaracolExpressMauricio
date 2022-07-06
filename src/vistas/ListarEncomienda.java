package vistas;

import accesodatos.DAO;
import static accesodatos.DAO.buscarPorIds;
import static accesodatos.DAO.mostrarTodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Encomienda;
import static vistas.AgregarEncomienda.registro;

/**
 *
 * @author mselfene
 */
public class ListarEncomienda extends javax.swing.JFrame {

    private static ListarEncomienda instancia;

    public static ListarEncomienda getInstancia() {

        if (instancia == null) {
            instancia = new ListarEncomienda();
        }

        return instancia;

    }

    public ListarEncomienda() {
        initComponents();

        mostrarTodos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_listado_encomiendas = new javax.swing.JLabel();
        lbl_id_encomiendas = new javax.swing.JLabel();
        btn_generar_listado = new javax.swing.JButton();
        txt_id_encomiendas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mostrar = new javax.swing.JTable();
        btn_mostrar_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_listado_encomiendas.setText("Listado de Encomiendas");

        lbl_id_encomiendas.setText("id :");

        btn_generar_listado.setText("Mostrar Todo");
        btn_generar_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_listadoActionPerformed(evt);
            }
        });

        txt_id_encomiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_encomiendasActionPerformed(evt);
            }
        });

        tbl_mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_mostrar);

        btn_mostrar_todo.setText("Buscar ID");
        btn_mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_todoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(lbl_listado_encomiendas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lbl_id_encomiendas)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id_encomiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(btn_mostrar_todo)
                                .addGap(70, 70, 70)
                                .addComponent(btn_generar_listado)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl_listado_encomiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_id_encomiendas)
                        .addComponent(txt_id_encomiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_mostrar_todo)
                        .addComponent(btn_generar_listado)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_encomiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_encomiendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_encomiendasActionPerformed

    private void btn_generar_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_listadoActionPerformed
        // TODO add your handling code here:

        mostrarTodos();


    }//GEN-LAST:event_btn_generar_listadoActionPerformed

    private void btn_mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_todoActionPerformed
        // TODO add your handling code here:
        //

        Encomienda buscarDato = DAO.buscarPorIds(Integer.parseInt(txt_id_encomiendas.getText()));

        String matriz[][] = new String[1][7];

        matriz[0][0] = buscarDato.getEn_id() + "";
        matriz[0][1] = buscarDato.getEn_destinatario();
        matriz[0][2] = buscarDato.getEn_direccion();
        matriz[0][3] = buscarDato.getEn_tipo() + "";
        boolean ckeck = true;
        if (buscarDato.isEn_entregadomicilio() == true) {
            matriz[0][4] = "Si";
        } else {
            matriz[0][4] = "No";
        }
        matriz[0][5] = buscarDato.getEn_tamano() + "";
        matriz[0][6] = buscarDato.getEn_remitente();

        tbl_mostrar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "DESTINATARIO", "DIRECCION", "TIPO ENCOMIENDA", "ENTREGA DOMICILIO", "TAMAÑO ENCOMIENDA", "REMITENTE"
                }
        )
        );
    }//GEN-LAST:event_btn_mostrar_todoActionPerformed

    private void mostrarTodos() {

        String matriz[][] = new String[DAO.mostrarTodos().size()][7];

        for (int i = 0; i < DAO.mostrarTodos().size(); i++) {

            matriz[i][0] = DAO.mostrarTodos().get(i).getEn_id() + "";
            matriz[i][1] = DAO.mostrarTodos().get(i).getEn_destinatario();
            matriz[i][2] = DAO.mostrarTodos().get(i).getEn_direccion();
            matriz[i][3] = DAO.mostrarTodos().get(i).getEn_tipo() + "";
            //matriz[i][4] = RegistroEncomiendaBD.mostrarTodos().get(i).isEn_entregadomicilio() + "";
            
            
            
            boolean ckeck = true;
            
            
            
            if (DAO.mostrarTodos().get(i).isEn_entregadomicilio() == true) {
                matriz[i][4] = "Si";
            } else {
                matriz[i][4] = "No";
            }
            
            
            matriz[i][5] = DAO.mostrarTodos().get(i).getEn_tamano() + "";
            matriz[i][6] = DAO.mostrarTodos().get(i).getEn_remitente();

        }

        tbl_mostrar.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "DESTINATARIO", "DIRECCION", "TIPO ENCOMIENDA", "ENTREGA DOMICILIO", "TAMAÑO ENCOMIENDA", "REMITENTE"
                }
        )
        );

    }

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
            java.util.logging.Logger.getLogger(ListarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEncomienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar_listado;
    private javax.swing.JButton btn_mostrar_todo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id_encomiendas;
    private javax.swing.JLabel lbl_listado_encomiendas;
    private javax.swing.JTable tbl_mostrar;
    private javax.swing.JTextField txt_id_encomiendas;
    // End of variables declaration//GEN-END:variables
}
