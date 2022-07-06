package vistas;

import accesodatos.DAO;
import javax.swing.JOptionPane;
import negocio.Encomienda;

/**
 *
 * @author mselfene
 */
public class AgregarEncomienda extends javax.swing.JFrame {
    
    static DAO registro = new DAO();
    
    private static AgregarEncomienda instancia;
    

    static AgregarEncomienda getInstancia() {
    
        if (instancia == null) {
            instancia = new AgregarEncomienda();
        }
        
        return instancia;

    }

    /**
     * Creates new form AgregarEncomienda
     */
    public AgregarEncomienda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_direccion = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        lbl_tipo_encomienda = new javax.swing.JLabel();
        rdo_sobre = new javax.swing.JRadioButton();
        rdo_paquete = new javax.swing.JRadioButton();
        lbl_registro_encomienda = new javax.swing.JLabel();
        chk_entrega_domicilio = new javax.swing.JCheckBox();
        lbl_id = new javax.swing.JLabel();
        lbl_tamano = new javax.swing.JLabel();
        btn_buscar_id = new javax.swing.JButton();
        lbl_remitente = new javax.swing.JLabel();
        lbl_destinatario = new javax.swing.JLabel();
        txt_remitente = new javax.swing.JTextField();
        txt_destinatario = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        lbl_direccion = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        cmb_seleccion_tamano = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        lbl_tipo_encomienda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_tipo_encomienda.setText("Tipo de Encomienda");

        buttonGroup1.add(rdo_sobre);
        rdo_sobre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdo_sobre.setSelected(true);
        rdo_sobre.setText("Sobre");

        buttonGroup1.add(rdo_paquete);
        rdo_paquete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdo_paquete.setText("Paquete");

        lbl_registro_encomienda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_registro_encomienda.setText("REGISTRO DE ENCOMIENDA");

        chk_entrega_domicilio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chk_entrega_domicilio.setText("Entrega a Domicilio");

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_id.setText("ID");

        lbl_tamano.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_tamano.setText("Tamaño");

