package vista;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class EditarTutor extends javax.swing.JInternalFrame {

    public EditarTutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTutores = new javax.swing.JTable();
        txtBusquedaTutor = new javax.swing.JTextField();
        btnCargarTablaAlumnos = new javax.swing.JButton();
        lblidTutor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        pnlImagen = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(975, 680));

        jPanel1.setBackground(new java.awt.Color(92, 146, 224));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 680));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(153, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 0, 153));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 380, 90));

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDITAR TUTORES");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        tblTutores.setBackground(new java.awt.Color(204, 255, 204));
        tblTutores.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        tblTutores.setForeground(new java.awt.Color(0, 51, 51));
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 540, 250));

        txtBusquedaTutor.setBackground(new java.awt.Color(204, 255, 204));
        txtBusquedaTutor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtBusquedaTutor.setForeground(new java.awt.Color(0, 0, 0));
        txtBusquedaTutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtBusquedaTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 40));

        btnCargarTablaAlumnos.setBackground(new java.awt.Color(204, 255, 153));
        btnCargarTablaAlumnos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnCargarTablaAlumnos.setForeground(new java.awt.Color(0, 0, 0));
        btnCargarTablaAlumnos.setText("BUSCAR");
        btnCargarTablaAlumnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 2, true));
        btnCargarTablaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarTablaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 100, 50));

        lblidTutor.setBackground(new java.awt.Color(204, 255, 204));
        lblidTutor.setForeground(new java.awt.Color(0, 0, 0));
        lblidTutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblidTutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblidTutor.setOpaque(true);
        jPanel1.add(lblidTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 100, 30));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("idTutor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 90, 30));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DNI:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 90, 30));

        txtDni.setBackground(new java.awt.Color(204, 255, 204));
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 200, 30));

        txtApellidos.setBackground(new java.awt.Color(204, 255, 204));
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 200, 30));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellidos:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 90, 30));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombres:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 90, 30));

        txtNombres.setBackground(new java.awt.Color(204, 255, 204));
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 200, 30));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Correo:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 90, 30));

        txtCorreo.setBackground(new java.awt.Color(204, 255, 204));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 200, 30));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 130, 30));

        txtCelular.setBackground(new java.awt.Color(204, 255, 204));
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 200, 30));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Celular:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 90, 30));

        jDateChooserFechaNacimiento.setBackground(new java.awt.Color(51, 255, 102));
        jDateChooserFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jDateChooserFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 200, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("MODIFICAR");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 51)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 140, 50));

        pnlImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));

        javax.swing.GroupLayout pnlImagenLayout = new javax.swing.GroupLayout(pnlImagen);
        pnlImagen.setLayout(pnlImagenLayout);
        pnlImagenLayout.setHorizontalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlImagenLayout.setVerticalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(pnlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 160, 160));

        jButton1.setBackground(new java.awt.Color(3, 128, 128));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings2_18px.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 30, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 380, 550));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarTablaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaAlumnosActionPerformed
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

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

    }//GEN-LAST:event_btnCargarTablaAlumnosActionPerformed

    private void tblTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTutoresMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            int fila = this.tblTutores.getSelectedRow();
            String idTutor = this.tblTutores.getValueAt(fila, 0).toString();
            if (pnlImagen.getComponentCount() != 0) {
                pnlImagen.removeAll();
            }

            ps = conexion.prepareStatement("SELECT TutorID, Dni, Apellidos, Nombres, CorreoInstitucional, Celular, Fecha_nacimiento, Img "
                    + "FROM Tutor WHERE TutorID=?");
            ps.setString(1, idTutor);
            rs = ps.executeQuery();
            BufferedImage buffimg = null;
            while (rs.next()) {
                lblidTutor.setText(rs.getString("TutorID"));
                txtDni.setText(rs.getString("Dni"));
                txtApellidos.setText(rs.getString("Apellidos"));
                txtNombres.setText(rs.getString("Nombres"));
                txtCorreo.setText(rs.getString("CorreoInstitucional"));
                txtCelular.setText(String.valueOf(rs.getString("Celular")));
                jDateChooserFechaNacimiento.setDate(rs.getDate("Fecha_nacimiento"));

                InputStream img = rs.getBinaryStream("Img");
                buffimg = ImageIO.read(img);      
                int ancho = this.pnlImagen.getWidth();
                int alto = this.pnlImagen.getHeight();

                Imagen imagen = new Imagen(ancho, alto, buffimg);
                this.pnlImagen.add(imagen);
                this.pnlImagen.repaint();
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_tblTutoresMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement ps = null;
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("UPDATE Tutor SET Dni=?, Apellidos=?, Nombres=?, CorreoInstitucional=?, "
                    + "Celular=?, Fecha_nacimiento=? WHERE TutorID=?");
            ps.setString(1, txtDni.getText());
            ps.setString(2, txtApellidos.getText());
            ps.setString(3, txtNombres.getText());
            ps.setString(4, txtCorreo.getText());
            ps.setInt(5, Integer.parseInt(txtCelular.getText()));
            ps.setDate(6, new java.sql.Date(jDateChooserFechaNacimiento.getDate().getTime()));
            ps.setString(7, lblidTutor.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            limpiarCajas();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (lblidTutor.equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un empleado");
            return;
        }
        String idTutor = lblidTutor.getText();
        JFileChooser escoger = new JFileChooser();

        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.png", "png");
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("*.jpg", "jpg");
        escoger.setFileFilter(filtro);
        escoger.setFileFilter(filtro2);

        int seleccion = escoger.showOpenDialog(this);

        PreparedStatement ps = null;
        Conexion con = new Conexion();

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = escoger.getSelectedFile();

            try {
                FileInputStream archivoEntrada = new FileInputStream(archivo);
                Connection conexion = con.getConnection();

                ps = conexion.prepareStatement("UPDATE Tutor SET Img = (?) WHERE TutorID = (?)");
                ps.setBinaryStream(1, archivoEntrada, archivo.length());
                ps.setString(2, idTutor);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Foto actualizada");

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarCajas() {
        lblidTutor.setText("");
        txtDni.setText("");
        txtApellidos.setText("");
        txtNombres.setText("");
        txtCorreo.setText("");
        txtCelular.setText("");
        jDateChooserFechaNacimiento.setDate(null);
        DefaultTableModel mo = new DefaultTableModel();
        tblTutores.setModel(mo);
        mo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTablaAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblidTutor;
    private javax.swing.JPanel pnlImagen;
    private javax.swing.JTable tblTutores;
    private javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtBusquedaTutor;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
