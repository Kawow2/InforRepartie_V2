package Y2A.InfoRepartieV2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mission")
public class Mission {

    @Id
    @Column(name = "Num_mission")
    private Integer numMission;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "num_stage")
    private Integer numStage;

    public Integer getNumMission() {
        return numMission;
    }

    public void setNumMission(Integer numMission) {
        this.numMission = numMission;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getNumStage() {
        return numStage;
    }

    public void setNumStage(Integer numStage) {
        this.numStage = numStage;
    }
}
