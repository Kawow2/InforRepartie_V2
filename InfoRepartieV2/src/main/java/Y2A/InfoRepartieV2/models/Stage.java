package Y2A.InfoRepartieV2.models;

import java.util.Date;

public class Stage {
    private Integer Num_Stage;
    private Date Debut_Stage;
    private Date Fin_Stage;
    private String Type_Stage;
    private String Desc_Projet;

    public Integer getNum_Stage() {
        return Num_Stage;
    }

    public void setNum_Stage(Integer num_Stage) {
        Num_Stage = num_Stage;
    }

    private String Observation_Stage;
    private Integer Num_Etudiant;
    private Integer Num_Prof;
    private Integer Num_Entreprise;

}
