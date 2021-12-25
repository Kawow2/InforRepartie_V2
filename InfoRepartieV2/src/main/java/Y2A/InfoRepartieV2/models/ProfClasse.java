package Y2A.InfoRepartieV2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProfClasse {

    @Id
    @Column(name = "num_prof")
    private int numProf;

    @Column(name = "num_classe")
    private int numClasse;

    @Column(name = "est_prof_principal")
    private int estProfPrincipal;

    public int getNumProf() {
        return numProf;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public int getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(int numClasse) {
        this.numClasse = numClasse;
    }

    public int getEstProfPrincipal() {
        return estProfPrincipal;
    }

    public void setEstProfPrincipal(int estProfPrincipal) {
        this.estProfPrincipal = estProfPrincipal;
    }
}
