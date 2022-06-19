package vista;

import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Tutor;
import modelo.ConsultasTutor;
import modelo.Escuela;
import modelo.Facultad;

public class RegistrarTutor extends javax.swing.JInternalFrame {

    private Tutor tutor;
    private ConsultasTutor modelo;
    private Escuela escuela;

    public RegistrarTutor() {
        initComponents();
        this.tutor = new Tutor();
        this.modelo = new ConsultasTutor();
        this.escuela = new Escuela();
        Facultad facultad = new Facultad();
        DefaultComboBoxModel modeloComboFacultad = new DefaultComboBoxModel(facultad.mostrarFacultades());
        this.cboFacultades.setModel(modeloComboFacultad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdTutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        cboEscuelas = new javax.swing.JComboBox<>();
        cboFacultades = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtCorreoInstitucional = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateChooserFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(975, 680));

        jPanel1.setBackground(new java.awt.Color(92, 146, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 70, 40));

        txtIdTutor.setBackground(new java.awt.Color(204, 255, 204));
        txtIdTutor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtIdTutor.setForeground(new java.awt.Color(0, 0, 0));
        txtIdTutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtIdTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombres:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 70, 40));

        txtNombres.setBackground(new java.awt.Color(204, 255, 204));
        txtNombres.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 40));

        btnInsertar.setBackground(new java.awt.Color(153, 0, 0));
        btnInsertar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("REGISTRAR");
        btnInsertar.setBorder(null);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 240, 70));

        cboEscuelas.setBackground(new java.awt.Color(204, 255, 204));
        cboEscuelas.setForeground(new java.awt.Color(0, 0, 0));
        cboEscuelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEscuelasItemStateChanged(evt);
            }
        });
        cboEscuelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEscuelasActionPerformed(evt);
            }
        });
        jPanel1.add(cboEscuelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 270, 40));

        cboFacultades.setBackground(new java.awt.Color(204, 255, 204));
        cboFacultades.setForeground(new java.awt.Color(0, 0, 0));
        cboFacultades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFacultadesItemStateChanged(evt);
            }
        });
        jPanel1.add(cboFacultades, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 270, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("DNI:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 50, 40));

        txtDni.setBackground(new java.awt.Color(204, 255, 204));
        txtDni.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 210, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Apellidos:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 70, 40));

        txtApellidos.setBackground(new java.awt.Color(204, 255, 204));
        txtApellidos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 40));

        txtCorreoInstitucional.setBackground(new java.awt.Color(204, 255, 204));
        txtCorreoInstitucional.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtCorreoInstitucional.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCorreoInstitucional, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 210, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Correo institucional:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 150, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Celular:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 70, 40));

        txtCelular.setBackground(new java.awt.Color(204, 255, 204));
        txtCelular.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 210, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Escuela:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 80, 40));

        jDateChooserFechaNacimiento.setBackground(new java.awt.Color(204, 255, 204));
        jDateChooserFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooserFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(jDateChooserFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 260, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 150, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Facultad:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 70, 40));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 420, 90));

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRAR TUTOR");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboFacultadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFacultadesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Facultad facultad = (Facultad) this.cboFacultades.getSelectedItem();
            Escuela escuela = new Escuela();
            DefaultComboBoxModel modeloComboEscuelas = new DefaultComboBoxModel(escuela.mostrarEscuelas(facultad.getIdFacultad()));
            this.cboEscuelas.setModel(modeloComboEscuelas);
        }
    }//GEN-LAST:event_cboFacultadesItemStateChanged

    private void cboEscuelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEscuelasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            escuela = (Escuela) this.cboEscuelas.getSelectedItem();
        }
    }//GEN-LAST:event_cboEscuelasItemStateChanged

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        tutor.setIdTutor(txtIdTutor.getText());
        tutor.setDni(txtDni.getText());
        tutor.setApellidos(txtApellidos.getText());
        tutor.setNombres(txtNombres.getText());
        tutor.setCorreoInstitucional(txtCorreoInstitucional.getText());
        tutor.setCelular(Integer.parseInt(txtCelular.getText()));
        tutor.setFecha_nacimiento(new java.sql.Date(jDateChooserFechaNacimiento.getDate().getTime()));

        if (modelo.insertar(tutor, escuela.getIdEscuela())) {
            JOptionPane.showMessageDialog(null, "Registro insertado con éxito");
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(null, "Error al insertar registro");
            limpiarCajas();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void cboEscuelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEscuelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEscuelasActionPerformed
    public void limpiarCajas() {
        txtIdTutor.setText(null);
        txtDni.setText(null);
        txtApellidos.setText(null);
        txtNombres.setText(null);
        txtCorreoInstitucional.setText(null);
        txtCelular.setText(null);
        jDateChooserFechaNacimiento.setDate(null);
        this.cboFacultades.setSelectedIndex(0);
    }

    private void cargarFotoBD() {
        PreparedStatement ps = null;
        Conexion con = new Conexion();
        String ruta = "C:\\Users\\Lorena\\Desktop\\Fotos ejemplo\\fotoPorDefecto.jpg";
        File archivo = new File(ruta);

        try {
            FileInputStream archivoEntrada = new FileInputStream(archivo);
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("INSERT INTO Empleado (DNI, img) VALUES (?, ?)");
            ps.setString(1, txtDni.getText());
            ps.setBinaryStream(2, archivoEntrada, archivo.length());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnInsertar;
    public javax.swing.JComboBox<String> cboEscuelas;
    public javax.swing.JComboBox<String> cboFacultades;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtCorreoInstitucional;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtIdTutor;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
