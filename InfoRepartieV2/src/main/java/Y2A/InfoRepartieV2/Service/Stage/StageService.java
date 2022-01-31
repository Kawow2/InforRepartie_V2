package Y2A.InfoRepartieV2.Service.Stage;

import Y2A.InfoRepartieV2.Repository.StageRepository;
import Y2A.InfoRepartieV2.models.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StageService implements IStageService {
    @Autowired
    private StageRepository stageRepository;

    @Override
    public Optional<Stage> findById(Integer id) {
        return stageRepository.findById(id);
    }

    @Override
    public Stage createStage(Stage stage) {
        return stageRepository.save(stage);
    }

    @Override
    @Transactional
    public void deleteStageFromEnterprise(ArrayList<Integer> ids) {
        stageRepository.deleteAllById(ids);
    }

    @Override
    public Iterable<Stage> getStagesFromEntreprise(int id) {
        return stageRepository.getAllByNumEntreprise(id);
    }

    @Override
    public Optional<Stage> getStage(int id) {
        return stageRepository.findById(id);
    }

    @Override
    public Iterable<Stage> getAllStages() {
        return stageRepository.findAll();
    }
}
