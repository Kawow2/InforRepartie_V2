package Y2A.InfoRepartieV2.Service.Classe;

import Y2A.InfoRepartieV2.Repository.ClasseRepository;
import Y2A.InfoRepartieV2.models.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClasseService implements IClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    @Override
    public Optional<Classe> findById(Integer id) {
        return classeRepository.findById(id);
    }
}
