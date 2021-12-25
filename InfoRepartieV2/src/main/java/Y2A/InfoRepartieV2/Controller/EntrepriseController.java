package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Entreprise.IEntrepriseService;
import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntrepriseController {

    @Autowired
    private IEntrepriseService entrepriseService;

    @GetMapping("/Entreprise")
    public Entreprise entreprise(@RequestParam int id) {
        return entrepriseService.findById(id).get();
    }
}
