package models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "entreprise")
public class Entreprise implements Serializable {

    @Id
    @Column(name = "num_entreprise")
    @Basic(optional = false)
    private Integer numEntreprise;

    @Column(name = "raison_sociale")
    private String raisonSociale;

    @Column(name = "nom_contact")
    private String nomContact;

    @Column(name = "nom_resp")
    private String Nom_Resp;

    @Column(name = "rue_entreprise")
    private String rueEntreprise;

    @Column(name = "cp_entreprise")
    private Integer cpEntreprise;

    @Column(name = "ville_entreprise")
    private String villeEntreprise;

    @Column(name = "tel_entreprise")
    private String telEntreprise;

    @Column(name = "fax_entreprise")
    private String faxEntreprise;

    @Column(name = "email")
    private String Email;

    @Column(name = "observation")
    private String Observation;

    @Column(name = "site_entreprise")
    private String siteEntreprise;

    @Column(name = "niveau")
    private String Niveau;

    @Column(name = "en_activite")
    private Integer enActicité;

    public Integer getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(Integer numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getNom_Resp() {
        return Nom_Resp;
    }

    public void setNom_Resp(String nom_Resp) {
        Nom_Resp = nom_Resp;
    }

    public String getRueEntreprise() {
        return rueEntreprise;
    }

    public void setRueEntreprise(String rueEntreprise) {
        this.rueEntreprise = rueEntreprise;
    }

    public Integer getCpEntreprise() {
        return cpEntreprise;
    }

    public void setCpEntreprise(Integer cpEntreprise) {
        this.cpEntreprise = cpEntreprise;
    }

    public String getVilleEntreprise() {
        return villeEntreprise;
    }

    public void setVilleEntreprise(String villeEntreprise) {
        this.villeEntreprise = villeEntreprise;
    }

    public String getTelEntreprise() {
        return telEntreprise;
    }

    public void setTelEntreprise(String telEntreprise) {
        this.telEntreprise = telEntreprise;
    }

    public String getFaxEntreprise() {
        return faxEntreprise;
    }

    public void setFaxEntreprise(String faxEntreprise) {
        this.faxEntreprise = faxEntreprise;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public String getSiteEntreprise() {
        return siteEntreprise;
    }

    public void setSiteEntreprise(String siteEntreprise) {
        this.siteEntreprise = siteEntreprise;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String niveau) {
        Niveau = niveau;
    }

    public Integer getEnActicité() {
        return enActicité;
    }

    public void setEnActicité(Integer enActicité) {
        this.enActicité = enActicité;
    }
}
