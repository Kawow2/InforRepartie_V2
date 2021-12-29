package Y2A.InfoRepartieV2.Service.Etudiant;

import Y2A.InfoRepartieV2.Repository.EtudiantRepository;
import Y2A.InfoRepartieV2.models.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EtudiantService implements IEtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Optional<Etudiant> findById(Integer id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public boolean isEtudiantExistant(String login, String mdp) {
        return !etudiantRepository.findByLoginAndMdp(login, mdp).isEmpty();
    }

    @Override
    public Iterable<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
