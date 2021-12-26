package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Etudiant;
import Y2A.InfoRepartieV2.models.Professeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesseurRepository extends CrudRepository<Professeur, Integer> {
    List<Etudiant> findByLoginAndMdp(String login, String mdp);

}
