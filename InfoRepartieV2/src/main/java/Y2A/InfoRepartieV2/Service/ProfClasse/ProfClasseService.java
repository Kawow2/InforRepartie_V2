package Y2A.InfoRepartieV2.Service.ProfClasse;

import Y2A.InfoRepartieV2.Repository.ProfClasseRepository;
import Y2A.InfoRepartieV2.models.ProfClasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfClasseService implements IProfClasseService {
    @Autowired
    private ProfClasseRepository profClasseRepository;

    @Override
    public Optional<ProfClasse> findById(Integer id) {
        return profClasseRepository.findById(id);
    }
}
