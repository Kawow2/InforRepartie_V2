package Y2A.InfoRepartieV2.models.Output;

import Y2A.InfoRepartieV2.models.Entreprise;
import Y2A.InfoRepartieV2.models.SpecEntreprise;

import java.io.Serializable;
import java.util.Optional;

public class EntrepriseEtSpec implements Serializable {

    private Optional<Entreprise> entreprise;
    private Iterable<SpecEntreprise> specEntreprises;

    public Optional<Entreprise> getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Optional<Entreprise> entreprise) {
        this.entreprise = entreprise;
    }

    public Iterable<SpecEntreprise> getSpecEntreprises() {
        return specEntreprises;
    }

    public void setSpecEntreprises(Iterable<SpecEntreprise> specEntreprises) {
        this.specEntreprises = specEntreprises;
    }

}
