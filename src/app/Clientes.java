package app;

import static app.VentanaPrincipal.content;
import conexion.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JPanel {
    
    Color naranja=new Color(0,15,29);
    Color naranjado=new Color(255,180,80);
    
    Conexion con= new Conexion();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    DefaultTableModel modelo;
    int id;
    
    public Clientes() {
        initComponents();
        mostrarPng.setIcon(new javax.swing.ImageIcon("./img/mostrarb.png"));
        agregarPng.setIcon(new javax.swing.ImageIcon("./img/agregarb.png"));
        actualizarPng.setIcon(new javax.swing.ImageIcon("./img/actualizarb.png"));
        eliminarPng.setIcon(new javax.swing.ImageIcon("./img/eliminarb.png"));

        cargarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        content2 = new javax.swing.JPanel();
        subMenu = new javax.swing.JPanel();
        AgregarBtn = new javax.swing.JPanel();
        AgregarTxt = new javax.swing.JLabel();
        agregarPng = new javax.swing.JLabel();
        ActualizarBtn = new javax.swing.JPanel();
        ActualizarTxt = new javax.swing.JLabel();
        actualizarPng = new javax.swing.JLabel();
        EliminarBtn = new javax.swing.JPanel();
        EliminarTxt = new javax.swing.JLabel();
        eliminarPng = new javax.swing.JLabel();
        MostrarBtn = new javax.swing.JPanel();
        MostrarTxt = new javax.swing.JLabel();
        mostrarPng = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 15, 29));
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        contenido.setBackground(new java.awt.Color(0, 15, 29));

        jPanel3.setBackground(new java.awt.Color(0, 15, 29));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblClientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cedula", "Dirección", "Afiliación", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        content2.setBackground(new java.awt.Color(0, 15, 29));

        javax.swing.GroupLayout content2Layout = new javax.swing.GroupLayout(content2);
        content2.setLayout(content2Layout);
        content2Layout.setHorizontalGroup(
            content2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        content2Layout.setVerticalGroup(
            content2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        subMenu.setBackground(new java.awt.Color(0, 15, 29));
        subMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 2, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        subMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarBtn.setBackground(new java.awt.Color(0, 15, 29));
        AgregarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarBtn.setPreferredSize(new java.awt.Dimension(242, 56));
        AgregarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarBtnMousePressed(evt);
            }
        });

        AgregarTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        AgregarTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgregarTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AgregarTxt.setText("Agregar");

        agregarPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout AgregarBtnLayout = new javax.swing.GroupLayout(AgregarBtn);
        AgregarBtn.setLayout(AgregarBtnLayout);
        AgregarBtnLayout.setHorizontalGroup(
            AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agregarPng, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        AgregarBtnLayout.setVerticalGroup(
            AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarPng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AgregarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        subMenu.add(AgregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 50));

        ActualizarBtn.setBackground(new java.awt.Color(0, 15, 29));
        ActualizarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarBtn.setPreferredSize(new java.awt.Dimension(242, 56));
        ActualizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarBtnMouseExited(evt);
            }
        });

        ActualizarTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        ActualizarTxt.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActualizarTxt.setText("Actualizar");

        actualizarPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ActualizarBtnLayout = new javax.swing.GroupLayout(ActualizarBtn);
        ActualizarBtn.setLayout(ActualizarBtnLayout);
        ActualizarBtnLayout.setHorizontalGroup(
            ActualizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActualizarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(actualizarPng, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActualizarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        ActualizarBtnLayout.setVerticalGroup(
            ActualizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ActualizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActualizarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(actualizarPng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        subMenu.add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 50));

        EliminarBtn.setBackground(new java.awt.Color(0, 15, 29));
        EliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarBtnMouseExited(evt);
            }
        });

        EliminarTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        EliminarTxt.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EliminarTxt.setText("Eliminar");

        eliminarPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout EliminarBtnLayout = new javax.swing.GroupLayout(EliminarBtn);
        EliminarBtn.setLayout(EliminarBtnLayout);
        EliminarBtnLayout.setHorizontalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eliminarPng, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EliminarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        EliminarBtnLayout.setVerticalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarBtnLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(EliminarTxt)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminarPng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        subMenu.add(EliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 50));

        MostrarBtn.setBackground(new java.awt.Color(0, 15, 29));
        MostrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarBtn.setPreferredSize(new java.awt.Dimension(242, 56));
        MostrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MostrarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MostrarBtnMouseExited(evt);
            }
        });

        MostrarTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        MostrarTxt.setForeground(new java.awt.Color(255, 255, 255));
        MostrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarTxt.setText("Mostrar");

        mostrarPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MostrarBtnLayout = new javax.swing.GroupLayout(MostrarBtn);
        MostrarBtn.setLayout(MostrarBtnLayout);
        MostrarBtnLayout.setHorizontalGroup(
            MostrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mostrarPng, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MostrarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        MostrarBtnLayout.setVerticalGroup(
            MostrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MostrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrarPng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        subMenu.add(MostrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 50));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(content2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 890, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtnMouseEntered
        AgregarBtn.setBackground(naranjado);
        AgregarTxt.setForeground(Color.black);
        agregarPng.setIcon(new javax.swing.ImageIcon("./img/agregar.png"));
    }//GEN-LAST:event_AgregarBtnMouseEntered

    private void AgregarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtnMouseExited
        AgregarBtn.setBackground(naranja);
        AgregarTxt.setForeground(Color.white);
        agregarPng.setIcon(new javax.swing.ImageIcon("./img/agregarb.png"));
    }//GEN-LAST:event_AgregarBtnMouseExited

    private void ActualizarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarBtnMouseEntered
        ActualizarBtn.setBackground(naranjado);
        ActualizarTxt.setForeground(Color.black);
        actualizarPng.setIcon(new javax.swing.ImageIcon("./img/actualizar.png"));
    }//GEN-LAST:event_ActualizarBtnMouseEntered

    private void ActualizarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarBtnMouseExited
        ActualizarBtn.setBackground(naranja);
        ActualizarTxt.setForeground(Color.white);
        actualizarPng.setIcon(new javax.swing.ImageIcon("./img/actualizarb.png"));
    }//GEN-LAST:event_ActualizarBtnMouseExited

    private void EliminarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnMouseEntered
        EliminarBtn.setBackground(naranjado);
        EliminarTxt.setForeground(Color.black);
        eliminarPng.setIcon(new javax.swing.ImageIcon("./img/eliminar.png"));
    }//GEN-LAST:event_EliminarBtnMouseEntered

    private void EliminarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarBtnMouseExited
        EliminarBtn.setBackground(naranja);
        EliminarTxt.setForeground(Color.white);
        eliminarPng.setIcon(new javax.swing.ImageIcon("./img/eliminarb.png"));
    }//GEN-LAST:event_EliminarBtnMouseExited

    private void MostrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarBtnMouseEntered
        MostrarBtn.setBackground(naranjado);
        MostrarTxt.setForeground(Color.black);
        mostrarPng.setIcon(new javax.swing.ImageIcon("./img/mostrar.png"));
    }//GEN-LAST:event_MostrarBtnMouseEntered

    private void MostrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarBtnMouseExited
        MostrarBtn.setBackground(naranja);
        MostrarTxt.setForeground(Color.white);
        mostrarPng.setIcon(new javax.swing.ImageIcon("./img/mostrarb.png"));
    }//GEN-LAST:event_MostrarBtnMouseExited

    private void AgregarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtnMousePressed
        Agregar ag = new Agregar();
        ag.setSize(396, 238);
        ag.setLocation(0,0);
        
        content2.removeAll();
        content2.add(ag, BorderLayout.CENTER);
        content2.revalidate();
        content2.repaint();
    }//GEN-LAST:event_AgregarBtnMousePressed

    private void MostrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarBtnMouseClicked
        Clientes cl = new Clientes();
        cl.setSize(870, 710);
        cl.setLocation(0,0);
        
        content.removeAll();
        content.add(cl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_MostrarBtnMouseClicked

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int fila = tblClientes.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null,"usuario no seleccionado");
        }else{
            String nom=(String)tblClientes.getValueAt(fila, 1);
            int ced=Integer.parseInt((String)tblClientes.getValueAt(fila, 2));
            String dir=(String)tblClientes.getValueAt(fila, 3);
            String fec=(String)tblClientes.getValueAt(fila, 4);
            String tel=(String)tblClientes.getValueAt(fila, 5);
            Agregar ag = new Agregar();
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void ActualizarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarBtnMouseClicked
        Agregar ag = new Agregar();
        ag.setSize(396, 238);
        ag.setLocation(0,0);
        
        content2.removeAll();
        content2.add(ag, BorderLayout.CENTER);
        content2.revalidate();
        content2.repaint();
    }//GEN-LAST:event_ActualizarBtnMouseClicked

    private void cargarTabla(){

        String sql = "select * from t_cliente";
        try{
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]cliente=new Object[6];
            modelo=(DefaultTableModel)tblClientes.getModel();
            while(rs.next()){
                cliente[0]=rs.getInt("id_cliente");
                cliente[1]=rs.getString("nom_cliente");
                cliente[2]=rs.getInt("ced_cliente");
                cliente[3]=rs.getString("dir_cliente");
                cliente[4]=rs.getDate("fecha_af");
                cliente[5]=rs.getString("tel_cliente");
                modelo.addRow(cliente);
                System.out.println("es: "+cliente[0]);
            }
            System.out.println("duera es_" +cliente[0]);
            tblClientes.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActualizarBtn;
    private javax.swing.JLabel ActualizarTxt;
    private javax.swing.JPanel AgregarBtn;
    private javax.swing.JLabel AgregarTxt;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JLabel EliminarTxt;
    private javax.swing.JPanel MostrarBtn;
    private javax.swing.JLabel MostrarTxt;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel actualizarPng;
    private javax.swing.JLabel agregarPng;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel content2;
    private javax.swing.JLabel eliminarPng;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarPng;
    private javax.swing.JPanel subMenu;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
