package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Professeur.IProfesseurService;
import Y2A.InfoRepartieV2.models.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/prof")
public class ProfesseurController {

    @Autowired
    private IProfesseurService professeurService;

    @GetMapping(value = "/existant/{login}/{mdp}")
    public boolean isProfesseurExistant(@PathVariable String login, @PathVariable String mdp) {
        return professeurService.isProfesseurExistant(login, mdp);
    }

    @GetMapping(value = "/all")
    public Iterable<Professeur> getAllProfesseur() {
        return professeurService.getAllProfesseur();
    }
}
