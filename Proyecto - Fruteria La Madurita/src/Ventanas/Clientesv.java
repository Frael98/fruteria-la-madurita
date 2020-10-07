package Ventanas;

import Clases.Clientes;
import Clases.Empleado;
import Project.Conexion;
import Project.FuncionesArchivos;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frael Campos
 */
public class Clientesv extends javax.swing.JFrame {

    public Empleado emp;
    private Connection con;

    private Clientesv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEmpleado(Empleado emp) {
        this.emp = emp;
    }

    public Clientesv(Empleado emp) {
        setTitle("Clientes");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);

        String[] ti = {"----", "General - 1 ", "VIP - 2"};
        tipo.setModel(new javax.swing.DefaultComboBoxModel(ti));

        setEmpleado(emp);
    }

    public void mostrar() throws ClassNotFoundException, SQLException {
        Connection con = Conexion.getConnection();
        FuncionesArchivos.mostrarClientes(con, table_cli);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_cli = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        mostrar.setText("Mostrar Clientes");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 14))); // NOI18N

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------" }));

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Cedula");

        jLabel5.setText("Telefono");

        jLabel6.setText("Tipo de Cliente");

        ingresar.setText("Ingresar Cliente");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar Cliente");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono)
                                    .addComponent(nombre)
                                    .addComponent(apellido, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(ingresar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        table_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_cli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_cliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_cli);

        eliminar.setText("Eliminar Cliente");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(mostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(volver))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(eliminar)
                                .addGap(364, 364, 364)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrar)
                            .addComponent(volver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || telefono.getText().isEmpty()
                || cedula.getText().isEmpty() || tipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
        } else {
            int dec = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este cliente");
            if (dec == 0) {

                try {
                    int id = Integer.parseInt(cedula.getText());

                    this.con = Conexion.getConnection();
                    FuncionesArchivos.eliminarCliente(con, id);
                    con.close();
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                } catch (SQLException ex) {
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                nombre.setText("");
                apellido.setText("");
                telefono.setText("");
                cedula.setText("");
                tipo.setSelectedIndex(0);
            }

        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isDigit(Val)) {
            evt.consume();
        }
        if (nombre.getText().length() > 29) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isDigit(Val)) {
            evt.consume();
        }
        if (apellido.getText().length() > 29) {
            evt.consume();
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isLetter(Val)) {
            evt.consume();
        }
        if (cedula.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isLetter(Val)) {
            evt.consume();
        }
        if (telefono.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        if (nombre.getText().isEmpty() || apellido.getText().isEmpty()
                || cedula.getText().isEmpty() || tipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            int ced = Integer.parseInt(cedula.getText());
            int tel = Integer.parseInt(telefono.getText());
            int tp = tipo.getSelectedIndex();
            Clientes cli = new Clientes(tp, ced, nombre.getText(), apellido.getText(), tel);
            Connection con;
            try {
                con = Conexion.getConnection();
                FuncionesArchivos.agregarCliente(con, cli);
                JOptionPane.showMessageDialog(null, "Cliente Registrado");
            } catch (SQLException ex) {
                Logger.getLogger(Clientesv.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Clientesv.class.getName()).log(Level.SEVERE, null, ex);
            }

            nombre.setText("");
            apellido.setText("");
            cedula.setText("");

            telefono.setText("");
            tipo.setSelectedIndex(0);

        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        try {
            mostrar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Clientesv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Clientesv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Menu ot = new Menu(this.emp);
        ot.setVisible(true);
        if (this.emp.getId_rol() == 1) {
            ot.inventario.setEnabled(true);
            ot.factura_win.setEnabled(true);
            ot.clientes.setEnabled(true);
            ot.usuarioss.setEnabled(true);
            ot.ventas.setEnabled(true);
            ot.compras.setEnabled(true);
        } else if (this.emp.getId_rol() == 2) {
            ot.inventario.setEnabled(false);
            ot.factura_win.setEnabled(false);
            ot.clientes.setEnabled(true);
            ot.usuarioss.setEnabled(false);
            ot.ventas.setEnabled(true);
            ot.compras.setEnabled(true);
        }
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || telefono.getText().isEmpty()
                || cedula.getText().isEmpty() || tipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente");
        } else {
            int ti = tipo.getSelectedIndex();
            int tel = Integer.parseInt(telefono.getText());
            int ced = Integer.parseInt(cedula.getText());
            Clientes cli
                    = new Clientes(ti, ced, nombre.getText(), apellido.getText(), tel);
            try {

                this.con = Conexion.getConnection();
                FuncionesArchivos.modificarCliente(con, cli);
                con.close();
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
            } catch (SQLException ex) {
                Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }

            nombre.setText("");
            apellido.setText("");
            telefono.setText("");
            cedula.setText("");
            tipo.setSelectedIndex(0);

        }
    }//GEN-LAST:event_modificarActionPerformed

    private void table_cliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_cliMouseClicked
        int sel = table_cli.rowAtPoint(evt.getPoint());

        nombre.setText(table_cli.getValueAt(sel, 2) + "");
        apellido.setText(table_cli.getValueAt(sel, 3) + "");
        telefono.setText(table_cli.getValueAt(sel, 4) + "");
        cedula.setText(table_cli.getValueAt(sel, 0) + "");
        tipo.setSelectedIndex(Integer.parseInt(table_cli.getValueAt(sel, 1) + ""));
    }//GEN-LAST:event_table_cliMouseClicked

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
            java.util.logging.Logger.getLogger(Clientesv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientesv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientesv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientesv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientesv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable table_cli;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
