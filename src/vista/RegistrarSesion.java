package vista;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class RegistrarSesion extends javax.swing.JInternalFrame {

    public RegistrarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTutorados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTutores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JCfechaAcordada = new com.toedter.calendar.JDateChooser();
        btnCargarTablaTutores = new javax.swing.JButton();
        btnCargarTablaTutorados = new javax.swing.JButton();
        lblidTutor = new javax.swing.JLabel();
        lblidTutorado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtBusquedaTutor = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtBusquedaTutorado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(975, 680));

        jPanel1.setBackground(new java.awt.Color(92, 146, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Curso:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 70, 40));

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
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 170, 60));

        tblTutorados.setBackground(new java.awt.Color(204, 255, 204));
        tblTutorados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idTutorado", "Nombres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTutorados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTutoradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTutorados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 520, 130));

        tblTutores.setBackground(new java.awt.Color(204, 255, 204));
        tblTutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombres", "Facultad", "Escuela"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTutoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTutores);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 520, 120));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha acordada");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 120, 30));

        JCfechaAcordada.setDateFormatString("dd/MM/yyyy HH:mm:ss");
        jPanel1.add(JCfechaAcordada, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 160, 40));

        btnCargarTablaTutores.setBackground(new java.awt.Color(153, 153, 0));
        btnCargarTablaTutores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCargarTablaTutores.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarTablaTutores.setText("BUSCAR");
        btnCargarTablaTutores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarTablaTutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaTutoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarTablaTutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 173, 80, 40));

        btnCargarTablaTutorados.setBackground(new java.awt.Color(153, 153, 0));
        btnCargarTablaTutorados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCargarTablaTutorados.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarTablaTutorados.setText("BUSCAR");
        btnCargarTablaTutorados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarTablaTutorados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaTutoradosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarTablaTutorados, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 90, 40));

        lblidTutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblidTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 110, 40));

        lblidTutorado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblidTutorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 110, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("idTutor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 90, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("idTutorado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 90, 40));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 430, 90));

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRAR SESIÓN");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        txtBusquedaTutor.setBackground(new java.awt.Color(204, 255, 204));
        txtBusquedaTutor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBusquedaTutor.setForeground(new java.awt.Color(0, 0, 0));
        txtBusquedaTutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusquedaTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaTutorActionPerformed(evt);
            }
        });
        jPanel1.add(txtBusquedaTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 140, 40));

        txtCurso.setBackground(new java.awt.Color(204, 255, 204));
        txtCurso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCurso.setForeground(new java.awt.Color(0, 0, 0));
        txtCurso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 140, 40));

        txtBusquedaTutorado.setBackground(new java.awt.Color(204, 255, 204));
        txtBusquedaTutorado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBusquedaTutorado.setForeground(new java.awt.Color(0, 0, 0));
        txtBusquedaTutorado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusquedaTutorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaTutoradoActionPerformed(evt);
            }
        });
        jPanel1.add(txtBusquedaTutorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 140, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TUTORES");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TUTORADOS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 170, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (this.lblidTutor.getText().equals("") || this.lblidTutorado.getText().equals("") || this.txtCurso.getText().equals("")) {
            return;
        }
        String idTutor = this.lblidTutor.getText();
        int idTutorado = Integer.parseInt(this.lblidTutorado.getText());
        java.sql.Date fechaAcordada = new java.sql.Date(JCfechaAcordada.getDate().getTime());

        PreparedStatement ps = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("INSERT INTO Sesion (TutorID, TutoradoID, FechaAcordada, Curso) VALUES (?, ?, ?, ?)");
            ps.setString(1, idTutor);
            ps.setInt(2, idTutorado);
            ps.setDate(3, fechaAcordada);
            ps.setString(4, this.txtCurso.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            limpiarCajas();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnCargarTablaTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaTutoresActionPerformed
        DefaultTableModel modeloTabla = new DefaultTableModel();
        this.tblTutores.setModel(modeloTabla);
        String busqueda = this.txtBusquedaTutor.getText();
        String where = "";

        if (!"".equals(busqueda)) {
            where = "WHERE T.TutorID LIKE '%" + busqueda + "%' OR T.Nombres LIKE '%" + busqueda + "%' OR T.Apellidos LIKE '%" + busqueda + "%'";
        }
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("SELECT T.TutorID, CONCAT(T.Nombres, ' ', T.Apellidos), F.Nombre, E.NombreEAP\n"
                    + "FROM Tutor T \n"
                    + "INNER JOIN Escuela E ON (T.EscuelaID = E.EscuelaID)\n"
                    + "INNER JOIN Facultad F ON (E.FacultadID = F.FacultadID) " + where);
            rs = ps.executeQuery();

            modeloTabla.addColumn("Código");
            modeloTabla.addColumn("Nombres");
            modeloTabla.addColumn("Facultad");
            modeloTabla.addColumn("NombreEAP");

            ResultSetMetaData rsMD = rs.getMetaData();
            int nColumnas = rsMD.getColumnCount();

            while (rs.next()) {
                Object fila[] = new Object[nColumnas];
                for (int i = 0; i < nColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
            limpiarCajas();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

    }//GEN-LAST:event_btnCargarTablaTutoresActionPerformed

    private void btnCargarTablaTutoradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaTutoradosActionPerformed
        DefaultTableModel modeloTabla = new DefaultTableModel();
        this.tblTutorados.setModel(modeloTabla);
        String busqueda = this.txtBusquedaTutorado.getText();
        String where = "";

        if (!"".equals(busqueda)) {
            where = "WHERE TutoradoID LIKE '%" + busqueda + "%' OR Nombres LIKE '%" + busqueda + "%' OR Apellidos LIKE '%" + busqueda + "%'";
        }
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("SELECT TutoradoID, CONCAT(Nombres, ' ', Apellidos)\n"
                    + "FROM Tutorado " + where);
            rs = ps.executeQuery();

            modeloTabla.addColumn("idTutorado");
            modeloTabla.addColumn("Nombres");

            ResultSetMetaData rsMD = rs.getMetaData();
            int nColumnas = rsMD.getColumnCount();

            while (rs.next()) {
                Object fila[] = new Object[nColumnas];
                for (int i = 0; i < nColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
            limpiarCajas();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }//GEN-LAST:event_btnCargarTablaTutoradosActionPerformed

    private void tblTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoresMouseClicked
        int sel = this.tblTutores.rowAtPoint(evt.getPoint());
        String idTutor = String.valueOf(this.tblTutores.getValueAt(sel, 0));
        this.lblidTutor.setText(idTutor);
    }//GEN-LAST:event_tblTutoresMouseClicked

    private void tblTutoradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoradosMouseClicked
        int sel = this.tblTutorados.rowAtPoint(evt.getPoint());
        String idTutorado = String.valueOf(this.tblTutorados.getValueAt(sel, 0));
        this.lblidTutorado.setText(idTutorado);
    }//GEN-LAST:event_tblTutoradosMouseClicked

    private void txtBusquedaTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaTutorActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void txtBusquedaTutoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaTutoradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaTutoradoActionPerformed
    public void limpiarCajas() {
        txtCurso.setText("");
        lblidTutor.setText("");
        lblidTutorado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JCfechaAcordada;
    private javax.swing.JButton btnCargarTablaTutorados;
    private javax.swing.JButton btnCargarTablaTutores;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblidTutor;
    private javax.swing.JLabel lblidTutorado;
    private javax.swing.JTable tblTutorados;
    private javax.swing.JTable tblTutores;
    public javax.swing.JTextField txtBusquedaTutor;
    public javax.swing.JTextField txtBusquedaTutorado;
    public javax.swing.JTextField txtCurso;
    // End of variables declaration//GEN-END:variables
}
