package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
}
