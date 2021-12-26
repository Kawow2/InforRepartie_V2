package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.Entreprise.IEntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/entreprise")
public class EntrepriseController {

    @Autowired
    private IEntrepriseService entrepriseService;
}
