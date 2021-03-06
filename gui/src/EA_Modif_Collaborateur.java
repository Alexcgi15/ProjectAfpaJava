import DAO.*;
import Classe.*;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
public class EA_Modif_Collaborateur extends javax.swing.JPanel {

    String id_local;
    /**
     * Creates new form AE_Modif_Collaborateur
     */
    public EA_Modif_Collaborateur() {
        initComponents();
        
        CentreCoutDAO repo = new CentreCoutDAO();
        for (CentreCout c : repo.list()) {
        ea_service_ComboBox.addItem(c.getService());
        } 
    }
    
    public void affiche_collaborateur(String id) {
        id_local = id;
        //Integer.parseInt(id);
        DAO.PersonnelDAO tab = new  DAO.PersonnelDAO();
        Classe.Personnel p = tab.List_By_id(Integer.parseInt(id));

        DAO.CentreCoutDAO cen = new CentreCoutDAO();
        Classe.CentreCout c = cen.List_By_id(p.getId_centre_cout());
        
        if (p.getSexe().equals("Homme")) {
            ea_homme_RadioButton.setSelected(true);
        } else {
            ea_femme_RadioButton.setSelected(true);
        }
        ea_nom.setText(p.getNom());
        ea_prenom.setText(p.getPrenom());
        ea_rue.setText(p.getAdresse());
        ea_code_postale.setText(String.valueOf(p.getCp()));
        ea_ville.setText(p.getVille());
        if(p.getSituation_perso().equals("Marié")){
         ea_marie_RadioButton.setSelected(true);
        }
        else if (p.getSituation_perso().equals("Veuf")){
         ea_veuf_RadioButton.setSelected(true);
        }
        else {
        ea_celibataire_RadioButton.setSelected(true);
        }
        ea_nbre_enfant_ComboBox.setSelectedItem(String.valueOf(p.getNb_enfant()));
        ea_date_naissance.setDate(p.getDate_naissance());
        ea_ville_naissance.setText(p.getLieu_naissance());
        ea_mail.setText(p.getMail());
        ea_telephone.setText(p.getTelephone());
        ea_service_ComboBox.setSelectedItem(c.getService());
        ea_poste.setText(p.getPoste());
        ea_niveau_etude.setText(p.getQualification());
        ea_specialite.setText(p.getSpecialite());
        ea_statut_ComboBox.setSelectedItem(p.getStatut());
        ea_date_embauche.setDate(p.getDate_embauche());
        ea_typecontrat.setSelectedItem(p.getType_contrat());
        ea_date_fin_embauche.setDate(p.getDate_fin_embauche());
        ea_cp.setText(String.valueOf(p.getSolde_CP()));
        ea_rtt.setText(String.valueOf(p.getSolde_RTT()));
        ea_identifiant.setText(p.getIdentifiant());
        ea_mdp.setText(p.getMdp());
        ea_commentaire.setText(p.getCommentaire());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexe = new javax.swing.ButtonGroup();
        situation = new javax.swing.ButtonGroup();
        ea_modif_collaborateur_perso = new javax.swing.JPanel();
        ea_prenom = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ea_nom = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ea_femme_RadioButton = new javax.swing.JRadioButton();
        ea_homme_RadioButton = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ea_rue = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ea_code_postale = new javax.swing.JTextField();
        ea_ville = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        ea_marie_RadioButton = new javax.swing.JRadioButton();
        ea_veuf_RadioButton = new javax.swing.JRadioButton();
        ea_celibataire_RadioButton = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        ea_nbre_enfant_ComboBox = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        ea_ville_naissance = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        ea_telephone = new javax.swing.JTextField();
        ea_mail = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        ea_date_naissance = new com.toedter.calendar.JDateChooser();
        ea_valider = new javax.swing.JButton();
        ea_ajout_collaborateur_pro = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        ea_service_ComboBox = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        ea_poste = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        ea_specialite = new javax.swing.JTextField();
        ea_niveau_etude = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        ea_statut_ComboBox = new javax.swing.JComboBox<>();
        ea_date_embauche = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        ea_typecontrat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ea_date_fin_embauche = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        ea_cp = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        ea_rtt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ea_identifiant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ea_mdp = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ea_commentaire = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(675, 514));

