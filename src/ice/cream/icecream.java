/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JINEET DESAI
 */
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class icecream extends javax.swing.JFrame {
    

    /**
     * Creates new form icecream
     */
    public icecream() {
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

        bg = new javax.swing.ButtonGroup();
        tg = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        tabpane = new javax.swing.JTabbedPane();
        user = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        contact = new javax.swing.JLabel();
        tcontact = new javax.swing.JTextField();
        n1 = new javax.swing.JButton();
        homeicon = new javax.swing.JLabel();
        type = new javax.swing.JPanel();
        cone = new javax.swing.JRadioButton();
        cup = new javax.swing.JRadioButton();
        candy = new javax.swing.JRadioButton();
        j1 = new javax.swing.JLabel();
        n2 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        flavour = new javax.swing.JPanel();
        f1 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();
        f3 = new javax.swing.JRadioButton();
        f4 = new javax.swing.JRadioButton();
        f5 = new javax.swing.JRadioButton();
        n3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        toppings = new javax.swing.JPanel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        billing = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textshow = new javax.swing.JTextArea();
        generatebill = new javax.swing.JButton();
        cancelorder = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("NAME");

        contact.setText("CONTACT");

        tcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcontactActionPerformed(evt);
            }
        });

        n1.setText("NEXT>>");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        homeicon.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/homeimage.jpeg")); // NOI18N
        homeicon.setText("jLabel4");

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                        .addComponent(n1)
                        .addGap(33, 33, 33))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeicon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeicon, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(n1)
                .addGap(32, 32, 32))
        );

        tabpane.addTab("USER INFO", user);
	//tabpane.setEnabledAt(0,false);

        type.setBackground(new java.awt.Color(255, 255, 255));

        tg.add(cone);
        cone.setText("CONE");
        cone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cone.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/cone.jpg")); // NOI18N
        cone.setSelectedIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/tick.png")); // NOI18N
        cone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coneActionPerformed(evt);
            }
        });

        tg.add(cup);
        cup.setText("CUP");
        cup.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/cup.jpg")); // NOI18N
        cup.setSelectedIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/tick.png")); // NOI18N
        cup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupActionPerformed(evt);
            }
        });

        tg.add(candy);
        candy.setText("CANDY");
        candy.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/candy.jpg")); // NOI18N
        candy.setSelectedIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/tick.png")); // NOI18N
        candy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candyActionPerformed(evt);
            }
        });

        j1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 0, 102));
        j1.setText("CHOOSE THE TYPE OF ICE-CREAM...........");

        n2.setText("NEXT>>");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        p1.setText("<<PREVOIUS");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typeLayout = new javax.swing.GroupLayout(type);
        type.setLayout(typeLayout);
        typeLayout.setHorizontalGroup(
            typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typeLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j1)
                    .addGroup(typeLayout.createSequentialGroup()
                        .addGroup(typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(typeLayout.createSequentialGroup()
                                .addComponent(cone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cup, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(p1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(candy, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        typeLayout.setVerticalGroup(
            typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(j1)
                .addGap(35, 35, 35)
                .addGroup(typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(candy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2)
                    .addComponent(p1))
                .addGap(26, 26, 26))
        );

        tabpane.addTab("TYPE", type);

        flavour.setBackground(new java.awt.Color(0, 0, 0));

        bg.add(f1);
        f1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        f1.setForeground(new java.awt.Color(204, 0, 0));
        f1.setText("CHOCOLATE");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        bg.add(f2);
        f2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        f2.setForeground(new java.awt.Color(255, 51, 153));
        f2.setText("STAWBERRY");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        bg.add(f3);
        f3.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        f3.setForeground(new java.awt.Color(0, 102, 102));
        f3.setText("VANILLA");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        bg.add(f4);
        f4.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        f4.setForeground(new java.awt.Color(255, 255, 0));
        f4.setText("RAJBHOG");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        bg.add(f5);
        f5.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        f5.setForeground(new java.awt.Color(255, 102, 0));
        f5.setText("MANGO");
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        n3.setText("NEXT>>");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        jButton1.setText("<<PREVIOUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Rs 20 for any flavour.......");

        javax.swing.GroupLayout flavourLayout = new javax.swing.GroupLayout(flavour);
        flavour.setLayout(flavourLayout);
        flavourLayout.setHorizontalGroup(
            flavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flavourLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(flavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flavourLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(n3)
                        .addGap(26, 26, 26))
                    .addGroup(flavourLayout.createSequentialGroup()
                        .addGroup(flavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f5)
                            .addComponent(f4)
                            .addComponent(f3)
                            .addComponent(f2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(298, Short.MAX_VALUE))))
            .addGroup(flavourLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        flavourLayout.setVerticalGroup(
            flavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flavourLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(f1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(flavourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n3)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        tabpane.addTab("FLAVOURS", flavour);

        c1.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        c1.setText("CHOCOLATE CHIPS");
        c1.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/chocolate chips.jpg")); // NOI18N
        c1.setSelectedIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/tick.png")); // NOI18N
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        c2.setText("JELLY");
        c2.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/jelly.jpg")); // NOI18N
        c2.setSelectedIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/tick.png")); // NOI18N
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c3.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        c3.setText("DRY FRIUTS");
        c3.setIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/dryfruits.jpg")); // NOI18N
        c3.setSelectedIcon(new javax.swing.ImageIcon("/home/jineet/ice-cream/images/tick.png")); // NOI18N
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        jButton2.setText("NEXT>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Rs 10 per topping");

        javax.swing.GroupLayout toppingsLayout = new javax.swing.GroupLayout(toppings);
        toppings.setLayout(toppingsLayout);
        toppingsLayout.setHorizontalGroup(
            toppingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppingsLayout.createSequentialGroup()
                .addGroup(toppingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(c3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, toppingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(toppingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppingsLayout.setVerticalGroup(
            toppingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(toppingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toppingsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(toppingsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(toppingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toppingsLayout.createSequentialGroup()
                        .addComponent(c3)
                        .addContainerGap(112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppingsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))))
        );

        tabpane.addTab("TOPPINGS", toppings);

        textshow.setEditable(false);
        textshow.setColumns(20);
        textshow.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        textshow.setForeground(new java.awt.Color(0, 0, 153));
        textshow.setRows(5);
        jScrollPane1.setViewportView(textshow);

        generatebill.setText("GENERATE BILL");
        generatebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatebillActionPerformed(evt);
            }
        });

        cancelorder.setText("CANCEL ORDER");
        cancelorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billingLayout = new javax.swing.GroupLayout(billing);
        billing.setLayout(billingLayout);
        billingLayout.setHorizontalGroup(
            billingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addGroup(billingLayout.createSequentialGroup()
                        .addComponent(generatebill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelorder)
                        .addContainerGap())))
        );
        billingLayout.setVerticalGroup(
            billingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generatebill)
                    .addComponent(cancelorder))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        tabpane.addTab("BILLING", billing);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane)
        );
	for(int i=0;i<5;i++)
		tabpane.setEnabledAt(i,false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_coneActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_c2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_c1ActionPerformed

    private void tcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcontactActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tcontactActionPerformed

    private void cupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cupActionPerformed

    private void candyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_candyActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_f5ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_c3ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
        if(tname.getText()!=null && tcontact.getText().length()==10 )
            tabpane.setSelectedIndex(1);
        else
        {
            JOptionPane.showMessageDialog(tabpane,"PLEASE ENTER CORRECT DETAILS!!!","WARNING",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
        tabpane.setSelectedIndex(2);
    }//GEN-LAST:event_n2ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
        tabpane.setSelectedIndex(0);
    }//GEN-LAST:event_p1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     tabpane.setSelectedIndex(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
     tabpane.setSelectedIndex(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_n3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textshow.append("NAME:"+tname.getText()+"\n");
        textshow.append("CONTACT:"+tcontact.getText()+"\n");
        tname.setText("");
        tcontact.setText("");
        if(cone.isSelected())
        {
            textshow.append("TYPE:"+cone.getText()+"\n");
        }
        if(cup.isSelected())
        {
            textshow.append("TYPE:"+cup.getText()+"\n");
        }
        if(candy.isSelected())
        {
            textshow.append("TYPE:"+candy.getText()+"\n");
        }
        if(f1.isSelected())
        {
            textshow.append("FLAVOUR:"+f1.getText()+"\n");
        }
        if(f2.isSelected())
        {
            textshow.append("FLAVOUR:"+f2.getText()+"\n");
        }
        if(f3.isSelected())
        {
            textshow.append("FLAVOUR:"+f3.getText()+"\n");
        }
        if(f4.isSelected())
        {
            textshow.append("FLAVOUR:"+f4.getText()+"\n");
        }
        if(f5.isSelected())
        {
            textshow.append("FLAVOUR:"+f5.getText()+"\n");
        }
        if(c1.isSelected())
        {
            textshow.append("TOPPING:"+c1.getText()+"\n");
        }
        if(c2.isSelected())
        {
            textshow.append("TOPPING:"+c2.getText()+"\n");
        }
        if(c3.isSelected())
        {
            textshow.append("TOPPING:"+c3.getText()+"\n");
        }
        int totalcost=0;
        if((c1.isSelected() && c2.isSelected()) || (c1.isSelected() && c3.isSelected()) || (c3.isSelected() && c2.isSelected()))
            totalcost=80;
        else if(c1.isSelected() || c2.isSelected() || c3.isSelected())
            totalcost=70;
        else
            totalcost=60;
        textshow.append("TOTAL COST:"+totalcost+"\n");
        tabpane.setSelectedIndex(4);
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void generatebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatebillActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(tabpane,"Are you sure?");  
    if(a==JOptionPane.YES_OPTION){  
    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        try {
            BufferedWriter fr=new BufferedWriter(new FileWriter("logs.doc",true));
            fr.append("************"+"\n");
            fr.append(textshow.getText());
            fr.append("************"+"\n");
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(icecream.class.getName()).log(Level.SEVERE, null, ex);
        }
         JOptionPane.showMessageDialog(tabpane,"ORDER ACCECPTED","CONGO",JOptionPane.WARNING_MESSAGE);
        tabpane.setSelectedIndex(0);
    }
        
    }//GEN-LAST:event_generatebillActionPerformed

    private void cancelorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelorderActionPerformed
        // TODO add your handling code here:
        tname.setText("");
        tcontact.setText("");
        textshow.setText("");
        cone.setSelected(false);
        cup.setSelected(false);
        candy.setSelected(false);
        f1.setSelected(false);
        f2.setSelected(false);
        f3.setSelected(false);
        f4.setSelected(false);
        f5.setSelected(false);
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        tabpane.setSelectedIndex(0);
    }//GEN-LAST:event_cancelorderActionPerformed

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
            java.util.logging.Logger.getLogger(icecream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(icecream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(icecream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(icecream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new icecream().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JPanel billing;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JButton cancelorder;
    private javax.swing.JRadioButton candy;
    private javax.swing.JRadioButton cone;
    private javax.swing.JLabel contact;
    private javax.swing.JRadioButton cup;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.JRadioButton f3;
    private javax.swing.JRadioButton f4;
    private javax.swing.JRadioButton f5;
    private javax.swing.JPanel flavour;
    private javax.swing.JButton generatebill;
    private javax.swing.JLabel homeicon;
    private javax.swing.JLabel j1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JLabel name;
    private javax.swing.JButton p1;
    private javax.swing.JTabbedPane tabpane;
    public javax.swing.JTextField tcontact;
    private javax.swing.JTextArea textshow;
    private javax.swing.ButtonGroup tg;
    public javax.swing.JTextField tname;
    private javax.swing.JPanel toppings;
    private javax.swing.JPanel type;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
