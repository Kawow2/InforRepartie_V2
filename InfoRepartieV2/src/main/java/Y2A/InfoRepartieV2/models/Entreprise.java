package Y2A.InfoRepartieV2.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
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
    private String nomResp;

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
    private Integer enActivite;

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

    public String getNomResp() {
        return nomResp;
    }

    public void setNomResp(String nomResp) {
        this.nomResp = nomResp;
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

    public Integer getEnActivite() {
        return enActivite;
    }

    public void setEnActivite(Integer enActicite) {
        this.enActivite = enActicite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entreprise that = (Entreprise) o;
        return Objects.equals(numEntreprise, that.numEntreprise) && Objects.equals(raisonSociale, that.raisonSociale) && Objects.equals(nomContact, that.nomContact) && Objects.equals(nomResp, that.nomResp) && Objects.equals(rueEntreprise, that.rueEntreprise) && Objects.equals(cpEntreprise, that.cpEntreprise) && Objects.equals(villeEntreprise, that.villeEntreprise) && Objects.equals(telEntreprise, that.telEntreprise) && Objects.equals(faxEntreprise, that.faxEntreprise) && Objects.equals(Email, that.Email) && Objects.equals(Observation, that.Observation) && Objects.equals(siteEntreprise, that.siteEntreprise) && Objects.equals(Niveau, that.Niveau) && Objects.equals(enActivite, that.enActivite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numEntreprise, raisonSociale, nomContact, nomResp, rueEntreprise, cpEntreprise, villeEntreprise, telEntreprise, faxEntreprise, Email, Observation, siteEntreprise, Niveau, enActivite);
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "numEntreprise=" + numEntreprise +
                ", raisonSociale='" + raisonSociale + '\'' +
                ", nomContact='" + nomContact + '\'' +
                ", Nom_Resp='" + nomResp + '\'' +
                ", rueEntreprise='" + rueEntreprise + '\'' +
                ", cpEntreprise=" + cpEntreprise +
                ", villeEntreprise='" + villeEntreprise + '\'' +
                ", telEntreprise='" + telEntreprise + '\'' +
                ", faxEntreprise='" + faxEntreprise + '\'' +
                ", Email='" + Email + '\'' +
                ", Observation='" + Observation + '\'' +
                ", siteEntreprise='" + siteEntreprise + '\'' +
                ", Niveau='" + Niveau + '\'' +
                ", enActivite=" + enActivite +
                '}';
    }
}
