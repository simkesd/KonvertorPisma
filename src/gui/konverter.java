/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Mar 30, 2012, 6:13:24 PM
 */
package gui;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import metode.UCirilicu;
import metode.ULatinicu;

/**
 *
 * @author ALATKA
 */
public class konverter extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public konverter() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        izadjiDugme = new javax.swing.JButton();
        uLatinicuDugme = new javax.swing.JButton();
        uCirilicuDugme = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        otvoriDugme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konverter Pisma - FONIS");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        izadjiDugme.setText("Izađi");
        izadjiDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izadjiDugmeActionPerformed(evt);
            }
        });

        uLatinicuDugme.setText("U Latinicu");
        uLatinicuDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uLatinicuDugmeActionPerformed(evt);
            }
        });

        uCirilicuDugme.setText("U Ćirilicu");
        uCirilicuDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uCirilicuDugmeActionPerformed(evt);
            }
        });

        jButton1.setText("Sačuvaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        otvoriDugme.setText("Otvori");
        otvoriDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otvoriDugmeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resursi/FONIS-logo-mali.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(izadjiDugme, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(uCirilicuDugme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uLatinicuDugme))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(otvoriDugme, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {izadjiDugme, jButton1, otvoriDugme, uCirilicuDugme, uLatinicuDugme});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otvoriDugme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uCirilicuDugme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uLatinicuDugme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izadjiDugme)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void otvoriDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otvoriDugmeActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = jFileChooser1.getSelectedFile();
        try {
          // What to do with the file, e.g. display it in a TextArea
          jTextArea1.read( new FileReader( file.getAbsolutePath() ), null );
        } catch (IOException ex) {
               System.out.println ("Izaberite tekstualni fajl!");
          }
    }
}//GEN-LAST:event_otvoriDugmeActionPerformed

private void uCirilicuDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uCirilicuDugmeActionPerformed
        String tekst =  getjTextArea1().getText();
       
       UCirilicu c = new UCirilicu();
       getjTextArea1().setText(c.metoda(tekst));
}//GEN-LAST:event_uCirilicuDugmeActionPerformed

private void uLatinicuDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uLatinicuDugmeActionPerformed
        String tekst =  getjTextArea1().getText();
       
       ULatinicu l = new ULatinicu();
       getjTextArea1().setText(l.metoda(tekst));
}//GEN-LAST:event_uLatinicuDugmeActionPerformed

private void izadjiDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izadjiDugmeActionPerformed
        System.exit(0);
}//GEN-LAST:event_izadjiDugmeActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
}//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(konverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new konverter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton izadjiDugme;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton otvoriDugme;
    private javax.swing.JButton uCirilicuDugme;
    private javax.swing.JButton uLatinicuDugme;
    // End of variables declaration//GEN-END:variables

    public JButton getIzadjiDugme() {
        return izadjiDugme;
    }

    public void setIzadjiDugme(JButton izadjiDugme) {
        this.izadjiDugme = izadjiDugme;
    }

    public JFileChooser getjFileChooser1() {
        return jFileChooser1;
    }

    public void setjFileChooser1(JFileChooser jFileChooser1) {
        this.jFileChooser1 = jFileChooser1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JButton getOtvoriDugme() {
        return otvoriDugme;
    }

    public void setOtvoriDugme(JButton otvoriDugme) {
        this.otvoriDugme = otvoriDugme;
    }

    public JButton getuCirilicuDugme() {
        return uCirilicuDugme;
    }

    public void setuCirilicuDugme(JButton uCirilicuDugme) {
        this.uCirilicuDugme = uCirilicuDugme;
    }

    public JButton getuLatinicuDugme() {
        return uLatinicuDugme;
    }

    public void setuLatinicuDugme(JButton uLatinicuDugme) {
        this.uLatinicuDugme = uLatinicuDugme;
    }
}
