package Y2A.InfoRepartieV2.Service.Professeur;

import Y2A.InfoRepartieV2.models.Professeur;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IProfesseurService {
    Optional<Professeur> findById(Integer id);

    boolean isProfesseurExistant(String login, String mdp);

    Iterable<Professeur> getAllProfesseur();


}
