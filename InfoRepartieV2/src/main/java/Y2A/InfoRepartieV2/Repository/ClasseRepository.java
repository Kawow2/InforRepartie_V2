package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Classe;
import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClasseRepository extends CrudRepository <Classe,Integer> {
}
