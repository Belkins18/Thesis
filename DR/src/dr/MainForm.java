package dr;

import dr.calculate.firstEtap.FirstStep;
import dr.calculate.firstEtap.SecondStep;
import dr.calculate.firstEtap.ThirdStep;
import dr.calculate.firstEtap.TranstormMatrix;
import dr.variables.FullGroupIvents;
import dr.variables.Variables;
import java.util.Arrays;
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        initTextFields();
        this.setResizable(false);
    }

    public void initTextFields() {
        jTextField1.setText("32000");
        jTextField2.setText("42000");
        jTextField3.setText("4.97");
        jTextField4.setText("12");
        jTextField5.setText("19.79");
        jTextField6.setText("21.77");
        jTextField7.setText("0.857");
        jTextField8.setText("1.03");
        jTextField9.setText("23.75");
        jTextField10.setText("27.31");
        jTextField11.setText("27.00");
        jTextField12.setText("30.52");
        jTextField13.setText("0.98");
        jTextField14.setText("1.0");
        jTextField15.setText("0.94");
        jTextField16.setText("0.96");
        jTextField17.setText("0.95");
        jTextField18.setText("1.0");
        jTextField19.setText("0.85");
        jTextField20.setText("0.9");
        jTextField21.setText("0.002");
        jTextField22.setText("0.001");
        jTextField23.setText("0.0365");
        jTextField24.setText("0.0183");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("D2");
        jLabel1.setMaximumSize(new java.awt.Dimension(20, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(20, 50));

        jTextField1.setText("jTextField1");
        jTextField1.setMaximumSize(null);
        jTextField1.setMinimumSize(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(150, 22));

        jTextField2.setText("jTextField1");

        jLabel2.setText("D4");

        jTextField3.setText("jTextField1");

        jLabel3.setText("Ch");

        jTextField4.setText("jTextField1");

        jLabel4.setText("Co");

        jTextField5.setText("jTextField1");

        jLabel5.setText("Cnl");

        jTextField8.setText("jTextField1");

        jLabel6.setText("dCnzip");

        jLabel7.setText("dCszip");

        jTextField6.setText("jTextField1");

        jTextField10.setText("jTextField1");

        jLabel8.setText("Cnh");

        jLabel9.setText("CsIl");

        jLabel10.setText("CsIh");

        jTextField9.setText("jTextField1");

        jTextField7.setText("jTextField1");

        jTextField13.setText("jTextField1");
        jTextField13.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel11.setText("CsIIh");

        jLabel12.setText("a1plus");

        jTextField11.setText("jTextField1");

        jTextField15.setText("jTextField1");
        jTextField15.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel13.setText("CsIIl");

        jLabel14.setText("a1plusZip");

        jLabel15.setText("a1minus");

        jTextField14.setText("jTextField1");
        jTextField14.setPreferredSize(new java.awt.Dimension(150, 20));

        jTextField12.setText("jTextField1");

        jTextField18.setText("jTextField1");
        jTextField18.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel16.setText("a2plus");

        jLabel17.setText("a2plusZip");

        jTextField16.setText("jTextField1");
        jTextField16.setPreferredSize(new java.awt.Dimension(150, 20));

        jTextField20.setText("jTextField1");
        jTextField20.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel18.setText("a1minusZip");

        jLabel19.setText("a2minus");

        jLabel20.setText("a2minusZip");

        jTextField19.setText("jTextField1");
        jTextField19.setPreferredSize(new java.awt.Dimension(150, 20));

        jTextField17.setText("jTextField1");
        jTextField17.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel21.setText("dE");

        jLabel22.setText("Enzip");

        jTextField23.setText("jTextField1");
        jTextField23.setPreferredSize(new java.awt.Dimension(150, 20));

        jTextField21.setText("jTextField1");
        jTextField21.setPreferredSize(new java.awt.Dimension(150, 22));

        jLabel23.setText("dEzip");

        jTextField24.setText("jTextField1");
        jTextField24.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel25.setText("En");

        jTextField22.setText("jTextField1");
        jTextField22.setPreferredSize(new java.awt.Dimension(150, 20));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("GOST type A", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Розрахувати");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField7)
                    .addComponent(jTextField6)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10)
                    .addComponent(jTextField11)
                    .addComponent(jTextField12)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15, jTextField16, jTextField17, jTextField18, jTextField19, jTextField2, jTextField20, jTextField21, jTextField22, jTextField23, jTextField24, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel23)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15, jTextField16, jTextField17, jTextField18, jTextField19, jTextField2, jTextField20, jTextField21, jTextField22, jTextField23, jTextField24, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9});

        jLabel24.setFont(new java.awt.Font("GOST type A", 3, 24)); // NOI18N
        jLabel24.setText("Вхідні значення для розрахунку");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("GOST type A", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(70, 70, 70)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dr.variables.Variables variables = new Variables();
        variables.setD2(Integer.parseInt(jTextField1.getText()));
        variables.setD4(Integer.parseInt(jTextField2.getText()));
        variables.setCh(Double.parseDouble(jTextField3.getText()));
        variables.setCo(Integer.parseInt(jTextField4.getText()));
        variables.setCnl(Double.parseDouble(jTextField5.getText()));
        variables.setCnh(Double.parseDouble(jTextField6.getText()));
        variables.setdCnzip(Double.parseDouble(jTextField7.getText()));
        variables.setdCszip(Double.parseDouble(jTextField8.getText()));
        variables.setCsIl(Double.parseDouble(jTextField9.getText()));
        variables.setCsIh(Double.parseDouble(jTextField10.getText()));
        variables.setCsIIl(Double.parseDouble(jTextField11.getText()));
        variables.setCsIIh(Double.parseDouble(jTextField12.getText()));
        //alpha paramerts
        variables.setA1plus(Double.parseDouble(jTextField13.getText()));
        variables.setA1plusZip(Double.parseDouble(jTextField14.getText()));
        variables.setA1minus(Double.parseDouble(jTextField15.getText()));
        variables.setA1minusZip(Double.parseDouble(jTextField16.getText()));

        variables.setA2plus(Double.parseDouble(jTextField17.getText()));
        variables.setA2plusZip(Double.parseDouble(jTextField18.getText()));
        variables.setA2minus(Double.parseDouble(jTextField19.getText()));
        variables.setA2minusZip(Double.parseDouble(jTextField20.getText()));
        //
        variables.setEn(Double.parseDouble(jTextField21.getText()));
        variables.setEnzip(Double.parseDouble(jTextField22.getText()));
        variables.setdE(Double.parseDouble(jTextField23.getText()));
        variables.setdEzip(Double.parseDouble(jTextField24.getText()));

        dr.variables.FullGroupIvents fullGroupIvents = new FullGroupIvents();
        fullGroupIvents.setA1(variables.getA1plus(), variables.getA1minus());
        fullGroupIvents.setA2(variables.getA2plus(), variables.getA2minus());
        fullGroupIvents.setA1z(variables.getA1plusZip(), variables.getA1minus());
        fullGroupIvents.setA2z(variables.getA2plusZip(), variables.getA2minusZip());

        fullGroupIvents.setCs1(variables.getCsIl(), variables.getCsIh());
        fullGroupIvents.setCs2(variables.getCsIIl(), variables.getCsIIh());
        fullGroupIvents.setCn(variables.getCnl(), variables.getCnh());

        //        fullGroupIvents.setD(variables.getD2(), variables.getD4());
        System.out.println("a1 = " + Arrays.toString(fullGroupIvents.getA1()) + ";");
        System.out.println("a2 = " + Arrays.toString(fullGroupIvents.getA2()) + ";");
        System.out.println("a1z = " + Arrays.toString(fullGroupIvents.getA1z()) + ";");
        System.out.println("a2z = " + Arrays.toString(fullGroupIvents.getA2z()) + ";");
        System.out.println("");
        System.out.println("Cs1 = " + Arrays.toString(fullGroupIvents.getCs1()) + ";");
        System.out.println("Cs2 = " + Arrays.toString(fullGroupIvents.getCs2()) + ";");
        System.out.println("Cn = " + Arrays.toString(fullGroupIvents.getCn()) + ";");
        //        System.out.println("D = " + Arrays.toString(fullGroupIvents.getD()) + ";");
        System.out.println("");
        System.out.print("//==============================================================================" + "\n");

//==============================================================================
        dr.calculate.firstEtap.FirstStep fs = new FirstStep();
        fs.setXO(variables.getCo(), variables.getD2(), variables.getD4(), variables.getCh(),
                fullGroupIvents.getA1(), fullGroupIvents.getA2(), fullGroupIvents.getA1z(), fullGroupIvents.getA2z(),
                fullGroupIvents.getCs1(), fullGroupIvents.getCs2(),
                variables.getdE(), variables.getdEzip(), variables.getdCszip());
//        System.out.println(Arrays.deepToString(fs.getXO()));
        fs.PrintResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        dr.calculate.firstEtap.SecondStep ss = new SecondStep();
        ss.setYO(fullGroupIvents.getA1(), fullGroupIvents.getA2(), variables.getD2(), variables.getD4(),
                fullGroupIvents.getCs1(), fullGroupIvents.getCs2(), fullGroupIvents.getCn(),
                variables.getEn(), variables.getdE(), variables.getCo(), variables.getCh(),
                fs.getXO());
//        System.out.println(Arrays.deepToString(ss.getYO()));
        ss.PrintResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================     
         dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
         ts.setZO(fullGroupIvents.getA1(), fullGroupIvents.getA2(), variables.getD2(), variables.getD4(),
                fullGroupIvents.getCs1(), fullGroupIvents.getCs2(), fullGroupIvents.getCn(),
                variables.getEn(), variables.getdE(), variables.getCo(), variables.getCh(),
                fs.getXO());
//        System.out.println(Arrays.deepToString(ts.getZO()));
        ts.PrintResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//==============================================================================" + "\n");
        
        
        StartDataForm startForm = new StartDataForm();
        startForm.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
