package vista;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class AsistenciaTutorado extends javax.swing.JInternalFrame {

    public AsistenciaTutorado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSesiones = new javax.swing.JTable();
        lblidSesion = new javax.swing.JLabel();
        lblidTutorado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTutorados = new javax.swing.JTable();
        btnCargarTablaTutorados = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtBusquedaTutorado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 160, 60));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 520, 130));

        lblidSesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblidSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 120, 40));

        lblidTutorado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblidTutorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 120, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("idSesion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 90, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("idTutorado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 90, 40));

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
        jScrollPane3.setViewportView(tblTutorados);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 520, 110));

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
        jPanel1.add(btnCargarTablaTutorados, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 90, 40));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 770, 90));

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRAR ASISTENCIA TUTORADO");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        txtBusquedaTutorado.setBackground(new java.awt.Color(204, 255, 204));
        txtBusquedaTutorado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBusquedaTutorado.setForeground(new java.awt.Color(0, 0, 0));
        txtBusquedaTutorado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtBusquedaTutorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 140, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TUTORADOS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 170, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SESIONES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (this.lblidSesion.getText().equals("") || this.lblidTutorado.getText().equals("")) {
            return;
        }
        String idTutorado = this.lblidTutorado.getText();
        int idSesion = Integer.parseInt(this.lblidSesion.getText());

        PreparedStatement ps = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("INSERT INTO AsistenciaTutorado (TutoradoID, SesionID) VALUES (?, ?)");
            ps.setString(1, idTutorado);
            ps.setInt(2, idSesion);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            limpiarCajas();
            this.btnCargarTablaTutoradosActionPerformed(evt);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void cargarTablaSesiones() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        this.tblSesiones.setModel(modeloTabla);
        if (lblidTutorado.getText().equals("")) {
            return;
        }
        String idTutorado = this.lblidTutorado.getText();
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            String simpleProc = "{ call SesionesDisponiblesTutorado(?) }";
            CallableStatement cs = conexion.prepareCall(simpleProc);
            cs.setString(1, idTutorado);            
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
            
//            ps = conexion.prepareStatement("EXECUTE SesionesDisponiblesTutorado " + idTutorado);
//            rs = ps.executeQuery();
//            modeloTabla.addColumn("ID Sesión");
//            modeloTabla.addColumn("Fecha");
//            modeloTabla.addColumn("Curso");
//
//            ResultSetMetaData rsMD = rs.getMetaData();
//            int nColumnas = rsMD.getColumnCount();
//
//            while (rs.next()) {
//                Object fila[] = new Object[nColumnas];
//                for (int i = 0; i < nColumnas; i++) {
//                    fila[i] = rs.getObject(i + 1);
//                }
//                modeloTabla.addRow(fila);
//            }           
        } catch(Exception e ) {
            System.out.println("Error: " + e);
        }
    }

    private void tblSesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSesionesMouseClicked
        int sel = this.tblSesiones.rowAtPoint(evt.getPoint());
        String idSesion = String.valueOf(this.tblSesiones.getValueAt(sel, 0));
        this.lblidSesion.setText(idSesion);
    }//GEN-LAST:event_tblSesionesMouseClicked

    private void tblTutoradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoradosMouseClicked
        int sel = this.tblTutorados.rowAtPoint(evt.getPoint());
        String idTutorado = String.valueOf(this.tblTutorados.getValueAt(sel, 0));
        this.lblidTutorado.setText(idTutorado);
        lblidSesion.setText("");
        cargarTablaSesiones();
    }//GEN-LAST:event_tblTutoradosMouseClicked

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
    
    public void limpiarCajas() {
        lblidTutorado.setText("");
        lblidSesion.setText("");
        DefaultTableModel mo = new DefaultTableModel();
        tblSesiones.setModel(mo);
        mo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTablaTutorados;
    public javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblidSesion;
    private javax.swing.JLabel lblidTutorado;
    private javax.swing.JTable tblSesiones;
    private javax.swing.JTable tblTutorados;
    public javax.swing.JTextField txtBusquedaTutorado;
    // End of variables declaration//GEN-END:variables

}
