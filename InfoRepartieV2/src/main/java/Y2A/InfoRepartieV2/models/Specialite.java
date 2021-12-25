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
}
