package Service;

import models.Entreprise;

import java.util.Optional;

public interface IEntrepriseService {
    Optional<Entreprise> findById(Integer id);
}
