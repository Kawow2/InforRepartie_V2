package Y2A.InfoRepartieV2.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "spec_entreprise")
@IdClass(SpecEntreprise.class)
public class SpecEntreprise implements Serializable {

    @Id
    @Column(name = "num_entreprise")
    private Integer numEntreprise;

    @Id
    @Column(name = "num_spec")
    private Integer numSpec;

    public Integer getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(Integer numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    public Integer getNumSpec() {
        return numSpec;
    }

    public void setNumSpec(Integer numSpec) {
        this.numSpec = numSpec;
    }
}
