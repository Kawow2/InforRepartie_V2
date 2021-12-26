package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Professeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepository extends CrudRepository<Professeur, Integer> {
}