package Y2A.InfoRepartieV2.Repository;

import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {


}
