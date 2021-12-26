package Y2A.InfoRepartieV2.Service.Stage;

import Y2A.InfoRepartieV2.Repository.StageRepository;
import Y2A.InfoRepartieV2.models.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StageService implements IStageService {
    @Autowired
    private StageRepository stageRepository;

    @Override
    public Optional<Stage> findById(Integer id) {
        return stageRepository.findById(id);
    }
}