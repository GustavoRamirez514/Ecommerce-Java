/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.C_Productos;
import Controlador.C_Cliente;
import Modelo.M_Productos;
import Utilidades.ConexionBD;
import Modelo.M_Cliente;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author wdg20
 */
public class V_GestionProductoAdmin extends javax.swing.JPanel {

    String Columna[] = {"ID", "Nombre", "Precio", "Descripcion", "Estado"};
    DefaultTableModel Modelo = new DefaultTableModel(Columna, 0);
    C_Productos cu;
    M_Productos bu;
 

    /**
     * Creates new form GestionInmueble
     */
    public V_GestionProductoAdmin() {
        initComponents();

        bu = new M_Productos();
        cu = new C_Productos();

       
        cu.setIu_GestionProductoAdmin(this);
        cu.ListarProductosAdmin();

        C_Cliente p = new C_Cliente();
        

    }

//    public static void Deshabilitar() {
//        G_Modificadores= new JPanel();
//        G_BtnVenta = new JButton();
//        
//    }
    public void AgregarFila(String datos[]) {
        Modelo.addRow(datos);

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        G_Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        G_Buscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        G_Filtro = new javax.swing.JComboBox<>();
        G_Modificadores = new javax.swing.JPanel();
        G_BtnCrear = new javax.swing.JButton();
        G_BtnEditar = new javax.swing.JButton();
        G_BtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        G_BtnActualizar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PRODUCTOS");

        G_Tabla.setModel(Modelo);
        jScrollPane1.setViewportView(G_Tabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setText("Filtro:");

        G_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BuscarActionPerformed(evt);
            }
        });
        G_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                G_BuscarKeyReleased(evt);
            }
        });

        jLabel4.setText("Buscar:");

        G_Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificador", "Nombre", "Precio", "Descripcion", "Estado", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(G_Buscar)
                    .addComponent(G_Filtro, 0, 118, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(G_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        G_Modificadores.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificadores "));

        G_BtnCrear.setText("Crear");
        G_BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnCrearActionPerformed(evt);
            }
        });

        G_BtnEditar.setText("Editar");
        G_BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnEditarActionPerformed(evt);
            }
        });

        G_BtnEliminar.setText("Eliminar");
        G_BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout G_ModificadoresLayout = new javax.swing.GroupLayout(G_Modificadores);
        G_Modificadores.setLayout(G_ModificadoresLayout);
        G_ModificadoresLayout.setHorizontalGroup(
            G_ModificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(G_ModificadoresLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(G_BtnCrear)
                .addGap(18, 18, 18)
                .addComponent(G_BtnEditar)
                .addGap(18, 18, 18)
                .addComponent(G_BtnEliminar)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        G_ModificadoresLayout.setVerticalGroup(
            G_ModificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(G_ModificadoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(G_ModificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G_BtnEditar)
                    .addComponent(G_BtnCrear)
                    .addComponent(G_BtnEliminar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("LISTADO DE PRODUCTOS ");

        G_BtnActualizar.setText("Actualizar Tabla");
        G_BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(540, 540, 540)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(G_Modificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(G_BtnActualizar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(G_BtnActualizar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(G_Modificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void G_BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnCrearActionPerformed
        // CODIGO AL PRESIONAR EL BOTON CREAR
        V_CrearProducto Cre = new V_CrearProducto();
        Cre.setVisible(true);
        Cre.setLocationRelativeTo(this);


    }//GEN-LAST:event_G_BtnCrearActionPerformed

    private void G_BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnEliminarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "Se eliminará el registro, ¿desea continuar?") == JOptionPane.YES_OPTION) {
                String Identificador = Modelo.getValueAt(G_Tabla.getSelectedRow(), 0).toString();
                ConexionBD c = new ConexionBD();
                boolean exito = false;
                //String sql= "delete from inmuebles where Identificador='" + Identificador + "'";
                String sql = "update inmuebles set Estado='Eliminado'";
                sql += "where Identificador='" + Identificador + "'";

                try {
                    exito = c.ejecutarSql(sql);
                    c.cerrarConexion();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexion");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccion un registro para eliminar");

        }

    }//GEN-LAST:event_G_BtnEliminarActionPerformed

    private void G_BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnActualizarActionPerformed
        //CODIGO AL PRESIONAR EL BOTON ACTUALIZAR 
        Modelo.setRowCount(0);
        cu.ListarProductosAdmin();


    }//GEN-LAST:event_G_BtnActualizarActionPerformed

    private void G_BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnEditarActionPerformed
        //CODIGO AL PRESIONAR EL BOTON EDITAR INMUEBLE

        try {
            if (JOptionPane.showConfirmDialog(null, "Se editara el registro, ¿desea continuar?") == JOptionPane.YES_OPTION) {
                int Identificador;
                Identificador = Integer.parseInt(Modelo.getValueAt(G_Tabla.getSelectedRow(), 0).toString());

                cu.ConsultarProductoId(Identificador);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccion un registro para editar");
        }

    }//GEN-LAST:event_G_BtnEditarActionPerformed

    private void G_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G_BuscarKeyReleased
        TableRowSorter<DefaultTableModel> Sorter;
        Sorter = new TableRowSorter<>(Modelo);
        G_Tabla.setRowSorter(Sorter);
        Sorter.setRowFilter(RowFilter.regexFilter(G_Buscar.getText(), G_Filtro.getSelectedIndex()));

    }//GEN-LAST:event_G_BuscarKeyReleased

    private void G_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton G_BtnActualizar;
    public static javax.swing.JButton G_BtnCrear;
    public static javax.swing.JButton G_BtnEditar;
    public static javax.swing.JButton G_BtnEliminar;
    private javax.swing.JTextField G_Buscar;
    private javax.swing.JComboBox<String> G_Filtro;
    public static javax.swing.JPanel G_Modificadores;
    public static javax.swing.JTable G_Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
