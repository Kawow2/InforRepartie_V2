package models;

public class Entreprise {
    private Integer Num_Entreprise;
    private String Raison_sociale ;
    private String Nom_Contact;
    private String Nom_Resp;
    private String Rue_Entreprise;
    private Integer Cp_Entreprise;
    private String Ville_Entreprise;
    private String Tel_Entreprise;
    private String Fax_Entreprise;
    private String Email;
    private String Observation;
    private String Site_Entreprise;
    private String Niveau;

    public Integer getNum_Entreprise() {
        return Num_Entreprise;
    }

    public void setNum_Entreprise(Integer num_Entreprise) {
        Num_Entreprise = num_Entreprise;
    }

    public String getRaison_sociale() {
        return Raison_sociale;
    }

    public void setRaison_sociale(String raison_sociale) {
        Raison_sociale = raison_sociale;
    }

    public String getNom_Contact() {
        return Nom_Contact;
    }

    public void setNom_Contact(String nom_Contact) {
        Nom_Contact = nom_Contact;
    }

    public String getNom_Resp() {
        return Nom_Resp;
    }

    public void setNom_Resp(String nom_Resp) {
        Nom_Resp = nom_Resp;
    }

    public String getRue_Entreprise() {
        return Rue_Entreprise;
    }

    public void setRue_Entreprise(String rue_Entreprise) {
        Rue_Entreprise = rue_Entreprise;
    }

    public Integer getCp_Entreprise() {
        return Cp_Entreprise;
    }

    public void setCp_Entreprise(Integer cp_Entreprise) {
        Cp_Entreprise = cp_Entreprise;
    }

    public String getVille_Entreprise() {
        return Ville_Entreprise;
    }

    public void setVille_Entreprise(String ville_Entreprise) {
        Ville_Entreprise = ville_Entreprise;
    }

    public String getTel_Entreprise() {
        return Tel_Entreprise;
    }

    public void setTel_Entreprise(String tel_Entreprise) {
        Tel_Entreprise = tel_Entreprise;
    }

    public String getFax_Entreprise() {
        return Fax_Entreprise;
    }

    public void setFax_Entreprise(String fax_Entreprise) {
        Fax_Entreprise = fax_Entreprise;
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

    public String getSite_Entreprise() {
        return Site_Entreprise;
    }

    public void setSite_Entreprise(String site_Entreprise) {
        Site_Entreprise = site_Entreprise;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String niveau) {
        Niveau = niveau;
    }

    public Integer getEn_Activite() {
        return En_Activite;
    }

    public void setEn_Activite(Integer en_Activite) {
        En_Activite = en_Activite;
    }

    private Integer En_Activite;
}
