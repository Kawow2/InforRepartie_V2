package Y2A.InfoRepartieV2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classe")
public class Classe {

    @Id
    @Column(name = "num_classe")
    private Integer numClasse;

    @Column(name = "nom_classe")
    private String nomClasse;

    public Integer getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(Integer numClasse) {
        this.numClasse = numClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
}
