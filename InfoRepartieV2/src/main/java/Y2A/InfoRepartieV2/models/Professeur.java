package Y2A.InfoRepartieV2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professer")
public class Professeur {

    @Id
    @Column(name = "num_prof")
    private Integer numProf;

    @Column(name = "nom_prof")
    private String nomProf;

    @Column(name = "prenom_prof")
    private String prenomProf;

    @Column(name = "login")
    private String login;

    @Column(name = "mdp")
    private String mdp;

    @Column(name = "email")
    private String email;

    public Integer getNumProf() {
        return numProf;
    }

    public void setNumProf(Integer numProf) {
        this.numProf = numProf;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
