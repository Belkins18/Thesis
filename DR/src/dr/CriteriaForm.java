package dr;

import dr.calculate.firstEtap.ThirdStep;
import dr.calculate.firstEtap.TranstormMatrix;
import dr.calculate.secondtEtap.BLCriteria;
import dr.calculate.secondtEtap.GCriteria;
import dr.calculate.secondtEtap.HLCriteria;
import dr.calculate.secondtEtap.HWCriteria;
import dr.calculate.secondtEtap.MMCriteria;
import dr.calculate.secondtEtap.MinusMatrix;
import dr.calculate.secondtEtap.MultCriteria;
import dr.calculate.secondtEtap.SCriteria;
import dr.criteria.BLCriteriaForm;
import dr.criteria.GCriteriaForm;
import dr.criteria.HLCriteriaForm;
import dr.criteria.HWCriteriaForm;
import dr.criteria.MMCriteriaForm;
import dr.criteria.SCriteriaForm;
import java.util.Arrays;

public class CriteriaForm extends javax.swing.JFrame {

    public CriteriaForm() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("GOST type A", 3, 24)); // NOI18N
        jLabel1.setText("Вибір критерію для розрахунку");
        jLabel1.setToolTipText("");
        jLabel1.setName(""); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("MM Критерій");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("BL Критерій");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("S Критерій");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("HW Критерій");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 255, 51));
        jButton6.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("HL Критерій");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 255, 51));
        jButton7.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("G Критерій");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 255, 51));
        jButton8.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("П Критерій");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton5, jButton6, jButton7, jButton8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton5, jButton6, jButton7, jButton8});

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton4.setText("Hide!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//==============================================================================" + "\n");
        System.out.println("//=== MiniMax Criteria ===" + "\n");
        MMCriteria mmCriteria = new MMCriteria();
        mmCriteria.setMinI(tm.getTM());
        mmCriteria.setRes(mmCriteria.getMinI());
        mmCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");

        MMCriteriaForm mmCriteriaForm = new MMCriteriaForm();
        mmCriteriaForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//==============================================================================" + "\n");
        System.out.println("//=== BL Criteria ===" + "\n");
        BLCriteria blCriteria = new BLCriteria();
        blCriteria.setSumeqI(tm.getTM());
        blCriteria.setRes(blCriteria.getSumeqI());
        blCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");

        BLCriteriaForm blCriteriaForm = new BLCriteriaForm();
        blCriteriaForm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//=== S Criteria ===" + "\n");
        SCriteria sCriteria = new SCriteria();
        MinusMatrix minusMatrix = new MinusMatrix();
        minusMatrix.setMinusMatrix(tm.getTM());
        sCriteria.setMaxJ(minusMatrix.getMinusMatrix());
//        sCriteria.getMaxJ();
        sCriteria.setMatrixZal(minusMatrix.getMinusMatrix(), sCriteria.getMaxJ());
//        sCriteria.PrintResult(sCriteria.getMatrixZal());
        sCriteria.setER(sCriteria.getMatrixZal());
        sCriteria.setResult(sCriteria.getER());
        sCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");

        SCriteriaForm sCriteriaForm = new SCriteriaForm();
        sCriteriaForm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        this.setResizable(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//=== HW Criteria ===" + "\n");
        HWCriteria hwCriteria = new HWCriteria();
        hwCriteria.setMinI(tm.getTM());
        hwCriteria.setMaxI(tm.getTM());
        hwCriteria.setEr(hwCriteria.getMinI(), hwCriteria.getMaxI());
        hwCriteria.setRes(hwCriteria.getEr());
        hwCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");

        HWCriteriaForm hwCriteriaForm = new HWCriteriaForm();
        hwCriteriaForm.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//=== HL Criteria ===" + "\n");
        HLCriteria hLCriteria = new HLCriteria();
        hLCriteria.setSumeqI(tm.getTM());
        hLCriteria.setMinI(tm.getTM());
        hLCriteria.setEr(hLCriteria.getSumeqI(), hLCriteria.getMinI());
        hLCriteria.setRes(hLCriteria.getEr());
        hLCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");

        HLCriteriaForm hlCriteriaForm = new HLCriteriaForm();
        hlCriteriaForm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//=== G Criteria ===" + "\n");
        GCriteria gCriteria = new GCriteria();
        MinusMatrix minusMatrix = new MinusMatrix();
        minusMatrix.setMinusMatrix(tm.getTM());
        gCriteria.setInputValue(minusMatrix.getMinusMatrix());
//         gCriteria.setInputValue(tm.getTM());
        gCriteria.setMinI(gCriteria.getInputValue());
        System.out.println(Arrays.deepToString(gCriteria.getInputValue()));
        gCriteria.setRes(gCriteria.getMinI());
        gCriteria.getResult();

        GCriteriaForm gCriteriaForm = new GCriteriaForm();
        gCriteriaForm.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
        System.out.println("//==============================================================================" + "\n");
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        MinusMatrix minusMatrix = new MinusMatrix();
        minusMatrix.setMinusMatrix(tm.getTM());
        System.out.println("//=== П Criteria ===" + "\n");
        MultCriteria multCriteria = new MultCriteria();
        multCriteria.setA(minusMatrix.getMinusMatrix());
//         multCriteria.setA(tm.getTM());
//         multCriteria.getA();
        multCriteria.setMatrix(minusMatrix.getMinusMatrix(), multCriteria.getA());
//         multCriteria.getMatrix();
        multCriteria.setMult(multCriteria.getMatrix());
        multCriteria.getMult();
        System.out.println(Arrays.toString(multCriteria.getMult()));
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(CriteriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriteriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriteriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriteriaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriteriaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