        btn_buscar_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_buscar_id.setText("Buscar id");
        btn_buscar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_idActionPerformed(evt);
            }
        });

        lbl_remitente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_remitente.setText("Remitente");

        lbl_destinatario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_destinatario.setText("Destinatario");

        btn_agregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_direccion.setText("Direccion");

        btn_modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        cmb_seleccion_tamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Pequeña", "Mediana", "Grande" }));
        cmb_seleccion_tamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_seleccion_tamanoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tipo_encomienda)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdo_paquete)
                                    .addComponent(rdo_sobre)
                                    .addComponent(chk_entrega_domicilio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_remitente)
                                    .addComponent(lbl_tamano))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_seleccion_tamano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_destinatario)
                                    .addComponent(lbl_direccion))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btn_agregar)
                                    .addGap(61, 61, 61)
                                    .addComponent(btn_modificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_limpiar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbl_id)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_buscar_id)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbl_registro_encomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registro_encomienda)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_id)
                        .addComponent(btn_buscar_id))
                    .addComponent(txt_id))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_destinatario)
                    .addComponent(txt_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo_encomienda)
                    .addComponent(rdo_sobre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdo_paquete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_entrega_domicilio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tamano)
                    .addComponent(cmb_seleccion_tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_remitente)
                    .addComponent(txt_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_limpiar))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        txt_id.setText("");
        txt_destinatario.setText("");
        txt_direccion.setText("");

        buttonGroup1.clearSelection();
        chk_entrega_domicilio.setSelected(false);

        cmb_seleccion_tamano.setSelectedIndex(0);
        txt_remitente.setText("");

        btn_modificar.setEnabled(true);
        btn_agregar.setEnabled(true);


    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_buscar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_idActionPerformed
    
        Encomienda id = DAO.buscarPorIds(Integer.parseInt(txt_id.getText()));
        
        
        
        if(id == null) {
            JOptionPane.showMessageDialog(null, "id no encontrada");
        } else {
            this.txt_destinatario.setText(id.getEn_destinatario());
            this.txt_direccion.setText(id.getEn_direccion());
            this.txt_remitente.setText(id.getEn_remitente());
            
            btn_agregar.setEnabled(false);
            btn_limpiar.setEnabled(false);
            
            if (id.getEn_tipo()== "Sobre") {
                rdo_sobre.setSelected(true);
            }else{
                rdo_paquete.setSelected(true);
            }
        }
        
        boolean entrega = true;
            if (id.isEn_entregadomicilio()== entrega ) {
                chk_entrega_domicilio.setSelected(true);
            }else{
                chk_entrega_domicilio.setSelected(false);
            }
            
            
            if (id.getEn_tamano().equals("Pequeño")) {
                cmb_seleccion_tamano.setSelectedIndex(1);
            }else if (id.getEn_tamano().equals("Mediana")){
                cmb_seleccion_tamano.setSelectedIndex(2);
            }else if (id.getEn_tamano().equals("Grande")) {
                cmb_seleccion_tamano.setSelectedIndex(3);
            }

    }//GEN-LAST:event_btn_buscar_idActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        
        try {

            if(txt_id.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el id");
                return;
            }
            if(txt_destinatario.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el destinatario");
                return;
            }
            if(txt_direccion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la dirección");
                return;
            }
            if(cmb_seleccion_tamano.getSelectedItem() == "Seleccione") {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el tamaño.");
                return;
            }
            if(txt_remitente.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un remitente.");
                return;
            }


            Encomienda e = new Encomienda(); 

            e.setEn_id(Integer.parseInt((txt_id.getText())));
            e.setEn_destinatario(txt_destinatario.getText());
            e.setEn_direccion(txt_direccion.getText());
            e.setEn_tipo(rdo_sobre.getText());
            e.setEn_tipo(rdo_paquete.getText());

            e.setEn_entregadomicilio(chk_entrega_domicilio.isSelected());

            e.setEn_tamano((String) cmb_seleccion_tamano.getSelectedItem()); 
            e.setEn_remitente(txt_remitente.getText());

            if(registro.Create(e)){
                JOptionPane.showMessageDialog(this, "Registro grabado");
            } else {
                JOptionPane.showMessageDialog(this, "No se grabo");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void cmb_seleccion_tamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_seleccion_tamanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_seleccion_tamanoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        
        //EncomiendaBD id = RegistroEncomiendaBD.Modificar(Integer.parseInt(txt_id.getText()));
        Encomienda e = new Encomienda(); 
        
        e.setEn_id(Integer.parseInt((txt_id.getText())));
        e.setEn_destinatario(txt_destinatario.getText());
        e.setEn_direccion(txt_direccion.getText());
        e.setEn_tipo(rdo_sobre.getText());
        e.setEn_tipo(rdo_paquete.getText());

        e.setEn_entregadomicilio(chk_entrega_domicilio.isSelected());

        e.setEn_tamano((String) cmb_seleccion_tamano.getSelectedItem()); 
        e.setEn_remitente(txt_remitente.getText());

        if(DAO.Modificar(e)){
            JOptionPane.showMessageDialog(this, "Registro grabado");
        } else {
            JOptionPane.showMessageDialog(this, "No se grabo");
        }
        
        
    }//GEN-LAST:event_btn_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEncomienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar_id;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_entrega_domicilio;
    private javax.swing.JComboBox<String> cmb_seleccion_tamano;
    private javax.swing.JLabel lbl_destinatario;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_registro_encomienda;
    private javax.swing.JLabel lbl_remitente;
    private javax.swing.JLabel lbl_tamano;
    private javax.swing.JLabel lbl_tipo_encomienda;
    private javax.swing.JRadioButton rdo_paquete;
    private javax.swing.JRadioButton rdo_sobre;
    private javax.swing.JTextField txt_destinatario;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_remitente;
    // End of variables declaration//GEN-END:variables
}