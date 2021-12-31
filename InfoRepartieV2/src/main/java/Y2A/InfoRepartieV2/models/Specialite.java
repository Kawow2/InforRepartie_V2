package Y2A.InfoRepartieV2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specialite")
public class Specialite {

    @Id
    @Column(name = "num_spec")
    private Integer numSpec;

    @Column(name = "libelle")
    private String libelle;

    public Integer getNumSpec() {
        return numSpec;
    }

    public void setNumSpec(Integer numSpec) {
        this.numSpec = numSpec;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
