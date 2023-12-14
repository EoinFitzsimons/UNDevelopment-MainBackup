/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package undevelopment;

//import undevelopment.IntegrationsFolder.cardGame;




import undevelopment.adaptabilityFolder.CrosswordUsers;
import undevelopment.IntegrationsFolder.cardGame;


/**
 *
 * @author everyone, david came up with the tab idea, eoin closed the menu and fixed menu bugs.
 */
public class UNDevelopmentMainMenuGUI extends javax.swing.JFrame {


    /**
     * Creates new form UNDevelopmentMainMenuGUI
     */
    public UNDevelopmentMainMenuGUI() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePane = new javax.swing.JLayeredPane();
        backgroundPane = new javax.swing.JPanel();
        backgroundIMG = new javax.swing.JLabel();
        awarenessPane = new javax.swing.JLayeredPane();
        awarenessBackground = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        awarenessLoad = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayAwareness = new javax.swing.JTextArea();
        adaptabilityPane = new javax.swing.JLayeredPane();
        adaptabilityBackground = new javax.swing.JPanel();
        AdaptabilityAppBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cwsTA = new javax.swing.JTextArea();
        deleteBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        integrationPane = new javax.swing.JLayeredPane();
        backgroundIntegration = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loadIntegrationApp = new javax.swing.JButton();
        loadBrief = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        displayText = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        backgroundPane.setMinimumSize(new java.awt.Dimension(800, 600));

        backgroundIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/OOP Background.png"))); // NOI18N

