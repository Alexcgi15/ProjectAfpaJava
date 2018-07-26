
import Classe.Absence;
import DAO.AbsenceDAO;
import Metier.Outils;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class EC_Congés_modif extends javax.swing.JPanel {
       String id_local;
       Date d1 = null;
       Date d2 = null;
    /**
     * Creates new form EC_Dermande_Congés
     */
    public EC_Congés_modif() {
        initComponents();
    }

    
    public void affiche_absence(String id){
        id_local = id;
        
       AbsenceDAO repo = new AbsenceDAO();
       Absence a = repo.list_by_id(Integer.parseInt(id));
       
      ec_conges_date_debut.setDate(a.getDate_debut());
      ec_conges_date_fin.setDate(a.getDate_fin());
      ec_type_conges_ComboBox.setSelectedItem(a.getType());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        ec_conges_nbre_jours_posés = new javax.swing.JTextField();
        ec_solde_cp = new javax.swing.JTextField();
        ec_solde_rtt = new javax.swing.JTextField();
        ec_type_conges_ComboBox = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ec_solde_cp_restant = new javax.swing.JTextField();
        ec_solde_rtt_restant = new javax.swing.JTextField();
        ec_conges_date_debut = new com.toedter.calendar.JDateChooser();
        ec_conges_date_fin = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demande de congés", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Solde CP en jours :");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Solde RTT en jours :");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Date du premier jours de congés :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Date du dernier jours de congés :");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Type de congés :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Nombre de jours de congés posés :");

        ec_type_conges_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CP", "RTT", "Sans solde" }));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Solde RTT restant en jours :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Solde CP restant en jours :");

        ec_conges_date_debut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ec_conges_date_debutPropertyChange(evt);
            }
        });

        ec_conges_date_fin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ec_conges_date_finPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ec_conges_nbre_jours_posés, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(ec_type_conges_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ec_solde_cp)
                            .addComponent(ec_solde_rtt)
                            .addComponent(ec_conges_date_debut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ec_conges_date_fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ec_solde_cp_restant, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(ec_solde_rtt_restant))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_solde_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_solde_rtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_conges_date_debut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_conges_date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_type_conges_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ec_conges_nbre_jours_posés, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_solde_cp_restant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ec_solde_rtt_restant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Valider");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
           
       Absence a = new Absence();  
       
       a.setId(Integer.parseInt(id_local));
       
       String conges_date_debut="";
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       conges_date_debut = sdf.format(ec_conges_date_debut.getDate());
       java.sql.Date sqlconges_date_debut = java.sql.Date.valueOf( conges_date_debut );
       a.setDate_debut(sqlconges_date_debut);
        System.out.println(sqlconges_date_debut);
       
       String conges_date_fin="";
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
       conges_date_fin = sdf1.format(ec_conges_date_fin.getDate());
       java.sql.Date sqlconges_date_fin = java.sql.Date.valueOf( conges_date_fin );
       a.setDate_fin(sqlconges_date_fin);
        System.out.println(sqlconges_date_fin);
       
       a.setType((String)ec_type_conges_ComboBox.getSelectedItem());
      
      java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
      a.setDate_pose(date);
       
       a.setIndemnites(02.12);
       a.setId_personnel(26);
       
       AbsenceDAO repo = new AbsenceDAO();
       AbsenceDAO res = new AbsenceDAO();
       
       boolean conges_correct = true;
       for(Classe.Absence p: res.list()){
           System.out.println(id_local);
           System.out.println(p.getId());
           System.out.println("------------------");
           if (Integer.parseInt(id_local) != p.getId()) {
            if (Outils.Validationconges(sqlconges_date_debut, sqlconges_date_fin, p.getDate_debut(), p.getDate_fin()) == false) {
                conges_correct = false;
            }
           }
       }
       
       if (conges_correct == true) {
           System.out.println("OK");
            repo.update(a);
            
            JOptionPane.showMessageDialog(null,"Modification réussi !","Informations",JOptionPane.INFORMATION_MESSAGE);
            
            Structure main = (Structure)SwingUtilities.getWindowAncestor(this);
        
            main.Afficher_Conges();
       }
       else {
           JOptionPane.showMessageDialog(null,"Cette date chevauche une demande existante","Erreur",JOptionPane.ERROR_MESSAGE);
       }
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void ec_conges_date_finPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ec_conges_date_finPropertyChange
        // TODO add your handling code here:
        if ("date".equals(evt.getPropertyName())) {
                System.out.println(evt.getPropertyName()
                    + ": " + (Date)evt.getNewValue());
                d1 = (Date)evt.getNewValue();
            }
        if (d1!=null && d2!=null) {
       Instant start = ec_conges_date_debut.getDate().toInstant();
       Instant end =  ec_conges_date_fin.getDate().toInstant();
       
       Duration duration = Duration.between(start, end);
       
       ec_conges_nbre_jours_posés.setText(String.valueOf(duration.toDays()+1));
       System.out.println(duration.toDays());
        }
    }//GEN-LAST:event_ec_conges_date_finPropertyChange

    private void ec_conges_date_debutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ec_conges_date_debutPropertyChange
        // TODO add your handling code here:
        if ("date".equals(evt.getPropertyName())) {
                System.out.println(evt.getPropertyName()
                    + ": " + (Date)evt.getNewValue());
                d2 = (Date)evt.getNewValue();
            }
        
        if (d1!=null && d2!=null) {
       Instant start = ec_conges_date_debut.getDate().toInstant();
       Instant end =  ec_conges_date_fin.getDate().toInstant();
       Duration duration = Duration.between(start, end);
       
       ec_conges_nbre_jours_posés.setText(String.valueOf(duration.toDays()+1));
       System.out.println(duration.toDays());

        }

    }//GEN-LAST:event_ec_conges_date_debutPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ec_conges_date_debut;
    private com.toedter.calendar.JDateChooser ec_conges_date_fin;
    private javax.swing.JTextField ec_conges_nbre_jours_posés;
    private javax.swing.JTextField ec_solde_cp;
    private javax.swing.JTextField ec_solde_cp_restant;
    private javax.swing.JTextField ec_solde_rtt;
    private javax.swing.JTextField ec_solde_rtt_restant;
    private javax.swing.JComboBox<String> ec_type_conges_ComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
