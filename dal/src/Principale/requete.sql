/*Liste des congés par collaborateur*/

select absence.id,absence.date_debut,absence.date_fin,absence."type",absence.date_pose,absence.date_validation,absence.indemnites,personnel.nom,personnel.prenom from absence
join personnel on personnel.id = absence.id_personnel
where personnel.nom='gris';

/*Liste des congés par service*/

select absence.id,absence.date_debut,absence.date_fin,absence."type",absence.date_pose,absence.date_validation,absence.indemnites,personnel.nom,personnel.prenom from absence
join personnel on personnel.id = absence.id_personnel
join centre_cout on centre_cout.id = personnel.id_centre_cout
where centre_cout.service ='logistique';


/*Liste collaborateur par responsable*/

select personnel.nom, personnel.prenom, centre_cout.service, centre_cout.code_service, centre_cout.responsable
from personnel
join centre_cout on centre_cout.id = personnel.id_centre_cout
where centre_cout.responsable = 'caumartin';


/*Liste collaborateur  par entreprise*/

select personnel.nom, personnel.prenom, centre_cout.service, centre_cout.code_service, centre_cout.responsable
from personnel
join centre_cout on centre_cout.id = personnel.id_centre_cout

/*fiche de paie*/

select coefficient,salaire_annuel_brut,taux_horaire,base_horaire,prime,date_prime,AI,date_AI,AG,date_AG,type_de_contrat,nom_entrprise,
personnel.service,personnel.nom,personnel.prenom,personnel.adresse,personnel.cp,personnel.ville,personnel.statut,personnel.date_embauche,personnel.poste,personnel.qualification,
charges_cotisations.sante,charges_cotisations.ss,charges_cotisations.comp_incap_inval_deces,charges_cotisations.comp_sante,charges_cotisations.at_mp,charges_cotisations.retraite,charges_cotisations.ss_plaf,charges_cotisations.ss_deplaf,charges_cotisations.comp_ta,charges_cotisations.comp_gmp,charges_cotisations.comp_tb,charges_cotisations.comp_tc,charges_cotisations.comp_t1,charges_cotisations.comp_t2,charges_cotisations.sup,charges_cotisations.famille_ss,charges_cotisations.assu_chom,charges_cotisations.chomage,charges_cotisations.apec,charges_cotisations.cotisations_statutaires,charges_cotisations.autres_contribution,charges_cotisations.csg_non_ir,charges_cotisations.csg_crds_ir,charges_cotisations.allegement_cotisations
from salaire
join personnel on personnel.id = salaire.id_personnel
join charges_cotisations on charges_cotisations.id=salaire.id_charges_cotisations;

