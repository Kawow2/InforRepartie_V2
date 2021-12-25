package Y2A.InfoRepartieV2.Service.Classe;

import Y2A.InfoRepartieV2.models.Classe;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IClasseService {
    Optional<Classe> findById(Integer id);
}
