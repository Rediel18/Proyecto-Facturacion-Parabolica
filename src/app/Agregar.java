/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import conexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leider
 */
public class Agregar extends javax.swing.JPanel {
    Color naranja=new Color(0,51,102);
    Color naranjado=new Color(255,180,80);
    
    Conexion con= new Conexion();
    Connection cn;
    Statement st = null;
    ResultSet rs = null;
    DefaultTableModel modelo;
    int id;
    
    public Agregar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaDat = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numeroTxt = new javax.swing.JTextField();
        aceptarBtn = new javax.swing.JPanel();
        aceptarTxt = new javax.swing.JLabel();

        fechaDat.setBackground(new java.awt.Color(0, 51, 102));
        fechaDat.setForeground(new java.awt.Color(0, 51, 102));
        fechaDat.setDateFormatString("yyyy/MM/dd");
        fechaDat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 15, 29));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre:");

        nombreTxt.setBackground(new java.awt.Color(0, 15, 29));
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        Cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cedula.setForeground(new java.awt.Color(255, 255, 255));
        Cedula.setText("Cedula:");

        cedulaTxt.setBackground(new java.awt.Color(0, 15, 29));
        cedulaTxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dirección:");

        direccionTxt.setBackground(new java.awt.Color(0, 15, 29));
        direccionTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        direccionTxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero:");

        numeroTxt.setBackground(new java.awt.Color(0, 15, 29));
        numeroTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        numeroTxt.setForeground(new java.awt.Color(255, 255, 255));

        aceptarBtn.setBackground(new java.awt.Color(0, 15, 29));
        aceptarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarBtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        aceptarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarBtnMouseExited(evt);
            }
        });

        aceptarTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        aceptarTxt.setForeground(new java.awt.Color(255, 255, 255));
        aceptarTxt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        aceptarTxt.setText("Aceptar");

        javax.swing.GroupLayout aceptarBtnLayout = new javax.swing.GroupLayout(aceptarBtn);
        aceptarBtn.setLayout(aceptarBtnLayout);
        aceptarBtnLayout.setHorizontalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aceptarBtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(aceptarTxt)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        aceptarBtnLayout.setVerticalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aceptarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarTxt)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccionTxt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre)
                                    .addComponent(Cedula))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(numeroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula)
                    .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(numeroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void aceptarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBtnMouseEntered
        aceptarBtn.setBackground(naranjado);
        aceptarTxt.setForeground(Color.black);
    }//GEN-LAST:event_aceptarBtnMouseEntered

    private void aceptarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBtnMouseExited
        aceptarBtn.setBackground(naranja);
        aceptarTxt.setForeground(Color.white);
    }//GEN-LAST:event_aceptarBtnMouseExited

    private void aceptarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarBtnMouseClicked
        Agregar();
        
    }//GEN-LAST:event_aceptarBtnMouseClicked

    void Agregar(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fec = sdf.format(new Date()); 
        System.out.println(sdf); // 27/01/2016

        
        String nom=nombreTxt.getText();
        String ced=cedulaTxt.getText();
        String dir=direccionTxt.getText();
        String tel =numeroTxt.getText();
        if(nom.equals("")||ced.equals("")||dir.equals("")||/*fec.equals("")||*/tel.equals("")){
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio!!");
            
        }else{
            String sql = "insert into t_cliente(nom_cliente,ced_cliente,dir_cliente,fecha_af,tel_cliente) values ('"+nom+"','"+ced+"','"+dir+"','"+fec+"','"+tel+"')";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Datos agregados");
                System.out.println();
                } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel aceptarBtn;
    private javax.swing.JLabel aceptarTxt;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField direccionTxt;
    private com.toedter.calendar.JDateChooser fechaDat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField numeroTxt;
    // End of variables declaration//GEN-END:variables
}
