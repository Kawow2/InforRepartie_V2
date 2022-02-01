package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Etudiant.IEtudiantService;
import Y2A.InfoRepartieV2.models.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantController {
    @Autowired
    private IEtudiantService etudiantService;

    @GetMapping(value = "/existant/{login}/{mdp}")
    public boolean isEtudiantExistant(@PathVariable String login, @PathVariable String mdp) {
        return etudiantService.isEtudiantExistant(login, mdp);
    }

    @GetMapping(value = "/all")
    public Iterable<Etudiant> getAllEtudiant() {
        return etudiantService.getAllEtudiant();
    }

    @GetMapping(value = "/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable int id) {
        return etudiantService.getEtudiantById(id);
    }

    @DeleteMapping(value = "/{id}")
    public int deleteEtudiant(@PathVariable int id) {
        return etudiantService.deleteEtudiant(id);
    }


    @PostMapping(value = "/")
    public Etudiant CreateEtudaint(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
}
