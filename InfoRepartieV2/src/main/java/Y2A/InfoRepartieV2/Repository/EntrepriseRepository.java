package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EntrepriseRepository extends CrudRepository <Entreprise,Integer> {
}