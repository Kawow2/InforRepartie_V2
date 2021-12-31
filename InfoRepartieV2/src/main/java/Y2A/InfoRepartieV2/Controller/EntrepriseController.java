package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Entreprise.IEntrepriseService;
import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/entreprise")
public class EntrepriseController {

    @Autowired
    private IEntrepriseService entrepriseService;

    @GetMapping(value = "/all")
    public Iterable<Entreprise> isEtudiantExistant() {
        return entrepriseService.getAllEntreprise();
    }

    @PostMapping(value = "/create")
    public Entreprise createEntreprise(@RequestBody Entreprise ent) {
        System.out.println(ent.toString());
        return entrepriseService.createEntreprise(ent);
    }


}
