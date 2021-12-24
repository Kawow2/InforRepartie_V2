package Y2A.InfoRepartieV2.models;

import java.util.Date;

public class Etudiant {
    private Integer Num_Etudiant;
    private String Nom_Etudiant;
    private String Prenom_Etudiant;
    private Date Annee_Obtention;
    private String Login;
    private String Mdp;
    private Integer Num_Classe;
    private Integer En_Activite;

    public Integer getNum_Etudiant() {
        return Num_Etudiant;
    }

    public void setNum_Etudiant(Integer num_Etudiant) {
        Num_Etudiant = num_Etudiant;
    }
}
