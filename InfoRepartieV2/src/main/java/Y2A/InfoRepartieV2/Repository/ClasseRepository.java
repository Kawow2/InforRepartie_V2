package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Classe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends CrudRepository<Classe, Integer> {
}
