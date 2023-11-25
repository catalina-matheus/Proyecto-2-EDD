/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *@Description interfaz para ver y/o agregar usuarios a la simulación 
 * @author Catalina Matheus 
 * @version 12/11/2023
 */
public class VerAgregarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form VerAgregarUsuarios
     */
    public VerAgregarUsuarios() {
        initComponents();
        transpareciaButton(); 
        this.setLocationRelativeTo(null); 
        this.setVisible(true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        AgregarUsuarios = new javax.swing.JToggleButton();
        VerUsuarios = new javax.swing.JToggleButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setText("ATRÁS");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 130, 30));

        AgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 350, 50));

        VerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(VerUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 250, 50));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarVerUsuarios.jpg"))); // NOI18N
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false); 
        MainInterface mI = new MainInterface(); 
        mI.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void AgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuariosActionPerformed
       this.setVisible(false); 
        AddUsers ad = new AddUsers(); 
        ad.setVisible(true); 
        
    }//GEN-LAST:event_AgregarUsuariosActionPerformed

    private void VerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerUsuariosActionPerformed
        this.setVisible(false); 
        VerUsuarios i = new VerUsuarios(); 
        i.setVisible(true); 
    }//GEN-LAST:event_VerUsuariosActionPerformed
     /**
     * @Description: método que hace que todos los botones de la interfaz sean transparentes 
     * @author: Catalina Matheus 
     * @version: 12/11/2023
     */
    public void transpareciaButton(){
       VerUsuarios.setOpaque(false);
       VerUsuarios.setContentAreaFilled(false);
       VerUsuarios.setBorderPainted(false); 
       
       AgregarUsuarios.setOpaque(false);
       AgregarUsuarios.setContentAreaFilled(false);
       AgregarUsuarios.setBorderPainted(false); 
  
       
   } 
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
            java.util.logging.Logger.getLogger(VerAgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerAgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerAgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerAgregarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerAgregarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AgregarUsuarios;
    private javax.swing.JLabel Imagen;
    private javax.swing.JToggleButton VerUsuarios;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}