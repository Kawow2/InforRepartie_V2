package Y2A.InfoRepartieV2.Service.Stage;

import Y2A.InfoRepartieV2.models.Stage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface IStageService {
    Optional<Stage> findById(Integer id);

    Stage createStage(Stage stage);

    void deleteStageFromEnterprise(ArrayList<Integer> ids);

    Iterable<Stage> getStagesFromEntreprise(int id);

    Optional<Stage> getStage(int id);
}
