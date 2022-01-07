package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.SpecEntreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecEntrepriseRepository extends CrudRepository<SpecEntreprise, Integer> {

    Iterable<SpecEntreprise> deleteSpecEntrepriseByNumEntreprise(int id);

    Iterable<SpecEntreprise> findAllByNumEntreprise(int id);

}
