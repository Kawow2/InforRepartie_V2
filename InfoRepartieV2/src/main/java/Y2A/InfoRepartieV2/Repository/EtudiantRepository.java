package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {

    List<Etudiant> findByLoginAndMdp(String login, String mdp);

}
