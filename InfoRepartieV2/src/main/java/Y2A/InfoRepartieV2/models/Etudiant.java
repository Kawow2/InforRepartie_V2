package Y2A.InfoRepartieV2.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @Column(name = "num_etudiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numEtudiant;

    @Column(name = "nom_etudiant")
    private String nomEtudiant;

    @Column(name = "prenom_etudiant")
    private String prenomEtudiant;

    @Column(name = "annee_obtention")
    private Date anneeObtention;

    @Column(name = "login")
    private String login;

    @Column(name = "mdp")
    private String mdp;

    @Column(name = "num_classe")
    private Integer numClasse;

    @Column(name = "en_activite")
    private Integer enActivite;

    public Integer getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(Integer numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public Date getAnneeObtention() {
        return anneeObtention;
    }

    public void setAnneeObtention(Date anneeObtention) {
        this.anneeObtention = anneeObtention;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Integer getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(Integer numClasse) {
        this.numClasse = numClasse;
    }

    public Integer getEnActivite() {
        return enActivite;
    }

    public void setEnActivite(Integer enActivite) {
        this.enActivite = enActivite;
    }
}
