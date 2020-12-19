/*
 * Copyright (C) 2020 Vojtěch Perník <v.pernik@centrum.cz>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.pervoj.lttedit;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Vojtěch Perník <v.pernik@centrum.cz>
 */
public class MainMenuJFrame extends javax.swing.JFrame {
    
    private JFileChooser jfc = new JFileChooser();

    /**
     * Creates new form MainMenu
     */
    public MainMenuJFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoJLabel = new javax.swing.JLabel();
        editLTTJButton = new javax.swing.JButton();
        createLTTJButton = new javax.swing.JButton();
        editLTTPJButton = new javax.swing.JButton();
        createLTTPJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LTT Edit");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rsc/icons/lttedit.png")));
        setResizable(false);

        logoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cz/pervoj/lttedit/rsc/icons/lttedit.png"))); // NOI18N

        editLTTJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        editLTTJButton.setText("Edit existing translation");
        editLTTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLTTJButtonActionPerformed(evt);
            }
        });

        createLTTJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        createLTTJButton.setText("Create new translation");
        createLTTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLTTJButtonActionPerformed(evt);
            }
        });

        editLTTPJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        editLTTPJButton.setText("Edit existing pattern");
        editLTTPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLTTPJButtonActionPerformed(evt);
            }
        });

        createLTTPJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        createLTTPJButton.setText("Create new pattern");
        createLTTPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLTTPJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoJLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createLTTPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editLTTPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editLTTJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(createLTTJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoJLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editLTTJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createLTTJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editLTTPJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createLTTPJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editLTTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLTTJButtonActionPerformed
        jfc.setFileFilter(new FileNameExtensionFilter("LTT files", "ltt"));
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File translation = jfc.getSelectedFile();
            new TranslationEditorJFrame(translation).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_editLTTJButtonActionPerformed

    private void createLTTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLTTJButtonActionPerformed
        NewTranslationJDialog ntjd = new NewTranslationJDialog(this, true);
        ntjd.setVisible(true);
        
        if (ntjd.isCreated()) {
            new TranslationEditorJFrame(ntjd.getFile(), ntjd.getTranslationController()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_createLTTJButtonActionPerformed

    private void editLTTPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLTTPJButtonActionPerformed
        jfc.setFileFilter(new FileNameExtensionFilter("LTTP files", "lttp"));
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            new PatternEditorJFrame(jfc.getSelectedFile()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_editLTTPJButtonActionPerformed

    private void createLTTPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLTTPJButtonActionPerformed
        jfc.setFileFilter(new FileNameExtensionFilter("LTTP files", "lttp"));
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = jfc.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            new PatternEditorJFrame(jfc.getSelectedFile(), true).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_createLTTPJButtonActionPerformed

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
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createLTTJButton;
    private javax.swing.JButton createLTTPJButton;
    private javax.swing.JButton editLTTJButton;
    private javax.swing.JButton editLTTPJButton;
    private javax.swing.JLabel logoJLabel;
    // End of variables declaration//GEN-END:variables
}
