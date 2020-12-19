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

import cz.pervoj.lttedit.classes.*;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vojtěch Perník <v.pernik@centrum.cz>
 */
public class PatternEditorJFrame extends javax.swing.JFrame {
    
    private File file;
    private PatternController patterns;
    private AbstractTableModel model;
    private int selected = -1;

    public PatternEditorJFrame(File file, boolean create) {        
        try {
            this.file = file;
            init();
            this.patterns = PatternParser.getEmpty("");
            PatternParser.saveFile(patterns, file);
            updateTable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            exit();
        }
    }
    
    public PatternEditorJFrame(File pattern) {
        try {
            file = pattern;
            init();
            patterns = PatternParser.parseFile(pattern);
            updateTable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            exit();
        }
    }

private void init() {
    initComponents();

    setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        patternsJTable.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                patternsJTableValueChanged(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        patternsJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        updateJButton = new javax.swing.JButton();
        textJTextField = new javax.swing.JTextField();
        codeJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesJTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        saveJButton = new javax.swing.JButton();
        savedJLabel = new javax.swing.JLabel();
        metaEditJButton = new javax.swing.JButton();
        newLineJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LTT Edit");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rsc/icons/lttedit.png")));
        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        patternsJTable.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        patternsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Text"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patternsJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        patternsJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patternsJTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(patternsJTable);

        updateJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        updateJButton.setText("Update list");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        textJTextField.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        codeJTextField.setEditable(false);
        codeJTextField.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Text:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Code:");

        notesJTextArea.setColumns(20);
        notesJTextArea.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        notesJTextArea.setRows(5);
        jScrollPane1.setViewportView(notesJTextArea);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Notes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateJButton)
                .addContainerGap())
        );

        saveJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        savedJLabel.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        savedJLabel.setText("Saved");

        metaEditJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        metaEditJButton.setText("Edit meta info");
        metaEditJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metaEditJButtonActionPerformed(evt);
            }
        });

        newLineJButton.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        newLineJButton.setText("New line");
        newLineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLineJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(metaEditJButton)
                .addGap(18, 18, 18)
                .addComponent(newLineJButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton)
                    .addComponent(savedJLabel)
                    .addComponent(metaEditJButton)
                    .addComponent(newLineJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        if (selected >= 0) {
            ArrayList<String> notes = new ArrayList<>();
            for (String note : notesJTextArea.getText().split("\n")) {
                if (!note.equals("")) {
                    notes.add(note);
                }
            }
            String[] notesarray = new String[notes.size()];
            for (int i = 0; i < notes.size(); i++) {
                notesarray[i] = notes.get(i);
            }
            patterns.setNotes(selected, notesarray);
            
            if (textJTextField.getText().contains("=")) {
                int result = JOptionPane.showConfirmDialog(this, "If you use = in a text, we don't guarantee that the translation will work correctly.", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    patterns.setText(selected, textJTextField.getText());
                }
            } else {
                patterns.setText(selected, textJTextField.getText());
            }

            updateTable(selected);
            updateSavedLabel();
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void patternsJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patternsJTableMouseClicked
        updateTextFields();
    }//GEN-LAST:event_patternsJTableMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (patterns.isSaved()) {
            exit();
        } else{
            int result = JOptionPane.showConfirmDialog(this, "Pattern has unsaved changes. Do you want to discard this changes?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                exit();
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        try {
            patterns = PatternParser.saveFile(patterns, file);
            updateTable();
            updateSavedLabel();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void newLineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLineJButtonActionPerformed
        PatternNewLineJDialog nl = new PatternNewLineJDialog(this, true);
        nl.setVisible(true);
        
        if (nl.getCode() != null) {
            patterns.add(new PatternModel(nl.getCode(), "", new String[0]));
            patterns.setSaved(false);
            updateTable();
            updateSavedLabel();
        }
    }//GEN-LAST:event_newLineJButtonActionPerformed

    private void metaEditJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metaEditJButtonActionPerformed
        MetaEditJDialog me = new MetaEditJDialog(this, true, patterns.getAuthor());
        me.setVisible(true);
        
        if (me.getAuthor() != null) {
            patterns.setAuthor(me.getAuthor());
            updateSavedLabel();
        }
    }//GEN-LAST:event_metaEditJButtonActionPerformed

    private void patternsJTableValueChanged(javax.swing.event.ListSelectionEvent evt) {
    }
    
    private void updateTable() {
        Object[] titles = {"Code", "Text"};
        model = (AbstractTableModel) new DefaultTableModel(patterns.getModelArray(), titles) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        patternsJTable.setModel(model);
        model.fireTableDataChanged();
    }
    
    private void updateTable(int selection) {
        updateTable();
        patternsJTable.setRowSelectionInterval(selection, selection);
    }
    
    private void updateSavedLabel() {
        if (patterns.isSaved()) {
            savedJLabel.setText("Saved");
        } else {
            savedJLabel.setText("Unsaved");
        }
    }
    
    private void updateTextFields() {
        selected = patternsJTable.getSelectedRow();
        codeJTextField.setText(patterns.getOne(patternsJTable.getSelectedRow()).getCode());
        textJTextField.setText(patterns.getOne(patternsJTable.getSelectedRow()).getText());
        notesJTextArea.setText(patterns.getNotesString(patternsJTable.getSelectedRow()));
    }
    
    private void exit() {
        new MainMenuJFrame().setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton metaEditJButton;
    private javax.swing.JButton newLineJButton;
    private javax.swing.JTextArea notesJTextArea;
    private javax.swing.JTable patternsJTable;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel savedJLabel;
    private javax.swing.JTextField textJTextField;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
