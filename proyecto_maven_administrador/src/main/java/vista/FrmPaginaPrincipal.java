/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import models.Administrador;

/**
 *
 * @author William
 */
public class FrmPaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPaginaPrincipal
     */
    public FrmPaginaPrincipal(Administrador administrador) {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsuario.setText(administrador.getLogin());
        dpEscritorio.removeAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpEscritorio = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        subMenuCerrarPrograma = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        subMenuCrearProducto = new javax.swing.JMenuItem();
        subMenuListarProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        subMenuCrearSubasta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        subMenuCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        dpEscritorio.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout dpEscritorioLayout = new javax.swing.GroupLayout(dpEscritorio);
        dpEscritorio.setLayout(dpEscritorioLayout);
        dpEscritorioLayout.setHorizontalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        dpEscritorioLayout.setVerticalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setText("Sin usuario");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido(a):");

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        subMenuCerrarPrograma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subMenuCerrarPrograma.setText("Cerrar Programa");
        subMenuCerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCerrarProgramaActionPerformed(evt);
            }
        });
        jMenu1.add(subMenuCerrarPrograma);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        subMenuCrearProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subMenuCrearProducto.setText("Crear");
        subMenuCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCrearProductoActionPerformed(evt);
            }
        });
        jMenu2.add(subMenuCrearProducto);

        subMenuListarProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subMenuListarProducto.setText("Listar");
        subMenuListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuListarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(subMenuListarProducto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Subasta");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        subMenuCrearSubasta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subMenuCrearSubasta.setText("Crear o Cerrar");
        subMenuCrearSubasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCrearSubastaActionPerformed(evt);
            }
        });
        jMenu3.add(subMenuCrearSubasta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sesi??n");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        subMenuCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subMenuCerrarSesion.setText("Cerrar Sesi??n");
        subMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu4.add(subMenuCerrarSesion);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpEscritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCerrarProgramaActionPerformed
        JOptionPane.showMessageDialog(this, "El programa se cerrara en breve, vuelve pronto.");
        System.exit(0);
    }//GEN-LAST:event_subMenuCerrarProgramaActionPerformed

    private void subMenuCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCrearProductoActionPerformed
        FrmRegistrarProducto frmRegistrarProducto = new FrmRegistrarProducto();
        dpEscritorio.add(frmRegistrarProducto);
        frmRegistrarProducto.show();
        //        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_subMenuCrearProductoActionPerformed

    private void subMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCerrarSesionActionPerformed
        JOptionPane.showMessageDialog(this, "La sesi??n se cerrara en breve, vuelve pronto...");
        this.dispose();
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
    }//GEN-LAST:event_subMenuCerrarSesionActionPerformed

    private void subMenuListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuListarProductoActionPerformed
        FrmListarProductos frmListarProductos = new FrmListarProductos();
        dpEscritorio.add(frmListarProductos);
        frmListarProductos.show();
    }//GEN-LAST:event_subMenuListarProductoActionPerformed

    private void subMenuCrearSubastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCrearSubastaActionPerformed
        FrmCrearSubasta frmCrearSubasta = new FrmCrearSubasta();
        dpEscritorio.add(frmCrearSubasta);
        frmCrearSubasta.show();
    }//GEN-LAST:event_subMenuCrearSubastaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPaginaPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem subMenuCerrarPrograma;
    private javax.swing.JMenuItem subMenuCerrarSesion;
    private javax.swing.JMenuItem subMenuCrearProducto;
    private javax.swing.JMenuItem subMenuCrearSubasta;
    private javax.swing.JMenuItem subMenuListarProducto;
    // End of variables declaration//GEN-END:variables
}
