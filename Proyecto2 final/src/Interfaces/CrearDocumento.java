/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Estructuras.NodeDocumento;
import Estructuras.NodeUsuario;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import proyecto2.App;

/**
 *@Description: interfaz para crear un documento en la simulación 
 * @author Catalina Matheus 
 * @version 12/11/2023
 */
public class CrearDocumento extends javax.swing.JFrame {

    App app = App.getInstance(); 
    String nombreD = null; 
    int cantidadP = 0; 
    String tipoD = null; 
    /**
     * Creates new form EliminarDoc
     */
    public CrearDocumento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true); 
        this.limpiarList(); 
        this.desplegarUsuarios();
        this.tamanioDoc.setText("0");
        this.tamanioDoc.setEditable(false);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputNombreDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tamanioDoc = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        opcionesTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListUsuarios = new javax.swing.JList<>();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jToggleButton1.setText("ATRÁS");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("SELECCIONE EL USUARIO QUE DESEA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("NOMBRE DOCUMENTO: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));
        getContentPane().add(inputNombreDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 280, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("TAMAÑO DEL DOCUMENTO: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 200, -1));

        tamanioDoc.setEditable(false);
        getContentPane().add(tamanioDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 40, 30));

        jToggleButton2.setText("+");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 50, 30));

        jToggleButton3.setText("-");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 50, 30));

        jToggleButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jToggleButton4.setText("AGREGAR");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 120, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("TIPO DE DOCUMENTO: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        opcionesTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "WORD", "EXCEL", "JPEG", "PNG", "POWERPOINT", "TIFF" }));
        getContentPane().add(opcionesTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jScrollPane1.setViewportView(ListUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 330, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearDocumento.jpg"))); // NOI18N
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false); 
        CrearEliminarDoc i = new CrearEliminarDoc(); 
        i.setVisible(true); 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        String username = ListUsuarios.getSelectedValue(); 
        this.nombreD = inputNombreDoc.getText();  
        this.tipoD = (String)opcionesTipo.getSelectedItem(); 
        this.cantidadP = Integer.parseInt(this.tamanioDoc.getText()); 
        if (nombreD.equals("") || tipoD.equals("") || cantidadP == 0 || username == null ) {
            JOptionPane.showMessageDialog(null, "Tiene que llenar todos los campos para poder crear el documento!");
        }else if(nombreD.length()>8){
            JOptionPane.showMessageDialog(null, "Error! El nombre puede tener máximo 8 caracteres!"); 
            inputNombreDoc.setText(null); 
            this.nombreD = null; 
        }
        else{
            NodeUsuario nodito = app.getLista().find(username); 
            NodeDocumento doc = new NodeDocumento(nombreD, cantidadP, tipoD); 
            nodito.getDocumentos().appendLast(doc);
            JOptionPane.showMessageDialog(null, "Se guardo exitosamente el documento!"); 
            ListUsuarios.clearSelection();
            inputNombreDoc.setText(null);
            tamanioDoc.setText("0");
            this.nombreD = ""; 
            this.tipoD = ""; 
            this.cantidadP = 0; 
        }
      
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String num = tamanioDoc.getText(); 
        int numInt = Integer.parseInt(num) ; 
        this.tamanioDoc.setText(Integer.toString(numInt+1));
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        String num = this.tamanioDoc.getText(); 
        int numInt = Integer.parseInt(num); 
        if (numInt != 0) {
            this.tamanioDoc.setText(Integer.toString(numInt -1));
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    /**
     * @Descripcion: funcion que limpia los JList antes de desplegar la
     * información
     * @return
     * @author: Catalina Matheus
     * @version: 17/10/2023
     */
    public DefaultListModel limpiarList() {
        DefaultListModel modelo = new DefaultListModel();
        ListUsuarios.setModel(modelo);
        return modelo;
    }
    
    /**
     * @Descripcion: funcion que despliega la informacion en el JList
     * @return
     * @author: Catalina Matheus
     * @version: 12/11/2023
     */
    public void desplegarUsuarios(){
        DefaultListModel modelo = (DefaultListModel) ListUsuarios.getModel();
        NodeUsuario aux = app.getLista().getpFirst(); 
        while(aux != null){
            modelo.addElement(aux.getNombreUsuario());
            aux = aux.getpNext(); 
        }
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
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearDocumento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearDocumento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JList<String> ListUsuarios;
    private javax.swing.JTextField inputNombreDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JComboBox<String> opcionesTipo;
    private javax.swing.JTextField tamanioDoc;
    // End of variables declaration//GEN-END:variables
}