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
}
