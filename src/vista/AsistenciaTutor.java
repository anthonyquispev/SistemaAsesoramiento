package vista;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class AsistenciaTutor extends javax.swing.JInternalFrame {

    public AsistenciaTutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSesiones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTutores = new javax.swing.JTable();
        txtBusquedaTutor = new javax.swing.JTextField();
        btnCargarTablaTutores = new javax.swing.JButton();
        lblidSesion = new javax.swing.JLabel();
        lblidTutor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(975, 680));

        jPanel1.setBackground(new java.awt.Color(92, 146, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 160, 60));

        tblSesiones.setBackground(new java.awt.Color(204, 255, 204));
        tblSesiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idSesion", "Hora", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSesionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSesiones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 530, 130));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 530, 120));

        txtBusquedaTutor.setBackground(new java.awt.Color(204, 255, 204));
        txtBusquedaTutor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBusquedaTutor.setForeground(new java.awt.Color(0, 0, 0));
        txtBusquedaTutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusquedaTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaTutorActionPerformed(evt);
            }
        });
        jPanel1.add(txtBusquedaTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 40));

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
        jPanel1.add(btnCargarTablaTutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 90, 40));

        lblidSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblidSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblidSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblidSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 110, 40));

        lblidTutor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblidTutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblidTutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblidTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 110, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("idSesion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 80, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SESIONES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 40));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 650, 90));

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRAR ASISTENCIA TUTOR");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("idTutor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 80, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TUTORES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (this.lblidSesion.getText().equals("") || this.lblidTutor.getText().equals("")) {
            return;
        }
        String idTutor = this.lblidTutor.getText();
        int idSesion = Integer.parseInt(this.lblidSesion.getText());

        PreparedStatement ps = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("INSERT INTO AsistenciaTutor (TutorID, SesionID) VALUES (?, ?)");
            ps.setString(1, idTutor);
            ps.setInt(2, idSesion);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            limpiarCajas();
            this.btnCargarTablaTutoresActionPerformed(evt);

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

    private void tblTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoresMouseClicked
        int sel = tblTutores.rowAtPoint(evt.getPoint());
        String idTutor = String.valueOf(this.tblTutores.getValueAt(sel, 0));
        lblidTutor.setText(idTutor);
        lblidSesion.setText("");
        cargarTablaSesiones();
    }//GEN-LAST:event_tblTutoresMouseClicked

    private void cargarTablaSesiones() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        this.tblSesiones.setModel(modeloTabla);
        if (lblidTutor.getText().equals("")) {
            return;
        }
        String idTutor = this.lblidTutor.getText();
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            String simpleProc = "{ call SesionesDisponiblesTutor(?) }";
            CallableStatement cs = conexion.prepareCall(simpleProc);
            cs.setString(1, idTutor);
            boolean hadResults = cs.execute();
            modeloTabla.addColumn("ID Sesión");
            modeloTabla.addColumn("Fecha");
            modeloTabla.addColumn("Curso");
            while (hadResults) {
                ResultSet resultSet = cs.getResultSet();
                while (resultSet.next()) {
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int nColumnas = metaData.getColumnCount();
                    
                    Object fila[] = new Object[nColumnas];
                    for (int i = 0; i < nColumnas; i++) {
                        fila[i] = resultSet.getObject(i + 1);
                    }
                    modeloTabla.addRow(fila);
                }
                hadResults = cs.getMoreResults();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private void tblSesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSesionesMouseClicked
        int sel = this.tblSesiones.rowAtPoint(evt.getPoint());
        String idSesion = String.valueOf(this.tblSesiones.getValueAt(sel, 0));
        this.lblidSesion.setText(idSesion);
    }//GEN-LAST:event_tblSesionesMouseClicked

    private void txtBusquedaTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaTutorActionPerformed
    public void limpiarCajas() {
        lblidTutor.setText("");
        lblidSesion.setText("");
        DefaultTableModel mo = new DefaultTableModel();
        tblSesiones.setModel(mo);
        mo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTablaTutores;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblidSesion;
    private javax.swing.JLabel lblidTutor;
    private javax.swing.JTable tblSesiones;
    private javax.swing.JTable tblTutores;
    public javax.swing.JTextField txtBusquedaTutor;
    // End of variables declaration//GEN-END:variables

}
