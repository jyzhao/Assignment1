/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Person;

/**
 *
 * @author zhaojiyuan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Person person;
    
    
    public MainJFrame() {
        initComponents();
        person = new Person();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        menuJPanel = new javax.swing.JPanel();
        personJButton = new javax.swing.JButton();
        addressJButton = new javax.swing.JButton();
        addressJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        personJButton.setText("Person");
        personJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personJButtonActionPerformed(evt);
            }
        });

        addressJButton.setText("Address");
        addressJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuJPanelLayout = new javax.swing.GroupLayout(menuJPanel);
        menuJPanel.setLayout(menuJPanelLayout);
        menuJPanelLayout.setHorizontalGroup(
            menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        menuJPanelLayout.setVerticalGroup(
            menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(personJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(addressJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jSplitPane1.setLeftComponent(menuJPanel);

        addressJPanel.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(addressJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personJButtonActionPerformed
        // TODO add your handling code here:
        PersonJPanel personJPanel = new PersonJPanel(person);
        jSplitPane1.setRightComponent(personJPanel);
        
    }//GEN-LAST:event_personJButtonActionPerformed

    private void addressJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJButtonActionPerformed
        // TODO add your handling code here:
        AddressJPanel addressJPanel = new AddressJPanel(person);
        jSplitPane1.setRightComponent(addressJPanel);
        
    }//GEN-LAST:event_addressJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addressJButton;
    private javax.swing.JPanel addressJPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel menuJPanel;
    private javax.swing.JButton personJButton;
    // End of variables declaration//GEN-END:variables
}
