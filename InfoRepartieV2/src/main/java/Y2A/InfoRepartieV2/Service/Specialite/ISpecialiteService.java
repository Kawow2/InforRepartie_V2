package Y2A.InfoRepartieV2.Service.Specialite;

import Y2A.InfoRepartieV2.models.Specialite;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ISpecialiteService {
    Optional<Specialite> findById(Integer id);

    Iterable<Specialite> getAllSpecialite();

}
