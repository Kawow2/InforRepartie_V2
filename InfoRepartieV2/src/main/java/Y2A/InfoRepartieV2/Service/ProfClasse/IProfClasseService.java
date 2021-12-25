package Y2A.InfoRepartieV2.Service.ProfClasse;

import Y2A.InfoRepartieV2.models.ProfClasse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IProfClasseService {
    Optional<ProfClasse> findById(Integer id);
}
