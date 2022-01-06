package Y2A.InfoRepartieV2.Service.Entreprise;

import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IEntrepriseService {
    Optional<Entreprise> findById(Integer id);

    Iterable<Entreprise> getAllEntreprise();

    Entreprise createEntreprise(Entreprise ent);

    int deleteEntreprise(int id);
}
