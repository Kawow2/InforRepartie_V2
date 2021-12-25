package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Mission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Integer> {
}
