package Y2A.InfoRepartieV2.Service.Professeur;

import Y2A.InfoRepartieV2.Repository.ProfesseurRepository;
import Y2A.InfoRepartieV2.models.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfesseurService implements IProfesseurService {
    @Autowired
    private ProfesseurRepository professeurRepository;

    @Override
    public Optional<Professeur> findById(Integer id) {
        return professeurRepository.findById(id);
    }
}
