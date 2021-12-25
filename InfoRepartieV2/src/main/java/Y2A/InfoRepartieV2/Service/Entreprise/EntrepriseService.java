package Y2A.InfoRepartieV2.Service.Entreprise;

import Y2A.InfoRepartieV2.Repository.EntrepriseRepository;
import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntrepriseService implements IEntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Optional<Entreprise> findById(Integer id) {
        return entrepriseRepository.findById(id);
    }
}
