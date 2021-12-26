package Y2A.InfoRepartieV2.Controller;

import Y2A.InfoRepartieV2.Service.SpecEntreprise.ISpecEntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/specEntreprise")
public class SpecEntrepriseController {

    @Autowired
    private ISpecEntrepriseService specEntrepriseService;
}
