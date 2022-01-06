package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Stage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends CrudRepository<Stage, Integer> {

    void deleteAllByNumEntreprise(int id);

    Iterable<Stage> getAllByNumEntreprise(int id);


}
