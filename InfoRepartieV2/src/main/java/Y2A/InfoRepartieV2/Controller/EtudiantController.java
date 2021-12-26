package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Etudiant.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantController {
    @Autowired
    private IEtudiantService etudiantService;

    @GetMapping(value = "/existant/{login}/{mdp}")
    public boolean isEtudiantExistant(@PathVariable String login, @PathVariable String mdp) {
        return etudiantService.isEtudiantExistant(login, mdp);
    }
}
