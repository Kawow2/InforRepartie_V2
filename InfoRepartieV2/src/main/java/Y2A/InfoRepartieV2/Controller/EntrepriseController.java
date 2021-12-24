package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.EntrepriseService;
import Y2A.InfoRepartieV2.models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("/Entreprise")
    public Entreprise hello(@RequestParam int id) {
        return entrepriseService.findById(id).get();
    }
}
