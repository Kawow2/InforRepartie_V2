package Y2A.InfoRepartieV2.Service.Entreprise;

import Y2A.InfoRepartieV2.models.Entreprise;
import Y2A.InfoRepartieV2.models.Output.EntrepriseEtSpec;
import org.springframework.stereotype.Service;

@Service
public interface IEntrepriseService {
    EntrepriseEtSpec findEntrepriseAndSpecById(Integer id);

    Iterable<Entreprise> getAllEntreprise();

    Entreprise createEntreprise(Entreprise ent);

    int deleteEntreprise(int id);

}
