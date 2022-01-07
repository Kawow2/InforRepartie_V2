package Y2A.InfoRepartieV2.Service.Entreprise;

import Y2A.InfoRepartieV2.Repository.EntrepriseRepository;
import Y2A.InfoRepartieV2.models.Entreprise;
import Y2A.InfoRepartieV2.models.Output.EntrepriseEtSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseService implements IEntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;


    @Override
    public EntrepriseEtSpec findEntrepriseAndSpecById(Integer id) {
        EntrepriseEtSpec entrepriseEtSpec = new EntrepriseEtSpec();
        entrepriseEtSpec.setEntreprise(this.entrepriseRepository.findById(id));
        return entrepriseEtSpec;
    }

    @Override
    public Iterable<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise createEntreprise(Entreprise ent) {
        return entrepriseRepository.save(ent);
    }

    @Override
    public int deleteEntreprise(int id) {
        entrepriseRepository.deleteById(id);
        return id;
    }
}
