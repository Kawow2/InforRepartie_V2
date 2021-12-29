package Y2A.InfoRepartieV2.Service.SpecEntreprise;

import Y2A.InfoRepartieV2.Repository.SpecEntrepriseRepository;
import Y2A.InfoRepartieV2.models.SpecEntreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecEntrepriseService implements ISpecEntrepriseService {

    @Autowired
    private SpecEntrepriseRepository specEntrepriseRepository;

    @Override
    public Optional<SpecEntreprise> findById(Integer id) {
        return specEntrepriseRepository.findById(id);
    }

    @Override
    public Iterable<SpecEntreprise> getAllSpecEntreprise() {
        return specEntrepriseRepository.findAll();
    }
}
