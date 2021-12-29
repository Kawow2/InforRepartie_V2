package Y2A.InfoRepartieV2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "stage")
public class Stage {

    @Id
    @Column(name = "num_stage")
    private Integer numStage;

    @Column(name = "debut_stage")
    private Date debutStage;

    @Column(name = "fin_stage")
    private Date finStage;

    @Column(name = "type_stage")
    private String typeStage;

    @Column(name = "desc_projet")
    private String descProjet;

    @Column(name = "observation_stage")
    private String observationStage;

    @Column(name = "num_etudiant")
    private Integer numEtudiant;

    @Column(name = "num_prof")
    private Integer numProf;

    @Column(name = "num_entreprise")
    private Integer numEntreprise;

    public Integer getNumStage() {
        return numStage;
    }

    public void setNumStage(Integer numStage) {
        this.numStage = numStage;
    }

    public Date getDebutStage() {
        return debutStage;
    }

    public void setDebutStage(Date debutStage) {
        this.debutStage = debutStage;
    }

    public Date getFinStage() {
        return finStage;
    }

    public void setFinStage(Date finStage) {
        this.finStage = finStage;
    }

    public String getTypeStage() {
        return typeStage;
    }

    public void setTypeStage(String typeStage) {
        this.typeStage = typeStage;
    }

    public String getDescProjet() {
        return descProjet;
    }

    public void setDescProjet(String descProjet) {
        this.descProjet = descProjet;
    }

    public String getObservationStage() {
        return observationStage;
    }

    public void setObservationStage(String observationStage) {
        this.observationStage = observationStage;
    }

    public Integer getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(Integer numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public Integer getNumProf() {
        return numProf;
    }

    public void setNumProf(Integer numProf) {
        this.numProf = numProf;
    }

    public Integer getNumEntreprise() {
        return numEntreprise;
    }

    public void setNumEntreprise(Integer numEntreprise) {
        this.numEntreprise = numEntreprise;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "numStage=" + numStage +
                ", debutStage=" + debutStage +
                ", finStage=" + finStage +
                ", typeStage='" + typeStage + '\'' +
                ", descProjet='" + descProjet + '\'' +
                ", observationStage='" + observationStage + '\'' +
                ", numEtudiant=" + numEtudiant +
                ", numProf=" + numProf +
                ", numEntreprise=" + numEntreprise +
                '}';
    }
}
