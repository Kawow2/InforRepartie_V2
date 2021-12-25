package Y2A.InfoRepartieV2.Service.Specialite;

import Y2A.InfoRepartieV2.Repository.SpecialiteRepository;
import Y2A.InfoRepartieV2.models.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialiteService implements ISpecialiteService {

    @Autowired
    private SpecialiteRepository specialiteRepository;

    @Override
    public Optional<Specialite> findById(Integer id) {
        return specialiteRepository.findById(id);
    }
}
