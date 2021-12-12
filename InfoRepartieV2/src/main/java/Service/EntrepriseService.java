package Service;

import Repository.EntrepriseRepository;
import models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntrepriseService implements IEntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Optional<Entreprise> findById(Integer id) {
        return entrepriseRepository.findById(id);
    }
}