        ea_modif_collaborateur_perso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Renseignements Personnels", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        ea_modif_collaborateur_perso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ea_modif_collaborateur_perso.add(ea_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 28, 170, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Prénom :");
        ea_modif_collaborateur_perso.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 27, 53, 22));
        ea_modif_collaborateur_perso.add(ea_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 28, 170, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Nom :");
        ea_modif_collaborateur_perso.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 27, 53, 22));

        sexe.add(ea_femme_RadioButton);
        ea_femme_RadioButton.setText("Femme");
        ea_modif_collaborateur_perso.add(ea_femme_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 27, -1, -1));

        sexe.add(ea_homme_RadioButton);
        ea_homme_RadioButton.setText("Homme");
        ea_modif_collaborateur_perso.add(ea_homme_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 27, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Sexe :");
        ea_modif_collaborateur_perso.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 35, 22));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Rue :");
        ea_modif_collaborateur_perso.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 55, 35, 22));
        ea_modif_collaborateur_perso.add(ea_rue, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 56, 598, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Code postale :");
        ea_modif_collaborateur_perso.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 83, 81, 22));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Ville :");
        ea_modif_collaborateur_perso.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 83, 39, 22));
        ea_modif_collaborateur_perso.add(ea_code_postale, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 84, 98, -1));
        ea_modif_collaborateur_perso.add(ea_ville, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 84, 407, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Situation personnelle :");
        ea_modif_collaborateur_perso.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 111, 137, 22));

        situation.add(ea_marie_RadioButton);
        ea_marie_RadioButton.setText("Marié");
        ea_modif_collaborateur_perso.add(ea_marie_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 111, -1, -1));

        situation.add(ea_veuf_RadioButton);
        ea_veuf_RadioButton.setText("Veuf");
        ea_modif_collaborateur_perso.add(ea_veuf_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 111, -1, -1));

        situation.add(ea_celibataire_RadioButton);
        ea_celibataire_RadioButton.setText("Célibataire");
        ea_modif_collaborateur_perso.add(ea_celibataire_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 111, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Nombre d'enfants à charges :");
        ea_modif_collaborateur_perso.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 111, -1, 22));

        ea_nbre_enfant_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "Plus de 4" }));
        ea_modif_collaborateur_perso.add(ea_nbre_enfant_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 112, 147, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Date de naissance :");
        ea_modif_collaborateur_perso.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 139, 118, 22));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Ville de naissance :");
        ea_modif_collaborateur_perso.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 139, 118, 22));
        ea_modif_collaborateur_perso.add(ea_ville_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 140, 261, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Numéro téléphone :");
        ea_modif_collaborateur_perso.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 167, 118, 22));
        ea_modif_collaborateur_perso.add(ea_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 168, 261, -1));
        ea_modif_collaborateur_perso.add(ea_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 168, 210, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Email :");
        ea_modif_collaborateur_perso.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 167, -1, 22));
        ea_modif_collaborateur_perso.add(ea_date_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, -1));

        ea_valider.setText("Valider");
        ea_valider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ea_valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ea_validerMouseClicked(evt);
            }
        });

        ea_ajout_collaborateur_pro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Renseignements Professionnels", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Service :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Poste :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Niveau d'étude :");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Spécialité :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Statut :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Date d'embauche :");

        ea_statut_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cadre", "Employé", "ETAM" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Type de contrat");

        ea_typecontrat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CDI", "CDD", "Interimaire", "Stagiaire" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Date fin d'embauche");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Congés payés :");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("RTT :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Identifiant");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mot de passe");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Commentaire :");

        ea_commentaire.setColumns(20);
        ea_commentaire.setRows(5);
        jScrollPane1.setViewportView(ea_commentaire);

        javax.swing.GroupLayout ea_ajout_collaborateur_proLayout = new javax.swing.GroupLayout(ea_ajout_collaborateur_pro);
        ea_ajout_collaborateur_pro.setLayout(ea_ajout_collaborateur_proLayout);
        ea_ajout_collaborateur_proLayout.setHorizontalGroup(
            ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ea_ajout_collaborateur_proLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ea_service_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ea_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ea_niveau_etude, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ea_specialite, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ea_statut_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ea_date_embauche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(ea_typecontrat, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ea_date_fin_embauche, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ea_ajout_collaborateur_proLayout.createSequentialGroup()
                            .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ea_identifiant))
                                .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ea_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addGap(10, 10, 10)
                                    .addComponent(ea_rtt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ea_mdp)))
                            .addContainerGap()))
                    .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        ea_ajout_collaborateur_proLayout.setVerticalGroup(
            ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ea_service_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ea_poste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ea_niveau_etude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ea_specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ea_statut_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ea_date_embauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(ea_typecontrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ea_date_fin_embauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ea_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ea_ajout_collaborateur_proLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ea_rtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ea_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ea_mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ea_ajout_collaborateur_proLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ea_ajout_collaborateur_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(ea_valider))
                    .addComponent(ea_modif_collaborateur_perso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ea_modif_collaborateur_perso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ea_ajout_collaborateur_pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ea_valider)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ea_validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ea_validerMouseClicked
        
        Personnel p = new Personnel();
        DAO.CentreCoutDAO cen = new CentreCoutDAO();
        
        
        String nom_centre_cout = ea_service_ComboBox.getSelectedItem().toString();
        Classe.CentreCout c = cen.list_by_nom(nom_centre_cout);
        
        p.setId(Integer.parseInt(id_local));
        String sexe ="";
        if(ea_homme_RadioButton.isSelected()){
        sexe="Homme";
        }
        else if(ea_femme_RadioButton.isSelected()){
        sexe="Femme";
        };
        p.setSexe(sexe);
        p.setNom(ea_nom.getText());
        p.setPrenom(ea_prenom.getText());
        p.setAdresse(ea_rue.getText());
        p.setCp(Integer.parseInt(ea_code_postale.getText()));
        p.setVille(ea_ville.getText());
        String situation="";
        if(ea_marie_RadioButton.isSelected()){
        situation="Marié";
        }
        else if(ea_veuf_RadioButton.isSelected()){
        situation="Veuf";
        }
        else if(ea_celibataire_RadioButton.isSelected()){
        situation="Célibataire";
        }
        p.setSituation_perso(situation);
        
        p.setNb_enfant(Integer.parseInt((String) ea_nbre_enfant_ComboBox.getSelectedItem()));
        
        String date_naissance="";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date_naissance = sdf.format(ea_date_naissance.getDate());
        java.sql.Date sqlDate_naissance = java.sql.Date.valueOf( date_naissance );
        p.setDate_naissance(sqlDate_naissance);
        
        p.setLieu_naissance(ea_ville_naissance.getText());
        
        p.setMail(ea_mail.getText());
        
        p.setTelephone(ea_telephone.getText());
        
        p.setId_centre_cout(c.getId());
        
        p.setPoste(ea_poste.getText());
        
        p.setQualification(ea_niveau_etude.getText());
        
        p.setSpecialite(ea_specialite.getText());
        
        p.setStatut((String)ea_statut_ComboBox.getSelectedItem());
        
        String date_embauche="";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        date_embauche = sdf1.format(ea_date_embauche.getDate());
        java.sql.Date sqlDate_embauche = java.sql.Date.valueOf( date_embauche );
        p.setDate_embauche(sqlDate_embauche);
        
        p.setType_contrat((String)ea_typecontrat.getSelectedItem());
        
        String date_fin_embauche="";
        if(ea_date_fin_embauche.getDate()!=null){
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        date_fin_embauche = sdf2.format(ea_date_fin_embauche.getDate());
        java.sql.Date sqlDate_fin_embauche = java.sql.Date.valueOf( date_fin_embauche );
        p.setDate_fin_embauche(sqlDate_fin_embauche);}
        else p.setDate_fin_embauche(null);
        
        p.setSolde_CP(Integer.parseInt(ea_cp.getText()));
        
        p.setSolde_RTT(Integer.parseInt(ea_rtt.getText()));
        
        p.setIdentifiant(ea_identifiant.getText());
        
        p.setMdp(ea_mdp.getText());
        
        p.setCommentaire(ea_commentaire.getText());
        
        PersonnelDAO repo = new PersonnelDAO();
        
        repo.Update(p);
        
        JOptionPane.showMessageDialog(null,"Modification réussi !","Informations",JOptionPane.INFORMATION_MESSAGE);
        
        Structure main = (Structure)SwingUtilities.getWindowAncestor(this);
        
        main.Affiche_JTAB();
        
        
        
    }//GEN-LAST:event_ea_validerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ea_ajout_collaborateur_pro;
    private javax.swing.JRadioButton ea_celibataire_RadioButton;
    private javax.swing.JTextField ea_code_postale;
    private javax.swing.JTextArea ea_commentaire;
    private javax.swing.JTextField ea_cp;
    private com.toedter.calendar.JDateChooser ea_date_embauche;
    private com.toedter.calendar.JDateChooser ea_date_fin_embauche;
    private com.toedter.calendar.JDateChooser ea_date_naissance;
    private javax.swing.JRadioButton ea_femme_RadioButton;
    private javax.swing.JRadioButton ea_homme_RadioButton;
    private javax.swing.JTextField ea_identifiant;
    private javax.swing.JTextField ea_mail;
    private javax.swing.JRadioButton ea_marie_RadioButton;
    private javax.swing.JTextField ea_mdp;
    private javax.swing.JPanel ea_modif_collaborateur_perso;
    private javax.swing.JComboBox<String> ea_nbre_enfant_ComboBox;
    private javax.swing.JTextField ea_niveau_etude;
    private javax.swing.JTextField ea_nom;
    private javax.swing.JTextField ea_poste;
    private javax.swing.JTextField ea_prenom;
    private javax.swing.JTextField ea_rtt;
    private javax.swing.JTextField ea_rue;
    private javax.swing.JComboBox<String> ea_service_ComboBox;
    private javax.swing.JTextField ea_specialite;
    private javax.swing.JComboBox<String> ea_statut_ComboBox;
    private javax.swing.JTextField ea_telephone;
    private javax.swing.JComboBox<String> ea_typecontrat;
    private javax.swing.JButton ea_valider;
    private javax.swing.JRadioButton ea_veuf_RadioButton;
    private javax.swing.JTextField ea_ville;
    private javax.swing.JTextField ea_ville_naissance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup sexe;
    private javax.swing.ButtonGroup situation;
    // End of variables declaration//GEN-END:variables
}
