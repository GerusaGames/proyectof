
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGW08
 */
public class Opc1Dvd extends javax.swing.JFrame {

    /**
     * Creates new form Opc1Dvd
     */
    public Opc1Dvd() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconUAM() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/IconUAM.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Director = new javax.swing.JTextField();
        Productor = new javax.swing.JTextField();
        Distribuidora = new javax.swing.JTextField();
        Duracion = new javax.swing.JTextField();
        Genero = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Descripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        NumDVD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconUAM());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Titulo.setText("DVD");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Director: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setText("Productor: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel4.setText("Distribuidora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setText("Duracion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 20));

        jLabel6.setText("Genero:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        getContentPane().add(Director, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, -1));
        getContentPane().add(Productor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, -1));
        getContentPane().add(Distribuidora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 160, -1));
        getContentPane().add(Duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 80, -1));
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 160, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, -1));

        jLabel11.setText("Id:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, -1));

        jLabel12.setText("Nombre:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel13.setText("Costo:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel14.setText("Descripcion:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, -1));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        jLabel15.setText("Numero de Discos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
        getContentPane().add(NumDVD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        OPC1 menu = new OPC1();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        //Tomamos en cuenta cuando el usuario ingresa un numero
        try {
            //Tomamos los valores de los JTextField y los asignamos a variables.
            int id = Integer.parseInt(Id.getText());
            int costo = Integer.parseInt(Costo.getText());
            String nombre = Nombre.getText();
            String descripcion = Descripcion.getText();
            String director = Director.getText();
            String distribuidora = Distribuidora.getText();
            int duracion = Integer.parseInt(Duracion.getText());
            String genero = Genero.getText();
            String productor = Productor.getText();
            int discos = Integer.parseInt(NumDVD.getText());

            //Agregando disco al catalogo
            MAIN.catalogo.añadirNuevoDvd(nombre,descripcion , id, costo, director, productor, distribuidora, duracion, genero, discos);
            
            //Limpiamos los JTextField
            JOptionPane.showMessageDialog(this, "Guardado Exitoso");
            Id.setText("");
            Costo.setText("");
            Nombre.setText("");
            Descripcion.setText("");
            Director.setText("");
            Distribuidora.setText("");
            Duracion.setText("");
            Genero.setText("");
            Productor.setText("");
            NumDVD.setText("");

        } catch (NumberFormatException e) {
            //Limpiamos los campos donde se pudo ocasionar un error
            JOptionPane.showMessageDialog(this, "Hubo un error, verifique sus datos");
            Id.setText("");
            Costo.setText("");
            Duracion.setText("");
            NumDVD.setText("");

        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(Opc1Dvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opc1Dvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opc1Dvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opc1Dvd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opc1Dvd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costo;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField Director;
    private javax.swing.JTextField Distribuidora;
    private javax.swing.JTextField Duracion;
    private javax.swing.JTextField Genero;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NumDVD;
    private javax.swing.JTextField Productor;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
