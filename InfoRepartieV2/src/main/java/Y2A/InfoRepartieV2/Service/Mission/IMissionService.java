package Y2A.InfoRepartieV2.Service.Mission;

import Y2A.InfoRepartieV2.models.Mission;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface IMissionService {
    Optional<Mission> findById(Integer id);

    void deleteMissionsFromStage(ArrayList<Integer> missions);

    Iterable<Mission> getMissionsFromStage(int stageId);
}
