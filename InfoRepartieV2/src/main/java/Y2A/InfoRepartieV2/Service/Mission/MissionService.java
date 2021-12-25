package Y2A.InfoRepartieV2.Service.Mission;

import Y2A.InfoRepartieV2.Repository.MissionRepository;
import Y2A.InfoRepartieV2.models.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MissionService implements IMissionService {

    @Autowired
    private MissionRepository missionRepository;

    @Override
    public Optional<Mission> findById(Integer id) {
        return missionRepository.findById(id);
    }
}
