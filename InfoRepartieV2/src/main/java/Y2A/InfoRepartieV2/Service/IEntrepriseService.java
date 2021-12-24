package Y2A.InfoRepartieV2.Service;

import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IEntrepriseService {
    Optional<Entreprise> findById(Integer id);
}
