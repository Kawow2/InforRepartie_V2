package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Specialite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteRepository extends CrudRepository<Specialite, Integer> {
}