        javax.swing.GroupLayout backgroundPaneLayout = new javax.swing.GroupLayout(backgroundPane);
        backgroundPane.setLayout(backgroundPaneLayout);
        backgroundPaneLayout.setHorizontalGroup(
            backgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPaneLayout.setVerticalGroup(
            backgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        homePane.setLayer(backgroundPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout homePaneLayout = new javax.swing.GroupLayout(homePane);
        homePane.setLayout(homePaneLayout);
        homePaneLayout.setHorizontalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePaneLayout.createSequentialGroup()
                .addComponent(backgroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homePaneLayout.setVerticalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePaneLayout.createSequentialGroup()
                .addComponent(backgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", homePane);

        jLabel6.setText("jLabel6");

        awarenessLoad.setText("load awareness");
        awarenessLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                awarenessLoadMouseClicked(evt);
            }
        });
        awarenessLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awarenessLoadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Awareness Menu");

        displayAwareness.setColumns(20);
        displayAwareness.setRows(5);
        jScrollPane1.setViewportView(displayAwareness);

        javax.swing.GroupLayout awarenessBackgroundLayout = new javax.swing.GroupLayout(awarenessBackground);
        awarenessBackground.setLayout(awarenessBackgroundLayout);
        awarenessBackgroundLayout.setHorizontalGroup(
            awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awarenessBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(awarenessBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(awarenessBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addComponent(awarenessLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(awarenessBackgroundLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        awarenessBackgroundLayout.setVerticalGroup(
            awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, awarenessBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(awarenessBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(awarenessBackgroundLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(awarenessLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        awarenessPane.setLayer(awarenessBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout awarenessPaneLayout = new javax.swing.GroupLayout(awarenessPane);
        awarenessPane.setLayout(awarenessPaneLayout);
        awarenessPaneLayout.setHorizontalGroup(
            awarenessPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awarenessPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awarenessBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        awarenessPaneLayout.setVerticalGroup(
            awarenessPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, awarenessPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awarenessBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Awareness", awarenessPane);

        adaptabilityBackground.setBackground(new java.awt.Color(100, 150, 200));

        AdaptabilityAppBTN.setText("Load Adaptability App");
        AdaptabilityAppBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaptabilityAppBTNActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Adaptability Menu");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("This is a crossword whose hints are information regarding natural disasters.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("You should take what you learn from this crossword and be able to apply it in future.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("With this knowledege you will be more adaptable in the face of danger.");

        updateBTN.setText("Update Scores");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        cwsTA.setColumns(20);
        cwsTA.setRows(5);
        jScrollPane2.setViewportView(cwsTA);

        deleteBTN.setText("Delete Scores");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search Scores");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adaptabilityBackgroundLayout = new javax.swing.GroupLayout(adaptabilityBackground);
        adaptabilityBackground.setLayout(adaptabilityBackgroundLayout);
        adaptabilityBackgroundLayout.setHorizontalGroup(
            adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adaptabilityBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(adaptabilityBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(adaptabilityBackgroundLayout.createSequentialGroup()
                                .addComponent(updateBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN))
                            .addComponent(jScrollPane2)
                            .addComponent(AdaptabilityAppBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adaptabilityBackgroundLayout.setVerticalGroup(
            adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBTN)
                    .addComponent(deleteBTN)
                    .addComponent(searchBTN))
                .addGap(18, 18, 18)
                .addComponent(AdaptabilityAppBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adaptabilityPane.setLayer(adaptabilityBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout adaptabilityPaneLayout = new javax.swing.GroupLayout(adaptabilityPane);
        adaptabilityPane.setLayout(adaptabilityPaneLayout);
        adaptabilityPaneLayout.setHorizontalGroup(
            adaptabilityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptabilityPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptabilityBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        adaptabilityPaneLayout.setVerticalGroup(
            adaptabilityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptabilityBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Adaptability", adaptabilityPane);

        backgroundIntegration.setBackground(new java.awt.Color(100, 150, 200));
        backgroundIntegration.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Brief Information On Integration ");
        backgroundIntegration.add(jLabel3);
        jLabel3.setBounds(0, 6, 788, 50);

        loadIntegrationApp.setBackground(new java.awt.Color(229, 225, 205));
        loadIntegrationApp.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        loadIntegrationApp.setText("Load Integration App");
        loadIntegrationApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadIntegrationAppActionPerformed(evt);
            }
        });
        backgroundIntegration.add(loadIntegrationApp);
        loadIntegrationApp.setBounds(350, 500, 432, 57);

        loadBrief.setBackground(new java.awt.Color(229, 225, 205));
        loadBrief.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        loadBrief.setText("Brief About Game");
        loadBrief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBriefActionPerformed(evt);
            }
        });
        backgroundIntegration.add(loadBrief);
        loadBrief.setBounds(350, 410, 432, 57);

        displayText.setEditable(false);
        displayText.setBackground(new java.awt.Color(229, 225, 205));
        displayText.setColumns(20);
        displayText.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        displayText.setLineWrap(true);
        displayText.setRows(5);
        displayText.setText("Intregration for climate change is the number of countres that nationally determined contributions to national adaptation plans, long term strategies and adaptation communications. Intregrated land use planning is part of this to help improve our atmosphere. The integrated land strategy is to allocate land for different purposes, to balance social,\\n enviormental economic values at a national or sub-national levels. This is the process of supporting decision makers and land users in selectomg the best combination of land uses to ultimately meet multiple needs for people, while safeguardomg natural resources and ecosystem services");
        displayText.setWrapStyleWord(true);
        jScrollPane6.setViewportView(displayText);

        backgroundIntegration.add(jScrollPane6);
        jScrollPane6.setBounds(0, 90, 326, 460);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/intregation.png"))); // NOI18N
        backgroundIntegration.add(jLabel8);
        jLabel8.setBounds(350, 97, 432, 260);

        integrationPane.setLayer(backgroundIntegration, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout integrationPaneLayout = new javax.swing.GroupLayout(integrationPane);
        integrationPane.setLayout(integrationPaneLayout);
        integrationPaneLayout.setHorizontalGroup(
            integrationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, integrationPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundIntegration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        integrationPaneLayout.setVerticalGroup(
            integrationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundIntegration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Integration", integrationPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadIntegrationAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadIntegrationAppActionPerformed
        // TODO add your handling code here:
        IntegrationsUI load = new IntegrationsUI();
        load.setVisible(true);
        this.dispose();

        cardGame load1 = new cardGame();
        load1.scriptRunner();

    }//GEN-LAST:event_loadIntegrationAppActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        //calls eoin's search method from his leaderboard fuction class called crossword users, repeated below for others
        CrosswordUsers search = new CrosswordUsers();
        search.search();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        CrosswordUsers delete = new CrosswordUsers();
        delete.delete();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        CrosswordUsers update = new CrosswordUsers();
        update.update();
    }//GEN-LAST:event_updateBTNActionPerformed


    private void AdaptabilityAppBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaptabilityAppBTNActionPerformed
        // TODO add your handling code here:
        //loads eoin's crossword and closes main menu

        AdaptabilityGUI load = new AdaptabilityGUI();
        load.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_AdaptabilityAppBTNActionPerformed

    private void awarenessLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awarenessLoadActionPerformed
        // TODO add your handling code here:

        AwarenessGUI load = new AwarenessGUI();
        load.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_awarenessLoadActionPerformed

    private void awarenessLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_awarenessLoadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_awarenessLoadMouseClicked

       

    private void loadBriefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBriefActionPerformed
        // TODO add your handling code here:
        BriefAboutGame load = new BriefAboutGame();
        load.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_loadBriefActionPerformed


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
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UNDevelopmentMainMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdaptabilityAppBTN;
    private javax.swing.JPanel adaptabilityBackground;
    private javax.swing.JLayeredPane adaptabilityPane;
    private javax.swing.JPanel awarenessBackground;
    private javax.swing.JButton awarenessLoad;
    private javax.swing.JLayeredPane awarenessPane;
    private javax.swing.JLabel backgroundIMG;
    private javax.swing.JPanel backgroundIntegration;
    private javax.swing.JPanel backgroundPane;
    public static javax.swing.JTextArea cwsTA;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextArea displayAwareness;
    private javax.swing.JTextArea displayText;
    private javax.swing.JLayeredPane homePane;
    private javax.swing.JLayeredPane integrationPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadBrief;
    private javax.swing.JButton loadIntegrationApp;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}