package Y2A.InfoRepartieV2.Service.SpecEntreprise;

import Y2A.InfoRepartieV2.models.SpecEntreprise;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ISpecEntrepriseService {
    Optional<SpecEntreprise> findById(Integer id);

    Iterable<SpecEntreprise> getAllSpecEntreprise();

    Iterable<SpecEntreprise> createSpecEntreprise(Iterable<SpecEntreprise> specs);

    void deleteSpecFromEntreprise(int id);
}
