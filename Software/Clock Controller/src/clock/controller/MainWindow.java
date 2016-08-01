/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clock.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author joshualange
 */
public class MainWindow extends javax.swing.JFrame {

    private ClockConnection clockConnection;
    private ClockProtocolCoder protocolCoder;
    private TimeWindow theTimeWindow;
    private ScheduleWindow theScheduleWindow;
    private BellsWindow theBellsWindow;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editScheduleButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        clockTimeButton = new javax.swing.JButton();
        ringBellsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clock Controller Main Window");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        editScheduleButton.setText("Edit Bell Schedule");
        editScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editScheduleButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("About");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        clockTimeButton.setText("Edit Clock Time");
        clockTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockTimeButtonActionPerformed(evt);
            }
        });

        ringBellsButton.setText("Ring Bells");
        ringBellsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringBellsButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(editScheduleButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 235, Short.MAX_VALUE)
                        .add(jButton3))
                    .add(clockTimeButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(ringBellsButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(clockTimeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(editScheduleButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(ringBellsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton3)
                    .add(jButton4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ringBellsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringBellsButtonActionPerformed
        if (theBellsWindow == null) {
            theBellsWindow = new BellsWindow();
        }
        theBellsWindow.setTheProtocolCoder(protocolCoder);
        theBellsWindow.setMw(this);
        theBellsWindow.setVisible(true);
    }//GEN-LAST:event_ringBellsButtonActionPerformed

    private void clockTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockTimeButtonActionPerformed
        if (this.theTimeWindow == null) {
            this.theTimeWindow = new TimeWindow();

        }
        theTimeWindow.setTheClockProtocolCoder(protocolCoder);
        theTimeWindow.setMw(this);
        theTimeWindow.setVisible(true);

    }//GEN-LAST:event_clockTimeButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (this.clockConnection != null) {
            this.clockConnection.disconnect();
        }
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void editScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editScheduleButtonActionPerformed
        if (this.theScheduleWindow == null) {
            this.theScheduleWindow = new ScheduleWindow();

        }
        this.theScheduleWindow.setTheProtocolCoder(protocolCoder);
        this.theScheduleWindow.setMw(this);
        theScheduleWindow.setVisible(true);
    }//GEN-LAST:event_editScheduleButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null, "Version " + ClockControllerMain.VERSION + "\n(c) 2014-2016 Josh Lange",
 "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (this.clockConnection != null) {
            this.clockConnection.disconnect();
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clockTimeButton;
    private javax.swing.JButton editScheduleButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton ringBellsButton;
    // End of variables declaration//GEN-END:variables

    void setConnection(ClockConnection clockConnection) {
        this.clockConnection = clockConnection;
        this.protocolCoder = new ClockProtocolCoder(this.clockConnection);
    }
}
