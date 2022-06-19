package vista;

import javax.swing.JOptionPane;
import modelo.*;

public class RegistrarTutorado extends javax.swing.JInternalFrame {

    private Tutorado tutorado;
    private ConsultasTutorado modelo;

    public RegistrarTutorado() {
        initComponents();
        this.tutorado = new Tutorado();
        this.modelo = new ConsultasTutorado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(975, 680));

        jPanel1.setBackground(new java.awt.Color(92, 146, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombres:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 70, 40));

        txtNombres.setBackground(new java.awt.Color(204, 255, 204));
        txtNombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 250, 40));

        btnInsertar.setBackground(new java.awt.Color(153, 0, 0));
        btnInsertar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("REGISTRAR");
        btnInsertar.setBorder(null);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 230, 70));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellidos:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 70, 40));

        txtApellidos.setBackground(new java.awt.Color(204, 255, 204));
        txtApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 250, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Celular:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 70, 40));

        txtCelular.setBackground(new java.awt.Color(204, 255, 204));
        txtCelular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 250, 40));

        txtCorreo.setBackground(new java.awt.Color(204, 255, 204));
        txtCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 250, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Correo:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 70, 40));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 530, 90));

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRAR TUTORADO");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        tutorado.setApellidos(txtApellidos.getText());
        tutorado.setNombres(txtNombres.getText());
        tutorado.setCelular(Integer.parseInt(txtCelular.getText()));
        boolean bCorreo = false;
        if (!txtCorreo.getText().equals("")) {
            tutorado.setCorreo(txtCorreo.getText());
            bCorreo = true;
        }

        if (modelo.insertar(tutorado, bCorreo)) {
            JOptionPane.showMessageDialog(null, "Registro insertado con éxito");
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar registro");
            limpiarCajas();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed
    public void limpiarCajas() {
        txtApellidos.setText(null);
        txtNombres.setText(null);
        txtCelular.setText(null);
        txtCorreo.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
