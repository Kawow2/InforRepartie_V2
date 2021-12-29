package Y2A.InfoRepartieV2.Service.Etudiant;

import Y2A.InfoRepartieV2.models.Etudiant;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IEtudiantService {
    Optional<Etudiant> findById(Integer id);

    boolean isEtudiantExistant(String login, String mdp);

    Iterable<Etudiant> getAllEtudiant();

    Etudiant createEtudiant(Etudiant etudiant);
}
