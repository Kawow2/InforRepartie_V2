package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.ProfClasse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfClasseRepository extends CrudRepository<ProfClasse, Integer> {
}
